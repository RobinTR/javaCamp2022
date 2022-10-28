package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if(!programmingLanguage.getName().isEmpty()) {
			for(ProgrammingLanguage prLang : programmingLanguageRepository.getAll()) {
				if(prLang.getName().equalsIgnoreCase(programmingLanguage.getName())) {
					throw new Exception("Aynı isimde bir programlama dili zaten mevcut.");
				}
			}
			programmingLanguageRepository.add(programmingLanguage);
		} else {
			throw new Exception("Programlama dili boş olamaz.");
		}
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.delete(id);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getById(id);
	}

}
