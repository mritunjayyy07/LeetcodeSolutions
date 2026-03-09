class Solution {

    int validatePoints(int[] p1, int[] p2, int[] p3) {
        int x1 = p1[0], y1 = p1[1];
        int x2 = p2[0], y2 = p2[1];
        int x3 = p3[0], y3 = p3[1];

        return (y3 - y2) * (x2 - x1) - (y2 - y1) * (x3 - x2);
    }

    public int[][] outerTrees(int[][] trees) {

        Arrays.sort(trees, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        Deque<int[]> lower = new ArrayDeque<>();
        Deque<int[]> upper = new ArrayDeque<>();

        for (int[] point : trees) {

            while (lower.size() >= 2) {
                int[] p2 = lower.removeLast();
                int[] p1 = lower.peekLast();

                if (validatePoints(p1, p2, point) < 0) {
                    continue;
                } else {
                    lower.addLast(p2);
                    break;
                }
            }

            while (upper.size() >= 2) {
                int[] p2 = upper.removeLast();
                int[] p1 = upper.peekLast();

                if (validatePoints(p1, p2, point) > 0) {
                    continue;
                } else {
                    upper.addLast(p2);
                    break;
                }
            }

            lower.addLast(point);
            upper.addLast(point);
        }

        Set<String> set = new HashSet<>();
        List<int[]> res = new ArrayList<>();

        for (int[] p : lower) {
            String key = p[0] + "," + p[1];
            if (set.add(key)) res.add(p);
        }

        for (int[] p : upper) {
            String key = p[0] + "," + p[1];
            if (set.add(key)) res.add(p);
        }

        return res.toArray(new int[res.size()][]);
    }
}