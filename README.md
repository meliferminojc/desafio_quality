# Desafio Quality
## _Bootcamp Meli W2_

### Observações

- Realizar o cadastro do Distrito/Bairro para poder cadastrar uma Casa
- [Repositorio com historico de commits e gitflow](https://github.com/meliferminojc/bootcamp-jc/tree/master/modulo11/desafio_quality)
- Arquivo `requests.json` pode ser importado no Insomnia para facilitar os testes

## Requests

### District

- Create District
  `POST - http://localhost:8080/api/district/create`

Payload:
```json
{
  "district_name" : "Bairro Aurora",
  "value_district_m2": 900
}
```
- List Districts
  `GET - http://localhost:8080/api/district/list`

####   Response

```json
{
  "districtList": [
    {
      "id": 1,
      "name": "",
      "valueM2": 900
    },
    {
      "id": 2,
      "name": null,
      "valueM2": 900
    }
  ]
}
```

### Property

- Create Property
  `POST - http://localhost:8080/api/property/create`

```json
{
  "prop_name": "Jcs house",
  "prop_district": "Bairro Aurora",
  "prop_rooms": [
    {
      "name": "quarto",
      "width": 10,
      "length": 10
    },
    {
      "name": "sala",
      "width": 30,
      "length": 30
    },
    {
      "name": "cozinha",
      "width": 20,
      "length": 20
    }
  ]
}
```
- Get bigger room
  - `Integer: houseID`
  - `GET - http://localhost:8080/api/property/bigger-room/{houseID}`

- Response

```json
{
  "propName": "JC's house",
  "room": {
    "id": 5,
    "name": "sala",
    "width": 30.0,
    "length": 30.0,
    "m2": 900.0
  }
}
```

- Get Property Value
    - `Integer: houseID`
    - `GET - http://localhost:8080/api/property/value/{houseID}`

- Response

```json
{
  "name": "Jcs house mectrab",
  "propertyValue": 1260000.0
}
```

- Get Property M2 and Rooms M2
    - `Integer: houseID`
    - `GET - http://localhost:8080/api/property/find/1`

- Response

```json
{
  "name": "Jcs house mectrab",
  "districtName": "Jcs house mectrab",
  "roomDTOList": [
    {
      "name": "quarto",
      "roomM2": 100.0
    },
    {
      "name": "sala",
      "roomM2": 900.0
    },
    {
      "name": "cozinha",
      "roomM2": 400.0
    }
  ],
  "totalM2": 1400.0
}
```

