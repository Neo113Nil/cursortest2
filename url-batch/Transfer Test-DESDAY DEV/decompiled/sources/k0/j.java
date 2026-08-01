package k0;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class j extends i implements j0.e {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f2846b;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2846b = sQLiteStatement;
    }

    @Override // j0.e
    public final long o() {
        return this.f2846b.executeInsert();
    }

    @Override // j0.e
    public final int w() {
        return this.f2846b.executeUpdateDelete();
    }
}
