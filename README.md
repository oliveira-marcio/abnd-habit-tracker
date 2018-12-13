# Udacity Android Basics Nanodegree - Projeto 9 (Habit Tracker)
 
O propósito do projeto é ter um app Android que cria e inicializa um banco de dados [SQLite](https://www.sqlite.org/index.html) com sucesso e possua 2 métodos utilitários configurados para uso futuro que sejam capazes de manipular o banco de dados. 

O app não apresenta nenhuma UI.

Classes principais:
- Contrato, que define uma tabela de banco de dados para registrar hábitos do usuário. Colunas da tabela:
  - nome do hábito
  - tipo do hábito
  - data de início
  - data de término
  - notas do usuário
- Utilitária que estende [SQLiteOpenHelper](https://developer.android.com/reference/android/database/sqlite/SQLiteOpenHelper) e inicializa o banco de dados utilizando as informações do contrato. Também oferece 2 métodos:
  - Inserção de um novo hábito no banco de dados
  - Leitura de um hábito (através do ID) do banco de dados
  
 

## Instalação:
- Faça um clone do repositório
- Importe a pasta como um novo projeto no [Android Studio](https://developer.android.com/studio/)
- Configure um [emulador](https://developer.android.com/studio/run/emulator) ou conecte um [celular com USB debug ativado](https://developer.android.com/studio/run/device)
- Execute apartir do menu "Run"

## Copyright

Esse projeto foi desenvolvido por Márcio Souza de Oliveira em 03/10/2016.

