package Practice37;

public class UniqueThreeDigit {
    public static void main(String[] args) {
        int amount =0;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=4; j++)
            {
                for(int k=1; k<=4; k++)
                {
                    if(k!=i && k!=j && i!=j)
                    {
                        amount++;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("Total number of Three Digit number is : "+amount);
    }
}


/*

123
124
132
134
142
143
213
214
231
234
241
243
312
314
321
324
341
342
412
413
421
423
431
432
Total number of Three Digit number is : 24

*/