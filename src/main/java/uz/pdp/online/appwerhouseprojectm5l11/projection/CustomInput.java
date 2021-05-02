package uz.pdp.online.appwerhouseprojectm5l11.projection;


import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Currency;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Input;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Supplier;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    Timestamp getDateWithTime();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();

}
