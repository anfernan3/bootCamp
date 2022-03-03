//package com.example.application.dtos;
//
//import javax.validation.constraints.NotBlank;
//
//import com.example.domains.entities.Actor;
//import com.example.domains.entities.Film;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data @NoArgsConstructor @AllArgsConstructor
//public class FilmDTO {
//	@JsonProperty("id")
//	private int film_id;
//	@JsonProperty("titulo")
//	private String title;
//	@JsonProperty("descripcion")
//	private String description;
//	@JsonProperty("año de lanzamiento")
//	private String release_year;
//	@JsonProperty("idioma id")
//	private String languaje_id;
//	@JsonProperty("idioma origi")
//	private String original_languaje;
//	@JsonProperty("tiempo de alquiler")
//	private String rental_duration;
//	@JsonProperty("rental rate")
//	private String rental_rate;
//	@JsonProperty("duracion")
//	private String length;
//	@JsonProperty("ultima modificacion")
//	private String last_update;
//	
//	public static Film from(FilmDTO source) {
//		return new Film(
//				source.getFilm_id(),
//				source.getTitle(),
//				source.getDescription(),
//				source.getRelease_year(),
//				source.getLanguaje_id(),
//				source.getOriginal_languaje(),
//				source.getRental_duration(),
//				source.getRental_rate(),
//				source.getLength(),
//				source.getLast_update()
//				);
//	}
//	public static FilmDTO from(Film source) {
//		return new FilmDTO(
//				source.getFilmId(),
//				source.getTitle(),
//				source.getDescription(),
//				source.getReleaseYear(),
//				source.getLanguage(),
//				source.getLanguageVO(),
//				source.getRentalDuration(),
//				source.getRentalRate(),
//				source.getLength(),
//				source.getLastUpdate()
//				);
//	}
//
//}
