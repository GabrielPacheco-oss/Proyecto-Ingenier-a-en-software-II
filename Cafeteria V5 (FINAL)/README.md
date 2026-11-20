###### Cafetería

Esta es una aplicación de escritorio que copila dentro de Visual Estudio Code, utilizando la interfaz graficas de Java "Swing", para simular la gestión de un sistema de cafetería, desde el punto de vista de un cliente y un administrador.

###### Requiere

- Java JDK 14 o una versión superior.
- Un copilador como Visual Studio Code.

###### Ejecución

Ya estando en Visual Studio Code:
    1. Abre la carpeta Cafetería V6.
    2. Verifica tener el JDK y las extensiones necesarias para el lenguaje de Java.
    3. Selección "Main.java" dentro de la carpeta "src".
    4. Ejecute la clase.

###### Inicio del programa

- Al ejecutarse el "Main.java" se generar una ventana emergente preguntando que tipo de usuario iniciara la app, este se podrá cambiar después de seleccionado, pero lo sugerido es iniciar como cliente y realizar algunos pedidos para posteriormente volver a la ventana inicial por medio de los botones "volver" y seleccionar el Usuario tipo Administrador para ver el flujo de los pedidos previamente generados.

Además, para que el flujo avance es necesario oprimir el botón "pasar 15 minutos" con el fin de simular el paso del tiempo y ver como los pedidos se van preparando poco a poco, podrás ver la "hora" arriba a la izquierda de la ventana generada al iniciar la ampliación.

Como Dato importante la hora de cierre es a las "8:00" por lo que después de esa hora solo podrás acceder como administrador.

###### Funcionalidades

## Tipos Usuario
-  Puedes acceder como Cliente o Administrador y puedes darle salir tantas veces quieras para volver a la pantalla de inicio luego de haber seleccionado un usuario, por si deseas cambiarlo, la aplicación mantendrá los cambios realizados y mostrar información diferente a cada usuario.

## Gestión de pedidos
- Como Cliente podrás crear pedidos de dos maneras: 
    1. Solicitando un combo predeterminado un máximo de 10 veces por pedido.
    2. Crear un pedido desde 0 totalmente personalizado con los productos disponibles en la cafetería

    Además, a estos pedidos podrás realizarles un seguimiento ya sea desde la interfaz de Cliente o Administrador. Y calcula el precio exacto de cada pedido al momento de su creación.

## Descuentos a los productos
- Como Cliente podrás realizar tus pedidos personalizados con ciertos descuentos en franjas horarias las cuales son:
    - De 4:00 a 5:00: Descuento del 10% en bebidas.
    - De 5:00 a 6:00: Descuento del 20% en acompañamientos.
    - De 6:00 a 7:00: Descuento del 30% en postres.

## Flujo del pedido
- Cada pedido luego de ser creado pasa por el siguiente flujo:
    1. El pedido luego de ser creado es preparado en la cocina.
    2. Ya preparado se deja en la recepción listo para ser entregado.
    3. El mesero recoge el pedido listo y empieza a entregarlo al cliente.
    4. Ya entregado el pedido se establece como entregado y se registra la ganancia.

    Este flujo es completamente automático y cada zona se va actualizando con los pedidos entrantes con ciertas limitaciones para simular un entorno un poco más real y si da curiosidad este flujo se puede ver mediante la interfaz del Administrador en la sección "Ver estaciones".

## Administrador
- El administrador podrá ver los pedidos creados y completados así mismo podrá ver el flujo que estos reciben desde
  su creación.

  Además de eso, el administrador es capaz de ver las ganancias del negocio al finalizar el día y también de ver las ganancias totales tras varios días de trabajo.

  Y lo más importante el administrador es capaz de pasar al siguiente día como si reabriera el café luego de que este cerrará para continuar usando la aplicación hasta el cierre de esa.