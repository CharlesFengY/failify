package me.arminb.spidersilk.execution;

import me.arminb.spidersilk.exceptions.RuntimeEngineException;

import java.util.Set;

public interface LimitedRuntimeEngine {
    // Runtime Operation
    void killNode(String nodeName) throws RuntimeEngineException;
    void stopNode(String nodeName, Integer secondsUntilForcedStop) throws RuntimeEngineException;
    void startNode(String nodeName) throws RuntimeEngineException;
    void restartNode(String nodeName, Integer secondsUntilForcedStop) throws RuntimeEngineException;
    void clockDrift(String nodeName) throws RuntimeEngineException;
    void linkDown(String node1, String node2) throws RuntimeEngineException;
    void linkUp(String node1, String node2) throws RuntimeEngineException;
    void networkPartition(String nodePartitions) throws RuntimeEngineException;
    void removeNetworkPartition() throws RuntimeEngineException;
    // TODO Change int to ProcessResults
    long runCommandInNode(String nodeName, String command) throws RuntimeEngineException;

    // Runtime Info
    Set<String> nodeNames();
    String ip(String nodeName);

    // Events
    void waitFor(String eventName) throws RuntimeEngineException;
    void sendEvent(String eventName) throws RuntimeEngineException;
    void enforceOrder(String eventName) throws RuntimeEngineException;
}
