class Solution {
    public List<Integer> majorityElement(int[] nums) {
           List<Integer> lst = new ArrayList<>();
        int n = nums.length / 3; 
        Map<Integer, Integer> map = new HashMap<>();

        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                lst.add(entry.getKey());
            }
        }

        return lst;
    }
        
    }
