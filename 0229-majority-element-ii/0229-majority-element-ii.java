class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int count1=0;
        int count2=0;
        int element1=0;
        int element2=0;

        for(int i=0;i<n;i++){
            if(count1==0 && nums[i]!=element2){
                count1=1;
                element1=nums[i];              
            }
            else if(count2==0 && nums[i]!=element1){
                count2=1;
                element2=nums[i];
            }
            else if(element1==nums[i]){
                count1++;
            }
            else if(element2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> list=new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(element1==nums[i]){
                count1++;
            }
            else if(element2==nums[i]){
                count2++;
            }
        }
        int min=((int)n/3)+1;
        if(count1>=min && count2>=min){
            list.add(element1);
            list.add(element2);
        }
        else if(count1>=min){
            list.add(element1);
        }
        else if(count2>=min){
            list.add(element2);
        }
        
        return list;
    }
}