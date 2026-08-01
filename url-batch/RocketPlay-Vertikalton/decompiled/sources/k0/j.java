package k0;

import android.database.sqlite.SQLiteStatement;
import j0.InterfaceC0182e;

/* loaded from: classes.dex */
public final class j extends i implements InterfaceC0182e {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f3277b;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3277b = sQLiteStatement;
    }

    @Override // j0.InterfaceC0182e
    public final int A() {
        return this.f3277b.executeUpdateDelete();
    }

    @Override // j0.InterfaceC0182e
    public final long r() {
        return this.f3277b.executeInsert();
    }
}
