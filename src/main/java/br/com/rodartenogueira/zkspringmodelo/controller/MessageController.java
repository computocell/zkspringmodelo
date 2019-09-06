package br.com.rodartenogueira.zkspringmodelo.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodartenogueira.zkspringmodelo.database.entities.Message;
import br.com.rodartenogueira.zkspringmodelo.database.repository.MessageRepository;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private MessageRepository repository;

    public MessageController(MessageRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public Page<Message> getMessages(Pageable pageable){
        return repository.findAll(pageable);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Message createMessage(@RequestBody Message message){
        return repository.save(message);
    }

    @DeleteMapping("/{uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMessage(@RequestParam String uuid){
        repository.deleteById(uuid);
    }

}
