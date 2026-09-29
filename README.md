# Patrones de Diseño en Java

Repositorio académico y de consulta dedicado al estudio práctico de **patrones de diseño de software** mediante ejemplos y plantillas desarrollados principalmente en Java.

El contenido está organizado por las tres categorías clásicas de patrones: **comportamiento**, **creación** y **estructurales**. Su objetivo es servir como material de aprendizaje, repaso y referencia, no como una aplicación final o un proyecto profesional independiente.

## Contenido

### Patrones de comportamiento

- Iterator
- Observer
- Strategy
- Template Method

### Patrones de creación

- Abstract Factory
- Factory Method
- Prototype
- Singleton

### Patrones estructurales

- Adapter
- Composite
- Decorator
- Facade

## Estructura del repositorio

Cada patrón puede incluir, según el caso:

- Ejemplos prácticos en Java.
- Plantillas para estudiar su estructura.
- Ejercicios o variantes de implementación.
- Proyectos preparados originalmente para NetBeans.
- Documentación o material de apoyo en PDF.

La estructura general es:

```text
Patrones Comportamiento/
├── Iterator/
├── Observer/
├── Strategy/
└── TemplateMethod/

Patrones Creacion/
├── AbstractFactory/
├── FactoryMethod/
├── Prototype/
└── Singelton/

Patrones Estructural/
├── Adapter/
├── Composite/
├── Decorator/
└── Facade/
```

> Nota: la carpeta `Singelton` mantiene actualmente ese nombre por compatibilidad con la estructura original del repositorio, aunque el nombre correcto del patrón es **Singleton**.

## Tecnologías

- **Java**
- **NetBeans** en varios de los proyectos originales

El repositorio contiene múltiples proyectos independientes, por lo que no existe un único punto de entrada para ejecutar todo el contenido.

## Cómo utilizarlo

1. Selecciona el patrón que quieras estudiar.
2. Accede a su carpeta correspondiente.
3. Abre uno de los ejemplos o plantillas.
4. Si el proyecto incluye archivos de NetBeans, puedes abrir directamente su carpeta desde el IDE.
5. También puedes revisar las clases Java de forma independiente para analizar participantes, responsabilidades y relaciones entre objetos.

## Objetivo académico

Este repositorio recopila material trabajado durante el aprendizaje de patrones de diseño y programación orientada a objetos. Los ejemplos están orientados a comprender la estructura y aplicación de cada patrón mediante implementaciones concretas.

Por este motivo, algunos proyectos priorizan la claridad didáctica sobre aspectos propios de software de producción, como arquitectura global, pruebas automatizadas, empaquetado unificado o despliegue.

## Limpieza del repositorio

Los archivos generados por compilación y la configuración privada de los IDE no se versionan. El archivo `.gitignore` evita incluir elementos como:

- `build/`, `dist/`, `target/` y `out/`
- archivos `.class`
- `nbproject/private/`
- `.idea/`
- archivos específicos del sistema operativo

## Autor

Repositorio mantenido por [Nico3246](https://github.com/Nico3246).
