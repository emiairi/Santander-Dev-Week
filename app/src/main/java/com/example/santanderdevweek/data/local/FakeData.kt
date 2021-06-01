package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData() : Conta{
        val cliente = Cliente("Maria")
        val cartao = Cartao("8382797347")
        return Conta(
            "4556-2",
            "9283-2",
            "R$ 1.100,31",
            "R$ 2.000,00",
            cliente,
            cartao
        );
    }
}