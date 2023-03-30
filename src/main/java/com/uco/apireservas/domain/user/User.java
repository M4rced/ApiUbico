package com.uco.apireservas.domain.user;


import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GenerationType;


@Document(collection = "Usuarios")
public class User {

    @Id
    private Long id;
    private String name;
    private String lastname;
    private String identificationType;//Verificar si es aca o en UserType
    private long identificationNumber;
    private long telephoneNumber;
    private String Email;
    private long ucoid;
    private String username;
    private String password;

    public User(String name, String lastname, String identificationType, long identificationNumber,
                long telephoneNumber, String email, long ucoid, String username, String password) {
        this.name = name;
        this.lastname = lastname;
        this.identificationType = identificationType;
        this.identificationNumber = identificationNumber;
        this.telephoneNumber = telephoneNumber;
        Email = email;
        this.ucoid = ucoid;
        this.username = username;
        this.password = password;
    }


    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private logn id;*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getUcoid() {
        return ucoid;
    }

    public void setUcoid(long ucoid) {
        this.ucoid = ucoid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
