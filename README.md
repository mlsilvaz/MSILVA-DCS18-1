# Examen Parcial - Diseño y Construcción de Software - Semestre 2018-1 - UNMSM-UPG-FISI
# Alumno: Marco Silva Zegarra

## Teoría (6 puntos)
### Pregunta 1. Explicar:
* Diseño de software.- Es la actividad del ciclo de vida del Software donde se realiza un diseno de alto nivel de los principales componentes del software y se valida los requeremientos de los usuarios. Esta etapa se toman las principles decisiones de diseño, identifican los principales componentes. Se define la arquitectura, las interfaces , los componentes


* Patrón de diseño.- Es la respuesta a un problema especifico de creacion de componentes de software. Los patrones de diseño se presentan como un conjunto de artefactos y componentes. Se tienen documentados alrededor de 23 patrones de Gof y existen otros mas que responden a problemas especificos de la ingenieria de software como lo son: Patrones para Integracion , Patrones para Microservicios.
Dentro de los patrones de GOF se tienen identificados los patrones Creacionales,Estructurales, Comportamiento.

 
* Principios del diseño de software.- 
-Abstracción: Los componentes deben estar abiertos para la comunicacion pero cerrados para la modificacion/cambio
-Acoplamiento y Cohesión :
 Acoplamiento : 
 Cohesion :
-Descomposición y Modularidad :
-Encapsulamiento y Ocultamiento de Información :
-Separaciónde Interfaze Implementación :
-Suficiencia y Completitud : Asegurar que el componente posea la propiedad de abstraccion.

* Síntomas de un diseño pobre. Son las siguientes sintomas:
-Rigidez:Cuando el SW es dificil de cambiar
-Fragilidad: Cuando el sw muestra problemas por algun cambio. 
-Opacidad: Cuando el sw es dificil de entender y usar
-Repeticion innecesaria: Contiene estructuras repetidas
-Viscosidad: Hacer el sw de la manera correcta es mas dificil que de la manera incorrecta
-Inmovilidad: Componentes que son enredado de usar
-Complejidad innecesaria : Crear estructuras que no aportan beneficios

* Atributo de calidad.-
Son los requerimientos no funcionales del sw que el arquitecto tiene que ver como balancear para dar una respuesta estas necesidades

* Drivers arquitecturales.-


## Práctica (14 puntos)
Para cada pregunta presentar diseño UML y código fuente (agregar a ebautistau@unmsm.edu.pe como colaborador del repositorio github).
Los ejemplos propuestos NO pueden ser los vistos en clases, ni tampoco bajado de la web.

### Pregunta 2. (3 puntos)
- Construya un ejemplo en la que se aplique el principio: "Favorecer la composición de objetos frente a la herencia de clases".***
-En mi ejemplo estoy usando clases abstractactas para ocultar la implementacion y solo exponer la interface.
-Las clases ProfesorTitular y ProfesorInterino son subcases de la clase abstracta Profesor que a su vez es subclase de la clase Persona.
-En este esquema ocultamos la implementacion y solo expone las interfaces.



### Pregunta 3. (3 puntos)
https://github.com/UNMSM-UPG-FISI/examen-parcial-dycs-18-1/tree/master/src/main/java/pregunta3
- Mejorar la implementación de la red social Reddit.
- Soportar la red social Pinterest.
- Usar un contenedor IoC.
- Indicar los patrones y/o principios implementados.

### Pregunta 4. (2 puntos)
- Construya un ejemplo aplicando el patrón notification.*****

### Pregunta 5. (6 puntos)
https://github.com/UNMSM-UPG-FISI/examen-parcial-dycs-18-1/tree/master/src/main/java/pregunta5
- Aplicar el patrón Abstract Factory para evitar exponer clases concretas (WhiteFinish, FastProcessor, etc) en el cliente (Client.java).
- El nuevo cliente (Client.java) debe mostrar la misma información.
