package homework.homework9.Exceptions;

public class CD implements AutoCloseable
{
    @Override
    public void close()  {
        System.out.println("Closing CD");
    }
}

