class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        wallet = sort(wallet);
        bill = sort(bill);
        while(bill[0]>wallet[0] || bill[1]>wallet[1]){
            answer++;
            bill[1] = bill[1]/2;
            wallet = sort(wallet);
            bill = sort(bill);
        }
        
        return answer;
    }
    
    public int[] sort(int[] a){
        int[] b = new int[2];
        
        if(a[0]>a[1]){
            b[0] = a[1];
            b[1] = a[0];
        }
        else{
            b[0] = a[0];
            b[1] = a[1];
        }
        return b;
    }
}