package com.raj.SpringJpaProject.models;

import java.time.LocalDateTime;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Here we could have used the getter and setter anotations for methods, but we have lombok 
 * so we can remove it because we are using @Data annoations.
 * 
 * to check the properties select @Data in line 16 and click F3 in eclipse to read documents.
 * 
 * @Entity this helps spring to recognise a class as an entity
 * 
 */

//@Table(name = "AUTHOR_TBL")
@Data
@NoArgsConstructor
@Entity
public class Author {
	
//	@Id	
//	@GeneratedValue(
//			strategy =  GenerationType.TABLE,
//			generator = "author_id_gen")
//	@SequenceGenerator(
//			name = "author_sequence",
//			sequenceName = "author_sequence",
//			allocationSize = 1)
//	@TableGenerator(
//			name = "author_id_gen",
//			table = "id_generator",
//			pkColumnName = "id_name",
//			valueColumnName = "id_value",
//			allocationSize = 1
//			)
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name =  "f_name" , length =  35)	
	private String firstName;
	
	@Column( name = "l_name")
	private String lastName;
	
	
	@Column( unique =  true,
			nullable = false)
	private String email;
	
	private int age;
	
	@Column(updatable = false, nullable = false)
	private LocalDateTime createDateTime;
	
	@Column(insertable = false)
	private LocalDateTime updateDateTime;
}

/*
 		
 		After creating the entities we will go for repositoryies
 	
 */
