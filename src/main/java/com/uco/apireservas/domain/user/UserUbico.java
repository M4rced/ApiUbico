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

    public UserUbico() {
    }
}
