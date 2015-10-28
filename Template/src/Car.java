/**
 * Created by amaliujia on 15-6-16.
 */
public abstract class Car {
    protected abstract boolean ifAlarm();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();

    public void run() {
        start();

        if (ifAlarm()) {
            alarm();
        }

        stop();
    }
}
