package com.sonu.utils.designPatterns.clone;

import lombok.*;

import java.time.LocalDate;


// Cloneable is the MarkerInterface, Means it doesn't have any methods
// Marker interface it gives only specifications
// This is Deep Cloning
// In Customer Class clone both parent and Child Class
public class ShallowCloningTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer1 customer = new Customer1();
        Address1 add = new Address1();
        customer.setAddress(add);
        Customer1 clone = (Customer1) customer.clone();
        System.out.println("ShallowCloningMainExample.main-->" + clone.getAddress());
        System.out.println("ShallowCloningMainExample.main-->" + customer.getAddress());
        add.setAddressId("150");
        System.out.println("ShallowCloningMainExample.main-->" + clone.getAddress());
        System.out.println("ShallowCloningMainExample.main-->" + customer.getAddress());
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
class Customer1 implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String customerId;
    private String customerName;
    private LocalDate customerDOB;
    private String phoneNumber;
    private String email;
    private String password;
    private Address1 address;

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Address1 implements Cloneable {

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

