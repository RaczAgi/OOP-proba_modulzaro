import java.util.ArrayList;
import java.util.List;
package animal;

public abstract class Animal {

 private final String name;

  private List<String> nickName;

  public Animal(String name) {
    this.name = name;
    this.nickName = new ArrayList<>();
  }



    public String getName() {
        return name;
    }


    public List<String> getNickName() {
        return this.nickName;
    }

    public void addNickName(String nickName) {
        this.nickName.add(nickName);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", nickName=" + nickName +
                '}';
    }
}
