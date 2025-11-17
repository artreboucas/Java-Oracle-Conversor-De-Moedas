# 💱 Conversor de Moedas em Java

Este projeto foi desenvolvido como parte do Challenge da Alura na formação “Java Orientado a Objetos”.  
O objetivo é criar um conversor de moedas que utiliza uma API real para obter **taxas de câmbio em tempo real**.

---

## 🚀 Funcionalidades

- Conversão entre 6 moedas (USD, BRL, EUR)
- Consumo da **Exchange Rate API**
- Desserialização de JSON com **Gson**
- Interação via **console**
- Código simples e organizado

---

## 🔧 Tecnologias utilizadas

- Java 17+
- IntelliJ IDEA
- Gson
- HTTPClient (nativo do Java)
- ExchangeRate API

---

## 🔑 Como obter sua API Key

1. Acesse o site da **Exchange Rate API**
2. Digite seu e-mail no cadastro
3. Receba sua chave no e-mail
4. Use na URL de requisição no padrão: https://v6.exchangerate-api.com/v6/SUA_API_KEY/latest/USD

---

## ▶ Como rodar o projeto

Se estiver usando Maven:
mvn compile
mvn exec:java

Ou simplesmente execute o arquivo `Main.java` pelo IntelliJ.

---

## 📌 Estrutura do projeto
src/
├── ApiClient.java → faz a chamada HTTP para a API
├── ApiResponse.java → modelo do JSON retornado pela API
├── Conversor.java → lógica de conversão
└── Main.java → menu principal e interação com o usuário

---

## 📝 Exemplo de uso

1. O programa exibe opções de conversão  
2. Você escolhe uma delas  
3. Digita o valor  
4. O programa retorna o resultado convertido  
5. O programa encerra
