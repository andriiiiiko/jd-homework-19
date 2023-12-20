package com.andriiiiiko.spring.controller;

import com.andriiiiiko.spring.entity.Note;
import com.andriiiiiko.spring.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/notes")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @PostMapping("/create")
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable("id") Long noteId) {
        return noteService.getNoteById(noteId);
    }

    @PostMapping("/update/{id}")
    public Note updateNote(@PathVariable("id") Long noteId,
                           @RequestBody Note note) {
        return noteService.updateNote(noteId, note);
    }

    @PostMapping("/delete/{id}")
    public void deleteNoteById(@PathVariable("id") Long noteId) {
        noteService.deleteNoteById(noteId);
    }
}
