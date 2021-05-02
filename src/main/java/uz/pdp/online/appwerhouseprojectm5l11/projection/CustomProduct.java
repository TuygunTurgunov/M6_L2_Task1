package uz.pdp.online.appwerhouseprojectm5l11.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Attachment;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Category;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Measurement;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Product;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    String getActive();


    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();


}
