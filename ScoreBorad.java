public class ScoreBorad {
    private GameEntry[] bored;
    private int numOfEntries = 0;

    public ScoreBorad(int capacity) {
        bored = new GameEntry[capacity];


    }

    public void add(GameEntry e) {
        int newScore = e.getScore();
        if (numOfEntries < bored.length || newScore > bored[numOfEntries - 1].getScore()) {


        }
        if (numOfEntries < bored.length)
            numOfEntries++;
        int j = numOfEntries - 1;
        while (j > 0 && newScore > bored[j - 1].getScore()) {


            bored [j]=bored[j-1];
            j--;


        }
        bored[j]=e;
    }
    public GameEntry remove(int index )throws IndexOutOfBoundsException{
        if (index <0||index >numOfEntries-1)
            throw new IndexOutOfBoundsException("IHJMKLHBJNK"+index);
        GameEntry deleted=bored[index];
        for (int i = index; i <numOfEntries  ; i++) {
            bored[i]=bored[i+1];

        }
        bored[numOfEntries-1]=null;
        numOfEntries--;
        return deleted;
    }
    public void  viewALL    ()
    {
        System.out.println("[");
        for(GameEntry g:bored){
            System.out.println(g+"\t");
        }
        System.out.println("]");

    }
}