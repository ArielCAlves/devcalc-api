# DevCalc API 

Aplicacao em Java utilizada na faculdade que realiza operações matemáticas básicas: adição, subtração, multiplicação, divisão e raiz quadrada.

### Endpoints para testar a API
- GET /add?a=10&b=5 → retorna 15
- GET /subtract?a=10&b=5 → retorna 5
- GET /multiply?a=10&b=5 → retorna 50
- GET /divide?a=10&b=5 → retorna 2
- GET /sqrt?x=16 → retorna 4

### Objetivo: foco em CI/CD usando GitHub Actions

### Build Tool
- Maven
- Java 17

### Badges
![CI Pipeline](https://github.com/ArielCAlves/devcalc-api/actions/workflows/ci.yml/badge.svg)
![Create Issue](https://github.com/ArielCAlves/devcalc-api/actions/workflows/create-issue.yml/badge.svg)
![Deploy](https://github.com/ArielCAlves/devcalc-api/actions/workflows/deploy.yml/badge.svg)
![Env Context Demo](https://github.com/ArielCAlves/devcalc-api/actions/workflows/env-context-demo.yml/badge.svg)
![Hello](https://github.com/ArielCAlves/devcalc-api/actions/workflows/hello.yml/badge.svg)
![Self Hosted Check](https://github.com/ArielCAlves/devcalc-api/actions/workflows/self-hosted-check.yml/badge.svg)
![Vars and Secrets](https://github.com/ArielCAlves/devcalc-api/actions/workflows/vars.yml/badge.svg)


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


### Execução Manual vs Automática
O pipeline foi executado automaticamente após o push e também manualmente no momento que cliquei em "Run workflow" dentro do pipeline que está na aba **Actions**.  
Para execução automática tem o trigger `push` e para manual tem `workflow_dispatch`, sendo que esta é possível escolher os parâmetros `run_tests` e `run_lint`  enquanto aquela garante integração contínua com cada alteração que é feita no projeto.



