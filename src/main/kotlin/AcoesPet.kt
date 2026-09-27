import java.util.Scanner

class AcoesPet(private val pet: Pet, private val scanner: Scanner) {

    fun alimentar() {
        println("🍰 Você deu um docinho super delicioso para ${pet.nome}!")
        pet.fome = (pet.fome - 15).coerceAtLeast(0)
        pet.vontadeBanheiro += 20
    }

    fun brincar() {
        println("Você brincou de vestir roupinhas e pintar com ${pet.nome}!")
        pet.felicidade = (pet.felicidade + 15).coerceAtMost(100)
        pet.cansaco += 15
        pet.sujeira += 15
    }

    fun descansar() {
        print("🛌 Quantas horas ${pet.nome} vai dormir? (8 horas descansam totalmente): ")
        val horasInput = scanner.nextLine().toIntOrNull() ?: 0
        val horas = horasInput.coerceAtLeast(0)

        if (horas >= 8) {
            pet.cansaco = 0
            println("✨ ${pet.nome} dormiu feito um anjinho e acordou com energia total! ✨")
        } else {
            val reducao = horas * 12.5
            pet.cansaco = (pet.cansaco - reducao.toInt()).coerceAtLeast(0)
            println("💤 ({pet.nome} descansou por)horas hora(s)!")
        }
    }

    fun darBanho() {
        println("🧼 Você deu um banho cheiroso de espumas e pétalas em ${pet.nome}!")
        pet.sujeira = 0
    }

    fun levarAoBanheiro() {
        println("🧻 ${pet.nome} usou o banheiro e está leve e aliviada!")
        pet.vontadeBanheiro = 0
    }

    fun observar() {
        println(" Você passou um tempo admirando e dando carinho para ${pet.nome}... ✨")
    }
}