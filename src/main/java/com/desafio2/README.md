# Sistema de Notificaciones 

Este proyecto es un sistema de notificaciones que permite enviar mensajes a través de diferentes servicios como WhatsApp, Telegram y Slack. El sistema está diseñado utilizando el patrón de diseño Abstract Factory para permitir la fácil adición de nuevos tipos de notificaciones en el futuro.

## Características

- Enviar mensajes a través de WhatsApp, Telegram y Slack.
- Registrar los mensajes enviados en un log.
- Selección dinámica del tipo de notificación sin conocer su implementación específica.

## Requisitos

- Java 8 o superior
- Maven (opcional, para gestión de dependencias y construcción del proyecto)
