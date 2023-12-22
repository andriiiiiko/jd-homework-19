package com.andriiiiiko.spring.controller;

import com.andriiiiiko.spring.entity.Note;
import com.andriiiiiko.spring.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class for managing notes.
 */
@RestController
@RequestMapping("api/v1/notes")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    /**
     * Creates a new note.
     *
     * @param note The note to be created.
     * @return The created note.
     */
    @PostMapping("/create")
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

    /**
     * Retrieves a note by its ID.
     *
     * @param noteId The ID of the note to retrieve.
     * @return The note with the specified ID.
     */
    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable("id") Long noteId) {
        return noteService.getNoteById(noteId);
    }

    /**
     * Updates an existing note.
     *
     * @param noteId The ID of the note to update.
     * @param note   The updated information for the note.
     * @return The updated note.
     */
    @PostMapping("/update/{id}")
    public Note updateNote(@PathVariable("id") Long noteId,
                           @RequestBody Note note) {
        return noteService.updateNote(noteId, note);
    }

    /**
     * Deletes a note by its ID.
     *
     * @param noteId The ID of the note to delete.
     */
    @PostMapping("/delete/{id}")
    public void deleteNoteById(@PathVariable("id") Long noteId) {
        noteService.deleteNoteById(noteId);
    }
}
