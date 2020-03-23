# Reto de Sophos Solutions (Promart)

## Prueba técnica de automatización
El reto consiste en lo siguiente:

- Ingrasar a la página [ProMart]
- Llevar uno de sus productos al carrito de compras
- Revisar el carrito de compras

## Resumen
Para el proyecto utilizaremos BDD como framework de automatización junto con el patrón de arquitectura de ScreenPlay donde dividiremos las capas de la automatización.

### Features:
Se evidencian los casos prueba en lenguaje Gherkin para fácil entendimiento por parde del negocio siguiendo el modelo “Given [rol] When[característica] Then [los beneficios]” y sus variaciones, con él se define el comportamiento de la transacción que vamos a automatizar. Se trata de un lenguaje fácil de leer, fácil de entender y fácil de escribir. Utilizar Gherkin nos va a permitir crear una documentación viva a la vez que automatizamos los tests.

### Step Definitions:
Son clases que mapean cada línea de los escenarios definidos en lenguaje Gherkin a métodos java.

### Tasks:
Son tareas a un nivel de granularidad más alto al de clicks y selects.

### Interactions: 
Una interacción representa una acción directa del usuario con la interfaz como ingresar datos en campos o dar clics en botones.

### Questions:
Es la capa donde se verifican los resultados de las operaciones realizadas en las capas anteriores.

### User interfaces:
Son las clases que mapean los componentes de una interfaz de usuario.

### Integration:
Capa creada para integraciones con otros subsistemas.

### Util:
Capa trasnversal al proyecto para reutilización de metodos.

### Model:
Una capa donde se encontrarán todos los objetos complejos de negocio, para ser usados dentro de cualquier capa del proyecto.

### Exceptions:
Una capa donde se crearán las excepciones específicas que permitirán la legibilidad de los reportes cuando las pruebas fallen.

## Detalles Generales
Navegador: Chrome
Versión: 80.0.3
Versión Gradle Wrapper: 5.4.1 





[ProMart]: <https://www.promart.pe>