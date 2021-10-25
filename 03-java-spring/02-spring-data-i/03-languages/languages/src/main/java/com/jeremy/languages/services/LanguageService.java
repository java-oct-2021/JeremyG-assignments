package com.jeremy.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeremy.languages.models.Language;
import com.jeremy.languages.repositories.LanguageRepository;

@Service
public class LanguageService {

	private LanguageRepository lRepo;

	public LanguageService(LanguageRepository lRepo) {
		this.lRepo = lRepo;
	} 
	
	public List<Language> allLanguages() {
		return lRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = lRepo.findById(id);
		
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		}
		
		else {
			return null;
		}
	}
	public void addLanguage(Language language) {
		lRepo.save(language);
	}
	
	public void updateLanguage(Language language) {
		lRepo.save(language);
	}
	
	public void deleteLanguage(Long id) {
		lRepo.deleteById(id);
	}
	
	
}
