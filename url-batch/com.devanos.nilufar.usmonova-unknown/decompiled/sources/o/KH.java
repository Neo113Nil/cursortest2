package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.database.connection.PersistentConnectionImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class KH implements InterfaceC1224iG, InterfaceC2357zU {
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ KH(PersistentConnectionImpl persistentConnectionImpl, long j, MU mu, MU mu2) {
        this.i = persistentConnectionImpl;
        this.h = j;
        this.j = mu;
        this.k = mu2;
    }

    @Override // o.InterfaceC1224iG
    public void c(Object obj) {
        ((PersistentConnectionImpl) this.i).lambda$tryScheduleReconnect$1(this.h, (MU) this.j, (MU) this.k, (Void) obj);
    }

    @Override // o.InterfaceC2357zU
    public Object execute() {
        AY ay = (AY) this.i;
        Iterable iterable = (Iterable) this.j;
        F7 f7 = (F7) this.k;
        C1495mP c1495mP = (C1495mP) ay.c;
        c1495mP.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C1495mP.t(iterable);
            SQLiteDatabase b = c1495mP.b();
            b.beginTransaction();
            try {
                b.compileStatement(str).execute();
                Cursor rawQuery = b.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        c1495mP.m(rawQuery.getInt(0), EnumC0824cB.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                b.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                b.setTransactionSuccessful();
            } finally {
                b.endTransaction();
            }
        }
        c1495mP.j(new LH(ay.g.a() + this.h, f7));
        return null;
    }

    public /* synthetic */ KH(AY ay, Iterable iterable, F7 f7, long j) {
        this.i = ay;
        this.j = iterable;
        this.k = f7;
        this.h = j;
    }
}
