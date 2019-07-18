package eu.flate.glc.steam.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {

    private int     appId;
    private String  name;
    private int     playTime2Weeks;
    private int     playTimeForever;
    private String  imgIconUrl;
    private String  imgLogoUrl;
    private boolean hasCommunityVisibleStats;

    public Game(@JsonProperty("appid") final int appId,
                @JsonProperty("name") final String name,
                @JsonProperty("playtime_2weeks") final int playTime2Weeks,
                @JsonProperty("playtime_forever") final int playTimeForever,
                @JsonProperty("img_icon_url") final String imgIconUrl,
                @JsonProperty("img_logo_url") final String imgLogoUrl,
                @JsonProperty("has_community_visible_stats") final boolean hasCommunityVisibleStats) {
        this.appId = appId;
        this.name = name;
        this.playTime2Weeks = playTime2Weeks;
        this.playTimeForever = playTimeForever;
        this.imgIconUrl = imgIconUrl;
        this.imgLogoUrl = imgLogoUrl;
        this.hasCommunityVisibleStats = hasCommunityVisibleStats;
    }

    public Game() {
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(final int appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPlayTime2Weeks() {
        return playTime2Weeks;
    }

    public void setPlayTime2Weeks(final int playTime2Weeks) {
        this.playTime2Weeks = playTime2Weeks;
    }

    public int getPlayTimeForever() {
        return playTimeForever;
    }

    public void setPlayTimeForever(final int playTimeForever) {
        this.playTimeForever = playTimeForever;
    }

    public String getImgIconUrl() {
        return imgIconUrl;
    }

    public void setImgIconUrl(final String imgIconUrl) {
        this.imgIconUrl = imgIconUrl;
    }

    public String getImgLogoUrl() {
        return imgLogoUrl;
    }

    public void setImgLogoUrl(final String imgLogoUrl) {
        this.imgLogoUrl = imgLogoUrl;
    }

    public boolean isHasCommunityVisibleStats() {
        return hasCommunityVisibleStats;
    }

    public void setHasCommunityVisibleStats(final boolean hasCommunityVisibleStats) {
        this.hasCommunityVisibleStats = hasCommunityVisibleStats;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        final Game game = (Game) o;
        return getAppId() == game.getAppId() &&
               getPlayTime2Weeks() == game.getPlayTime2Weeks() &&
               getPlayTimeForever() == game.getPlayTimeForever() &&
               isHasCommunityVisibleStats() == game.isHasCommunityVisibleStats() &&
               getName().equals(game.getName()) &&
               Objects.equals(getImgIconUrl(), game.getImgIconUrl()) &&
               Objects.equals(getImgLogoUrl(), game.getImgLogoUrl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAppId(),
                            getName(),
                            getPlayTime2Weeks(),
                            getPlayTimeForever(),
                            getImgIconUrl(),
                            getImgLogoUrl(),
                            isHasCommunityVisibleStats());
    }

    @Override
    public String toString() {
        return "Game{" +
               "appId=" + appId +
               ", name='" + name + '\'' +
               ", playTime2Weeks=" + playTime2Weeks +
               ", playTimeForever=" + playTimeForever +
               ", imgIconUrl='" + imgIconUrl + '\'' +
               ", imgLogoUrl='" + imgLogoUrl + '\'' +
               ", hasCommunityVisibleStats=" + hasCommunityVisibleStats +
               '}';
    }
}
