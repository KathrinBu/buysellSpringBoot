package com.example.buysell.services;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products=new ArrayList<>();
    private long ID=0;
    {
        products.add(new Product(++ID,"PlayStation","simple",7,"Spb","me"));
        products.add(new Product(++ID,"IPhone","simple",10,"Msc","Kk"));
    }

    public List<Product> listProducts() {
        return products;
    }
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product: products) {
            if (product.getId().equals(id))
                return product;
        }
        return null;
    }
}
