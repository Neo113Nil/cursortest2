package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Kl implements Q6 {
    public final C5586p7 a;

    public Kl(@NotNull C5586p7 c5586p7) {
        this.a = c5586p7;
    }

    @Override // io.appmetrica.analytics.impl.Q6
    public final void a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.Q6
    @Nullable
    public final SQLiteDatabase a() {
        try {
            return this.a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
