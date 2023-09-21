//import java.util.ArrayList;
/* 
public class App {
    public static void main(String[] args) throws Exception {
        Integer[] array = {2, 1, 3};
        Stack<Integer> s;

        //checking second constructor
        s = new Stack<Integer>(array);
        System.out.println(s);
        System.out.println();

        // check if push works
        s.push(5);
        System.out.println(s);
        System.out.println();

        // check if pop works
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println();

        //check if peek works
        System.out.println(s.peek());
        System.out.println();

        // check if isEmpty works
        System.out.println(s.isEmpty());

        s = new Stack<Integer>();
        System.out.println(s.isEmpty());

    }
}
*/


public class App {
    public static void main(String[] args) throws Exception {
    
        
        System.out.println(App.postfix("45+9/"));
        System.out.println(App.postfix("23-5*"));

    }


public static int postfix(String exp)
{
    Stack<Integer> operands = new Stack<Integer>();

    while (!exp.equals(""))
    {
        String bit = "";
        bit = exp.substring(0, 1);
        exp = exp.substring(1);
        if (isNum(bit))
        {
            operands.push(Integer.parseInt(bit));
        }
        else
        {
            Integer second = operands.pop();
            Integer first = operands.pop();

            switch (bit)
            {
                case "*":
                    operands.push(first * second);
                break;

                case "/":
                    operands.push(first / second);
                break;

                case "+":
                    operands.push(first + second);
                break;

                case "-":
                    operands.push(first - second);
                break;
            }
            
        }
    }
    return operands.pop();

    

}


// is it a number??
public static boolean isNum(String inp)
{
    try
    {
        Integer.parseInt(inp);
        return true;
    }
    catch (NumberFormatException e)
    {
        return false;
    }
}
}