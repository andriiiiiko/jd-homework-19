package com.andriiiiiko.spring.service;

import com.andriiiiiko.spring.entity.Note;

import java.util.List;

public interface NoteService {

    List<Note> listAll();

    Note add(Note note);

    void deleteById(Long id);

    void update(Note note);

    Note getById(Long id);
}
