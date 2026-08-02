package com.neptunesoft.gestionbacdz.dao;

import com.neptunesoft.gestionbacdz.entities.Note;
import java.util.List;

/* loaded from: classes.dex */
public interface NoteDao {
    void deleteNote(Note Note);

    List<Note> getAllNotes();

    void insertNote(Note note);
}
