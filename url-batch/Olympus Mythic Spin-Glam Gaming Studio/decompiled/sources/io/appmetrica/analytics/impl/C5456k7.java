package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.sql.SQLException;

/* renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5456k7 extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
    }
}
