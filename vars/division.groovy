def call(List<Integer> val){

  int mul = 0;
         
        boolean flag = false;
        for(int i=0;i<a1.size;i++){
            def a1 = [val[i]]
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
