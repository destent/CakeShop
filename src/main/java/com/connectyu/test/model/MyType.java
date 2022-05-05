package com.connectyu.test.model;


public class MyType {

  private long id;
  private String name;

  public MyType(int id,String name) {
    this.id = id;
    this.name = name;
  }

  public MyType() {
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
