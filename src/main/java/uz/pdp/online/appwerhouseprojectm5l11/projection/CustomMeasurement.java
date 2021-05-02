package uz.pdp.online.appwerhouseprojectm5l11.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

Integer getId();
String getName();
String getActive();


}
