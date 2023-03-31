package com.burgir.customer;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CustomerService {

  private final CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public List<Customer> index() {
    return this.customerRepository.findAll();
  }

  public Customer store(Customer customer) {
    Optional<Customer> optionalCustomer = this.customerRepository.findCustomerByEmail(customer.getEmail());

    if (optionalCustomer.isPresent()) {
      throw new IllegalStateException("This email is taken!");
    }

    return this.customerRepository.save(customer);
  }

  public Customer show(Long id) {
    boolean exists = this.customerRepository.existsById(id);

    if (!exists) {
      throw new IllegalStateException("Customer with ID: " + id + " does not exist!");
    }

    return this.customerRepository.findById(id).get();
  }

  @Transactional
  public Customer update(Long id, Map<String, String> requestParams) {
    Customer customer = this.customerRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Customer with ID: " + id + " does not exist!"));

    for (Map.Entry<String, String> pair : requestParams.entrySet()) {
      switch (pair.getKey()) {
        case "firstName":
          customer.setFirstName(pair.getValue());
          break;
        case "lastName":
          customer.setLastName(pair.getValue());
          break;
        case "country":
          customer.setCountry(pair.getValue());
          break;
        case "city":
          customer.setCity(pair.getValue());
          break;
        case "street":
          customer.setStreet(pair.getValue());
          break;
        case "houseNumber":
          customer.setHouseNumber(pair.getValue());
          break;
        case "telephone":
          customer.setTelephone(pair.getValue());
          break;
        case "email":
          Optional<Customer> optionalCustomer = this.customerRepository.findCustomerByEmail(pair.getValue());

          if (optionalCustomer.isPresent()) {
            throw new IllegalStateException("This email is taken!");
          }

          customer.setEmail(pair.getValue());
          break;
        default:
      }
    }

    return customer;
  }

  public Customer destroy(Long id) {
    boolean exists = this.customerRepository.existsById(id);

    if (!exists) {
      new IllegalStateException("Customer with ID: " + id + " does not exist!");
    }

    Customer customer = this.customerRepository.findById(id).get();

    this.customerRepository.deleteById(id);

    return customer;
  }

}
