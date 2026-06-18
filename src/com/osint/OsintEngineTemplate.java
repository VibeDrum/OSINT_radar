package com.osint;

import java.util.List;

public abstract class OsintEngineTemplate {
    
    // O esqueleto do processo de OSINT (Template Method)
    public final void executarInvestigacao(String target, List<OsintStrategy> modulos) {
        registrarInicio(target);
        
        // Executa cada modulo/estrategia escolhida
        for (OsintStrategy modulo : modulos) {
            modulo.scan(target);
        }
        
        sanitizarResultados();
        exportarRelatorio();
    }

    private void registrarInicio(String target) {
        System.out.println("\n=== INICIANDO OPERACAO OSINT NO ALVO: " + target + " ===");
    }

    private void sanitizarResultados() {
        System.out.println("[*] Removendo duplicatas e mascarando dados sensiveis...");
    }

    // Método que a classe filha vai decidir como finalizar
    protected abstract void exportarRelatorio();
}

// Implementacao do motor que joga o resultado direto na tela
class ConsoleOsintEngine extends OsintEngineTemplate {
    @Override
    protected void exportarRelatorio() {
        System.out.println("=== RELATORIO FINAL GERADO COM SUCESSO NO TERMINAL ===\n");
    }
}