package vn.edu.fit.iuh.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long id;
    @Column(name = "number",length = 20)
    private String number;
    @Column(name = "Street",length = 150)
    private String street;
    @Column(name = "city",length = 50)
    private String city;
    @Column(name = "zipcode",length = 7)
    private String zipCode;


//    @Column(name = "country",length = 30)
//
//    private Country country;
//    private Company company;
//    private Candidate candidate;


}
