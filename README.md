# 🛒 [Proyecto QuickCart]

> Proyecto final — Java POO · [1603] · [2026]

## 👥 Integrantes

| Nombre | GitHub |
|--------|--------|
| [Nombre 1] | [@ManuelMB2004](https://github.com/ManuelMB2004) |
| [Nombre 2] | [@cabrerakeiner1019](https://github.com/cabrerakeiner1019) |
| [Nombre 3] | [@usuario](https://github.com/usuario) |
  [Nombre 4] | [@usuario](https://github.com/usuario) |
---

## 📋 Descripción

QuickCart es un sistema de comercio electrónico desarrollado en Java 
con interfaz gráfica Swing. Permite a los clientes registrarse, 
explorar un catálogo de productos, gestionar su carrito de compras 
y realizar pedidos. Los administradores pueden gestionar el inventario 
de productos en tiempo real.

---

## 🚀 Cómo ejecutar

### Requisitos
- Java JDK 17+
- - NetBeans IDE 25

### Pasos
```bash
1. Clonar el repositorio
2. Abrir NetBeans
3. File → Open Project > seleccionar la carpeta Quickcart
4. Ejecutar la clase Quickcart.java
```

---

## 🏗️ Tecnologías usadas

| Categoría | Tecnología elegida |
|-----------|-------------------|
| Lenguaje | Java |
| UI / Framework | Java Swing |
| Persistencia | Archivos.txt |
| IDE | NetBeans 25 |

---

## 🧩 Diagrama de clases UML

![Diagrama de clases](docs/uml/diagrama-clases.png)

---

## 📐 Diagrama de casos de uso

![Casos de uso](docs/uml/casos-de-uso.png)

---

## 🎯 Funcionalidades implementadas

- [x] Gestión de productos
- [x] Gestión de usuarios / clientes
- [x] Carrito de compras
- [x] Flujo de pedido y pago
- [x] Historial de pedidos
- [x] Interfaz gráfica o web funcional
- [x] Persistencia de datos
- [ ] <!-- opcional: búsqueda, reportes, descuentos... -->

---

## 📐 Conceptos POO aplicados

| Concepto | Clase / método donde se aplica |
|----------|-------------------------------|
| Herencia | Cliente y Administrador extienden Usuario, ProductoFisico y ProductoDigital extienden Producto |
| Encapsulación | Todos los atributos privados con getters y setters en todas las clases del modelo |
| Polimorfismo | getTipoUsuario() en Cliente y Administrador, getTipoProducto() en ProductoFisico y ProductoDigital |
| Abstracción | Clases abstractas Usuario y Producto |
| Colecciones | ArrayList en Carrito, Pedido y SistemaEcommerce |
| Excepciones | try/catch en VentanaAdmin y VentanaCatalogo, IOException en GestorUsuarios y GestorProductos |

---

## 🖼️ Capturas

<!-- Agrega screenshots en la carpeta assets/ -->
