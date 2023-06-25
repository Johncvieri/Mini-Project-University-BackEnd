package id.co.indivara.jdt12.universit.repo;

public class ResponMessage {
    private String message;
    private int code;

    public ResponMessage(){}

    public ResponMessage(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
