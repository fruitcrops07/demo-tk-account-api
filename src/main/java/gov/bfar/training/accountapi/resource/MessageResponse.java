package gov.bfar.training.accountapi.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageResponse {

    private int status;
    private String message;
    private Object data;

    public MessageResponse(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

}
