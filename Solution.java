public JumpGameII {
    public int  jump(int []s) {
    
        int jump =0;
        int currend =0;
        int farthest =0;
        for(int i = 0 ;i<s.length-1;i++){
            int reach = s[i]+i;
            if(reach > farthest){
                farthest=reach;
            }
            if(i == currend){
                jump++;
                currend=farthest;
            }
        }
        return jump;
    }
} {
    
}
