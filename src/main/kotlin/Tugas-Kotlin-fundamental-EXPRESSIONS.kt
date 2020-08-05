fun main() {
    val KKM = 75
    val nilaimu = 75
    val keterangan: String
    if (nilaimu >= KKM) {
        keterangan = "Nilai kamu $KKM,selamat ya!"
    } else {
        keterangan = "Nilai kamu $KKM,silakan ikuti remidial."
    }
    print(keterangan)
}
