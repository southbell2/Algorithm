    
    static class Edge {
        int start;
        int end;
        int dist;

        public Edge(int start, int end, int dist) {
            this.start = start;
            this.end = end;
            this.dist = dist;
        }
    }


    public static boolean bellmanFord(int start) {
        //거리비용 테이블, 시작점을 0으로
        Arrays.fill(dist, INF);
        dist[start] = 0;
        boolean update = false;
        //노드가 n개일때 n-1번 루프를 돈다
        for (int i = 0; i < n - 1; i++) {
            update = false;
            //모든 edge에 대해 최소비용을 갱신해줄수 있으면 갱신해준다
            for (Edge edge : edges) {
                if (dist[edge.start] != INF && dist[edge.start] + edge.dist < dist[edge.end]) {
                    dist[edge.end] = dist[edge.start] + edge.dist;
                    update = true;
                }
            }
            //업데이트가 없으면 더 이상 루프를 돌지 않는다
            if(!update) break;
        }

        //음의 싸이클이 있는지 파악
        boolean flag = false;
        //음의 싸이클이 존재하면 최소비용이 한번 더 갱신된다
        for (Edge edge : edges) {
            //갱신되면 true 반환
            if (dist[edge.start] != INF && dist[edge.start] + edge.dist < dist[edge.end]) {
                flag = true;
                break;
            }
        }

        return flag;
    }
