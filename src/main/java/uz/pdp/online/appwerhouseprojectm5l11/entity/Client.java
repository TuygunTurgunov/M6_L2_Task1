package uz.pdp.online.appwerhouseprojectm5l11.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.online.appwerhouseprojectm5l11.entity.template.AbsEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client extends AbsEntity {

    @NotNull(message = "Phone number not be null ")
    @Column(nullable = false,unique = true)
    private String phoneNumber;


}
