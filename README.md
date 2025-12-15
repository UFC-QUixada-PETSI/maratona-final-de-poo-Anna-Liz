[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/4Mka83l1)
🏆 Maratona Final de POO - Guia do Participante

Bem-vindos à Maratona Final de Programação Orientada a Objetos! Siga atentamente os passos abaixo para configurar seu ambiente no GitHub Codespaces e entender as regras da competição.
🛠️ Configuração do Ambiente

Siga este passo a passo exatamente como descrito para garantir que tudo funcione.
1º Passo: Acesso ao Repositório

    Entre no link do GitHub Classroom enviado pelo professor.

    Clone o repositório gerado para você/sua equipe.

    Acesse a página do seu repositório no GitHub.

2º Passo: Criando o Codespace

    Clique no botão verde Code.

    Vá na aba Codespaces.

    Clique em Create codespace on main.

3º Passo: Instalação das Ferramentas

Assim que o terminal do Codespace abrir, copie e cole o bloco de comandos abaixo para instalar o ambiente e as dependências (Python, Java e TKO):
Bash

sudo apt update && sudo apt install -y build-essential pipx wslu
grep -qxF 'export BROWSER="wslview"' ~/.bashrc || echo 'export BROWSER="wslview"' >> ~/.bashrc
sudo add-apt-repository ppa:deadsnakes/ppa
sudo apt update
sudo apt install python3.12
pipx install tko
pipx ensurepath
# Reinicie o terminal
tko --version
sudo apt install openjdk-11-jdk

4º Passo: Inicializando a Maratona

No terminal, digite o seguinte comando para baixar as questões:
Bash

tko init --git poo

5º Passo: Abrindo o Painel

Ainda no terminal, execute:
Bash

tko open poo

6º Passo: Selecionando a Linguagem

Quando solicitado, digite java e aperte Enter.
7º Passo: Acessando as Questões

No menu do lado esquerdo (ou na aba aberta), vá para a aba Local. Lá estarão listadas todas as questões da maratona.
🎈 Regras e Funcionamento

A Maratona simula um ambiente competitivo real. A estratégia é tão importante quanto o código.
🥇 Como Vencer

    Balões: Ao finalizar uma questão (passar em todos os testes), levantem a mão. A equipe receberá um balão simbolizando a conquista.

    Critério Principal: A equipe que terminar todas as questões primeiro vence.

    Desempate 1: Em caso de empate (ninguém terminar tudo ou terminarem juntos), vence a equipe com mais casos de teste passados no total.

    Desempate 2: Persistindo o empate, vence a equipe que chegou à última questão resolvida mais rápido.

🚫 Proibições e Restrições (Risco de Expulsão)

    ZERO IA: O uso de ChatGPT, Copilot, Gemini, DeepSeek ou qualquer ferramenta de IA é estritamente proibido.

        Penalidade: Expulsão imediata da equipe.

    Hardware: Todos devem utilizar apenas uma máquina para programar.

    Material de Apoio: É permitido o uso de papel e caneta para rascunhos, diagramas e lógica.

Boa sorte a todos e que vença o melhor código! 🚀

[Insira aqui o nome da sua equipe e os participantes presentes]
