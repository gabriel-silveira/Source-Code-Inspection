package br.calebe.ticketmachine.core;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicketMachineTest {
    
    public static void main(String[] args) throws PapelMoedaInvalidaException {
        TicketMachineTest tmt = new TicketMachineTest();
        // insere a quantia
        tmt.inserirQUantia(10);
    }
    
    @Test
    public void inserirQUantia(int quantia) throws PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(quantia);
        
        // se inserir a quantia, testar o saldo
        if(tm.inserir(quantia*2)) {
            int saldo = tm.getSaldo();
            assertEquals(21, saldo);
        }
    }
}
