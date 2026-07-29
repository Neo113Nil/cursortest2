package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: o.mP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495mP implements InterfaceC0480Sk, AU, InterfaceC0082Db {
    public static final C1845rk m = new C1845rk("proto");
    public final C0970eQ h;
    public final InterfaceC0212Ib i;
    public final InterfaceC0212Ib j;
    public final C2136w7 k;
    public final InterfaceC1557nL l;

    public C1495mP(InterfaceC0212Ib interfaceC0212Ib, InterfaceC0212Ib interfaceC0212Ib2, C2136w7 c2136w7, C0970eQ c0970eQ, InterfaceC1557nL interfaceC1557nL) {
        this.h = c0970eQ;
        this.i = interfaceC0212Ib;
        this.j = interfaceC0212Ib2;
        this.k = c2136w7;
        this.l = interfaceC1557nL;
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, F7 f7) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(f7.a, String.valueOf(AbstractC1555nJ.a(f7.c))));
        byte[] bArr = f7.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String t(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((B7) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object v(Cursor cursor, InterfaceC1363kP interfaceC1363kP) {
        try {
            return interfaceC1363kP.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase b() {
        C0970eQ c0970eQ = this.h;
        Objects.requireNonNull(c0970eQ);
        InterfaceC0212Ib interfaceC0212Ib = this.j;
        long a = interfaceC0212Ib.a();
        while (true) {
            try {
                return c0970eQ.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC0212Ib.a() >= this.k.c + a) {
                    throw new C2291yU("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h.close();
    }

    public final Object j(InterfaceC1363kP interfaceC1363kP) {
        SQLiteDatabase b = b();
        b.beginTransaction();
        try {
            Object apply = interfaceC1363kP.apply(b);
            b.setTransactionSuccessful();
            return apply;
        } finally {
            b.endTransaction();
        }
    }

    public final ArrayList k(SQLiteDatabase sQLiteDatabase, F7 f7, int i) {
        ArrayList arrayList = new ArrayList();
        Long c = c(sQLiteDatabase, f7);
        if (c == null) {
            return arrayList;
        }
        v(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{c.toString()}, null, null, null, String.valueOf(i)), new C0165Gg(this, (Object) arrayList, f7, 2));
        return arrayList;
    }

    public final void m(long j, EnumC0824cB enumC0824cB, String str) {
        j(new C1297jP(j, str, enumC0824cB));
    }

    public final Object q(InterfaceC2357zU interfaceC2357zU) {
        SQLiteDatabase b = b();
        InterfaceC0212Ib interfaceC0212Ib = this.j;
        long a = interfaceC0212Ib.a();
        while (true) {
            try {
                b.beginTransaction();
                try {
                    Object execute = interfaceC2357zU.execute();
                    b.setTransactionSuccessful();
                    return execute;
                } finally {
                    b.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC0212Ib.a() >= this.k.c + a) {
                    throw new C2291yU("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
