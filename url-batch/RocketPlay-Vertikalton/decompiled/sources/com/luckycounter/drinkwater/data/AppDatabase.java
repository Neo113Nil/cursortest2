package com.luckycounter.drinkwater.data;

import android.content.Context;
import androidx.room.r;
import androidx.room.t;
import i1.d;
import i1.f;

/* loaded from: classes.dex */
public abstract class AppDatabase extends t {
    public static final Companion Companion = new Companion(null);
    private static volatile AppDatabase instance;

    public static final class Companion {
        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final AppDatabase getInstance(Context context) {
            f.e(context, "context");
            AppDatabase appDatabase = AppDatabase.instance;
            if (appDatabase == null) {
                synchronized (this) {
                    try {
                        appDatabase = AppDatabase.instance;
                        if (appDatabase == null) {
                            Context applicationContext = context.getApplicationContext();
                            f.d(applicationContext, "getApplicationContext(...)");
                            if (p1.d.S("lucky_counter_db")) {
                                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            }
                            t a2 = new r(applicationContext).a();
                            AppDatabase.instance = (AppDatabase) a2;
                            appDatabase = (AppDatabase) a2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return appDatabase;
        }

        private Companion() {
        }
    }

    public abstract WaterDao waterDao();
}
