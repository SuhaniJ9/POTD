class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        if (q.isEmpty() || k > q.size())
            return q;

        // Using a stack to reverse the first k elements
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++)
            stack.push(q.poll());

        while (!stack.isEmpty())
            q.add(stack.pop());

        // Adding the remaining elements back to the queue
        for (int i = 0; i < q.size() - k; i++)
            q.add(q.poll());

        return q; // add code here.
    }
}
