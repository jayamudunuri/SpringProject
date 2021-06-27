package com.jaya.SpringSecurityGrocerySaleProject;

import org.springframework.data.jpa.repository.JpaRepository;



public interface SalesRepository extends JpaRepository<Sale, Long> {

}
