
class ATM {
    public static void main(String[] args)
    {
        double amt_to_withdraw=-20, account_balance=1000;

        //check the input
        if( amt_to_withdraw>0 && amt_to_withdraw <= 2000 && amt_to_withdraw%5==0 && account_balance>0 && amt_to_withdraw+.5<account_balance)
        {
            account_balance = account_balance-amt_to_withdraw-.5;
        }
        System.out.println("Balance : "+account_balance);
    }
}

/*


4. Check if we can deduct the charges , Deduct charges
5. Calculate and display
6. Output Balance after withdrawal in any case
 */

