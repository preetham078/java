class Static {
    static String name = "eran";
    int age;

    Static(int age) {
        this.age = age;
    }

    void print() {
        System.out.println(name + " " + age);
    }
    static void printChar(int a)
    {
        
        System.out.println(a + "static method");
    }

    public static void main(String[] args) {
        Static o = new Static(20);
        Static o2 = new Static(210);
        o.print();
        o2.print();
        Static.printChar(5);
        
    }
}
