package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class Z4 extends DatabaseScript {
    public final String a = "sessions";
    public final int b = 200;
    public final String c = "id";
    public final String d = "start_time";
    public final String e = "report_request_parameters";
    public final String f = "server_time_offset";
    public final String g = "type";
    public final String h = "obtained_before_first_sync";
    public final K7 i = new K7(null, 1, 0 == true ? 1 : 0);

    public final J7 a(Cursor cursor) {
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.c)));
            int i = cursor.getInt(cursor.getColumnIndexOrThrow(this.g));
            EnumC5600pl enumC5600pl = EnumC5600pl.FOREGROUND;
            boolean z = true;
            if (i != 0) {
                enumC5600pl = EnumC5600pl.BACKGROUND;
                if (i != 1) {
                    enumC5600pl = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.e));
            Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.d)));
            Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.h)) != 1) {
                z = false;
            }
            return new J7(valueOf, enumC5600pl, string, new I7(valueOf2, valueOf3, Boolean.valueOf(z)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x005b, code lost:
    
        if (r2 == null) goto L28;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        Long l;
        String str;
        Long l2;
        ArrayList arrayList = new ArrayList();
        try {
            cursor = sQLiteDatabase.query(this.a, null, null, null, null, null, null, String.valueOf(this.b));
            while (cursor.moveToNext()) {
                try {
                    J7 a = a(cursor);
                    if (a != null && (l = a.a) != null && l.longValue() >= 0 && a.b != null && (str = a.c) != null && str.length() != 0 && (l2 = a.d.a) != null && l2.longValue() > 0) {
                        arrayList.add(this.i.fromModel(a));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        cursor.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase.insertOrThrow("sessions", null, (ContentValues) it.next());
            } catch (Throwable unused3) {
            }
        }
    }
}
