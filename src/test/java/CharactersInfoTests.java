import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CharactersInfoTests {

    private final String PATH = "https://www.breakingbadapi.com/api/characters";
    private final String newLine = System.getProperty("line.separator");

    @Test(priority = 1)
    public void getWalterWhiteBirthdaySimple() {
        String response =
        given()
                .when()
                .get(PATH)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .jsonPath().getString("[0].birthday");

        System.out.println("Walter White's Birthday: " + response);
    }

    @Test(priority = 2)
    public void getWalterWhiteBirthdayUsingPojo() {
        CharacterPojo[] allCharacters =
                given()
                .when()
                .get(PATH).as(CharacterPojo[].class);

        for (CharacterPojo singleCharacter: allCharacters) {
            if (singleCharacter.getName().equals("Walter White")) {
                System.out.println(singleCharacter.getName() + "'s Birthday: " + singleCharacter.getBirthday());
            }
        }
    }

    @Test(priority = 3)
    public void getAllCharactersPortrayed() {
        CharacterPojo[] allCharacters =
                given()
                        .when()
                        .get(PATH).as(CharacterPojo[].class);

        for (CharacterPojo singleCharacter: allCharacters) {
            System.out.println("-------------------------------------------------" + newLine);
            System.out.println("Character name: " + singleCharacter.getName());
            System.out.println("Portrayed: " + singleCharacter.getPortrayed() + newLine);
        }
    }

}
