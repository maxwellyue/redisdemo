package com.maxwell.redisdemo.service;

import com.maxwell.redisdemo.dao.ProductDao;
import com.maxwell.redisdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年07月15日 --  下午4:56 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Service
@CacheConfig(cacheNames = "products")
public class ProductService {

    @Autowired
    private ProductDao productDao;

    //todo 待解决：如何保证在产品变更后清除此缓存，其他正常
    @Cacheable
    public List<Product> getAllProduct(){
        return productDao.getAll();
    }

    @CacheEvict(key = "'product_' + #id")
    public void delete(Integer id){
        productDao.delete(id);
    }

    @CacheEvict(key = "'product_' + #product.id")
    public void add(Product product){
        productDao.add(product);
    }

    @CacheEvict(key = "'product_' + #product.id")
    public void update(Product product){
        productDao.update(product);
    }

    @Cacheable(key = "'product_' + #id")
    public Product get(Integer id){
        return productDao.get(id);
    }
}
