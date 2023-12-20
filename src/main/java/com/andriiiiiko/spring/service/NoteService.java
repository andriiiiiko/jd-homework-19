package com.andriiiiiko.spring.service;

import com.andriiiiiko.spring.entity.Note;

public interface NoteService {

    Note createNote(Note note);

    Note getNoteById(Long noteId);

    Note updateNote(Long noteId, Note note);

    void deleteNoteById(Long noteId);
}
