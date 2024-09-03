# Proyecto: Aplicación de Distribuidora de Vehículos

## Descripción del Proyecto
Este proyecto consiste en el desarrollo de una aplicación para una empresa de distribución de alimentos que ha incluido un servicio de despacho a domicilio. La aplicación permitirá a los usuarios calcular automáticamente los costos de despacho basados en reglas de negocio específicas.

## Requerimientos del Proyecto

### Requerimientos Funcionales
1. **Registro de Usuarios**
   - Los usuarios deben poder registrarse en la aplicación utilizando una cuenta de Gmail.
   
2. **Ingreso de Datos del Vehículo**
   - La aplicación debe solicitar al usuario la siguiente información sobre el vehículo:
     - Marca
     - Modelo
     - Cilindrada
     - Tipo de Combustible
     - Capacidad en pasajeros

3. **Cálculo Automático del Costo de Despacho**
   - La aplicación debe calcular automáticamente el costo de despacho basado en las siguientes reglas:
     - **Compras mayores a $50,000**: El despacho es gratuito dentro de un radio de 20 km.
     - **Compras entre $25,000 y $49,999**: Se cobra $150 por kilómetro recorrido.
     - **Compras menores a $25,000**: Se cobra $300 por kilómetro recorrido.

4. **Visualización de la Información**
   - Después de ingresar los datos, la aplicación debe mostrar la información ingresada por el usuario en la consola.

5. **Gestión de Despacho**
   - La aplicación debe calcular y mostrar el costo total del despacho basado en la distancia y las reglas de negocio.

### Requerimientos No Funcionales
1. **Seguridad**
   - El sistema debe asegurar que los datos de los usuarios (especialmente las credenciales de Gmail) se manejen de manera segura.

2. **Performance**
   - La aplicación debe responder en tiempo real a las entradas del usuario y realizar cálculos sin demoras perceptibles.

3. **Usabilidad**
   - La interfaz debe ser intuitiva y fácil de usar, permitiendo a los usuarios interactuar sin necesidad de formación previa.

4. **Compatibilidad**
   - El sistema debe ser compatible con cualquier sistema operativo que soporte Java.
   - La aplicación debe ser ejecutable desde la línea de comandos sin necesidad de un entorno de desarrollo integrado (IDE).

5. **Mantenibilidad**
   - El código debe estar bien documentado y estructurado para facilitar futuras actualizaciones y mantenimiento.

6. **Disponibilidad**
   - La aplicación debe estar disponible en un repositorio de GitHub para su descarga y revisión.

7. **Portabilidad**
   - El sistema debe poder ser transferido y ejecutado en diferentes entornos sin requerir modificaciones significativas.

## Estructura del Repositorio
- `Semana3Distribuidora.java`: Código fuente de la aplicación.
- `README.md`: Documentación completa del proyecto.
- `LICENSE`: Licencia del proyecto.

## Instrucciones de Uso
1. **Compilación**: Compila el archivo `Semana3Distribuidora.java` desde la línea de comandos usando `javac Semana3Distribuidora.java`.
2. **Ejecución**: Ejecuta el programa con `java Semana3Distribuidora`.
3. **Contribución**: Si deseas contribuir al proyecto, por favor, sigue las directrices de contribución en el archivo `CONTRIBUTING.md`.

## Autor
- Nicole Diaz

## Licencia
Este proyecto está licenciado bajo los términos de la [Licencia MIT](LICENSE).
