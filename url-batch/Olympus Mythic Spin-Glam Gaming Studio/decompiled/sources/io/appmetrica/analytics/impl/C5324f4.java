package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.f4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5324f4 extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("preferences", "key = ?", new String[]{"NEXT_STARTUP_TIME"});
    }
}
