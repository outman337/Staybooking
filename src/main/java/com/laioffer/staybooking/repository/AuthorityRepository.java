package com.laioffer.staybooking.repository;


import com.laioffer.staybooking.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// spring help us create the method, we don't need to write them
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {


}
