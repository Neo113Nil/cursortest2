package k0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import l0.C0250a;
import q.AbstractC0321e;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2835g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2836a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2837b;

    /* renamed from: c, reason: collision with root package name */
    public final B.d f2838c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final C0250a f2839e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2840f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final d dVar, final B.d dVar2) {
        super(context, str, null, dVar2.f43a, new DatabaseErrorHandler() { // from class: k0.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                g1.f.e(B.d.this, "$callback");
                d dVar3 = dVar;
                int i = g.f2835g;
                g1.f.d(sQLiteDatabase, "dbObj");
                c f2 = h0.f.f(dVar3, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + f2 + ".path");
                SQLiteDatabase sQLiteDatabase2 = f2.f2829a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        B.d.c(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        f2.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            g1.f.d(obj, "p.second");
                            B.d.c((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            B.d.c(path2);
                        }
                    }
                }
            }
        });
        g1.f.e(dVar2, "callback");
        this.f2836a = context;
        this.f2837b = dVar;
        this.f2838c = dVar2;
        if (str == null) {
            str = UUID.randomUUID().toString();
            g1.f.d(str, "randomUUID().toString()");
        }
        this.f2839e = new C0250a(str, context.getCacheDir());
    }

    public final j0.a a(boolean z2) {
        C0250a c0250a = this.f2839e;
        try {
            c0250a.a((this.f2840f || getDatabaseName() == null) ? false : true);
            this.d = false;
            SQLiteDatabase n2 = n(z2);
            if (!this.d) {
                c j2 = j(n2);
                c0250a.b();
                return j2;
            }
            close();
            j0.a a2 = a(z2);
            c0250a.b();
            return a2;
        } catch (Throwable th) {
            c0250a.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C0250a c0250a = this.f2839e;
        try {
            HashMap hashMap = C0250a.d;
            c0250a.getClass();
            c0250a.a(false);
            super.close();
            this.f2837b.f2830a = null;
            this.f2840f = false;
        } finally {
            c0250a.b();
        }
    }

    public final c j(SQLiteDatabase sQLiteDatabase) {
        g1.f.e(sQLiteDatabase, "sqLiteDatabase");
        return h0.f.f(this.f2837b, sQLiteDatabase);
    }

    public final SQLiteDatabase m(boolean z2) {
        if (z2) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            g1.f.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        g1.f.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase n(boolean z2) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z3 = this.f2840f;
        Context context = this.f2836a;
        if (databaseName != null && !z3 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return m(z2);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return m(z2);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof f)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                f fVar = th;
                int a2 = AbstractC0321e.a(fVar.f2833a);
                Throwable th2 = fVar.f2834b;
                if (a2 == 0 || a2 == 1 || a2 == 2 || a2 == 3) {
                    throw th2;
                }
                if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return m(z2);
                } catch (f e2) {
                    throw e2.f2834b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        g1.f.e(sQLiteDatabase, "db");
        boolean z2 = this.d;
        B.d dVar = this.f2838c;
        if (!z2 && dVar.f43a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            j(sQLiteDatabase);
            dVar.getClass();
        } catch (Throwable th) {
            throw new f(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        g1.f.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f2838c.f(j(sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        g1.f.e(sQLiteDatabase, "db");
        this.d = true;
        try {
            this.f2838c.h(j(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new f(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        g1.f.e(sQLiteDatabase, "db");
        if (!this.d) {
            try {
                this.f2838c.g(j(sQLiteDatabase));
            } catch (Throwable th) {
                throw new f(5, th);
            }
        }
        this.f2840f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        g1.f.e(sQLiteDatabase, "sqLiteDatabase");
        this.d = true;
        try {
            this.f2838c.h(j(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new f(3, th);
        }
    }
}
