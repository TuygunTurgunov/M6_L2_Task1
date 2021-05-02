package uz.pdp.online.appwerhouseprojectm5l11.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
    Boolean getActive();
    Category getParentCategory();

}
