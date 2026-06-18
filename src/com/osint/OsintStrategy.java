package com.osint;

// Interface que define o que toda estratégia de OSINT deve fazer
public interface OsintStrategy {
    void scan(String target);
}

// Estratégia de busca de DNS
class DnsReconStrategy implements OsintStrategy {
    @Override
    public void scan(String target) {
        System.out.println("[+] [DNS] Buscando subdominios para: " + target);
        System.out.println("    -> Encontrado: api." + target);
        System.out.println("    -> Encontrado: dev." + target);
    }
}

// Estratégia de busca de vazamentos
class BreachCheckStrategy implements OsintStrategy {
    @Override
    public void scan(String target) {
        System.out.println("[+] [Breach] Vasculhando databases vazadas para o dominio: " + target);
        System.out.println("    -> ATENCAO: 3 e-mails corporativos encontrados no Pastebin!");
    }
}