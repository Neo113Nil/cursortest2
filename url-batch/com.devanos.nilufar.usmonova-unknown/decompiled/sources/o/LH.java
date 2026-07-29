package o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.database.connection.PersistentConnectionImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class LH implements InterfaceC0960eG, InterfaceC1363kP {
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;

    public /* synthetic */ LH(long j, F7 f7) {
        this.h = j;
        this.i = f7;
    }

    @Override // o.InterfaceC1363kP
    public Object apply(Object obj) {
        F7 f7 = (F7) this.i;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.h));
        String str = f7.a;
        EnumC1489mJ enumC1489mJ = f7.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC1555nJ.a(enumC1489mJ))}) < 1) {
            contentValues.put("backend_name", f7.a);
            contentValues.put("priority", Integer.valueOf(AbstractC1555nJ.a(enumC1489mJ)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // o.InterfaceC0960eG
    public void d(Exception exc) {
        ((PersistentConnectionImpl) this.i).lambda$tryScheduleReconnect$2(this.h, exc);
    }

    public /* synthetic */ LH(PersistentConnectionImpl persistentConnectionImpl, long j) {
        this.i = persistentConnectionImpl;
        this.h = j;
    }
}
