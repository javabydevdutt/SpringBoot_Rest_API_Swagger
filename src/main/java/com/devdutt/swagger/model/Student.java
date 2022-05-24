package com.devdutt.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@ApiModelProperty(notes = "Name of the Student", name = "name", required = true, value = "test name")
	private String name;
	@ApiModelProperty(notes = "Courses of the Student", name = "course", required = true, value = "test course")
	private String course;
	@ApiModelProperty(notes = "Country of the Student", name = "country", required = true, value = "test country")
	private String country;

}
