package eu.flate.glc.steam;

import org.springframework.web.reactive.function.client.WebClient;

public class SteamApi {

    private static final String API_URL = "https://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/" +
                                          "?key=%s" +
                                          "&steamid=%s" +
                                          "&format=json";

    private WebClient client;
    private String    key;

}
