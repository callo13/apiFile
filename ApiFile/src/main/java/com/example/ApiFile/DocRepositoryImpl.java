package com.example.ApiFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocRepositoryImpl {
	@Autowired
	private DocRepository docRepository;
	
	public Documents saveFile(MultipartFile file) {
		String docname=file.getOriginalFilename();
		Documents doc;
		try {
			doc = new Documents(docname,file.getContentType(),file.getBytes());
			return docRepository.save(doc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
