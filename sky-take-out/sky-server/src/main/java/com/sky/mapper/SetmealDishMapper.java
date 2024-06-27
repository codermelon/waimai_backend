package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SetmealDishMapper
 * Description:
 *
 * @author melon
 * @create 2024-06-27 15:11
 */
@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询关联套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
