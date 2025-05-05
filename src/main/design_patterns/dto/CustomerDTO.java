package main.design_patterns.dto;

public class CustomerDTO {
    private String name;
    private String email;
    private String phone;

    public CustomerDTO(Customer customer) {
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.phone = customer.getPhone();
    }
}
