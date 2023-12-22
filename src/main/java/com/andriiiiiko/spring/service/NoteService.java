package com.andriiiiiko.spring.service;

import com.andriiiiiko.spring.entity.Note;

/**
 * Service interface for managing notes.
 */
public interface NoteService {

    /**
     * Creates a new note.
     *
     * @param note The note to be created.
     * @return The created note.
     */
    Note createNote(Note note);

    /**
     * Retrieves a note by its ID.
     *
     * @param noteId The ID of the note to retrieve.
     * @return The note with the specified ID.
     */
    Note getNoteById(Long noteId);

    /**
     * Updates an existing note.
     *
     * @param noteId The ID of the note to update.
     * @param note   The updated information for the note.
     * @return The updated note.
     */
    Note updateNote(Long noteId, Note note);

    /**
     * Deletes a note by its ID.
     *
     * @param noteId The ID of the note to delete.
     */
    void deleteNoteById(Long noteId);
}
