## Diferença entre Workflow e Action (atividade do TP2): Workflows vs Actions

- **Workflow** é o arquivo que define o fluxo de execução (CI/CD). Ele tem as triggers, jobs, steps e outros comandos que serão executados. Um exemplo é o arquivo ci.yml disponível em: [`ci.yml`](https://github.com/ArielCAlves/devcalc-api/blob/main/.github/workflows/ci.yml)

- **Action** é uma tarefa específica dentro do workflow.

---

## Como uma Action é estruturada internamente

Uma action tem um arquivo chamado `action.yml`, cujo objetivo é definir:

- **`inputs`**: as entredas que podem ser passadas no momento em que chama a action.
- **`outputs`**: as saídas que a action retorna.
- **`runs`**: define o ambiente da action para a execução.

---
