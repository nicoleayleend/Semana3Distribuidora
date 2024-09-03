# Historias de Usuario

## Historia de Usuario 1: Registro de Usuario
**Como** usuario, **quiero** registrarme en la aplicación utilizando mi cuenta de Gmail **para** poder acceder a todas las funcionalidades de la aplicación.

### Objetivo:
- Permitir que los usuarios se registren de manera rápida y segura utilizando su cuenta de Gmail.

### Criterios de Aceptación:
1. El usuario debe poder acceder a una opción de registro en la página de inicio.
2. Al seleccionar la opción de registro, se debe redirigir al usuario a una pantalla de autenticación de Google.
3. Después de autenticarse con éxito, el usuario debe ser registrado en el sistema y recibir una confirmación de su registro.

### Supuestos:
- La aplicación utiliza OAuth 2.0 para la autenticación con Gmail.
- El sistema almacena el correo electrónico del usuario como identificador único.

---

## Historia de Usuario 2: Ingreso de Datos del Vehículo
**Como** usuario registrado, **quiero** ingresar los detalles de mi vehículo **para** que el sistema pueda calcular el costo de despacho.

### Objetivo:
- Capturar la información del vehículo del usuario para calcular los costos de despacho de acuerdo con las reglas de negocio.

### Criterios de Aceptación:
1. El usuario debe poder acceder a un formulario donde pueda ingresar la marca, modelo, cilindrada, tipo de combustible y capacidad en pasajeros de su vehículo.
2. El formulario debe validar que todos los campos requeridos estén completos antes de permitir al usuario continuar.
3. Al enviar el formulario, los datos ingresados deben ser almacenados temporalmente para el cálculo del costo de despacho.

### Supuestos:
- El usuario ha iniciado sesión en el sistema.
- La información del vehículo es relevante para determinar el costo del despacho.

---

## Historia de Usuario 3: Cálculo del Costo de Despacho
**Como** usuario, **quiero** que el sistema calcule automáticamente el costo de despacho basado en la distancia y el total de mi compra **para** que pueda saber cuánto me costará el envío.

### Objetivo:
- Proporcionar al usuario un cálculo automático del costo de despacho basado en las reglas de negocio establecidas.

### Criterios de Aceptación:
1. El sistema debe calcular el costo de despacho en función del total de la compra y la distancia desde la distribuidora hasta la dirección del usuario.
2. Para compras superiores a $50,000, el despacho debe ser gratuito dentro de un radio de 20 km.
3. Para compras entre $25,000 y $49,999, el sistema debe cobrar $150 por kilómetro recorrido.
4. Para compras menores a $25,000, el sistema debe cobrar $300 por kilómetro recorrido.
5. El resultado del cálculo debe ser mostrado al usuario antes de confirmar la compra.

### Supuestos:
- La dirección de entrega está dentro de los límites de despacho definidos por la empresa.
- La distancia se calcula automáticamente usando un servicio de mapas.

---

## Historia de Usuario 4: Visualización de la Información del Vehículo
**Como** usuario, **quiero** ver la información de mi vehículo después de ingresarla **para** asegurarme de que los datos son correctos.

### Objetivo:
- Mostrar al usuario la información que ha ingresado para su confirmación antes de proceder al cálculo del despacho.

### Criterios de Aceptación:
1. Después de que el usuario ingrese los datos del vehículo, estos deben mostrarse en la pantalla de confirmación.
2. El usuario debe tener la opción de modificar cualquier dato incorrecto antes de proceder.
3. La pantalla de confirmación debe ser clara y fácil de entender.

### Supuestos:
- El usuario desea revisar los datos ingresados antes de confirmar el despacho.
- El sistema permite la edición de la información antes de la confirmación final.
