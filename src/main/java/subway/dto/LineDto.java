package subway.dto;

import lombok.Getter;
import subway.jpa.Line;
import subway.jpa.Station;

import java.util.List;

@Getter
public class LineDto {

    private Long id;
    private String name;
    private String color;
    private Long upStationId;
    private Long downStationId;
    private Integer distance;
    private List<StationDto> stationDtos;

    public LineDto(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public LineDto(Long id, String name, String color, List<StationDto> stationDtos) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.stationDtos = stationDtos;
    }

    public LineDto(String name, String color, Long upStationId, Long downStationId, Integer distance) {
        this.name = name;
        this.color = color;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public static LineDto from(Line lineEntity) {
        return new LineDto(
                lineEntity.getId(),
                lineEntity.getName(),
                lineEntity.getColor(),
                List.of(StationDto.from(lineEntity.getUpStation()), StationDto.from(lineEntity.getDownStation()))
        );
    }

    public Line toEntity(Station upStation, Station downStation) {
        return new Line(
                name,
                color,
                upStation,
                downStation,
                distance
        );
    }
}
