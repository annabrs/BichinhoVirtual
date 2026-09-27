class RegrasJogo(private val pet: Pet) {

    fun passarTempo() {
        pet.fome += 3
        pet.felicidade -= 3
        pet.cansaco += 10
        pet.idade += 1
    }

    fun verificarVitoria(): Boolean {
        if (pet.idade >= 50) {
            println("\n🎉 PARABÉNSSSS! 🎉")
            println("✨ ${pet.nome} atingiu a idade 50 muito feliz e saudável com todo o seu cuidado! Você venceu o jogo! ✨")
            return true
        }
        return false
    }

    fun verificarDerrota(): Boolean {
        return when {
            pet.fome >= 100 -> {
                encerrarJogo("💔 ${pet.nome} ficou com muita fome e precisou ser levada ao veterinário!")
                true
            }
            pet.cansaco >= 100 -> {
                encerrarJogo("💔 ${pet.nome} exauriu todas as forças de tanto cansaço!")
                true
            }
            pet.felicidade <= 0 -> {
                encerrarJogo("💔 ${pet.nome} ficou muito tristinha e desanimou!")
                true
            }
            pet.vontadeBanheiro >= 100 -> {
                encerrarJogo("💔 Oh não! ${pet.nome} teve um aperto gigante e se acidentou!")
                true
            }
            pet.sujeira >= 100 -> {
                encerrarJogo("💔 ${pet.nome} ficou sujinha demais e adoeceu!")
                true
            }
            else -> false
        }
    }

    private fun encerrarJogo(mensagem: String) {
        println("\n😭 GAME OVER 😭")
        println(mensagem)
    }
}