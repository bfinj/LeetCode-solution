/*
 * @lc app=leetcode.cn id=793 lang=java
 *
 * [793] 阶乘函数后K个零
 *
 * https://leetcode-cn.com/problems/preimage-size-of-factorial-zeroes-function/description/
 *
 * algorithms
 * Hard (35.69%)
 * Likes:    48
 * Dislikes: 0
 * Total Accepted:    2.3K
 * Total Submissions: 6.3K
 * Testcase Example:  '0'
 *
 *  f(x) 是 x! 末尾是0的数量。（回想一下 x! = 1 * 2 * 3 * ... * x，且0! = 1）
 * 
 * 例如， f(3) = 0 ，因为3! = 6的末尾没有0；而 f(11) = 2 ，因为11!= 39916800末端有2个0。给定
 * K，找出多少个非负整数x ，有 f(x) = K 的性质。
 * 
 * 
 * 示例 1:
 * 输入:K = 0
 * 输出:5
 * 解释: 0!, 1!, 2!, 3!, and 4! 均符合 K = 0 的条件。
 * 
 * 示例 2:
 * 输入:K = 5
 * 输出:0
 * 解释:没有匹配到这样的 x!，符合K = 5 的条件。
 * 
 * 
 * 注意：
 * 
 * 
 * 
 * K是范围在 [0, 10^9] 的整数。
 * 
 * 
 * 
 */

// @lc code=start

class Solution {
    public int preimageSizeFZF(long K) {
        long lo = K, hi = 10*K + 1;
        while (lo < hi) {
            long mi = lo + (hi - lo) / 2;
            long zmi = zeta(mi);
            if (zmi == K) return 5;
            else if (zmi < K) lo = mi + 1;
            else hi = mi;
        }
        return 0;
    }

    public long zeta(long x) {
        if (x == 0) return 0;
        return x/5 + zeta(x/5);
    }
}

// @lc code=end

