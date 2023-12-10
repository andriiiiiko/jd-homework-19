package com.andriiiiiko.spring.service;

import com.andriiiiiko.spring.entity.Note;
import com.andriiiiiko.spring.exception.NoteNotFoundException;
import com.andriiiiiko.spring.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class NoteServiceImp implements NoteService {

    private final NoteRepository noteRepository;

    @Override
    public List<Note> listAll() {
        log.info("Getting all notes");
        return noteRepository.findAll();
    }

    @Override
    public Note add(Note note) {
        log.info("Adding a new note");
        return noteRepository.save(note);
    }

    @Override
    public void deleteById(Long id) {
        log.info("Deleting note with ID: {}", id);
        noteRepository.deleteById(id);
    }

    @Override
    public void update(Note note) {
        log.info("Updating note with ID: {}", note.getUserId());

        Note existingNote = noteRepository
                .findById(note.getUserId())
                .orElseThrow(() -> new NoteNotFoundException(note.getUserId()));

        existingNote.setTitle(note.getTitle());
        existingNote.setContent(note.getContent());

        noteRepository.save(existingNote);
    }

    @Override
    public Note getById(Long id) {
        log.info("Getting note by ID: {}", id);

        return noteRepository
                .findById(id)
                .orElseThrow(() -> new NoteNotFoundException(id));
    }
}
