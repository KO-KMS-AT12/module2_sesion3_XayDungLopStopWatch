
public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long end() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
