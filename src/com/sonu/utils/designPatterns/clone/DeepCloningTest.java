package com.sonu.utils.designPatterns.clone;

import lombok.*;

import java.time.LocalDate;


// Cloneable is the MarkerInterface, Means it doesn't have any methods
// Marker interface it gives only specifications
// This is Deep Cloning
// Reference classes also will be clone
public class DeepCloningTest{
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer = new Customer();
        Address add = new Address();
        customer.setAddress(add);
        Customer clone = (Customer) customer.clone();
        System.out.println("DeepCloningMainExample.main-->" + clone.getAddress());
        System.out.println("DeepCloningMainExample.main-->" + customer.getAddress());
        add.setAddressId("150");
        System.out.println("DeepCloningMainExample.main-->" + clone.getAddress());
        System.out.println("DeepCloningMainExample.main-->" + customer.getAddress());
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
class Customer implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Customer customer = (Customer) super.clone();
        customer.setAddress((Address) address.clone());
        return customer;
    }

    private String customerId;
    private String customerName;
    private LocalDate customerDOB;
    private String phoneNumber;
    private String email;
    private String password;
    private Address address;

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Address implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String addressId = "1452";
    private String addressType = "permanent";
    private String flatNumber = "309";
    private String plotNumber = "88";
    private String buildingName = "Hyd Residency";
    private Integer roadNumber = 15;
    private String street = "Nagole";
    private String city = "Hyderabad";
    private String country = "India";
    private Long pinCode = 500068L;
}

