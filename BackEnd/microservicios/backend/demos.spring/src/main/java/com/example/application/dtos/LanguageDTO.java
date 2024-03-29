package com.example.application.dtos;

import javax.validation.constraints.NotBlank;

import com.example.domains.entities.Language;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguageDTO {
	@JsonProperty("id")
	private int languageId;
	@NotBlank
	@JsonProperty("nombre")
	private String name;
	@JsonProperty("ultima modificacion")
	private String last_update;
	

//	public static Language from(LanguageDTO source) {
//		return new Language(
//				source.getLanguageId(), 
//				source.getName(), 
//				source.getLast_update()
//				);
//	}
//
//	public static LanguageDTO from(Language source) {
//		return new LanguageDTO(
//				source.getLanguageId(),
//				source.getName(),
//				source.getLastUpdate());
//	}
}
