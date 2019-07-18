package eu.flate.glc.steam.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class User {

    private String     steamId;
    private int        gameCount;
    private List<Game> games;

    public User(final String steamId) {
        this.steamId = steamId;
    }

    public User() { }

    public String getSteamId() {
        return steamId;
    }

    public void setSteamId(final String steamId) {
        this.steamId = steamId;
    }

    public int getGameCount() {
        return gameCount;
    }

    @JsonProperty("game_count")
    public void setGameCount(final int gameCount) {
        this.gameCount = gameCount;
    }

    public List<Game> getGames() {
        return games;
    }

    @JsonProperty("games")
    public void setGames(final List<Game> games) {
        this.games = games;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        final User user = (User) o;
        return getGameCount() == user.getGameCount() &&
               getSteamId().equals(user.getSteamId()) &&
               Objects.equals(getGames(), user.getGames());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSteamId(), getGameCount(), getGames());
    }

    @Override
    public String toString() {
        return "User{" +
               "steamId='" + steamId + '\'' +
               ", gameCount=" + gameCount +
               ", games=" + games +
               '}';
    }
}
