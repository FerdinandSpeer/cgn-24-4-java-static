package org.example.Challenge2;

public class Count {
    private int instanceCount = 0;
    private static int totalCount = 0;

    public Count(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int newTotalCount) {
        Count.totalCount = newTotalCount;
    }

    @Override
    public String toString() {
        return "totalCount{" +
                "instanceCount=" + instanceCount +
                " totalCount=" + totalCount +
                '}';
    }

    //Challenge2:
    //Step2: static method
    public static void incrementTotalCount(){
        totalCount++;
    }
    //Step 3:
    public void incrementInstanceCount(){
        instanceCount++;
    }

}
