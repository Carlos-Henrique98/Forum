package br.com.alura.forum.service

//@Service
//  class RespostaService(
//    private var respostas: List<Topico> = ArrayList(),
//    private var respostaFormMapper: RespostaFormMapper,
//    private var topicoService: TopicoService
//) {
//
//    fun cadastrar(form: NovaRespostaForm, idTopico: Long){
//        val resposta = respostaFormMapper.map(form)
//        resposta.id = respostas.size.toLong() + 1
//        resposta.topico = topicoService.buscarPorId(idTopico)
//        respostas = respostas.plus(resposta)
//    }
//}
