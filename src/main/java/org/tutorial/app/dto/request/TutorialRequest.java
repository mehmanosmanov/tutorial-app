package org.tutorial.app.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Setter
@Getter
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class TutorialRequest {
    @ApiModelProperty(notes = "Tutorial title", example = "java-ee", required = true)
    private String title;
    @ApiModelProperty(notes = "Tutorial name", example = "Thinking Java", required = true)
    private String name;
    @ApiModelProperty(notes = "Tutorial subject", example = "Java", required = true)
    private String subject;
    @ApiModelProperty(notes = "Is published?", example = "true", required = true)
    private Boolean published;
}
