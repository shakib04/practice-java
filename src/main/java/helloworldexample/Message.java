package helloworldexample;

public class Message {

    private Short id;

    private String message;

    public Message() {

    }

    public Message(String message) {
        this.message = message;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
