package se.callista.springmvc.asynch.common;

/**
 * Created by magnus on 18/07/14.
 */
public interface Error {
    public void onThrowable(Throwable t);
}
