package com.hazelcast.monitor;

/**
 * Created by emrah on 01/02/2017.
 */
public interface MonitoringService {

    void start();
    void stop();
    void update(TimedMemberState timedMemberState);

}
