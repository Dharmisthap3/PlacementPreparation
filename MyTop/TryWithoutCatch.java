
class TryWithoutCatch 
    {
        public static void main(String args[]) 
        {
            try 
            {
                System.out.print("A");
                throw new MyExc("Hello");
            }
            catch(Exception e) 
            {
                
            }
        }
    }


class MyExc extends Exception{
    MyExc(String s){
        super(s);
    }
}