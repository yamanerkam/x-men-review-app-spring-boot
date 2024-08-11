package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Xmen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String currentLocation;
    private int health;


   
}
