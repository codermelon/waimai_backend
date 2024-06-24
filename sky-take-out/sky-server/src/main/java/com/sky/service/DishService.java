package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * ClassName: DishService
 * Description:
 *
 * @author melon
 * @create 2024-06-24 15:35
 */
public interface DishService {
    /**
     * 新增菜品以及对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
