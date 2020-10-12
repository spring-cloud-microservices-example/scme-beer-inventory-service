package com.ncjoshi.beer.inventory.service.repositories;

import com.ncjoshi.beer.inventory.service.domain.BeerInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by ncj on 12 Oct, 2020.
 */
public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {

    List<BeerInventory> findAllByBeerId(UUID beerId);
}
