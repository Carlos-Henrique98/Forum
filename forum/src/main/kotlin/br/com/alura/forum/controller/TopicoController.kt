package br.com.alura.forum.controller

import br.com.alura.forum.dto.AtualizacaoTopicoForm
import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.service.TopicoService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<TopicoView> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView {
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody @Valid dto: NovoTopicoForm) {
        service.cadastrar(dto)
    }

    @PutMapping
    fun atualizar(@RequestBody @Valid form: AtualizacaoTopicoForm) {
        service.atualizar(form)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        service.deletar(id)
    }
}