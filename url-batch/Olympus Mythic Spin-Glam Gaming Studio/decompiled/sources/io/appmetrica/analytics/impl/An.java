package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class An implements InterfaceC5862zn {
    public final HashMap a;

    public An(@NonNull String str, @NonNull HashMap<String, List<String>> hashMap) {
        this.a = hashMap;
    }

    @VisibleForTesting
    public final HashMap<String, List<String>> a() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5862zn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z = true;
            for (Map.Entry entry : this.a.entrySet()) {
                try {
                    Cursor query = sQLiteDatabase.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        Do.a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z &= list.equals(asList);
                    Do.a(query);
                } catch (Throwable th) {
                    Do.a((Cursor) null);
                    throw th;
                }
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
