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
class Salary {
    public static void main(String[] args)
    {
        double gross,net,DA,HRA,CCA=240,PF,PT=100,basic = 25000;
        DA  = (basic *.7);

        PF  = basic*(10/100);
        HRA = basic*(30/100);

        gross = DA+HRA+CCA+basic;
        net =   gross - PF - PT;
        System.out.println("Gross Salary and Net Salary! "+gross+"  "+ net);
    }
}
