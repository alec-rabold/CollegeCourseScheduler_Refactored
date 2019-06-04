package io.collegeplanner.my.collegecoursescheduler.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;

@Data
@Wither
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FormParametersDto {
    private String year;
    private String season;
    private String includeOnlineCourses;
    private String includeWaitlistedCourses;
    private String relaxedVsCompactPreference;
    private String shorterVsFewerClassesPreference;
    private String[] chosenCourses;
    private String[] favoredProfessors;
    private String[] disfavoredProfessors;
    private String[] excludedProfessors;
    private String[] unavailableTimeblockStart;
    private String[] unavailableTimeblockEnd;
    private String[] unavailableTimeblockDays;
}
