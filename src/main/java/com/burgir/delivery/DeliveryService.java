package com.burgir.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class DeliveryService {

  @Autowired
  private DeliveryRepository deliveryRepository;

  public List<Delivery> index() {
    return this.deliveryRepository.findAll();
  }

  public Delivery store(Delivery delivery) {
    return this.deliveryRepository.save(delivery);
  }

  public Delivery show(Long id) {
    boolean exists = this.deliveryRepository.existsById(id);

    if (!exists) {
      throw new IllegalStateException("Delivery with ID: " + id + " does not exist!");
    }

    return this.deliveryRepository.findById(id).get();
  }

  @Transactional
  public Delivery update(
      Long id,
      Double distance,
      Boolean delivered,
      Long orderId,
      Long employeeId,
      Long carId) {

    Delivery delivery = this.deliveryRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Delivery with ID: " + id + " does not exist!"));

    if (distance != null) {
      delivery.setDistance(distance);
    }

    if (delivered != null) {
      delivery.setDelivered(delivered);
    }

    if (orderId != null) {
      delivery.setOrderId(orderId);
    }

    if (employeeId != null) {
      delivery.setEmployeeId(employeeId);
    }

    if (carId != null) {
      delivery.setCarId(carId);
    }

    return delivery;
  }

  public Delivery destroy(Long id) {
    boolean exists = this.deliveryRepository.existsById(id);

    if (!exists) {
      new IllegalStateException("Delivery with ID: " + id + " does not exist!");
    }

    Delivery delivery = this.deliveryRepository.findById(id).get();

    this.deliveryRepository.deleteById(id);

    return delivery;
  }

}
