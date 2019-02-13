package gameofthrones;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepository extends MongoRepository<Character, String> {

    public Character findByCharacterName(String characterName);
    public List<Character> findByHouseName(String houseName);

}