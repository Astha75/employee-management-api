package com.astha.employee;
public class ResourceNotFoundException extends RuntimeException { public ResourceNotFoundException(String type,Long id){super(type+" with id "+id+" was not found");} }
