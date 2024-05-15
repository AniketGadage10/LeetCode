class Solution {
    public List<Integer> getRow(int rowIndex) {

        rowIndex=rowIndex+1;

       List< List<Integer> > ans=new ArrayList<>();
       List<Integer> a=new ArrayList<>();
           a.add(1);
           ans.add(a);

        for(int i=1;i<rowIndex;i++)
        {
                List<Integer> prev=ans.get(i-1);
                List<Integer> current=new ArrayList<>();
                 current.add(1);
                for(int j=1;j<i;j++)
                {
                    current.add(prev.get(j-1)+prev.get(j));
                }
                current.add(1);

                ans.add(current);
        }   
              System.out.println(ans.size());
         return ans.get(rowIndex-1);
           
        }
      
    }
