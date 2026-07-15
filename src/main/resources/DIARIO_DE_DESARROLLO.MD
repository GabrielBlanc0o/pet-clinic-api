# Día 1

## Lo aprendido

- Una entidad representa un concepto del negocio.
- Antes de crear una entidad debo analizar:
  - Qué representa.
  - Qué datos le pertenecen.
  - Qué es obligatorio.
  - Qué puede modificarse.
  - Qué la identifica.
  - Qué reglas del negocio la afectan.

## Decisiones tomadas

Entidad Mascota:

Atributos:

- nombre
- fechaNacimiento
- especie
- raza
- peso
- sexo

No se almacenará la edad porque se puede calcular.

## Dudas

¿Por qué LocalDate es mejor que String?



## Dia 5


### ¿Por qué existe `main()`?

Porque Java necesita un punto de entrada para iniciar la aplicación.

### ¿Qué hace `SpringApplication.run()`?

Recibe la clase principal y comienza el proceso de inicialización del framework.

### ¿Por qué recibe una clase?

Porque desde esa clase obtiene el paquete raíz desde donde comenzará a explorar el proyecto.

### ¿Por qué la clase principal debe estar en el paquete raíz?

Porque el escaneo comienza desde ese paquete y baja por todos los subpaquetes.

### ¿Cómo descubre Spring las clases importantes?

Escaneando los paquetes y leyendo las anotaciones.

### ¿Cómo decide qué clases administrar?

Por las anotaciones (`@Service`, `@Repository`, etc.).

### ¿Dónde guarda los objetos?

En el **IoC Container**, para reutilizarlos cuando otra clase los necesite.

### ¿Cómo crea un Service?

Lee su constructor, identifica las dependencias, las busca en el contenedor y luego crea el objeto.

### ¿Por qué existe `main()`?

Porque Java necesita un punto de entrada para iniciar la aplicación.

### ¿Qué hace `SpringApplication.run()`?

Recibe la clase principal y comienza el proceso de inicialización del framework.

### ¿Por qué recibe una clase?

Porque desde esa clase obtiene el paquete raíz desde donde comenzará a explorar el proyecto.

### ¿Por qué la clase principal debe estar en el paquete raíz?

Porque el escaneo comienza desde ese paquete y baja por todos los subpaquetes.

### ¿Cómo descubre Spring las clases importantes?

Escaneando los paquetes y leyendo las anotaciones.

### ¿Cómo decide qué clases administrar?

Por las anotaciones (`@Service`, `@Repository`, etc.).

### ¿Dónde guarda los objetos?

En el **IoC Container**, para reutilizarlos cuando otra clase los necesite.

### ¿Cómo crea un Service?

Lee su constructor, identifica las dependencias, las busca en el contenedor y luego crea el objeto.
