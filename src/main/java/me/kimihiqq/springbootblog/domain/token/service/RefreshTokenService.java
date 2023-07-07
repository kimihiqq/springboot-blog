package me.kimihiqq.springbootblog.domain.token.service;

import lombok.RequiredArgsConstructor;
import me.kimihiqq.springbootblog.domain.token.RefreshToken;
import me.kimihiqq.springbootblog.domain.token.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}

