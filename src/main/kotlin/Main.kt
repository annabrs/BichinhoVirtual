// Main.kt

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("🌸✨ Criador de Bichinho Virtual ✨🌸")
    print("👉 Escolha o nome do seu pet : ")
    val nome = scanner.nextLine().ifBlank { "Luna" }

    val pet = Pet(nome = nome)
    val acoes = AcoesPet(pet, scanner)
    val regras = RegrasJogo(pet)
    val menu = Menu(pet)

    var jogoRodando = true

    println("\nWelcome! Você adotou a fofura: 💕 ${pet.nome} 💕!\n")

    while (jogoRodando) {
        menu.exibirStatus()

        if (regras.verificarVitoria() || regras.verificarDerrota()) {
            break
        }

        menu.exibirOpcoes()
        val opcao = scanner.nextLine()
        println()

        when (opcao) {
            "1" -> acoes.alimentar()
            "2" -> acoes.brincar()
            "3" -> acoes.descansar()
            "4" -> acoes.darBanho()
            "5" -> acoes.levarAoBanheiro()
            "6" -> acoes.observar()
            "7" -> {
                println("✨ Até logo! ${pet.nome} vai sentir sua falta! 💕")
                jogoRodando = false
                continue
            }
            else -> {
                println("💖 Opção inválida! Tente novamente.")
                continue
            }
        }

        // Passagem de tempo após a ação
        regras.passarTempo()

        // Verifica condições pós-ação
        if (regras.verificarVitoria() || regras.verificarDerrota()) {
            jogoRodando = false
        }
    }
}