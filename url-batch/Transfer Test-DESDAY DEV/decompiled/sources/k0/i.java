package k0;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class i implements j0.c {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f2845a;

    public i(SQLiteProgram sQLiteProgram) {
        g1.f.e(sQLiteProgram, "delegate");
        this.f2845a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2845a.close();
    }

    @Override // j0.c
    public final void e(int i, byte[] bArr) {
        this.f2845a.bindBlob(i, bArr);
    }

    @Override // j0.c
    public final void f(int i) {
        this.f2845a.bindNull(i);
    }

    @Override // j0.c
    public final void g(String str, int i) {
        this.f2845a.bindString(i, str);
    }

    @Override // j0.c
    public final void h(int i, double d) {
        this.f2845a.bindDouble(i, d);
    }

    @Override // j0.c
    public final void p(int i, long j2) {
        this.f2845a.bindLong(i, j2);
    }
}
