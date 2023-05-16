## API Rotas

#### Get todas as entregas

```http
  GET /api/viagem
```

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas    |

#### Get entrega por identifier

```http
  GET /api/viagem/${identifier}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `identifier`     | `string` | **Required**. identifier da entrega  |

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entrega`     | `json` | Retorna json daquela entrega    |

#### POST cadastro de entrega

```http
  POST /api/viagem
```

| Body | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `entrega`     | `json` | **Required**. json da entrega  |

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entrega`     | `json` | Retorna json da entrega cadastrada    |

#### PUT atualização de entrega

```http
  PUT /api/viagem/${identifier}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `identifier`     | `string` | **Required**. identifier da entrega  |

| Body | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `entrega`     | `json` | **Required**. json da entrega  |

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entrega`     | `json` | Retorna json da entrega atualizada    |

#### GET todas as entregas finalizadas

```http
  GET /api/viagem/finalizadas
```

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas finalizadas    |

#### GET todas as entregas pendentes

```http
  GET /api/viagem/pendentes
```

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas pendentes    |

#### GET todas as entregas em andamento

```http
  GET /api/viagem/andamento
```

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas em andamento    |

#### GET todas as entregas canceladas

```http
  GET /api/viagem/canceladas
```

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas canceladas    |

#### DELETE entrega

```http
  DELETE /api/viagem/${identifier}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `identifier`     | `string` | **Required**. identifier da entrega  |

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entrega`     | `json` | Retorna json da entrega deletada    |