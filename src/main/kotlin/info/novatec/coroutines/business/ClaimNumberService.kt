package info.novatec.coroutines.business

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Component

@Component
class ClaimNumberService {

    fun generateClaimNumber(prefix: String): String {
        var result: String = prefix
        runBlocking {
            withContext(coroutineContext) {
                async (Dispatchers.IO) {
                    result += (10000000..99999999).random().toString()
                }
            }
        }
        return result
    }
}