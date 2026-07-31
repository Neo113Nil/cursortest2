package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.buffering.DeferredBatchExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Jn implements TempCacheStorage {
    public final Q6 a;
    public final String b;
    public final SystemTimeProvider c = new SystemTimeProvider();
    public final C5556o3 d = new C5556o3(new In(this));

    public Jn(@NotNull Q6 q6, @NotNull String str) {
        this.a = q6;
        this.b = str;
    }

    public final void b() {
        this.d.b.flushAsync();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void put(@NotNull String str, long j, @NotNull byte[] bArr) {
        DeferredBatchExecutor.submit$default(this.d.b, new Mn(str, j, bArr), false, 2, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j) {
        a("id=?", new String[]{String.valueOf(j)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(@NotNull String str, long j) {
        a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.c.currentTimeMillis() - j)});
    }

    public final long a(@NotNull String str, long j, @NotNull byte[] bArr) {
        return a(CollectionsKt.listOf(new Mn(str, j, bArr)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @Nullable
    public final TempCacheStorage.Entry get(@NotNull String str) {
        return (TempCacheStorage.Entry) CollectionsKt.firstOrNull((List) get(str, 1));
    }

    public final long a(List list) {
        long j = -1;
        if (list.isEmpty()) {
            return -1L;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a = this.a.a();
            if (a != null) {
                try {
                    a.beginTransaction();
                    try {
                        Iterator it = list.iterator();
                        long j2 = -1;
                        while (it.hasNext()) {
                            Mn mn = (Mn) it.next();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("scope", mn.a);
                            contentValues.put("timestamp", Long.valueOf(mn.b));
                            contentValues.put("data", mn.c);
                            j2 = a.insertOrThrow(this.b, null, contentValues);
                        }
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        j = j2;
                    } catch (Throwable th) {
                        a.endTransaction();
                        throw th;
                    }
                } catch (Throwable unused) {
                    sQLiteDatabase = a;
                    this.a.a(sQLiteDatabase);
                    return j;
                }
            }
            this.a.a(a);
        } catch (Throwable unused2) {
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<TempCacheStorage.Entry> get(@NotNull String str, int i) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        Ln ln;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            sQLiteDatabase = this.a.a();
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable unused) {
            cursor = null;
        }
        if (sQLiteDatabase != 0) {
            try {
                cursor = sQLiteDatabase.query(false, this.b, null, "scope=?", new String[]{str}, null, null, "id", String.valueOf(i));
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            try {
                                ln = new Ln(cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getString(cursor.getColumnIndexOrThrow("scope")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getBlob(cursor.getColumnIndexOrThrow("data")));
                            } catch (Throwable unused2) {
                                ln = null;
                            }
                            if (ln != null) {
                                arrayList.add(ln);
                            }
                        } catch (Throwable unused3) {
                            cursor2 = sQLiteDatabase;
                            sQLiteDatabase = cursor2;
                            cursor2 = cursor;
                            sQLiteDatabase2 = sQLiteDatabase;
                            Do.a(cursor2);
                            this.a.a(sQLiteDatabase2);
                            return arrayList;
                        }
                    }
                }
            } catch (Throwable unused4) {
                cursor = null;
            }
            cursor2 = cursor;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        Do.a(cursor2);
        this.a.a(sQLiteDatabase2);
        return arrayList;
    }

    public final void a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.a.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.delete(this.b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.a.a(sQLiteDatabase);
    }

    public final void a() {
        this.d.b.flush();
    }
}
