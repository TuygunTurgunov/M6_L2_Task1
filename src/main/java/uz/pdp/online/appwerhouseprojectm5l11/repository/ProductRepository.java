package uz.pdp.online.appwerhouseprojectm5l11.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.appwerhouseprojectm5l11.entity.Product;
import uz.pdp.online.appwerhouseprojectm5l11.projection.CustomProduct;

import java.util.List;




@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {

    boolean existsByNameAndCategoryId(String name, Integer category_id);
    Page<Product>findAllByCategoryId(Integer category_id, Pageable pageable);




}
