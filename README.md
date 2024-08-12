Climao
Climao é um aplicativo Android que fornece informações meteorológicas precisas e atualizadas para os usuários, utilizando a API OpenWeatherMap. O objetivo principal do aplicativo é fornecer dados sobre a altura das ondas e a velocidade do vento de um local específico, ajudando usuários como surfistas, velejadores e entusiastas de atividades ao ar livre a planejarem suas atividades com base nas condições climáticas.

Funcionalidades
Consulta por Localização: Os usuários podem inserir o nome de uma cidade ou coordenadas geográficas para obter as condições meteorológicas atuais.
Informações Detalhadas: O aplicativo exibe a altura das ondas e a velocidade do vento, além de outros dados climáticos, como temperatura, umidade e pressão.
Interface com Jetpack Compose: O aplicativo foi desenvolvido utilizando Jetpack Compose, proporcionando uma interface de usuário moderna e reativa.
API OpenWeatherMap: Integração com a API OpenWeatherMap para obter dados climáticos em tempo real.
Tecnologias Utilizadas
Kotlin: Linguagem principal utilizada para o desenvolvimento do aplicativo.
Jetpack Compose: Framework para construção de interfaces de usuário nativas no Android.
MVVM (Model-View-ViewModel): Arquitetura utilizada para manter a separação de preocupações e facilitar a manutenção do código.
Retrofit: Biblioteca para consumo da API REST, facilitando a comunicação com o servidor OpenWeatherMap.
Coroutines: Para operações assíncronas, garantindo uma experiência de usuário fluida.
Hilt: Para injeção de dependências, tornando o código mais modular e testável.
Como Executar
Clone este repositório:
bash
Copy code
git clone https://github.com/94lucas/Climao.git
Abra o projeto no Android Studio.
Configure a chave da API do OpenWeatherMap no arquivo local.properties:
properties
Copy code
OPEN_WEATHER_MAP_API_KEY=your_api_key_here
Execute o aplicativo em um dispositivo ou emulador Android.
Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para reportar bugs ou sugerir melhorias. Pull requests são encorajados.
