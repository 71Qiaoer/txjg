package com.example.finaltab.service.impl;

import com.example.finaltab.dao.ItemDAO;
import com.example.finaltab.dto.ItemDTO;
import com.example.finaltab.entity.Item;
import com.example.finaltab.service.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemDAO itemDAO;

    public ItemServiceImpl(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    @Override
    public ItemDTO createItem(ItemDTO itemDTO) {
        Item item = new Item();
        BeanUtils.copyProperties(itemDTO, item);
        Item savedItem = itemDAO.save(item);
        ItemDTO resultDTO = new ItemDTO();
        BeanUtils.copyProperties(savedItem, resultDTO);
        return resultDTO;
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return null;
    }

}
