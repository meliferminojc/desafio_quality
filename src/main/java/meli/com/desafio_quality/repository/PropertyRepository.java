package meli.com.desafio_quality.repository;

import meli.com.desafio_quality.entity.Property;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PropertyRepository {
    private List<Property> propertiesList = new ArrayList<>();

    public Property saveProperty(Property property) {
        propertiesList.add(property);

        return property;
    }

    public Property find(Long id) {
        return propertiesList.stream()
                .filter(property -> property.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
