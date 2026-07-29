package o;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.database.connection.ConnectionTokenProvider;
import com.google.firebase.database.core.Context;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: o.ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1576ne implements ConnectionTokenProvider, InterfaceC0764bG, InterfaceC1363kP, InterfaceC2357zU {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ C1576ne(Object obj, int i, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    @Override // o.InterfaceC1363kP
    public Object apply(Object obj) {
        C1495mP c1495mP = (C1495mP) this.i;
        F7 f7 = (F7) this.j;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C2136w7 c2136w7 = c1495mP.k;
        ArrayList k = c1495mP.k(sQLiteDatabase, f7, c2136w7.b);
        for (EnumC1489mJ enumC1489mJ : EnumC1489mJ.values()) {
            if (enumC1489mJ != f7.c) {
                int size = c2136w7.b - k.size();
                if (size <= 0) {
                    break;
                }
                C0950e6 a = F7.a();
                a.P(f7.a);
                if (enumC1489mJ == null) {
                    throw new NullPointerException("Null priority");
                }
                a.k = enumC1489mJ;
                a.j = f7.b;
                k.addAll(c1495mP.k(sQLiteDatabase, a.l(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < k.size(); i++) {
            sb.append(((B7) k.get(i)).a);
            if (i < k.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new C1429lP(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = k.listIterator();
        while (listIterator.hasNext()) {
            B7 b7 = (B7) listIterator.next();
            long j2 = b7.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                C1343k5 c = b7.c.c();
                for (C1429lP c1429lP : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.b(c1429lP.a, c1429lP.b);
                }
                listIterator.set(new B7(j2, b7.b, c.h()));
            }
        }
        return k;
    }

    @Override // o.InterfaceC2357zU
    public Object execute() {
        switch (this.h) {
            case 3:
                AY ay = (AY) this.i;
                Iterable iterable = (Iterable) this.j;
                C1495mP c1495mP = (C1495mP) ay.c;
                c1495mP.getClass();
                if (iterable.iterator().hasNext()) {
                    c1495mP.b().compileStatement("DELETE FROM events WHERE _id in " + C1495mP.t(iterable)).execute();
                    break;
                }
                break;
            default:
                AY ay2 = (AY) this.i;
                for (Map.Entry entry : ((HashMap) this.j).entrySet()) {
                    ((C1495mP) ay2.i).m(((Integer) entry.getValue()).intValue(), EnumC0824cB.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.firebase.database.connection.ConnectionTokenProvider
    public void getToken(boolean z, ConnectionTokenProvider.GetTokenCallback getTokenCallback) {
        Context.lambda$wrapTokenProvider$0((TokenProvider) this.i, (ScheduledExecutorService) this.j, z, getTokenCallback);
    }

    @Override // o.InterfaceC0764bG
    public void onComplete(MU mu) {
        ((EnhancedIntentService) this.i).lambda$onStartCommand$1((Intent) this.j, mu);
    }
}
