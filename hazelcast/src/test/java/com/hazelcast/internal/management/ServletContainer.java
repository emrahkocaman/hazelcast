package com.hazelcast.internal.management;

public interface ServletContainer {

    public void restart() throws Exception;

    public void stop() throws Exception;

    public void start() throws Exception;

    public boolean isRunning();

}
