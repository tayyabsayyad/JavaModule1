/*
Implement a java program to calculate gross salary & net salary taking the following data.
Input: empno, empname, basic
Process:
DA=70% of basic
HRA=30% of basic
CCA=Rs240/-

PF=10% of basic
PT= Rs100/-
 */

class Salary2 {
    public static void main(String[] args)
    {
        float basic = 25000, DA,HRA,PF,PT,gross,net,CCA = 240;

        DA = 0.7f * basic;
        HRA = (float) (0.3 * basic);

        gross = DA+HRA+CCA+basic;
        net = gross - (float) (0.1f * basic) - 100;

        System.out.println(" Gross =  and Net =  "+gross+"  "+net);
    }
}
