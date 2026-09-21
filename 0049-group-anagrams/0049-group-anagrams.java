class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chr = strs[i].toCharArray();
            Arrays.sort(chr); //Arrays.sort returns void as it returns nothing, it just sorts the array
            String key = new String(chr); //stroring the sorted element to make it a key;
                if(!map.containsKey(key)){  //checking if the map contains the key
                 List<String> list = new ArrayList<>();
                 list.add(strs[i]);
                 map.put(key,list);
                }
                else{
                     map.get(key).add(strs[i]);
                }
        }
      return new ArrayList<>(map.values());
    }
}