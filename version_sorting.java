


    
public class Solution {
    
    
public static void main(String[] args) {
        System.out.println("Hello World!");
    String[] arr = new String[] {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};

        String response[] = solution(arr);
    
    for (int i=0; i<response.length ; i++ )
        System.out.println( response[i] );
        
    }
    
    
    public static String[] solution(String[] l) {
        
// This is bubble sort, used to sort array, and I need it to modify only in the if cluase to include version numbering too
for (int i = 0; i < l.length; i++)   
    {  
        for (int j = i + 1; j < l.length ; j++)   
        { 
            // split the numbers by a dot (.) for the first loop element 
            int splitted[] = splitAndConvert(l[i]);
            int majorOld=splitted[0];
            int minorOld =splitted[1];
            int revisionOld = splitted[2];
            // split the numbers by a dot (.) for the second loop elemetns
            splitted = splitAndConvert(l[j]);
            int majorNew=splitted[0];
            int minorNew =splitted[1];
            int revisionNew = splitted[2];
            
            String tmp = "";
            //modification is needed here to the bubble sort
            if( (majorOld > majorNew) || (majorOld == majorNew && minorOld > minorNew ) ||  (majorOld == majorNew && minorOld == minorNew && revisionOld > revisionNew )  )
             {  
                tmp = l[i];  
                l[i] = l[j];  
                l[j] = tmp; 
            }
            
            
        }
        
    }
      return l;  
        
    }
    
    // split version number by dot (.)
    static int[] splitAndConvert(String str){
        String splittedStr[] = str.split("\\.") ;
        int splittedNum[] = new int[3];
        splittedNum[0] = Integer.parseInt(splittedStr[0]);
        if(splittedStr.length>1)
            splittedNum[1] = Integer.parseInt(splittedStr[1]);
        else 
            splittedNum[1] = -1;
        if(splittedStr.length>2)
            splittedNum[2] = Integer.parseInt(splittedStr[2]);
        else
            splittedNum[2] = -1;
        
        return splittedNum;
    }
    
    
    
    
}
