public class Level_1 {

    /////////////////////////////
    int n = 250;
    int X8 = 8 * n;
    int C = n % 10;
    int add = 0;

    public int Accc(int n) {
        if ((X8 % 10 == C) && ((X8 / 10) % 10 == C) && ((X8 / 100) % 10 == C)) {
            return AddABC(n);
        } else return 0;
    }

    public int AddABC(int n) {
        if (n < 1) {
            return 8;
        } else return n % 10 + AddABC(n / 10);
    }
}
/////////////////////////////

 //   public int SumTwoDigi(int a, int b){

/////////////////////////////

//    public int MultiX(){}