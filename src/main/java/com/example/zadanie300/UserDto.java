package com.example.zadanie300;

import jakarta.validation.constraints.*;

public class UserDto {

    @NotBlank(message = "Pole nie może być puste")
    @Size(min = 3, message = "Pole musi mieć conajmniej 3 znaki")
    private String firstName;
    @NotBlank(message = "Pole nie może być puste")
    @Size(min = 3, message = "Pole musi mieć conajmniej 3 znaki")
    private String lastName;
    @NotBlank(message = "Pole nie może być puste")
    private String address;
    @NotBlank(message = "Pole nie może być puste")
    @Pattern(regexp = "\\d{2}-\\d{3}", message = "Wpisz poprawny kod pocztowy (11-111)")
    private String postCode;
    @NotBlank(message = "Pole nie może być puste")
    private String city;
    @NotBlank(message = "Pole nie może być puste")
    @Email(message = "Musi być poprawnie sformatowanym adresem email")
    private String email;
    @NotBlank(message = "Pole nie może być puste")
    @Size(min = 8, message = "Hasło musi mieć conajmniej 8 znaków")
    private String password;

    @AssertTrue(message = "Akceptacja regulaminu jest wymagana")
    private boolean regulationAcceptation;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRegulationAcceptation() {
        return regulationAcceptation;
    }

    public void setRegulationAcceptation(boolean regulationAcceptation) {
        this.regulationAcceptation = regulationAcceptation;
    }
}
