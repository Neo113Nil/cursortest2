package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.vc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5747vc implements Q6 {
    public final Context a;
    public final String b;
    public final C5836yn c;
    public final C5719ua d;
    public C5586p7 e;

    public C5747vc(Context context, String str, @NonNull C5836yn c5836yn) {
        this(context, str, new C5719ua(str), c5836yn);
    }

    @Override // io.appmetrica.analytics.impl.Q6
    @Nullable
    @WorkerThread
    public final synchronized SQLiteDatabase a() {
        C5586p7 c5586p7;
        try {
            this.d.a();
            c5586p7 = new C5586p7(this.a, this.b, this.c, PublicLogger.getAnonymousInstance());
            this.e = c5586p7;
        } catch (Throwable unused) {
            return null;
        }
        return c5586p7.getWritableDatabase();
    }

    @VisibleForTesting
    public C5747vc(@NonNull Context context, @NonNull String str, @NonNull C5719ua c5719ua, @NonNull C5836yn c5836yn) {
        this.a = context;
        this.b = str;
        this.d = c5719ua;
        this.c = c5836yn;
    }

    @Override // io.appmetrica.analytics.impl.Q6
    @WorkerThread
    public final synchronized void a(@Nullable SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        Do.a((Closeable) this.e);
        this.d.b();
        this.e = null;
    }
}
