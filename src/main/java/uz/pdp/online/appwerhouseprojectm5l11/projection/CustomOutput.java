package uz.pdp.online.appwerhouseprojectm5l11.projection;


import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Client;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Currency;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Output;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getDateWithTime();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();


}
