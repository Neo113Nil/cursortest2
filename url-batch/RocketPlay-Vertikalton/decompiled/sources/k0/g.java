package k0;

import a1.AbstractC0067d;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import j0.InterfaceC0178a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import l0.C0291a;
import q.AbstractC0332e;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f3266g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3267a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3268b;

    /* renamed from: c, reason: collision with root package name */
    public final B.d f3269c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final C0291a f3270e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3271f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final d dVar, final B.d dVar2) {
        super(context, str, null, dVar2.f60b, new DatabaseErrorHandler() { // from class: k0.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                i1.f.e(B.d.this, "$callback");
                d dVar3 = dVar;
                int i = g.f3266g;
                i1.f.d(sQLiteDatabase, "dbObj");
                c l2 = AbstractC0067d.l(dVar3, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + l2 + ".path");
                SQLiteDatabase sQLiteDatabase2 = l2.f3260a;
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
                        l2.close();
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
                            i1.f.d(obj, "p.second");
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
        i1.f.e(dVar2, "callback");
        this.f3267a = context;
        this.f3268b = dVar;
        this.f3269c = dVar2;
        if (str == null) {
            str = UUID.randomUUID().toString();
            i1.f.d(str, "randomUUID().toString()");
        }
        this.f3270e = new C0291a(str, context.getCacheDir());
    }

    public final InterfaceC0178a a(boolean z2) {
        C0291a c0291a = this.f3270e;
        try {
            c0291a.a((this.f3271f || getDatabaseName() == null) ? false : true);
            this.d = false;
            SQLiteDatabase i = i(z2);
            if (!this.d) {
                c f2 = f(i);
                c0291a.b();
                return f2;
            }
            close();
            InterfaceC0178a a2 = a(z2);
            c0291a.b();
            return a2;
        } catch (Throwable th) {
            c0291a.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C0291a c0291a = this.f3270e;
        try {
            HashMap hashMap = C0291a.d;
            c0291a.getClass();
            c0291a.a(false);
            super.close();
            this.f3268b.f3261a = null;
            this.f3271f = false;
        } finally {
            c0291a.b();
        }
    }

    public final c f(SQLiteDatabase sQLiteDatabase) {
        i1.f.e(sQLiteDatabase, "sqLiteDatabase");
        return AbstractC0067d.l(this.f3268b, sQLiteDatabase);
    }

    public final SQLiteDatabase h(boolean z2) {
        if (z2) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            i1.f.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        i1.f.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase i(boolean z2) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z3 = this.f3271f;
        Context context = this.f3267a;
        if (databaseName != null && !z3 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return h(z2);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return h(z2);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof f)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                f fVar = th;
                int a2 = AbstractC0332e.a(fVar.f3264a);
                Throwable th2 = fVar.f3265b;
                if (a2 == 0 || a2 == 1 || a2 == 2 || a2 == 3) {
                    throw th2;
                }
                if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return h(z2);
                } catch (f e2) {
                    throw e2.f3265b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        i1.f.e(sQLiteDatabase, "db");
        boolean z2 = this.d;
        B.d dVar = this.f3269c;
        if (!z2 && dVar.f60b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            f(sQLiteDatabase);
            dVar.getClass();
        } catch (Throwable th) {
            throw new f(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        i1.f.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f3269c.f(f(sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        i1.f.e(sQLiteDatabase, "db");
        this.d = true;
        try {
            this.f3269c.h(f(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new f(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        i1.f.e(sQLiteDatabase, "db");
        if (!this.d) {
            try {
                this.f3269c.g(f(sQLiteDatabase));
            } catch (Throwable th) {
                throw new f(5, th);
            }
        }
        this.f3271f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        i1.f.e(sQLiteDatabase, "sqLiteDatabase");
        this.d = true;
        try {
            this.f3269c.h(f(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new f(3, th);
        }
    }
}
