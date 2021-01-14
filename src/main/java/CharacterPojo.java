import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterPojo {
    @JsonProperty("char_id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("occupation")
    private String[] occupation;
    @JsonProperty("img")
    private String img;
    @JsonProperty("status")
    private String status;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("appearance")
    private String[] appearance;
    @JsonProperty("portrayed")
    private String portrayed;
    @JsonProperty("category")
    private String category;
    @JsonProperty("better_call_saul_appearance")
    private String[] better_call_saul_appearance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String[] getOccupation() {
        return occupation;
    }

    public void setOccupation(String[] occupation) {
        this.occupation = occupation;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String[] getAppearance() {
        return appearance;
    }

    public void setAppearance(String[] appearance) {
        this.appearance = appearance;
    }

    public String getPortrayed() {
        return portrayed;
    }

    public void setPortrayed(String portrayed) {
        this.portrayed = portrayed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String[] getBetter_call_saul_appearance() {
        return better_call_saul_appearance;
    }

    public void setBetter_call_saul_appearance(String[] better_call_saul_appearance) {
        this.better_call_saul_appearance = better_call_saul_appearance;
    }
}
