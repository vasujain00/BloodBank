/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shivam;

public class Geometry {

 private Location location ;
 
 private String location_type;
 
 
 private Object bounds;
 
 
 
 private Object viewport;

 public Location getLocation() {
  return location;
 }

 public void setLocation(Location location) {
  this.location = location;
 }

 public String getLocation_type() {
  return location_type;
 }

 public void setLocation_type(String location_type) {
  this.location_type = location_type;
 }

 public Object getBounds() {
  return bounds;
 }

 public void setBounds(Object bounds) {
  this.bounds = bounds;
 }

 public Object getViewport() {
  return viewport;
 }

 public void setViewport(Object viewport) {
  this.viewport = viewport;
 }
 
 
 
 
}