package course.exceptionpkg;

public class ExceptionSample {
    public static void main(String[] args) {
        //lint userInput = 0;
        try {
            doSomething();
            //MyException other class exception handle or custom exception
            throw new MyException("My messege");
            //luserInput = Integer.parseInt("8");
            // throw exception
            /*if(userInput == 1){
                throw new NumberFormatException("1 is not valid number");
            }*/
            //lString[] fruits = {"Bananas","Watermelon","Apples","Oranges"};
            //lSystem.out.println("User Picked "+ fruits[userInput - 1]);
        } catch (NumberFormatException e) {
            System.out.println("invalid number. you have to give only numbers");//by pass the block
            //e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Give numbers between 1 to 4");
            /*System.out.println("give numbers between 1 and 4");*/
        }//custom exception
        catch (MyException e){
            System.out.println("this is my own exception");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }/*finally {
            System.out.println("it will execute always");
        }*/

    }
    public static void doSomething() throws ArrayIndexOutOfBoundsException,NumberFormatException{
        {
            int userInput = 0;

                userInput = Integer.parseInt("1");
                String[] fruits = {"Bananas","Watermelon","Apples","Oranges"};
                System.out.println("User Picked "+ fruits[userInput - 1]);

            }
    }
}
