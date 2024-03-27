public class Set {
    int data[];
    public Set(){
        this.data = new int[]{34,56,78,90};
    }
    public Set(int[] data){
        this.data = data;
    }
    public boolean isExist(int[] data,int value){
        boolean isPresent = false;
        for(int i =0 ;i< data.length;i++){
            if (data[i] ==  value){
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }
    public int length(){
        return this.data.length;
    }
    public int[] union(Set obj){
        int counter = 0;
        int[] arr = new int[this.length()+obj.length()];
        for(int i=0;i<this.data.length;i++){
            arr[i]=this.data[i];
        }
        counter = this.data.length;
        for(int i=0; i<obj.data.length;i++){
            if(!isExist(arr,obj.data[i])){
                arr[counter]=obj.data[i];
                counter ++;
            }
        }
        int[] outputArr = new int[counter];
        for (int i=0; i< counter;i++){
            outputArr[i] = arr[i];
        }
        return outputArr;
    }
    
    public String toString(){
        String res = "[ ";
        if (this.data.length!=0) res+=data[0];

        for (int i = 1;i<this.data.length;++i){
            res += " , "+data[i];
        }
        res+= " ]";
        return res;
    }

    public static void main(String args[]){
        Set SetA = new Set(new int[]{23,56,78,90});
        Set SetB = new Set(new int[]{20,50,78,95});
        System.out.println("Set A - "+SetA);
        System.out.println("Set B - "+SetB);
        System.out.println("Union of Set A & Set B - "+new Set(SetA.union(SetB)));
    }
}