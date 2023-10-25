package com.example.watchgallery;

public class WatchNotFoundException extends RuntimeException{

    WatchNotFoundException(Long id){
        super("Could not find watch "+ id);
    }

}
