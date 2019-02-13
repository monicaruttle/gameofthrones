package gameofthrones;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "characters")
public class Character {

    @Id
    private String id;

    private String characterName;

    private String nickname;

    private String houseName;

    private List<String> serves;

    private List<String> killed;

    private List<String> siblings;

}