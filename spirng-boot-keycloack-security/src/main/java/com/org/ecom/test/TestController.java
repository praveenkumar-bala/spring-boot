package com.org.ecom.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
    @RequestMapping(value = "/anonymous", method = RequestMethod.GET)
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("Hello Anonymous");
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<String> getUser() {
		/*
		 * Article article = new Article("Spring Data Elasticsearch"); List<Author>
		 * authorList = new ArrayList<Author>(); authorList.add(new
		 * Author("John Smith")); authorList.add(new Author("John Doe"));
		 * article.setAuthors(authorList); articleRepository.save(article); String
		 * nameToFind = "John Smith"; Page<Article> articleByAuthorName =
		 * articleRepository.findByAuthorsName(nameToFind, PageRequest.of(0, 10));
		 */

        return ResponseEntity.ok("Hello User");
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ResponseEntity<String> getAdmin() {
        return ResponseEntity.ok("Hello Admin");
    }

    @RequestMapping(value = "/all-user", method = RequestMethod.GET)
    public ResponseEntity<String> getAllUser() {
        return ResponseEntity.ok("Hello All User");
    }
}