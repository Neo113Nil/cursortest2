package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class D4 {

    @NotNull
    public static final a a = new a(null);

    @NotNull
    private static final Object b = new Object();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Nullable
    public final SQLiteDatabase a(@NotNull SQLiteOpenHelper sqliteOpenHelper) {
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public static /* synthetic */ SQLiteDatabase a(D4 d4, boolean z, SQLiteOpenHelper sQLiteOpenHelper, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return d4.a(z, sQLiteOpenHelper);
    }

    @Nullable
    public final SQLiteDatabase a(boolean z, @NotNull SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase readableDatabase;
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (b) {
            try {
                if (z) {
                    readableDatabase = sqliteOpenHelper.getWritableDatabase();
                } else {
                    readableDatabase = sqliteOpenHelper.getReadableDatabase();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return readableDatabase;
    }
}
