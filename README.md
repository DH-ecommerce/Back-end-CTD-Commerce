# Back-end-CTD-Commerce

![banner](https://i.imgur.com/X0lS0i7.png)


<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/eduardoaraujogomes/Back-end-CTD-Commerce?color=%2304D361">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/eduardoaraujogomes/Back-end-CTD-Commerce">

  <a href="https://github.com/eduardoaraujogomes/Back-end-CTD-Commerce/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/eduardoaraujogomes/Back-end-CTD-Commerce">
  </a>

  <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen">

</p>

_________

## 💻 Sobre o projeto

## Enunciado:
 Desenvolver uma API com os endpoints necessários para:
- Tem que ser desenvolvido em Java/Spring Framework
- Modelo MVC
- Distribuído pelo AWS ElasticBeanStalk
- Banco de dados H2
- Disponibilizar os dados de todos os produtos cadastrados em um JSON 
- Disponibilizar os dados de um produto específico em um JSON
- Disponibilizar uma lista de categorias cadastradas em um JSON
- Disponibilizar os produtos de uma determinada categoria, em um JSON

_________

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do Back-end:
 
- [Java]

- [Spring Boot]
- [H2]

- [Heroku]
- [AWS]

- Programado no [IntelliJ].
    

_________


## 👨‍💻 Acessar o projeto

  Pelo Link -  [https://front-end-ctd-commerce-9iwg6kgyl-eduardoaraujogomes.vercel.app/](https://front-end-ctd-commerce-9iwg6kgyl-eduardoaraujogomes.vercel.app/) 

 **_⚠️Note:_** Aguarde um momento para o Heroku ser carregador ( pois quando é o primeiro acesso o heroku demora para ativar o banco de dados na versão gratuita)    
    



_________

## 🤩 Como fazer as requisições
GET - Todas as Categorias

Digite no browser/insomnia/postman a URL:
```
https://neotechdh.herokuapp.com/categories/all
```

GET - Apenas uma Categoria

Digite no browser/insomnia/postman a URL:
```
https://neotechdh.herokuapp.com/categories/{id}
```

GET - Todos os Produtos

Digite no browser/insomnia/postman a URL:
```
https://neotechdh.herokuapp.com/products/filter/all
```

GET - Apenas um Produto

Digite no browser/insomnia/postman a URL:
```
https://neotechdh.herokuapp.com/products/product/{id}
```


### Para fazer o POST/DELETE/PUT é preciso utilizar o Insomnia ou o Postman para fazer o POST

POST - Criar uma Categoria
```
https://neotechdh.herokuapp.com/categories/save

JSON BODY
```
```json
{
  "name": "Periféricos",
}
```

POST - Criar um Produto
```
https://neotechdh.herokuapp.com/products/save

JSON BODY
```
```json

{	
  "title": "Zotac RTX 3070",
  "price": "1000.99",
  "description": "Get Amplified with the ZOTAC GAMING GeForce RTX 30 Series based on the NVIDIA...",
  "image": "LINK DA IMAGEM/IMAGENS"
  "category": "ID DA CATEGORIA"
}

```

DELETE - Deletar um Produto

```
https://neotechdh.herokuapp.com/products/delete/{id}
```

PUT - Atualizar um Produto

```
https://neotechdh.herokuapp.com/products/delete/{id}

JSON BODY
```
```json

{	
  "title": "Novo Nome para o Produto",
  "price": "Novo Preço para o Produto",
  "description": "Nova Descrição para o Produto",
  "image": "Link com Novas imagens para o produto"
  "category": "ID da nova categoria do produto"
}

```

_________


## 🏆Integrantes

[Eduardo de Araujo](https://github.com/eduardoaraujogomes)

[Stefany Lovato](https://github.com/stefanylovato)

[Gustavo Barretto](https://github.com/gustavobarretto)

[Marcelo Nader](https://github.com/marcelonader)

[Sophia Fiama](https://github.com/sophiafiama)

[Vitor Galbier](https://github.com/VitorGalbier)


_________




## 📝 Licença

O projeto se encontra sob licença MIT.

Para mais detalhes, acesse [license](LICENSE).


 
[Java]: https://www.java.com/pt-BR/ 

[Spring Boot]: https://spring.io/projects/spring-boot

[H2]: https://www.h2database.com/html/main.html
[AWS]: https://aws.amazon.com/pt/elasticbeanstalk/

[Heroku]: https://dashboard.heroku.com/


[IntelliJ]: https://www.sonarlint.org/intellij?gclid=CjwKCAiA866PBhAYEiwANkIneGpaCVRSJJrI6CSN5mWDRM-X8beqe9Vja9Sk62RpQ12EWkLNrMg1txoCFgAQAvD_BwE
