# 🔍 OSINT RADAR

OSINT Radar é uma aplicacao de inteligência de fontes abertas (OSINT) desenvolvida para identificar e analisar a exposição digital de um alvo a partir de um domínio ou endereço de e-mail. O sistema executa automaticamente diversas verificações e coletas de informações públicas, consolidando os resultados em um relatório detalhado que auxilia na identificação de riscos, vazamento de dados, ativos expostos e potenciais vulnerabilidades. O objetivo é fornecer uma visão clara da presença digital do alvo, apoiando processos de segurança, monitoramento e avaliação de exposição cibernética.

## 🛠️ Padrões de Projeto Aplicados

Para garantir a modularidade e a extensibilidade da ferramenta, apliquei dois padrões de projeto estruturais/comportamentais:

1. **Strategy Pattern**: Utilizado para desacoplar as técnicas de recon (Scanners). Cada nova ferramenta de OSINT (Ex: busca de DNS, busca de vazamentos) é uma estratégia isolada que implementa a interface `OsintStrategy`. Isso permite adicionar novas ferramentas no futuro sem alterar o código existente (Princípio Aberto/Fechado do SOLID).
2. **Template Method Pattern**: Utilizado na classe `OsintEngineTemplate` para definir o algoritmo rígido de uma investigação cibernética (Registrar início -> Executar Módulos -> Sanitizar Dados PII -> Exportar Relatório). As subclasses apenas definem onde o relatório será exibido (Console, arquivo, etc), mas o fluxo de execução é protegido.

## 🚀 Como Rodar o Projeto
- Certifique-se de ter o Java JDK instalado.
- Abra a pasta no VS Code com a extensão "Extension Pack for Java".
- Abra o arquivo `Main.java` e clique em **Run**.
