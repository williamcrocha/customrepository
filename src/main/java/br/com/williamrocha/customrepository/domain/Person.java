package br.com.williamrocha.customrepository.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "person")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Long id;

    @Column(name="first_name", length = 20)
    private String firstName;

    @Column(name="last_name", length = 20)
    private String lastName;

    @Column(name="email", length = 100)
    private String email;

    @Column(name="address", length = 100)
    private String address;

    @Column(name="city", length = 50)
    private String city;

    @Column(name="zipcode", length = 10)
    private String zipcode;
}
