package Interface;

public interface Mother extends GrandMa,GrandPa {
    /*
    * Default method in interface have access modifier public
    * and abstract keyword
    */
    void sayHello();
    Integer getAge();

    default String getCarBrand() {
        return "";
    }
}
