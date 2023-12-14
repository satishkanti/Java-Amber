public class Emp {
    private int id;
    private int phn_no;
    private String name;

    public Emp(int id, int phn_no, String name){
        this.id = id;
        this.phn_no = phn_no;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPhn_no() {
        return phn_no;
    }
    public void setPhn_no(int phn_no) {
        this.phn_no = phn_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", phn_no=" + phn_no + ", name=" + name + "]";
    }
    
    
}