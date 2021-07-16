package meli.com.desafio_quality.repository;

import meli.com.desafio_quality.entity.District;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DistrictRepository {
    private List<District> districtList = new ArrayList<>();

    public District add(District district) {
        districtList.add(district);

        return district;
    }

    public District findByName(String name) {
        return districtList.stream()
                .filter(district -> district.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public List<District> getAll(){
        return districtList;
    }
}
