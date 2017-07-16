package com.maxwell.redisdemo.web;

import com.maxwell.redisdemo.entity.Product;
import com.maxwell.redisdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年07月15日 --  下午4:55 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @PostMapping("/get/{id}")
    public Object getProduct(@PathVariable Integer id){
        return productService.get(id);
    }

    @PostMapping("/getAll")
    public Object getAllProduct(){
        return productService.getAllProduct();
    }

    @PostMapping("/add")
    public Object getProduct(@RequestBody Product product){
        productService.add(product);
        return "success";
    }

    @PostMapping("/update")
    public Object updateProduct(@RequestBody Product product){
        productService.update(product);
        return "success";
    }

    @PostMapping("/delete/{id}")
    public Object deleteProduct(@PathVariable Integer id){
        productService.delete(id);
        return "success";
    }

}
