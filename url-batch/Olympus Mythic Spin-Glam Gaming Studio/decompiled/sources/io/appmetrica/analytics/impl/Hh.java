package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;

/* loaded from: classes10.dex */
public final class Hh {
    public final C5250c7 a;
    public final C5470kl b;
    public final Po c;

    public Hh(C5532n5 c5532n5) {
        this.a = c5532n5.i();
        this.b = c5532n5.s();
        this.c = c5532n5.u();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(LinkedHashMap linkedHashMap) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        C5250c7 c5250c7 = this.a;
        c5250c7.a.lock();
        try {
            readableDatabase = c5250c7.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            String a = C5250c7.a(linkedHashMap);
            ArrayList arrayList = new ArrayList(Arrays.asList(Long.toString(0L)));
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getValue());
            }
            cursor = readableDatabase.query("sessions", null, a, (String[]) arrayList.toArray(new String[0]), null, null, "id ASC", null);
            c5250c7.a.unlock();
            if (cursor != null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList2 = new ArrayList();
            while (cursor.moveToNext()) {
                try {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        arrayList2.add(new K7(null, 1, null).toModel(contentValues));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(cursor, th);
                            throw th2;
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursor, null);
            return arrayList2;
        }
        cursor = null;
        c5250c7.a.unlock();
        if (cursor != null) {
        }
    }

    public final int a() {
        int optInt;
        Po po = this.c;
        synchronized (po) {
            optInt = po.a.a().optInt("report_request_id", -1);
        }
        return optInt + 1;
    }
}
