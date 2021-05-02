package uz.pdp.online.appwerhouseprojectm5l11.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Users;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Projection(types = Users.class)
public interface CustomUser {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    List<Warehouse> getWarehouses();

    Boolean getActive();


}
