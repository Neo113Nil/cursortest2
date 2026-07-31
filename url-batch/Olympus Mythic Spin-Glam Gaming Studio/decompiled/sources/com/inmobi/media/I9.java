package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class I9 extends SQLiteOpenHelper {
    public final C4330s5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I9(C4330s5 databaseConfig) {
        super(databaseConfig.a, "com.im_11.3.0.db", (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(databaseConfig, "databaseConfig");
        this.a = databaseConfig;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, C4188mk c4188mk) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + c4188mk.a + " " + c4188mk.b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final String getDatabaseName() {
        this.a.getClass();
        return "com.im_11.3.0.db";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (this.a.c != 2 || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                a(sQLiteDatabase, (C4188mk) it.next());
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
