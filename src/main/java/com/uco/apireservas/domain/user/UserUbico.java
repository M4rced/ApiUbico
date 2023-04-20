package com.uco.apireservas.domain.user;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UserUbico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "identificationType")
    private String identificationType;//Verificar si es aca o en UserType

    @Column(name = "identificationNumber")
    private long identificationNumber;

    @Column(name = "telephoneNumber")
    private long telephoneNumber;

    @Column(name = "Email")
    private String Email;

    @Column(name = "ucoid")
    private long ucoid;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public UserUbico(String name, String lastname, String identificationType, long identificationNumber,
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserUbico() {
    }

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
