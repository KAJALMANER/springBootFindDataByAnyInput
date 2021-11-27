package com.csi.controller;

import com.csi.model.Product;
import com.csi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;


     @PostMapping("/savedata")
     public ResponseEntity<String> saveData(@RequestBody Product product)
    {
        productService.saveData(product);
        return ResponseEntity.ok("data save successfully");
    }

    @PostMapping("/getdatabyanyinput")
    public ResponseEntity <List<Product>> getDataByAnyInput(@RequestBody Product product)
    {
        return ResponseEntity.ok(productService.getAllData(product));
    }
    @GetMapping("/bye")
    public String byeWorld(){
    	return "bye bye kajal Maner!!!";
    }
}
