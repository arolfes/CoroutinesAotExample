package info.novatec.coroutines.api

import info.novatec.coroutines.business.ClaimNumberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/claimNumber")
@Validated
class ClaimNumberController(
    @Autowired private val claimNumberService: ClaimNumberService
) {

    @GetMapping("/{claimNumberPrefix}/generate")
    fun isClaimNumberValid(
        @PathVariable
        claimNumberPrefix: String
    ): String {
        return """{"newClaimNumber":"${claimNumberService.generateClaimNumber(claimNumberPrefix)}"}"""
    }
}