package k0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0178a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2826b;

    public /* synthetic */ C0178a(int i, Object obj) {
        this.f2825a = i;
        this.f2826b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f2825a) {
            case 0:
                j0.d dVar = (j0.d) this.f2826b;
                g1.f.e(dVar, "$query");
                g1.f.b(sQLiteQuery);
                dVar.a(new i(sQLiteQuery));
                break;
            default:
                b bVar = (b) this.f2826b;
                g1.f.b(sQLiteQuery);
                bVar.f2827b.a(new i(sQLiteQuery));
                break;
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
