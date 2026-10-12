/*
 * @lc app=leetcode id=1381 lang=java
 *
 * [1381] Design a Stack With Increment Operation
 */

// @lc code=start
class CustomStack {

    int stack[];
    int top = 0;

    public CustomStack(int maxSize) {

        stack = new stack[maxSize];

    }

    public void push(int x) {

        if (top > stack.length) {

            stack[top] = x;
            top++;
        }

    }

    public int pop() {

        if (top == 0) {
            return -1;
        }

        top--;

        return stack[top];

    }

    public void increment(int k, int val) {

        if (k > 0) {
            top = k;
        }

        for (int i = 0; i < k; i++) {

            stack[top] += val;
        }

    }
}

/**
 * Your CustomStack object will be instantiated and called as such: CustomStack
 * obj = new CustomStack(maxSize); obj.push(x); int param_2 = obj.pop();
 * obj.increment(k,val);
 */
// @lc code=end

