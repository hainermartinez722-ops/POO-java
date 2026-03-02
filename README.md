# POO Java - Gestión de Aprendices

## Descripción
Este proyecto aplica los conceptos básicos de la Programación Orientada a Objetos en Java. Se trabaja con clases, constructores, getters, setters, validaciones y listas con ArrayList.

---

## Estructura del proyecto

```
src/
└── com/
    └── sena/
        ├── Aprendiz.java   
        └── App.java        
```

---

## Aprendiz.java

Clase que representa a un aprendiz con sus datos personales.

### Atributos

| Atributo     | Tipo   | Descripción                  |
|--------------|--------|------------------------------|
| `nombre`     | String | Nombre completo del aprendiz |
| `documento`  | String | Número de documento          |
| `correo`     | String | Correo electrónico           |
| `edad`       | int    | Edad del aprendiz            |

Los atributos son privados para aplicar encapsulamiento.

### Constructores

- **Constructor vacío** `Aprendiz()` — crea el objeto sin valores, se asignan despues con setters.
- **Constructor con parámetros** `Aprendiz(nombre, documento, correo, edad)` — crea el objeto con todos los datos desde el inicio.

### Getters

Permiten leer los atributos privados desde fuera de la clase:

```java
getNombre()
getDocumento()
getCorreo()
getEdad()
```

### Setters

Permiten modificar los atributos de forma controlada:

```java
setNombre(String nombre)
setDocumento(String documento)
setCorreo(String correo)   // valida que contenga "@"
setEdad(int edad)          // valida que sea mayor a 0 y menor a 150
```

### Método presentarse()

Retorna un String con la información completa del aprendiz:

```
Hola, mi nombre es Santiago Herrera, mi documento es 1023456781, mi correo es santiago@correo.com y tengo 19 anos.
```

---

## App.java

Clase principal que ejecuta el programa.

### Que hace

1. Crea objetos con el constructor con parametros
2. Crea un objeto con el constructor vacio y le asigna valores con setters
3. Agrega los objetos a un ArrayList
4. Recorre la lista con un ciclo for-each
5. Muestra la informacion de cada aprendiz

### Ejemplo de salida

```
Hola, mi nombre es Santiago Herrera, mi documento es 1023456781, mi correo es santiago@correo.com y tengo 19 anos.
Nombre: Santiago Herrera
Documento: 1023456781
Correo: santiago@correo.com
Edad: 19
---------------------------
```

---

## Conceptos aplicados

| Concepto        | Como se aplico                                              |
|-----------------|-------------------------------------------------------------|
| Encapsulamiento | Atributos private, acceso solo con getters y setters        |
| Constructores   | Vacio y con parametros                                      |
| Getters/Setters | Para leer y modificar atributos de forma controlada         |
| Validacion      | setCorreo y setEdad verifican que los datos sean correctos  |
| ArrayList       | Lista para almacenar multiples objetos Aprendiz             |
| For-each        | Ciclo para recorrer todos los elementos de la lista         |

---

## Tecnologias
- Java JDK 8+
- Paquete: com.sena
