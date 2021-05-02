package uz.pdp.online.appwerhouseprojectm5l11.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Integer getId();
    String getName();
    String getActive();

}
