package com.dealbab.exception;

public class CategoryAlreadyExistsException extends RuntimeException {
	public CategoryAlreadyExistsException(Integer integer) {
        super("Category already exists for ID: '" + integer + "'");
    }
}
