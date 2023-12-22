package com.andriiiiiko.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception to represent a not found exception for notes.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoteNotFoundException extends RuntimeException {

    /**
     * Constructs a new NoteNotFoundException with the specified ID.
     *
     * @param id The ID of the note that was not found.
     */
    public NoteNotFoundException(Long id) {
        super(String.format("Note not found with ID: %s", id));
    }
}
