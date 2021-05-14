## Installation

Clone repository:
```sh
https://github.com/douglasew/projeto-poo.git
```
Run server
```sh
mvc spring-boot:run
```
### APIs endpoints

GET  [http://localhost:8080/pacientes](http://localhost:8080/pacientes)  [lista todos os pacientes]  
GET  [http://localhost:8080/paciente/{id}](http://localhost:8080/paciente/{id})  [lista um paciente por ID]  
POST  [http://localhost:8080/paciente/cadastro](http://localhost:8080/paciente/cadastro)  [cadastra um novo paciente]  
PUT  [http://localhost:8080/paciente/{id}/editar](http://localhost:8080/paciente/{id}/editar)  [atualiza os dados de um paciente]  
DELETE  [http://localhost:8080/paciente/{id}/delete](http://localhost:8080/paciente/{id}/delete)  [remove um paciente por ID]
