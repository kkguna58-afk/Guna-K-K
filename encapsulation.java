class students {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }
}

public class student {
    public static void main(String[] args) {
        students s = new students();
        s.setId(101);
        s.setName("guna");
        System.out.println("ID:" + s.getId());
        System.out.println("Name:" + s.getId());
    }
}
