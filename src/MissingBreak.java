class MissingBreak {
    public static void main(String[] args)
    {
        int x;
        for(x=0;x<10;x++)
        {
            switch (x){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("X is Less than 4 ");
                    break;
                case 5:
                case 6:
                case 7:
                    System.out.println("X is greater than 4 and Less than 8");
                    break;
                default:
                    System.out.println("This is Default ");
            }

        }


    }
}
