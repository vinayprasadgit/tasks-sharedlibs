package com.demo
class Vehicle implements Serializable
{
   String name
   String color
   Vehicle(String name,String color){
    this.name=name
    this.color=color
  }
   String display(){
      return "Car Name : $name, Car Color : $color"
   }
}
  
