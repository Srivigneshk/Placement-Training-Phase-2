public class program4 {
    class shape{
        void area(){
            System.out.println("Area : ");
        }
        void area(int a){
            int sq = a * a;
            System.out.println("Area : " + sq);
        }
        void area(int a, int b){
            int rect = a * b;
            System.out.println("Area : " + rect);
        }
        void area(double a,int b){
            int tri = (int)(0.5 * a * b);
            System.out.println("Area : " + tri);
        }
        void area(float a, int b, int c){
            int trap = (int)(0.5 * (a + b) * c);
            System.out.println("Area : " + trap);
        }
    }
    void main(String[] args){
        shape s = new shape();
        s.area();
        s.area(5);
        s.area(5, 10);
        s.area(5.5, 10);
        s.area(5.5f, 10, 15);
    }
}