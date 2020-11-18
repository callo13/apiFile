package com.example.ApiFile;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public interface DocRepository extends JpaRepository<Documents, Integer>{
	public Documents saveFile(MultipartFile file);

	public Documents findBydocName(String name);

}
