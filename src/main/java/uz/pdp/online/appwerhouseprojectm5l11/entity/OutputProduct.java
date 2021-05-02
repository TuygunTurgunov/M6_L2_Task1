package uz.pdp.online.appwerhouseprojectm5l11.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OutputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private  Product product;

    @NotNull(message = "amount not be null.")
    @Column(nullable = false)
    private Double amount;

    @NotNull(message = "price not be null.")
    @Column(nullable = false)
    private Double price ;

    @ManyToOne
    private Output output;

}