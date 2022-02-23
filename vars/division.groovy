def call(int... args){

  int mul = 0;
        int[] a1 = new int[]{arg1,arg2,arg3};
        boolean flag = false;
        for(int i=0;i<a1.length;i++){
            if (a1[i] % 7 == 0) {
                int x;
                x = a1[i] * 2;
                mul = mul + x;
                flag = true;
            }

        }
        if(flag == false){
            println("No Number found...");
        }
           println(mul);

  
}
