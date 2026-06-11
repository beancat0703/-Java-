public class Main 
{
    public static void main(String[] args)
    {
        Greeting greeting = new Greeting()
        {
            @Override
            public void sayHello()
            {
                System.out.println("你好，欢迎学习Java！");
            }
        };
        greeting.sayHello();
    }
}
