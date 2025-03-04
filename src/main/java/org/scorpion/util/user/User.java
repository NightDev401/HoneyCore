package org.scorpion.util.user;

import org.bukkit.Location;
import org.scorpion.user.inventory.UserInterface;
import org.scorpion.util.Time;

import java.util.List;

/**
 * @author Lukas on 11/24/2021
 */
public interface User {

    boolean existPlayer();

    void createUser();

    int getMaxHomes();

    List<String> getHomes();

    Location getHome(String name);

    void addHome(String home);

    void removeHome(String home);

    void saveLocation(String name, Location location);

    void removeLocation(String name);

    String listHomes();

    boolean existHome(String name);

    Location getDeathPoint();

    void setDeathPoint(Location location);

    void setOnlineTime();

    String getOnlineTime();

    void ban(String reason, long ms, Time time);

    boolean isBanned();

    void unban();

    String getReason();

    long getTime();

    boolean hasGod();

    void setGod(boolean b);

    UserInterface getUserInterface();

}
