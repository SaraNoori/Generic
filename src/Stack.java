import java.util.ArrayList;

//self remember: top of stack is end of list!!
public class Stack<T> 
{
    T item;
    private ArrayList<T> arrayT;

    // constructors
    public Stack()
    {
        arrayT = new ArrayList<T>();
    }

    // if user has existing values, allow them to default put in :)
    public Stack(T [] elements)
    {
        arrayT = new ArrayList<T>();
        for (T element : elements)
        {
            arrayT.add(element);
        }
    }

    // push method (place item at top of stack)
    public void push(T element)
    {
        arrayT.add(element);
    }

    // pop method (take from top of stack)
    public T pop()
    {
        T element = arrayT.get(arrayT.size() - 1);
        arrayT.remove(element);
        return element;
    }

    // peek method (look at top element)
    public T peek()
    {
        return arrayT.get(arrayT.size() - 1);
    }

    // isEmpty method (returns true if empty)
    public boolean isEmpty()
    {
        if (arrayT.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }



    // -------
    // for testing purposes
    public String toString()
    {
        String st = "";
        for (T element : arrayT)
        {
            st += element + " ";
        }
        return st;
    }
    
}
