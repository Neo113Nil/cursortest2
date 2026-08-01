package k0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import j0.InterfaceC0178a;
import j0.InterfaceC0181d;
import j0.InterfaceC0182e;

/* loaded from: classes.dex */
public final class c implements InterfaceC0178a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3259b = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f3260a;

    public c(SQLiteDatabase sQLiteDatabase) {
        i1.f.e(sQLiteDatabase, "delegate");
        this.f3260a = sQLiteDatabase;
    }

    @Override // j0.InterfaceC0178a
    public final Cursor B(InterfaceC0181d interfaceC0181d, CancellationSignal cancellationSignal) {
        i1.f.e(interfaceC0181d, "query");
        String f2 = interfaceC0181d.f();
        String[] strArr = f3259b;
        i1.f.b(cancellationSignal);
        C0216a c0216a = new C0216a(0, interfaceC0181d);
        SQLiteDatabase sQLiteDatabase = this.f3260a;
        i1.f.e(sQLiteDatabase, "sQLiteDatabase");
        i1.f.e(f2, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(c0216a, f2, strArr, null, cancellationSignal);
        i1.f.d(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // j0.InterfaceC0178a
    public final InterfaceC0182e C(String str) {
        i1.f.e(str, "sql");
        SQLiteStatement compileStatement = this.f3260a.compileStatement(str);
        i1.f.d(compileStatement, "delegate.compileStatement(sql)");
        return new j(compileStatement);
    }

    @Override // j0.InterfaceC0178a
    public final void c() {
        this.f3260a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3260a.close();
    }

    @Override // j0.InterfaceC0178a
    public final void d() {
        this.f3260a.endTransaction();
    }

    @Override // j0.InterfaceC0178a
    public final void e() {
        this.f3260a.beginTransaction();
    }

    @Override // j0.InterfaceC0178a
    public final boolean isOpen() {
        return this.f3260a.isOpen();
    }

    @Override // j0.InterfaceC0178a
    public final boolean n() {
        SQLiteDatabase sQLiteDatabase = this.f3260a;
        i1.f.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // j0.InterfaceC0178a
    public final void p(String str) {
        i1.f.e(str, "sql");
        this.f3260a.execSQL(str);
    }

    @Override // j0.InterfaceC0178a
    public final Cursor t(String str) {
        i1.f.e(str, "query");
        return v(new B.j(str));
    }

    @Override // j0.InterfaceC0178a
    public final Cursor v(InterfaceC0181d interfaceC0181d) {
        i1.f.e(interfaceC0181d, "query");
        Cursor rawQueryWithFactory = this.f3260a.rawQueryWithFactory(new C0216a(1, new b(interfaceC0181d)), interfaceC0181d.f(), f3259b, null);
        i1.f.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // j0.InterfaceC0178a
    public final void w() {
        this.f3260a.setTransactionSuccessful();
    }

    @Override // j0.InterfaceC0178a
    public final boolean x() {
        return this.f3260a.inTransaction();
    }
}
