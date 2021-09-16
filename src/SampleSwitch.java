/*
    Write about the program here
 */
class SampleSwitch {
    public static void main(String[] args)
    {
            for(int x = 0; x<10; x++ )
            {
                String y = "0";

                switch(y){
                    case "0":
                            System.out.println("I is Zero !");
                            break;
                    case "1":
                            System.out.println("I is One !");
                            break;
                    default:
                        System.out.println("This is default case ");
                }
            }


    }
}

