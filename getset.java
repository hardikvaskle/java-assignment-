class Employee{
    int id;
    String name;

    public void setid(int i){
       this.id = i;
    }

    public int getid (){
        return id;
    }

    public void setname (String n){
        this.name = n;
    }

    public String getname (){
        return name;
    } 
}

public class getset {
    public static void main(String[] args) {
        Employee tiku = new Employee();
      
        tiku.setid(2);
        System.out.println( tiku.getid());

        tiku.setname("hardik");
        System.out.println(tiku.getname());

    }   
}
