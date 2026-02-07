class Solution {
public:
    int minimumDeletions(string s) {
        //using dp, prefix sum approach
        int n = s.size(), res = n;
        int a = 0, b = 0;
            //iamsagnik_15
        for (auto& c : s)
            a += c & 1;             //'a' = 97 (odd)

        for (auto& c : s) {
            a -= c & 1;
            res = min(res, a + b);
            b += ~c & 1;           //'b' = 98 (even)
        }

        return res;
    }
};
