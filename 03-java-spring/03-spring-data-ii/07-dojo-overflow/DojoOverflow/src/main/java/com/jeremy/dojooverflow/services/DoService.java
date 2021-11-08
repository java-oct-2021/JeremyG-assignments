package com.jeremy.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeremy.dojooverflow.models.Answer;
import com.jeremy.dojooverflow.models.Question;
import com.jeremy.dojooverflow.models.Tag;
import com.jeremy.dojooverflow.repositories.AnswerRepository;
import com.jeremy.dojooverflow.repositories.QuestionRepository;
import com.jeremy.dojooverflow.repositories.TagRepository;

@Service
public class DoService {
	private final QuestionRepository qRepo;
	private final TagRepository tRepo;
	private final AnswerRepository aRepo;
	
	public DoService(QuestionRepository qRepo, TagRepository tRepo, AnswerRepository aRepo) {
		this.qRepo = qRepo;
		this.tRepo = tRepo;
		this.aRepo = aRepo;
	}
	
	public List<Question> allQuestions(){
		return (List<Question>) qRepo.findAll();
	}
	
	public Question findQuestionById(Long id) {
		Optional<Question> optQ = qRepo.findById(id);
		if(optQ.isPresent()) {
			return optQ.get();
		}
		else {
			return null;
		}
	}
	
	public void createAnswer(String ans, Long id) {
		Answer answer = new Answer();
		aRepo.save(answer);
	}
	
	public void createQuestion(String q, List<String> tags) {
		Question question = new Question(q);
		List<Tag> objTags = createTag(tags);
		addTagsToQuestion(objTags, question);
	}
	
	
	public List<Tag> createTag(List<String> tags) {
		List<Tag> returnTags = new ArrayList<Tag>(); 
		List<Tag> allTags = (List<Tag>) tRepo.findAll(); 
		for(int i=0; i<tags.size(); i++) { 
			String name = tags.get(i); 
			for(int j=0; j<allTags.size(); j++) {
				if(name.equals(allTags.get(j).getName())) { 
					returnTags.add(tRepo.findByName(name));
					name = "exists";
					break;
				}
			}
			if(!name.equals("exists")) { 
				Tag tag = new Tag(name);
				returnTags.add(tag);
				tRepo.save(tag);
			}
		}
		return returnTags;
	}
	
	public void addTagsToQuestion(List<Tag> objTags, Question q) {
		q.setTags(objTags);
		qRepo.save(q);
	}
}
