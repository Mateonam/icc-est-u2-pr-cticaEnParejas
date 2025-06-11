package Model;

public class Contact{
    private String name;
    private int phone;
    
    public Contact(String name) {
        this.name = name;
    }

    public Contact(int phone){
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", phone=" + phone + "]";
    }
}
