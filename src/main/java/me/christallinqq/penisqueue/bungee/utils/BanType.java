package me.christallinqq.penisqueue.bungee.utils;

/**
 * How shadowbanned people should be punished.
 */
public enum BanType {
    /**
     * Loop forever in queue!
     */
    LOOP,

    /**
     * Have a 10% chance of getting into the server!
     */
    TENPERCENT,

    /**
     * Kick a player while joining!
     */
    KICK
}
