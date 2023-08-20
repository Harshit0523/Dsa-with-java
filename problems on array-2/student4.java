
class student5{
    int id;
    String name;
    student5(int i, String n){
        id =i;
        name = n;
    }

    student5(){
        id=15;
        name="hello";
    }

}

public class student4 {
    public static void main(String[] args) {
        student5 obj = new student5();
        System.out.println(obj.id);
    }

}
