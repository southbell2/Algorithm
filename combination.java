public class Combination {
    static void combination(int[] arr, boolean[] visited, int start, int r) {
        //원하는 만큼 뽑았으면 할것들을 처리한다 여기선 print함수
        if (r == 0) {
            print(arr, visited);
            return;
        }
        //재귀적으로 조합을 뽑는다
        for (int i = start; i < arr.length; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, r - 1);
            visited[i] = false;
        }
    }

    static void print(int[] arr, boolean[] visited) {
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
  
  public static void main(String args[]) { 
    int[] arr = {1,2,3,4,5};
    boolean[] visited = new boolean[arr.length];
    combination(arr,visited,0,3);
  } 
}
