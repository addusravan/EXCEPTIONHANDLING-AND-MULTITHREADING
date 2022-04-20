

class ItemNotFound extends RuntimeException
{
    public ItemNotFound(String s) {
        super(s);
    }

}

class Demo
{
    static void find(int arr[], int item) throws ItemNotFound
    {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(item == arr[i])
                flag = true;
        }
        if(!flag)
        {
            throw new ItemNotFound("Not Found");
        }
        else
        {
            System.out.println("Found");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            find(new int[]{12,25,45}, 10);
        }
        catch(ItemNotFound i)
        {
            System.out.println(i);
        }
    }
}

