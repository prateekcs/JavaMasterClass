package course.exceptionpkg;

public class MyException extends Exception{
    String messege;
    MyException(String messege){
        this.messege = messege;

    }
}
