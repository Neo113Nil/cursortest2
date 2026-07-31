package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.buffering.BatchProcessor;
import io.appmetrica.analytics.coreutils.internal.buffering.DeferredBatchExecutor;
import io.appmetrica.analytics.coreutils.internal.buffering.MapMergingBuffer;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class Ob implements InterfaceC5357gb, Closeable {

    @NotNull
    public static final Nb g = new Nb();
    public final String a;
    public final Q6 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final Object d = new Object();
    public volatile boolean e;
    public final DeferredBatchExecutor f;

    public Ob(@NotNull String str, @NotNull Q6 q6, @NotNull IHandlerExecutor iHandlerExecutor) {
        this.a = str;
        this.b = q6;
        this.f = new DeferredBatchExecutor(iHandlerExecutor, new MapMergingBuffer(), new BatchProcessor() { // from class: io.appmetrica.analytics.impl.Ob$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreutils.internal.buffering.BatchProcessor
            public final void processBatch(List list) {
                Ob.a(Ob.this, list);
            }
        }, 1000L, "[KeyValueTableDbHelper-(" + str + ")]");
        iHandlerExecutor.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Ob$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ob.a(Ob.this);
            }
        });
    }

    public static final void a(Ob ob, List list) {
        SQLiteDatabase sQLiteDatabase;
        Map map = (Map) CollectionsKt.first(list);
        ob.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            if (value == ob) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            arrayList.add(contentValues);
        }
        ContentValues[] contentValuesArr = (ContentValues[]) arrayList.toArray(new ContentValues[0]);
        if (contentValuesArr == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = ob.b.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    try {
                        Iterator it = ArrayIteratorKt.iterator(contentValuesArr);
                        while (it.hasNext()) {
                            ContentValues contentValues2 = (ContentValues) it.next();
                            if (contentValues2.getAsString("value") == null) {
                                sQLiteDatabase.delete(ob.a, "key = ?", new String[]{contentValues2.getAsString("key")});
                            } else {
                                sQLiteDatabase.insertWithOnConflict(ob.a, null, contentValues2, 5);
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        Do.a(sQLiteDatabase);
                    } catch (Throwable th) {
                        Do.a(sQLiteDatabase);
                        throw th;
                    }
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    ob.b.a(sQLiteDatabase);
                }
            }
        } catch (Throwable unused2) {
        }
        ob.b.a(sQLiteDatabase);
    }

    public final float b(@NotNull String str, float f) {
        Object b = b(str);
        return b instanceof Float ? ((Number) b).floatValue() : f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        SQLiteDatabase sQLiteDatabase;
        String str;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.b.a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(this.a, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    if (query != null) {
                        while (query.moveToNext()) {
                            try {
                                String string = query.getString(query.getColumnIndexOrThrow("key"));
                                String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                                int i = query.getInt(query.getColumnIndexOrThrow("type"));
                                if (string != null && string.length() != 0) {
                                    if (i != 1) {
                                        if (i == 2) {
                                            str = ParseUtils.parseInt(string2);
                                        } else if (i != 3) {
                                            str = string2;
                                            if (i != 4) {
                                                str = i != 5 ? null : ParseUtils.parseFloat(string2);
                                            }
                                        } else {
                                            str = ParseUtils.parseLong(string2);
                                        }
                                        if (str == null) {
                                            this.c.put(string, str);
                                        }
                                    } else {
                                        if (Intrinsics.areEqual(string2, "true")) {
                                            str = Boolean.TRUE;
                                        } else {
                                            if (Intrinsics.areEqual(string2, "false")) {
                                                str = Boolean.FALSE;
                                            }
                                        }
                                        if (str == null) {
                                        }
                                    }
                                }
                            } finally {
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(query, null);
                    }
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.b.a(sQLiteDatabase);
                }
            }
        } catch (Throwable unused2) {
        }
        this.b.a(sQLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @VisibleForTesting
    public final void close() {
        this.f.flush();
    }

    public final void d() {
        if (this.e) {
            return;
        }
        try {
            Object obj = this.d;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Object");
            obj.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final void flushAsync() {
        this.f.flushAsync();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final boolean getBoolean(@NotNull String str, boolean z) {
        Object b = b(str);
        return b instanceof Boolean ? ((Boolean) b).booleanValue() : z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final int getInt(@NotNull String str, int i) {
        Object b = b(str);
        return b instanceof Integer ? ((Number) b).intValue() : i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final long getLong(@NotNull String str, long j) {
        Object b = b(str);
        return b instanceof Long ? ((Number) b).longValue() : j;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    @Nullable
    public final String getString(@NotNull String str, @Nullable String str2) {
        Object b = b(str);
        return b instanceof String ? (String) b : str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    @NotNull
    public final InterfaceC5357gb remove(@NotNull String str) {
        synchronized (this.d) {
            d();
            this.c.remove(str);
        }
        DeferredBatchExecutor.submit$default(this.f, MapsKt.mapOf(TuplesKt.to(str, this)), false, 2, null);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    @NotNull
    public final Set<String> b() {
        HashSet hashSet;
        synchronized (this.d) {
            hashSet = new HashSet(this.c.keySet());
        }
        return hashSet;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.d) {
            d();
            obj = this.c.get(str);
        }
        return obj;
    }

    public static final void a(Ob ob) {
        synchronized (ob.d) {
            ob.c();
            ob.e = true;
            Object obj = ob.d;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Object");
            obj.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final void a() {
        this.f.flush();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    @NotNull
    public final InterfaceC5357gb a(@NotNull String str, @NotNull String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    @NotNull
    public final InterfaceC5357gb a(@NotNull String str, long j) {
        a(str, Long.valueOf(j));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    @NotNull
    public final InterfaceC5357gb a(@NotNull String str, int i) {
        a(str, Integer.valueOf(i));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    @NotNull
    public final InterfaceC5357gb a(@NotNull String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    @NotNull
    public final InterfaceC5357gb a(@NotNull String str, float f) {
        a(str, Float.valueOf(f));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final boolean a(@NotNull String str) {
        boolean containsKey;
        synchronized (this.d) {
            d();
            containsKey = this.c.containsKey(str);
        }
        return containsKey;
    }

    @VisibleForTesting
    public final void a(@NotNull String str, @NotNull Object obj) {
        synchronized (this.d) {
            d();
            this.c.put(str, obj);
            Unit unit = Unit.INSTANCE;
        }
        DeferredBatchExecutor.submit$default(this.f, MapsKt.mapOf(TuplesKt.to(str, obj)), false, 2, null);
    }
}
