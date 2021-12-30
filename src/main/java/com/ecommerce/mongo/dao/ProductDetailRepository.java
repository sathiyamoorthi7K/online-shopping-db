package com.ecommerce.mongo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.product.ProductDetail;
import com.ecommerce.model.product.ProductImage;

@Repository
@EnableMongoRepositories("com.ecommerce.mongo.dao")
public interface ProductDetailRepository extends MongoRepository<ProductDetail, String>{
	public ProductDetail save(ProductDetail productDetail);
	public ProductImage save(ProductImage productImage);
	public List<ProductDetail> findAll();
	public Optional<ProductDetail> findById(String id);
	public List<ProductDetail> findByCategory(String category);
}
