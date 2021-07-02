# Geovanny Zambrano
### Instituto Tecnologico Quito Metropolitano
#### Repositorio Semana 6

Nos piden hacer que gestionemos una serie de productos. 
Los productos tienen los siguientes atributos: 
- nombre 
- precio 

Crear clase Padre Productos: con los atributos antes mencionados (nombre, precio).
Tenemos dos tipos de productos: 
- Perecedero: tiene un atributo llamado días a caducar ➜ clase hija 
- No perecedero: tiene un atributo llamado tipo ➜ clase hija
Crea los constructores y métodos getters, setters y toString necesarios para cada clase.

En la clase Perecedero crear un método que permita calcular el precio de cada producto con las siguientes condiciones:
- Si le queda 1 día para caducar, se reducirá un 0.40% el precio final. 
- Si le quedan 2 días para caducar, se reducirá un 0.30% el precio final. 
- Si le quedan 3 días para caducar, se reducirá un 0.20% el precio final. 

Crear una clase ejecutable que contenga un menú repetitivo:
- Desplegar producto perecedero con su respectivo: nombre, días a caducar y precio (aplicar descuento al precio si es necesario).
- Desplegar producto  no perecedero con su respectivo: nombre, tipo y precio.
