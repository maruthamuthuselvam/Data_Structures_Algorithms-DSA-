public class Allocate_Minimum_Pages {
    public static void main(String[] args) {
        int[] pages = {22, 23, 67};
        int persons = 1;
        System.out.println(FindMinPages(pages,persons));
    }
    static int FindMinPages(int[] pages , int persons){
        int start = Maxpage(pages);
        int end = SumofPages(pages);
        int ans = end;
        while( start < end){
            int mid = start + (end - start) / 2;
            if(FindPage(pages,mid,persons)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    static int Maxpage(int[] pages){
        int max = 0;
        for(int i : pages){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
    static int SumofPages(int[] pages){
        int sum = 0;
        for(int i : pages){
            sum += i;
        }
        return sum;
    }
    static boolean FindPage(int[] pages,int page,int persons){
        int currentallocation = 1;
        int currentpages = 0;
        for(int p : pages){
            if(currentpages + p <= page){
                currentpages += p;
            }
            else{
                currentallocation++;
                currentpages = p;
            }
        }
        return currentallocation <= persons;
    }
}
