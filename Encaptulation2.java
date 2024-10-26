class Area {
    int length;
    int breadth;

    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length * breadth;
        System.out.println("Aera: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Area rectange = new Area(2, 16);
        rectange.getArea();
    }
}