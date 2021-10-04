package br.com.alura.forum.mapper

import br.com.alura.forum.dto.NovaRespostaForm
import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.model.Resposta
import br.com.alura.forum.model.Topico
import br.com.alura.forum.service.TopicoService
import org.springframework.stereotype.Component

//@Component
//class RespostaFormMapper(private var topicoService: TopicoService) : Mapper<NovaRespostaForm, Topico> {
//    override fun map(t: NovaRespostaForm): Topico {
//        return Resposta(
//            id = t.idAutor,
//            topico = topicoService.buscarPorId(t.idAutor)
//        )
//    }
//
//}
