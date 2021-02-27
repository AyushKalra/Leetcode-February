class Solution {
    public int divide(int dividend, int divisor) {
        
        long sign = ((dividend < 0) ^ 
            (divisor < 0)) ? -1 : 1; 
 

long dividend_new = Math.abs((long)dividend); 
long divisor_new = Math.abs((long)divisor); 
 

long quotient = 0, temp = 0; 
 
 
for (int i = 31; i >= 0; --i) 
{ 
 
    if (temp + (divisor_new << i) <= dividend_new) 
    { 
        temp += divisor_new << i; 
        quotient |= 1L << i; 
    } 
} 
    if(sign*quotient>Integer.MAX_VALUE)
           return Integer.MAX_VALUE;
    else    
    return (int)(sign*quotient); 
    }
} 