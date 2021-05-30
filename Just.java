class Just {
    public static void main(String[] args) {

        System.out.println("Hi jahangir Start You Programe");

        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
        
    }


}


//Interface 
interface palygone{
    void getArea(int length, int breadth);
}
//Implement the polygone interface
class Rectangle implements palygone{

    @Override
    public void getArea(int length, int breadth) {
        // TODO: Auto-generated method stub
        System.out.println("the area of the rectangle is " + (length * breadth));

        
        
    }
    
}
//
