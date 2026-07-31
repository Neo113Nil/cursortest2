package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5586p7 extends SQLiteOpenHelper implements Closeable {
    public final String a;
    public final PublicLogger b;
    public final C5836yn c;

    public C5586p7(Context context, String str, C5836yn c5836yn, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, M5.b);
        this.c = c5836yn;
        this.a = str;
        this.b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.a);
            C5340fk c5340fk = Dj.a;
            c5340fk.getClass();
            c5340fk.a(new Ej("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.a);
            C5340fk c5340fk = Dj.a;
            c5340fk.getClass();
            c5340fk.a(new Ej("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C5836yn c5836yn = this.c;
        if (i <= i2) {
            c5836yn.getClass();
            return;
        }
        try {
            c5836yn.b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c5836yn.a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C5836yn c5836yn = this.c;
        c5836yn.getClass();
        try {
            InterfaceC5862zn interfaceC5862zn = c5836yn.d;
            if (interfaceC5862zn == null || interfaceC5862zn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c5836yn.b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c5836yn.a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        C5836yn c5836yn = this.c;
        c5836yn.getClass();
        if (i2 > i) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                try {
                    Collection collection = (Collection) c5836yn.c.a.get(Integer.valueOf(i3));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z = false;
            if (!z && !(!c5836yn.d.a(sQLiteDatabase))) {
                try {
                    c5836yn.b.runScript(sQLiteDatabase);
                } catch (Throwable unused2) {
                }
                try {
                    c5836yn.a.runScript(sQLiteDatabase);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z = true;
        if (!(z | (c5836yn.d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
