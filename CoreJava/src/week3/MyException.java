package week3;

public class MyException extends Exception {
    public MyException() {
//default constructor
    }
    public MyException(String s) {
        //parameterized constructor12
        super(s);
        System.out.println("Just for reference: In MyException constructor");
    }
        public void conversionToIntCustom(String s) throws MyException{
            try {
                int i = Integer.parseInt(s);
                System.out.println("Output:"+i);
                    //throw new MyException();
            }
            catch (NumberFormatException ne) {
               throw new MyException("Exception: Given input is not an Integer");
            }

        }
    }

