package uz.pdp.online.appwerhouseprojectm5l11.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Output;
import uz.pdp.online.appwerhouseprojectm5l11.entity.OutputProduct;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();

}
