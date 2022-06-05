class index {
    public static void main(String[] args) {
        char[] one={'1','a','2','b'};
        
        for(int i=0;i<one.length;i++){
            if(i%2==0){
                char temp=one[i];
                one[i]=one[i+1];
                one[i+1]=temp;
            }
         
        }
        System.out.println(one);
    }
}