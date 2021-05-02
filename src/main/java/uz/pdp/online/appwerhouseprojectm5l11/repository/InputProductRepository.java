package uz.pdp.online.appwerhouseprojectm5l11.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.appwerhouseprojectm5l11.entity.InputProduct;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Product;
import uz.pdp.online.appwerhouseprojectm5l11.projection.CustomInputProduct;


@RepositoryRestResource(path = "inputProduct",collectionResourceRel = "list",excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {

    Page<InputProduct>findAllByInputId(Integer input_id, Pageable pageable);
}
