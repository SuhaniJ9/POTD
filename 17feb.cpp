class Solution{
    public:
    bool isMaxHeap(int arr[], int n)
    {
         int i=0;
        while(i<n){
            int x=2*i+1;
            if(x<n && arr[i]<arr[x]){
                return false;
            }
            x=2*i+2;
            if(x<n && arr[i]<arr[x]){
                return false;
            }
            i++;
        }
        return true;
    }
};
