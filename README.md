Se pretende desarrollar un conjunto de clases que representen, de forma simplificada, a una hipotética empresa dedicada a vender un producto. A continuación, se describen las características básicas de estas clases:
1. Empleado. Clase básica que describe a un empleado. Incluye sus datos personales (nombre, apellidos, DNI, dirección) y algunos datos tales como los años de antigüedad, teléfono de contacto y su salario.
Incluye también información de quién es el empleado que lo supervisa (Empleado *). Tendrá, al menos, las siguientes funciones miembro:

- Constructores para definir correctamente un empleado, a partir de su nombre, apellidos, DNI, dirección, teléfono y salario.
- Imprimir (A través de los operadores de E/S redefinidos)
- Cambiar supervisor
- Incrementar salario
  
2. Secretario. Tiene despacho, número de fax e incrementa su salario un 5% anual.
Tendrá, al menos, las siguientes funciones miembro:

- Constructores (debe rellenar la información personal y los datos principales)
- Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
  
3. Vendedor. Tiene coche de la empresa (identificado por la matricula, marca y modelo), teléfono móvil, área de venta, lista de clientes y porcentaje que se lleva de las ventas en concepto de comisiones. Incrementa su salario un 10% anual. Tendrá, al menos, las siguientes funciones miembro:

- Constructores (debe rellenar la información personal y los datos principales)
- Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
- Dar de alta un nuevo cliente.
- Dar de baja un cliente.
- Cambiar de coche.

4. Jefe de zona. Tiene despacho, tiene un secretario a su cargo, una lista de vendedores a su cargo y tiene coche de la empresa (identificado por la matrícula, marca y modelo). Incrementa su salario un 20% anual.
Tendrá, al menos, las siguientes funciones miembro:

- Constructores (debe rellenar la información personal y los datos principales)
- Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
- Cambiar de secretario.
- Cambiar de coche.
- Dar de alta y de baja un nuevo vendedor en su zona.

Todos los empleados son vendedores, jefes de zona o secretarios. Hacer un programa de prueba que muestre como funciona. Probar, especialmente, que el método incrementar salario se comparta bien, según el empleado que sea así es la subida.
