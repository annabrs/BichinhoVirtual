// Menu.kt
class Menu(private val pet: Pet) {

    fun exibirStatus() {
        println("──────────────────────────────────────────")
        println("💖 ✨ STATUS DO PET MAIS FOFO DO MUNDO ${pet.nome.uppercase()} ✨ 💖")
        println("🎂 Idade: ${pet.idade} / 50")
        println("🍓 Fome: ${pet.fome} / 100")
        println("🌸 Felicidade: ${pet.felicidade} / 100")
        println("💤 Cansaço: ${pet.cansaco} / 100")
        println("🧻 Vontade de ir ao Banheiro: ${pet.vontadeBanheiro} / 100")
        println("🧼 Sujeira: ${pet.sujeira} / 100")
        println("──────────────────────────────────────────")
    }

    fun exibirOpcoes() {
        println("\n🎀 O que você gostaria de fazer com ${pet.nome}? 🎀")
        println("1. 🍰 Alimentar")
        println("2. 🎨 Brincar")
        println("3. 🛌 Descansar")
        println("4. 🧼 Dar Banho")
        println("5. 🧻 Levar ao Banheiro")
        println("6. 💖 Apenas olhar (Avançar tempo)")
        println("7. 🌸 Sair do jogo")
        print("👉 Escolha uma opção: ")
    }
}