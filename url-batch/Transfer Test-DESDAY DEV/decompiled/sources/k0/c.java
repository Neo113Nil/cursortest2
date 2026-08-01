package k0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class c implements j0.a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2828b = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f2829a;

    public c(SQLiteDatabase sQLiteDatabase) {
        g1.f.e(sQLiteDatabase, "delegate");
        this.f2829a = sQLiteDatabase;
    }

    @Override // j0.a
    public final void b() {
        this.f2829a.beginTransactionNonExclusive();
    }

    @Override // j0.a
    public final void c() {
        this.f2829a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2829a.close();
    }

    @Override // j0.a
    public final void d() {
        this.f2829a.beginTransaction();
    }

    @Override // j0.a
    public final boolean i() {
        return this.f2829a.isOpen();
    }

    @Override // j0.a
    public final boolean k() {
        SQLiteDatabase sQLiteDatabase = this.f2829a;
        g1.f.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // j0.a
    public final void l(String str) {
        g1.f.e(str, "sql");
        this.f2829a.execSQL(str);
    }

    @Override // j0.a
    public final Cursor q(String str) {
        g1.f.e(str, "query");
        return r(new B.j(str));
    }

    @Override // j0.a
    public final Cursor r(j0.d dVar) {
        g1.f.e(dVar, "query");
        Cursor rawQueryWithFactory = this.f2829a.rawQueryWithFactory(new C0178a(1, new b(dVar)), dVar.j(), f2828b, null);
        g1.f.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // j0.a
    public final void s() {
        this.f2829a.setTransactionSuccessful();
    }

    @Override // j0.a
    public final boolean u() {
        return this.f2829a.inTransaction();
    }

    @Override // j0.a
    public final Cursor x(j0.d dVar, CancellationSignal cancellationSignal) {
        g1.f.e(dVar, "query");
        String j2 = dVar.j();
        String[] strArr = f2828b;
        g1.f.b(cancellationSignal);
        C0178a c0178a = new C0178a(0, dVar);
        SQLiteDatabase sQLiteDatabase = this.f2829a;
        g1.f.e(sQLiteDatabase, "sQLiteDatabase");
        g1.f.e(j2, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(c0178a, j2, strArr, null, cancellationSignal);
        g1.f.d(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // j0.a
    public final j0.e y(String str) {
        g1.f.e(str, "sql");
        SQLiteStatement compileStatement = this.f2829a.compileStatement(str);
        g1.f.d(compileStatement, "delegate.compileStatement(sql)");
        return new j(compileStatement);
    }
}
