
# Práctica 4, Trabajo en Parejas

## 📌 Información General

- **Título:** Gestor de Contactos con Lista Enlazada  
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiantes:** Pablo Escandón, Mateo Namicela 
- **Fecha:** 11-06-2025  
- **Profesor:** Ing. Pablo Torres  

---

## 🛠️ Descripción

Este proyecto implementa una aplicación de consola para gestionar contactos utilizando listas enlazadas simples. Las funcionalidades principales incluyen:

- Añadir nuevos contactos  
- Buscar contactos por nombre  
- Eliminar contactos por nombre  
- Imprimir la lista completa de contactos  

La estructura del proyecto sigue el patrón MVC (Modelo - Vista - Controlador), separando claramente la lógica de presentación, los datos y el control de flujo.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila todos los archivos `.java` del proyecto:
   ```bash
   javac Controller/*.java Model/*.java View/*.java
   ```

2. Crea una clase principal (`Main.java`) con el siguiente contenido:
   ```java
   import Controller.*;
   import View.ConsoleView;

   public class Main {
       public static void main(String[] args) {
           ContactManager contactManager = new ContactManager();
           ConsoleView consoleView = new ConsoleView();
           MenuController menuController = new MenuController(contactManager, consoleView);
           menuController.showMenu();
       }
   }
   ```

3. Compílala:
   ```bash
   javac Main.java
   ```

4. Ejecuta el programa:
   ```bash
   java Main
   ```

---

## 🧑‍💻 Ejemplo de Uso

```plaintext
Menu:
1. Añadir contacto
2. Buscar contacto
3. Eliminar contacto
4. Imprimir listado
5. Salir

Elija una opción: 1  
Ingrese un nombre: Juan Pérez  
Ingrese un número telefónico: 0991234567  
Contacto añadido.

Elija una opción: 4  
Name: Juan Pérez, Phone: 0991234567
```

---

## 🧱 Estructura del Proyecto

```plaintext
├── Controller/
│   ├── ContactManager.java
│   └── MenuController.java
├── Model/
│   ├── Contact.java
│   ├── LinkedList.java
│   └── Node.java
├── View/
│   └── ConsoleView.java
└── Main.java
```
