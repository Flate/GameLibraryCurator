package eu.flate.glc.api.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "games")
@Data
public class SteamGame
    extends Game {

    @Column(name = "steam_appid")
    private String steamAppId;

}
