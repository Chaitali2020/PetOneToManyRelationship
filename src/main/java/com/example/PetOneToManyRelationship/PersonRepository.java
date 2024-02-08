package com.example.PetOneToManyRelationship;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "person1",path="person1")
public interface PersonRepository extends JpaRepository<Person1,Long>{

}
