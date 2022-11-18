package jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mail {
    private int senderId;
    private int receiverId;
    private String topic;
    private String text;
    private Date sendDate;
}
