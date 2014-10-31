package com.netflix.simianarmy.chaos;

import com.netflix.simianarmy.MonkeyConfiguration;

/**
 * Kills docker container for peoples on the node.
 *
 * This simulates the process crashing (for any reason).
 */
public class FailDockerContainerChaosType extends ScriptChaosType {
    /**
     * Constructor.
     *
     * @param config
     *            Configuration to use
     * @throws IOException
     */
    public FailDockerContainerChaosType(MonkeyConfiguration config) {
        super(config, "FailDockerContainer");
    }
}
