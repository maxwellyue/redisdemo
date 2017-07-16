package com.maxwell.redisdemo.dao;

import com.maxwell.redisdemo.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年07月15日 --  下午4:17 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Mapper
public interface ProductDao {
    void delete(Integer id);
    void add(Product product);
    void update(Product product);
    Product get(Integer id);
    List<Product> getAll();
}
