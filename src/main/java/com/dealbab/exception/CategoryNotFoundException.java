package com.dealbab.exception;

public class CategoryNotFoundException extends RuntimeException {

    private Integer errorMessage;

    public CategoryNotFoundException(Integer id){
        this.errorMessage = id;
    }

    public Integer getErrorMessage() {
        return errorMessage;
    }

}
 