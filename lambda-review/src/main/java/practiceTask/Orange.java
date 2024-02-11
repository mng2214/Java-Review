package practiceTask;

import lombok.*;


//@Getter
//@Setter
//@ToString
@Data
@Builder // generates AllArgsConstructor unless there is another X Constructor
public class Orange {
    private int weight;
    private Color color;
}
