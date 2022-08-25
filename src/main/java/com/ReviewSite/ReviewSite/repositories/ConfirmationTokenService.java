package com.ReviewSite.ReviewSite.repositories;

import org.springframework.stereotype.Service;

import com.ReviewSite.ReviewSite.user.ConfirmationToken;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor()
public
class ConfirmationTokenService {

	private final ConfirmationTokenRepository confirmationTokenRepository;

	public void saveConfirmationToken(ConfirmationToken confirmationToken) {

		confirmationTokenRepository.save(confirmationToken);
	}
    public void deleteConfirmationToken(Long id){

        confirmationTokenRepository.deleteById(id);
    }
    
}