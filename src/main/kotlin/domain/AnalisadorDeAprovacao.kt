package domain

import criterios.CriterioDeAprovacao
import Boletim
import org.junit.jupiter.api.BeforeEach

class AnalisadorDeAprovacao {
    private lateinit var criterio: CriterioDeAprovacao
    
    @BeforeEach
    fun defineCriterio(criterioDeAprovacao : CriterioDeAprovacao){
        criterio = criterioDeAprovacao
    }
    
    fun fechaBoletim(boletim: Boletim) : BoletimFechado{
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, criterio.mediaFinal(boletim), criterio.estaAprovado(boletim))
    }
}
