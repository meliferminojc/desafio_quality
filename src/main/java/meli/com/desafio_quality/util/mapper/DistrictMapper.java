package meli.com.desafio_quality.util.mapper;


import meli.com.desafio_quality.dto.form.DistrictForm;
import meli.com.desafio_quality.dto.response.DistrictDTO;
import meli.com.desafio_quality.entity.District;
import meli.com.desafio_quality.util.GenerateID;

public class DistrictMapper {
    public static District toEntity(DistrictForm districtForm) {
        return new District(GenerateID.toDistrict(), districtForm.getDistrict_name(), districtForm.getValue_district_m2());
    }

    public static DistrictDTO toDTO(District district) {
        return new DistrictDTO(district.getId(), district.getName(), district.getValueM2());
    }
}
