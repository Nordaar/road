package com.sloniec.road.shared.result;

import com.sloniec.road.framework.IResult;
import com.sloniec.road.shared.gpxparser.modal.Waypoint;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SpeedResult implements IResult {

    private String file;
    private Waypoint beginningWaypoint;
    private Double step;
    private List<SingeSpeedResult> beforeSpeeds;
    private List<SingeSpeedResult> duringSpeeds;
    private List<SingeSpeedResult> afterSpeeds;

    public SpeedResult(String file, Double step, Waypoint beginningWaypoint) {
        this.file = file;
        this.step = step;
        this.beginningWaypoint = beginningWaypoint;
        beforeSpeeds = new ArrayList<>();
        duringSpeeds = new ArrayList<>();
        afterSpeeds = new ArrayList<>();
    }
}