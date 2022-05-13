package com.connectyu.test.model;


public class CakeType {

  private long id;
  private String name;

  public CakeType(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public CakeType() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
