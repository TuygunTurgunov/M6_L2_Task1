package uz.pdp.online.appwerhouseprojectm5l11.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Input;
import uz.pdp.online.appwerhouseprojectm5l11.entity.InputProduct;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Product;


import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();


    Product getProduct();


    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();


}
