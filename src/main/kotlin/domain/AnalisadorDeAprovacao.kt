package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {
    private lateinit var criterio: CriterioDeAprovacao
    

    fun defineCriterio(criterioDeAprovacao : CriterioDeAprovacao){
        criterio = criterioDeAprovacao
    }
    
    fun fechaBoletim(boletim: Boletim) : BoletimFechado{
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, criterio.mediaFinal(boletim), criterio.estaAprovado(boletim))
    }
}
