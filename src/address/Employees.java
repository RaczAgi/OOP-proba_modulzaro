package address;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Employees {

 String name;
 Address address;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Address getAddress() {
  return address;
 }

 public void addAddress(Address address) {
  this.address = address;
 }
}
