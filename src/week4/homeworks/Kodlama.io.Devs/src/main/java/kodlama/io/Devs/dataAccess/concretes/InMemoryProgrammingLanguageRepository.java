package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	private List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
	}
	
	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		ProgrammingLanguage programmingLanguageToUpdate = getById(programmingLanguage.getId());
		programmingLanguageToUpdate.setName(programmingLanguage.getName());
	}

	@Override
	public void delete(int id) {
	ProgrammingLanguage programmingLanguageToDelete = getById(id);
	programmingLanguages.remove(programmingLanguageToDelete);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for(ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if(programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}

}
