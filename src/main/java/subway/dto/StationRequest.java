package subway.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StationRequest {

    private Long id;
    private String name;

    public StationDto toDto() {
        return new StationDto(
                name
        );
    }
}
