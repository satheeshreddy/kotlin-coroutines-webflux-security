package com.popokis.backend_server.application.security.authorization

import com.auth0.jwt.interfaces.DecodedJWT
import com.popokis.backend_server.application.security.JWTService
import org.springframework.security.authorization.AuthorizationDecision
import org.springframework.stereotype.Component

@Component
class JWTAuthorizationManager(private val jwtService: JWTService) : JWTReactiveAuthorizationManager {
    override suspend fun getJwtService(): JWTService {
        return jwtService
    }

    override suspend fun doAuthorization(jwtToken: DecodedJWT): AuthorizationDecision {
        return AuthorizationDecision(true)
    }
}