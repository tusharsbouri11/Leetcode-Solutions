class Solution {
    public int lengthOfLongestSubstring(String s) {

        ArrayList<Character> h=new ArrayList<>();
        int max=0, l=0, r=0;

        for(r=0;r<s.length();r++)
        {
            while(h.contains(s.charAt(r))  )
            {
                h.remove( h.get(0));
                l++;
            }
            h.add(s.charAt(r));

            max=Math.max(max, r-l+1);
        }

        return max;

    }
}
