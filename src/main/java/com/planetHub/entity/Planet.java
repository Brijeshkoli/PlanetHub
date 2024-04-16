package com.planetHub.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "planet")

public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  
    @NotEmpty(message = "Title is required")
    @Column(nullable = false, name = "title")
    private String title;
  
   
    @NotEmpty(message = "Description name is required")
    @Column(nullable = false, name = "description")
    private String description;
  
  
    public Long getId() {
      return id;
    }
  
    public void setId(Long id) {
      this.id = id;
    }
  
    public String getTitle() {
      return title;
    }
  
    public void setTitle(String title) {
      this.title = title;
    }
  
  
    public String getDescription() {
      return description;
    }
  
    public void setDescription(String description) {
      this.description = description;
    }
  
   
}



