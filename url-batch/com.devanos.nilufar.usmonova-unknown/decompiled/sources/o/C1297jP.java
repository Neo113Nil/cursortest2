package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: o.jP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1297jP implements InterfaceC1363kP, InterfaceC2357zU {
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ C1297jP(long j, Object obj, Object obj2) {
        this.i = obj;
        this.j = obj2;
        this.h = j;
    }

    @Override // o.InterfaceC1363kP
    public Object apply(Object obj) {
        String str = (String) this.i;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((EnumC0824cB) this.j).h;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.h;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // o.InterfaceC2357zU
    public Object execute() {
        AY ay = (AY) this.i;
        F7 f7 = (F7) this.j;
        InterfaceC0480Sk interfaceC0480Sk = ay.c;
        long a = ay.g.a() + this.h;
        C1495mP c1495mP = (C1495mP) interfaceC0480Sk;
        c1495mP.getClass();
        c1495mP.j(new LH(a, f7));
        return null;
    }
}
