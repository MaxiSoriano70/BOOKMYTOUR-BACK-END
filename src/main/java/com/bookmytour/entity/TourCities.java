package com.bookmytour.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tour_cities")
public class TourCities {

    @EmbeddedId
    private TourCitiesId id;

    @ManyToOne
    @MapsId("tourId") // Mapea la clave compuesta "tourId" al campo de la entidad Tour
    @JoinColumn(name = "tour_id", nullable = false)
    private Tour tour;

    @ManyToOne
    @MapsId("cityId") // Mapea la clave compuesta "cityId" al campo de la entidad City
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

}
