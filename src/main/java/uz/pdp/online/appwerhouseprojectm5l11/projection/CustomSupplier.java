package uz.pdp.online.appwerhouseprojectm5l11.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Integer getId();
    String getName();
    String getPhoneNumber();
    String getActive();



}
