<h1>Sistema de Barbearia</h1>

<p>
    Este projeto é um sistema simples de gerenciamento para barbearia desenvolvido em Java,
    utilizando JavaFX para interface gráfica (FXML) e persistência em arquivos de texto.
</p>

<h2>Funcionalidades</h2>
<ul>
    <li>Cadastro de clientes</li>
    <li>Agendamento de cortes</li>
    <li>Cancelamento de agendamentos</li>
    <li>Listagem de agendamentos</li>
    <li>Persistência de dados em arquivos .txt</li>
</ul>

<h2>Tecnologias Utilizadas</h2>
<ul>
    <li>Java (JDK 17 ou JDK 21)</li>
    <li>JavaFX (FXML)</li>
    <li>Arquitetura orientada a objetos com:
        <ul>
            <li>Encapsulamento</li>
            <li>Herança</li>
            <li>Enumerações (Enums)</li>
            <li>Classe Abstrata (Person.java)</li>
            <li>Exceções personalizadas (HaircutCanceledException)</li>
        </ul>
    </li>
</ul>

<h2>Persistência dos Dados</h2>
<p>
    O sistema utiliza dois arquivos de texto para armazenar informações:
</p>

<ul>
    <li><strong>clients.txt</strong> – armazena os dados dos clientes cadastrados</li>
    <li><strong>appointments.txt</strong> – armazena os agendamentos</li>
</ul>

<p>
    Ambos os arquivos são gerados automaticamente na pasta raiz do projeto quando o sistema é executado.
</p>


<h2>Executar</h2>
<p>
    Basta executar o arquivo <strong>Main.java</strong> no IntelliJ.
</p>

<h2>Objetivo</h2>
<p>
    Este sistema foi desenvolvido para fins educacionais, aplicando princípios de Programação Orientada a Objetos,
    estruturação de interfaces gráficas e manipulação de arquivos.
</p>
