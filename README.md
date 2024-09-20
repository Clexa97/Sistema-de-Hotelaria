# 🏨 Sistema de Gerenciamento de Hotel

### Trabalho Final de Programação Orientada a Objetos (POO)

**Integrantes do grupo:**
- Juliana Ransani
- Marcos Gustavo
- Nathan Alves

## 📋 Descrição

Este projeto é um **sistema de gerenciamento de hotel** desenvolvido como trabalho final de POO. As principais funcionalidades incluem o controle de **reservas**, **solicitação de serviços**, **gerenciamento de consumo de itens**, e o **cálculo de gastos** dos hóspedes durante a estadia.

## 🚀 Funcionalidades Principais

### 1. 🛏️ Gerenciamento de Hóspedes e Clientes
O sistema permite cadastrar hóspedes e clientes, diferenciando-os pelas funcionalidades:
- **Cliente**: Herda de `Hospede` e pode realizar reservas.
- **Hóspede**: Pode solicitar serviços e adicionar consumos, mas não necessariamente faz reservas.

### 2. 🗝️ Reserva de Quartos
As reservas de quartos permitem:
- **Confirmar** e **cancelar** reservas de quartos, verificando a disponibilidade do quarto no momento da solicitação.

### 3. 🛎️ Serviços
Hóspedes podem solicitar serviços oferecidos pelo hotel:
- Lavanderia 🧺
- Passar Roupa 👔
- Serviço de Quarto 🛏️

Cada serviço possui um preço que é adicionado ao total de gastos do hóspede.

### 4. 🍽️ Consumo de Itens
O sistema gerencia o consumo de itens pelo hóspede, como:
- Refrigerantes 🥤
- Água 💧
- Snacks 🍪

Os valores dos itens consumidos são somados ao total da conta do hóspede.

### 5. 💸 Cálculos Totais
O sistema faz o cálculo automático do total de:
- **Consumos** de itens.
- **Serviços** solicitados.

Esses valores são exibidos detalhadamente para cada hóspede.