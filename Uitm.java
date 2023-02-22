public abstract class Uitm {
    String id;
    String branch;
    int age;

    public Uitm(){  //default constructor
        id = null;
        branch = null;
        age = 0;
    }

    public Uitm(String ic,String br,int age){ //normal constructor
        id = ic;
        branch = br;
        this.age = age;
    }

    public String getId(){return id;} //accessor method
    public String getBranch(){return branch;}
    public int getAge(){return age;}

    public abstract double calcFee(); //processor method

    public String toString(){ //print method
        return "Id : " + id + 
        "\nBranch : " + branch +
        "\nAge : " + age;
    }
}   
