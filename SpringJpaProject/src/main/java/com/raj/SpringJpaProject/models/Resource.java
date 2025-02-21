package com.raj.SpringJpaProject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Resource {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private int size;
	
	private String url;
	
	@OneToOne
	@JoinColumn(name = "lecture_id")
	private Lecture lecture;
}
