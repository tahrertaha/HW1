public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length;
int[] queue = new int[n];
int[] distance = new int[n];
boolean[] visited = new boolean[n];

int front = 0;
int back = 0;

queue[back] = i;
back++;
visited[i] = true;

while (front < back) {
    int current = queue[front];
    front++;

    if (current == j) {
        return distance[current];
    }

    for (int neighbor = 0; neighbor < n; neighbor++) {
        if (m[current][neighbor] == 1 && !visited[neighbor]) {
            visited[neighbor] = true;
            distance[neighbor] = distance[current] + 1;
            queue[back] = neighbor;
            back++;
        }
    }
}
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}