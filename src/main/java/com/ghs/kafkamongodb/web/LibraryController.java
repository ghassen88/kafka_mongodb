package com.ghs.kafkamongodb.web;


import com.ghs.kafkamongodb.dto.AuthorCreationRequest;
import com.ghs.kafkamongodb.dto.BookCreationRequest;
import com.ghs.kafkamongodb.dto.BookLendRequest;
import com.ghs.kafkamongodb.dto.MemberCreationRequest;
import com.ghs.kafkamongodb.entites.Author;
import com.ghs.kafkamongodb.entites.Book;
import com.ghs.kafkamongodb.entites.Member;
import com.ghs.kafkamongodb.service.LibraryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/library")
public class LibraryController {


    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

//, j'utilise @RequestParam et il doit être transmis via l'URL, et c'est une
// valeur facultative. nous pouvons utiliser @RequestParam pour
// obtenir des paramètres facultatifs comme celui-ci dans l'API Spring Boot REST

    @GetMapping("/book")
    public ResponseEntity readBooks(@RequestParam(required = false) String isbn) {
        if (isbn == null) {
            return ResponseEntity.ok(libraryService.readBooks());
        }
        return ResponseEntity.ok(libraryService.readBook(isbn));
    }



    //Cartographie GET pour lire un livre par ID. L'ID
    // est transmis en tant que variable de chemin, donc l'URL ajoutera l'ID à la fin, veillez à
    // ajouter le même nom à la fois dans l'URL et dans
    // la variable, vous allez utiliser une variable de chemin ici.
    @GetMapping("/book/{bookId}")
    public ResponseEntity<Book> readBook (@PathVariable String bookId) {
        return ResponseEntity.ok(libraryService.readBookById(bookId));
    }


    @PostMapping("/book")
    public ResponseEntity<Book> createBook (@RequestBody BookCreationRequest request) {
        return ResponseEntity.ok(libraryService.createBook(request));
    }


    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<Void> deleteBook (@PathVariable String bookId) {
        libraryService.deleteBook(bookId);
        return ResponseEntity.ok().build();
    }


    @PostMapping("/member")
    public ResponseEntity<Member> createMember (@RequestBody MemberCreationRequest request) {
        return ResponseEntity.ok(libraryService.createMember(request));
    }

    @PatchMapping("/member/{memberId}")
    public ResponseEntity<Member> updateMember (@RequestBody MemberCreationRequest request, @PathVariable String memberId) {
        return ResponseEntity.ok(libraryService.updateMember(memberId, request));
    }

    @PostMapping("/book/lend")
    public ResponseEntity<List<String>> lendABook(@RequestBody BookLendRequest bookLendRequests) {
        return ResponseEntity.ok(libraryService.lendABook(bookLendRequests));
    }

    @PostMapping("/author")
    public ResponseEntity<Author> createAuthor (@RequestBody AuthorCreationRequest request) {
        return ResponseEntity.ok(libraryService.createAuthor(request));
    }


}


