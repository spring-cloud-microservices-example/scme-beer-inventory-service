package com.ncjoshi.beer.inventory.service.web.mappers;

import com.ncjoshi.beer.inventory.service.domain.BeerInventory;
import com.ncjoshi.beer.inventory.service.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

/**
 * Created by ncj on 12 Oct, 2020.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}