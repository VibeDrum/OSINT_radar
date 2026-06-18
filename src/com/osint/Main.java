package com.osint;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instancia nosso motor de OSINT
        OsintEngineTemplate engine = new ConsoleOsintEngine();

        // Define o alvo da investigação
        String alvo = "alvo-empresa.com.br";

        // Escolhe dinamicamente quais módulos de OSINT quer rodar (Strategy)
        List<OsintStrategy> ferramentasAtivas = new ArrayList<>();
        ferramentasAtivas.add(new DnsReconStrategy());
        ferramentasAtivas.add(new BreachCheckStrategy());

        // Executa o fluxo padrão (Template Method)
        engine.executarInvestigacao(alvo, ferramentasAtivas);
    }
}