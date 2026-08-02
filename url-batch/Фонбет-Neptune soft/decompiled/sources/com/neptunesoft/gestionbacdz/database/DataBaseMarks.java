package com.neptunesoft.gestionbacdz.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.neptunesoft.gestionbacdz.classobjects.Avg;
import com.neptunesoft.gestionbacdz.classobjects.Mark;
import com.neptunesoft.gestionbacdz.classobjects.Triple;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class DataBaseMarks extends SQLiteOpenHelper {
    public static String databaseName = "marks.db";
    Context activity;
    boolean darkMode;

    public DataBaseMarks(Context context, boolean darkMode) {
        super(context, databaseName, (SQLiteDatabase.CursorFactory) null, 1);
        this.activity = context;
        this.darkMode = darkMode;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE Triples (ID_Triple INTEGER PRIMARY KEY AUTOINCREMENT,Triple INTEGER NOT NULL,Full_Name text NOT NULL,Sport INTEGER NOT NULL,Amazight INTEGER NOT NULL)");
        sqLiteDatabase.execSQL("CREATE TABLE Marks (ID_Mark INTEGER PRIMARY KEY AUTOINCREMENT,Article text NOT NULL,Behavior REAL NOT NULL,Assumption REAL NOT NULL, Test REAL NOT NULL, Factor INTEGER NOT NULL, ID_Triple INTEGER NOT NULL, FOREIGN KEY (ID_Triple) REFERENCES Triples(ID_Triple))");
        onOpen(sqLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists Marks");
        sqLiteDatabase.execSQL("drop table if exists Triples");
        onCreate(sqLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (db.isReadOnly()) {
            return;
        }
        db.execSQL("PRAGMA foreign_keys = ON;");
    }

    public boolean insertTriple(Triple triple) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Triple", Integer.valueOf(triple.getTriple()));
        contentValues.put("Full_Name", String.valueOf(triple.getFull_name()));
        if (triple.isSport()) {
            contentValues.put("Sport", (Integer) 1);
        } else {
            contentValues.put("Sport", (Integer) 0);
        }
        if (triple.isAmazight()) {
            contentValues.put("Amazight", (Integer) 1);
        } else {
            contentValues.put("Amazight", (Integer) 0);
        }
        return writableDatabase.insert("Triples", null, contentValues) != -1;
    }

    public void updateMark(Mark mark) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Behavior", String.format(Locale.ENGLISH, "%.02f", Double.valueOf(mark.getBehavior())));
        contentValues.put("Assumption", String.format(Locale.ENGLISH, "%.02f", Double.valueOf(mark.getAssumption())));
        contentValues.put("Test", String.format(Locale.ENGLISH, "%.02f", Double.valueOf(mark.getTest())));
        writableDatabase.update("Marks", contentValues, "ID_Mark = ?", new String[]{Integer.toString(mark.getId_mark())});
        writableDatabase.close();
    }

    public void insertMark(Mark mark) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Article", String.valueOf(mark.getArticle()));
        contentValues.put("Behavior", String.format(Locale.ENGLISH, "%.02f", Double.valueOf(mark.getBehavior())));
        contentValues.put("Assumption", String.format(Locale.ENGLISH, "%.02f", Double.valueOf(mark.getAssumption())));
        contentValues.put("Test", String.format(Locale.ENGLISH, "%.02f", Double.valueOf(mark.getTest())));
        contentValues.put("Factor", Integer.valueOf(mark.getFactor()));
        contentValues.put("ID_Triple", Integer.valueOf(mark.getId_triple()));
        writableDatabase.insert("Marks", null, contentValues);
    }

    public List<Object> getAllMarks(int id_triple) {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor rawQuery = readableDatabase.rawQuery("SELECT Marks.ID_Mark,Marks.Article,Marks.Behavior,Marks.Assumption,Marks.Test,Marks.Factor,Marks.ID_Triple FROM Marks WHERE Marks.ID_Triple = '" + id_triple + "' ORDER BY Marks.ID_Mark ASC", null);
        if (rawQuery.moveToFirst()) {
            String[] columnNames = rawQuery.getColumnNames();
            while (!rawQuery.isAfterLast()) {
                arrayList.add(new Mark(rawQuery.getInt(rawQuery.getColumnIndex(columnNames[0])), rawQuery.getString(rawQuery.getColumnIndex(columnNames[1])), rawQuery.getFloat(rawQuery.getColumnIndex(columnNames[2])), rawQuery.getFloat(rawQuery.getColumnIndex(columnNames[3])), rawQuery.getFloat(rawQuery.getColumnIndex(columnNames[4])), rawQuery.getInt(rawQuery.getColumnIndex(columnNames[5])), rawQuery.getInt(rawQuery.getColumnIndex(columnNames[6])), this.darkMode));
                rawQuery.moveToNext();
                columnNames = columnNames;
            }
        }
        rawQuery.close();
        readableDatabase.close();
        return arrayList;
    }

    public List<Object> getAllAvg() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor rawQuery = readableDatabase.rawQuery("SELECT Triples.ID_Triple,Triples.Full_Name,Triples.Triple FROM Triples ORDER BY Triples.ID_Triple DESC", null);
        if (rawQuery.moveToFirst()) {
            String[] columnNames = rawQuery.getColumnNames();
            while (!rawQuery.isAfterLast()) {
                arrayList.add(new Avg(rawQuery.getInt(rawQuery.getColumnIndex(columnNames[0])), rawQuery.getString(rawQuery.getColumnIndex(columnNames[1])), rawQuery.getInt(rawQuery.getColumnIndex(columnNames[2])), averageCalculation(rawQuery.getInt(rawQuery.getColumnIndex(columnNames[0]))), this.darkMode));
                rawQuery.moveToNext();
            }
        }
        rawQuery.close();
        readableDatabase.close();
        return arrayList;
    }

    public boolean checkTripleFullName(int triple, String fullName) {
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor rawQuery = readableDatabase.rawQuery("SELECT Triples.ID_Triple from Triples where Triples.Triple = '" + triple + "' and Triples.Full_Name = '" + fullName + "'", null);
        int count = rawQuery.getCount();
        rawQuery.close();
        readableDatabase.close();
        return count > 0;
    }

    public double averageCalculation(int idTriple) {
        List<Object> allMarks = getAllMarks(idTriple);
        double d = 0.0d;
        int i = 0;
        for (int i2 = 0; i2 < allMarks.size(); i2++) {
            i += ((Mark) allMarks.get(i2)).getFactor();
            d += (((((Mark) allMarks.get(i2)).getBehavior() + ((Mark) allMarks.get(i2)).getAssumption()) + (((Mark) allMarks.get(i2)).getTest() * 2.0d)) / 4.0d) * ((Mark) allMarks.get(i2)).getFactor();
        }
        return round(d / i, 2);
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        return Math.round(value * r0) / ((long) Math.pow(10.0d, places));
    }

    public void deleteTriple(int idTriple) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.execSQL("DELETE FROM Marks WHERE Marks.ID_Triple='" + idTriple + "'");
        writableDatabase.execSQL("DELETE FROM Triples WHERE Triples.ID_Triple='" + idTriple + "'");
        writableDatabase.close();
    }

    public Triple getLastTriple() {
        Triple triple;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor rawQuery = readableDatabase.rawQuery("SELECT Triples.ID_Triple,Triples.Triple,Triples.Full_Name,Triples.Sport,Triples.Amazight from Triples where ID_Triple = (SELECT MAX(ID_Triple)  FROM Triples)", null);
        if (rawQuery.moveToFirst()) {
            String[] columnNames = rawQuery.getColumnNames();
            triple = new Triple(rawQuery.getInt(rawQuery.getColumnIndex(columnNames[0])), rawQuery.getInt(rawQuery.getColumnIndex(columnNames[1])), rawQuery.getString(rawQuery.getColumnIndex(columnNames[2])), rawQuery.getInt(rawQuery.getColumnIndex(columnNames[3])) != 0, rawQuery.getInt(rawQuery.getColumnIndex(columnNames[4])) != 0);
        } else {
            triple = new Triple(-1, 0, null, false, false);
        }
        rawQuery.close();
        readableDatabase.close();
        return triple;
    }
}
