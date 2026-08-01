package com.football.transfertrivia.db;

import android.content.Context;
import androidx.room.r;
import androidx.room.t;
import g1.d;
import g1.f;

/* loaded from: classes.dex */
public abstract class AppDatabase extends t {
    public static final Companion Companion = new Companion(null);
    private static volatile AppDatabase INSTANCE;

    public static final class Companion {
        public /* synthetic */ Companion(d dVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[LOOP:0: B:6:0x0019->B:15:0x004b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AppDatabase getDatabase(Context context) {
            boolean z2;
            f.e(context, "context");
            AppDatabase appDatabase = AppDatabase.INSTANCE;
            if (appDatabase == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    f.d(applicationContext, "getApplicationContext(...)");
                    for (int i = 0; i < 22; i++) {
                        char charAt = "transfer_test_database".charAt(i);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            z2 = false;
                            if (z2) {
                                r rVar = new r(applicationContext);
                                rVar.h = false;
                                rVar.i = true;
                                appDatabase = (AppDatabase) rVar.a();
                                AppDatabase.INSTANCE = appDatabase;
                            }
                        }
                        z2 = true;
                        if (z2) {
                        }
                    }
                    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                }
            }
            return appDatabase;
        }

        private Companion() {
        }
    }

    public abstract GameSessionDao gameSessionDao();
}
