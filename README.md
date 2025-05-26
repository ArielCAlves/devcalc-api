# DevCalc API 

Aplicacao em Java utilizada na faculdade que realiza operações matemáticas básicas: adição, subtração, multiplicação e divisão.

### Endpoints para testar a API
- GET /add?a=10&b=5 → retorna 15
- GET /subtract?a=10&b=5 → retorna 5
- GET /multiply?a=10&b=5 → retorna 50
- GET /divide?a=10&b=5 → retorna 2

### Objetivo: foco em CI/CD usando GitHub Actions

### Build Tool
- Maven
- Java 17

### Como clonar e executar

```bash
git clone https://github.com/seu-usuario/devcalc-api.git
cd devcalc-api
```


### Diagnóstico e Correção de Erro no Pipeline

Durante a atividade 5 do TP2 inseri um erro proposital para simular uma falha no pipeline.

A falha foi identificada por meio da aba **Actions** dentro deste repositório do GitHub, onde é possível acompanhar os logs.  
Foi possível identificar qual step ocasionou o erro exibindo a mensagem de falha. 
Reverti o erro para voltar a funcionar corretamente.


