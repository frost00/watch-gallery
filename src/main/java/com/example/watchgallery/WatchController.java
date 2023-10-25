package com.example.watchgallery;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WatchController {
    private final WatchRepository repository;

    WatchController(WatchRepository repository){
        this.repository = repository;
    }


        @GetMapping("/watch")
        List<Watch>all(){
            return repository.findAll(); 
        }
    
        @PostMapping("/watch")
        Watch newWatch(@RequestBody Watch newWatch){
            return repository.save(newWatch);
        }
        
        @GetMapping("watch/{id}")
        Watch one(@PathVariable Long id){
            return repository.findById(id)
            .orElseThrow(()-> new WatchNotFoundException(id));
        }

        @PutMapping("/watch/{all}")
        Watch replaceWatch(@RequestBody Watch newWatch,@PathVariable Long id){
            return repository.findById(id)
            .map(watch->{
                watch.setName(newWatch.getName());
                watch.setBrand(newWatch.getBrand());
                return repository.save(watch);
            })
            .orElseGet(()->{
                newWatch.setId(id);
                return repository.save(newWatch);
            });
        }
        
        @DeleteMapping("/watch/{id}")
        void deleteWatch(@PathVariable Long id){
            repository.deleteById(id);
        }


    }
