package com.example.finaltab.service;

import com.example.finaltab.dto.ItemDTO;
import java.util.List;

public interface ItemService {
    ItemDTO createItem(ItemDTO itemDTO);

    List<ItemDTO> getAllItems();
}
