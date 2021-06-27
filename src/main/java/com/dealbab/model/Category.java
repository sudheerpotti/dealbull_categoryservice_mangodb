package com.dealbab.model;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Category")
public class Category {
	

    private Integer id;
    private String catName;
    private String catType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatType() {
		return catType;
	}
	public void setCatType(String catType) {
		this.catType = catType;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", catName=" + catName + ", catType=" + catType + "]";
	}

}