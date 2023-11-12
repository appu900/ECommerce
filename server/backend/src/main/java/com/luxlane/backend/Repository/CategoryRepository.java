package com.luxlane.backend.Repository;

import com.luxlane.backend.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    public Category findByName(String name);


    @Query("Select c from Category c where c.name = :name and c.parentCategory.name = :parent")
    public Category findByNameAndParent(@Param("name") String name,@Param("parent")
    String parent);


}
