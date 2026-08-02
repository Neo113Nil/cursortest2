package com.neptunesoft.gestionbacdz.dao;

import android.database.Cursor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.neptunesoft.gestionbacdz.entities.Note;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class NoteDao_Impl implements NoteDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<Note> __deletionAdapterOfNote;
    private final EntityInsertionAdapter<Note> __insertionAdapterOfNote;

    public NoteDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfNote = new EntityInsertionAdapter<Note>(__db) { // from class: com.neptunesoft.gestionbacdz.dao.NoteDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `Notes` (`id_note`,`title`,`date_time`,`subtitle`,`note_content`,`image_path`,`color`,`web_link`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final Note entity) {
                statement.bindLong(1, entity.getId_note());
                if (entity.getTitle() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getTitle());
                }
                if (entity.getDate_time() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, entity.getDate_time());
                }
                if (entity.getSubtitle() == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindString(4, entity.getSubtitle());
                }
                if (entity.getNote_content() == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, entity.getNote_content());
                }
                if (entity.getImage_path() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getImage_path());
                }
                if (entity.getColor() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getColor());
                }
                if (entity.getWeb_link() == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindString(8, entity.getWeb_link());
                }
            }
        };
        this.__deletionAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) { // from class: com.neptunesoft.gestionbacdz.dao.NoteDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `Notes` WHERE `id_note` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final Note entity) {
                statement.bindLong(1, entity.getId_note());
            }
        };
    }

    @Override // com.neptunesoft.gestionbacdz.dao.NoteDao
    public void insertNote(final Note note) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfNote.insert((EntityInsertionAdapter<Note>) note);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.neptunesoft.gestionbacdz.dao.NoteDao
    public void deleteNote(final Note Note) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfNote.handle(Note);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.neptunesoft.gestionbacdz.dao.NoteDao
    public List<Note> getAllNotes() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM Notes ORDER BY id_note DESC", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id_note");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "title");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date_time");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "subtitle");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "note_content");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "image_path");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, TypedValues.Custom.S_COLOR);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "web_link");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                Note note = new Note();
                note.setId_note(query.getInt(columnIndexOrThrow));
                note.setTitle(query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2));
                note.setDate_time(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3));
                note.setSubtitle(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4));
                note.setNote_content(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5));
                note.setImage_path(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                note.setColor(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
                note.setWeb_link(query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8));
                arrayList.add(note);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
