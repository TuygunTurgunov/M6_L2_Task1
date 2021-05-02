package uz.pdp.online.appwerhouseprojectm5l11.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {

    Integer getId();
    String getName();
    Boolean getActive();
    String getPhoneNumber();


}
