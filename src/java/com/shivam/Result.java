/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shivam;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * 
 * 
 * @author Abhishek Somani
 * 
 */
public class Result {
 
 private String formatted_address;
 
 private boolean partial_match;
 
 private Geometry geometry;
 
 
 private Object address_components;
 
 
 private Object types;

 public String getFormatted_address() {
  return formatted_address;
 }

 public void setFormatted_address(String formatted_address) {
  this.formatted_address = formatted_address;
 }

 public boolean isPartial_match() {
  return partial_match;
 }

 public void setPartial_match(boolean partial_match) {
  this.partial_match = partial_match;
 }

 public Geometry getGeometry() {
  return geometry;
 }

 public void setGeometry(Geometry geometry) {
  this.geometry = geometry;
 }

 public Object getAddress_components() {
  return address_components;
 }

 public void setAddress_components(Object address_components) {
  this.address_components = address_components;
 }

 public Object getTypes() {
  return types;
 }

 public void setTypes(Object types) {
  this.types = types;
 }
 
 
 
}