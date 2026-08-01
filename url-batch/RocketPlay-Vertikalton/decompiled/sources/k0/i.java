package k0;

import android.database.sqlite.SQLiteProgram;
import j0.InterfaceC0180c;

/* loaded from: classes.dex */
public class i implements InterfaceC0180c {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f3276a;

    public i(SQLiteProgram sQLiteProgram) {
        i1.f.e(sQLiteProgram, "delegate");
        this.f3276a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3276a.close();
    }

    @Override // j0.InterfaceC0180c
    public final void j(int i, byte[] bArr) {
        this.f3276a.bindBlob(i, bArr);
    }

    @Override // j0.InterfaceC0180c
    public final void k(int i) {
        this.f3276a.bindNull(i);
    }

    @Override // j0.InterfaceC0180c
    public final void l(String str, int i) {
        this.f3276a.bindString(i, str);
    }

    @Override // j0.InterfaceC0180c
    public final void m(int i, double d) {
        this.f3276a.bindDouble(i, d);
    }

    @Override // j0.InterfaceC0180c
    public final void s(int i, long j2) {
        this.f3276a.bindLong(i, j2);
    }
}
