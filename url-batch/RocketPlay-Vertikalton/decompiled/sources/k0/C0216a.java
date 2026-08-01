package k0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import j0.InterfaceC0181d;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0216a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3257b;

    public /* synthetic */ C0216a(int i, Object obj) {
        this.f3256a = i;
        this.f3257b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f3256a) {
            case 0:
                InterfaceC0181d interfaceC0181d = (InterfaceC0181d) this.f3257b;
                i1.f.e(interfaceC0181d, "$query");
                i1.f.b(sQLiteQuery);
                interfaceC0181d.a(new i(sQLiteQuery));
                break;
            default:
                b bVar = (b) this.f3257b;
                i1.f.b(sQLiteQuery);
                bVar.f3258b.a(new i(sQLiteQuery));
                break;
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
