package uz.pdp.online.appwerhouseprojectm5l11.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = " firstName not be null")
    @Column(nullable = false)
    private String firstName;

    @NotNull(message = " lastName not be null")
    @Column(nullable = false)
    private String lastName;

    @NotNull(message = " phone number not be null")
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @NotNull(message = " code not be null")
    @Column(nullable = false)
    private String code;

    @NotNull(message = "password not be null")
    @Column(nullable = false)
    private String password;

    @ManyToMany
    private List<Warehouse> warehouses;

    private Boolean active=true;

}