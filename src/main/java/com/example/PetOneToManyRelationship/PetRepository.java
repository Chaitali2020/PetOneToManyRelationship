package com.example.PetOneToManyRelationship;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pet4", path="pet4")
public interface PetRepository{

}
