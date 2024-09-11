class Emp {
    int id;
    String name;

    public void setname(String n){
        name = n; 
    }

    public String getname(){
        return name ;
    }

    public void setid(int i)  {
        id = i;
    }

    public int getid(){
        return id ;
    }
} 


public class set {
    public static void main(String[] args) {
        Emp har = new Emp();

        har.setname("hardik");
        System.out.println(har.getname());

        har.setid(2);
        System.out.println(har.getid());
    }
}
