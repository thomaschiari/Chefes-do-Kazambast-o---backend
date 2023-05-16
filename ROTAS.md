## API Rotas

#### Get todas as entregas

```http
  GET /api/entregas
```

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas    |

#### Get entrega por identifier

```http
  GET /api/entregas/${identifier}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `identifier`     | `string` | **Required**. identifier da entrega  |

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entrega`     | `json` | Retorna json daquela entrega    |

#### Get entregas de um entregador

```http
  GET /api/entregas/entregador/${identifier}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `identifier`     | `string` | **Required**. identifier do entregador  |

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas daquele entregador    |

#### POST cadastro de entrega

```http
  POST /api/entregas
```

| Body | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `entrega`     | `json` | **Required**. json da entrega  |

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entrega`     | `json` | Retorna json da entrega cadastrada    |

#### PUT atualização de entrega

```http
  PUT /api/entregas/${identifier}
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
  GET /api/entregas/finalizadas
```

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas finalizadas    |

#### GET todas as entregas pendentes

```http
  GET /api/entregas/pendentes
```

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas pendentes    |

#### GET todas as entregas em andamento

```http
  GET /api/entregas/andamento
```

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas em andamento    |

#### GET todas as entregas canceladas

```http
  GET /api/entregas/canceladas
```

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entregas`     | `json` | Retorna json com todas as entregas canceladas    |

#### DELETE entrega

```http
  DELETE /api/entregas/${identifier}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `identifier`     | `string` | **Required**. identifier da entrega  |

| Return | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `entrega`     | `json` | Retorna json da entrega deletada    |