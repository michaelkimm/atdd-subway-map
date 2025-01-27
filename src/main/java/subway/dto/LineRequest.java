package subway.dto;

import lombok.Getter;

@Getter
public class LineRequest {

    private String name;
    private String color;
    private Long upStationId;
    private Long downStationId;
    private Integer distance;

    public LineRequest(String name, String color, Long upStationId, Long downStationId, Integer distance) {
        this.name = name;
        this.color = color;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public LineDto toDto() {
        return new LineDto(
                name,
                color,
                upStationId,
                downStationId,
                distance
        );
    }
}
