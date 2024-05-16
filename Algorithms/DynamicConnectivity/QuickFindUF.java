package projects.dynamic_connectivity;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for(int i = 0; i < id.length; i++) {
            if(id[i] == pid) id[i] = qid;
        }
    }
}

//https://www.notion.so/Union-Find-dynamic-connectivity-5cfbb81b87944467a85845354f11917a
