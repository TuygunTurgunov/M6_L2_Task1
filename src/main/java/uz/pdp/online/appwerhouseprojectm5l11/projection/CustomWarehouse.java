package uz.pdp.online.appwerhouseprojectm5l11.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {


    Integer getId();
    String getName();
    String getActive();


}
