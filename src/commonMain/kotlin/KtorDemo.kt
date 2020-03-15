import io.ktor.client.HttpClient
import io.ktor.client.request.get

suspend fun main() {
    val httpClient = HttpClient()
    val ipData: String = httpClient.get("https://api.ipify.org/?format=json")
    println(ipData)
}
