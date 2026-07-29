package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class AY {
    public final Context a;
    public final JC b;
    public final InterfaceC0480Sk c;
    public final C0153Fu d;
    public final Executor e;
    public final AU f;
    public final InterfaceC0212Ib g;
    public final InterfaceC0212Ib h;
    public final InterfaceC0082Db i;

    public AY(Context context, JC jc, InterfaceC0480Sk interfaceC0480Sk, C0153Fu c0153Fu, Executor executor, AU au, InterfaceC0212Ib interfaceC0212Ib, InterfaceC0212Ib interfaceC0212Ib2, InterfaceC0082Db interfaceC0082Db) {
        this.a = context;
        this.b = jc;
        this.c = interfaceC0480Sk;
        this.d = c0153Fu;
        this.e = executor;
        this.f = au;
        this.g = interfaceC0212Ib;
        this.h = interfaceC0212Ib2;
        this.i = interfaceC0082Db;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03cd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(F7 f7, int i) {
        byte[] bArr;
        long j;
        C1741q7 c1741q7;
        String str;
        int i2;
        C1967ta a;
        String str2;
        Integer num;
        C1370kW c1370kW;
        int i3;
        final AY ay = this;
        final F7 f72 = f7;
        byte[] bArr2 = f72.b;
        InterfaceC2095vW a2 = ay.b.a(f72.a);
        long j2 = 0;
        while (true) {
            final int i4 = 0;
            InterfaceC2357zU interfaceC2357zU = new InterfaceC2357zU(ay) { // from class: o.zY
                public final /* synthetic */ AY i;

                {
                    this.i = ay;
                }

                @Override // o.InterfaceC2357zU
                public final Object execute() {
                    Boolean bool;
                    switch (i4) {
                        case 0:
                            F7 f73 = f72;
                            C1495mP c1495mP = (C1495mP) this.i.c;
                            SQLiteDatabase b = c1495mP.b();
                            b.beginTransaction();
                            try {
                                Long c = C1495mP.c(b, f73);
                                if (c == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = c1495mP.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{c.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                b.setTransactionSuccessful();
                                return bool;
                            } finally {
                                b.endTransaction();
                            }
                        default:
                            C1495mP c1495mP2 = (C1495mP) this.i.c;
                            c1495mP2.getClass();
                            return (Iterable) c1495mP2.j(new C1576ne(c1495mP2, 2, f72));
                    }
                }
            };
            C1495mP c1495mP = (C1495mP) ay.f;
            if (!((Boolean) c1495mP.q(interfaceC2357zU)).booleanValue()) {
                c1495mP.q(new C1297jP(j2, ay, f72));
                return;
            }
            final int i5 = 1;
            Iterable iterable = (Iterable) c1495mP.q(new InterfaceC2357zU(ay) { // from class: o.zY
                public final /* synthetic */ AY i;

                {
                    this.i = ay;
                }

                @Override // o.InterfaceC2357zU
                public final Object execute() {
                    Boolean bool;
                    switch (i5) {
                        case 0:
                            F7 f73 = f72;
                            C1495mP c1495mP2 = (C1495mP) this.i.c;
                            SQLiteDatabase b = c1495mP2.b();
                            b.beginTransaction();
                            try {
                                Long c = C1495mP.c(b, f73);
                                if (c == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = c1495mP2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{c.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                b.setTransactionSuccessful();
                                return bool;
                            } finally {
                                b.endTransaction();
                            }
                        default:
                            C1495mP c1495mP22 = (C1495mP) this.i.c;
                            c1495mP22.getClass();
                            return (Iterable) c1495mP22.j(new C1576ne(c1495mP22, 2, f72));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                AbstractC0868ct.q("Uploader", "Unknown backend for %s, deleting event batch for it...", f72);
                c1741q7 = new C1741q7(-1L, 3);
                bArr = bArr2;
                j = j2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((B7) it.next()).c);
                }
                if (bArr2 != null) {
                    InterfaceC0082Db interfaceC0082Db = ay.i;
                    Objects.requireNonNull(interfaceC0082Db);
                    C0160Gb c0160Gb = (C0160Gb) c1495mP.q(new C1932t2(7, interfaceC0082Db));
                    C1343k5 c1343k5 = new C1343k5();
                    c1343k5.m = new HashMap();
                    c1343k5.k = Long.valueOf(ay.g.a());
                    c1343k5.l = Long.valueOf(ay.h.a());
                    c1343k5.h = "GDT_CLIENT_METRICS";
                    C1845rk c1845rk = new C1845rk("proto");
                    c0160Gb.getClass();
                    c1343k5.j = new C1780qk(c1845rk, AbstractC0965eL.a.encode(c0160Gb));
                    arrayList.add(((C2033ua) a2).a(c1343k5.h()));
                }
                C2033ua c2033ua = (C2033ua) a2;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C2070v7 c2070v7 = (C2070v7) it2.next();
                    String str3 = c2070v7.a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(c2070v7);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c2070v7);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    C2070v7 c2070v72 = (C2070v7) ((List) entry.getValue()).get(i4);
                    EnumC1689pL enumC1689pL = EnumC1689pL.h;
                    long a3 = c2033ua.f.a();
                    long a4 = c2033ua.e.a();
                    C1872s7 c1872s7 = new C1872s7(new C1675p7(Integer.valueOf(c2070v72.b("sdk-version")), c2070v72.a("model"), c2070v72.a("hardware"), c2070v72.a("device"), c2070v72.a("product"), c2070v72.a("os-uild"), c2070v72.a("manufacturer"), c2070v72.a("fingerprint"), c2070v72.a("locale"), c2070v72.a("country"), c2070v72.a("mcc_mnc"), c2070v72.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C2070v7 c2070v73 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        C1780qk c1780qk = c2070v73.c;
                        C1845rk c1845rk2 = c1780qk.a;
                        byte[] bArr4 = c1780qk.b;
                        long j3 = j2;
                        if (c1845rk2.equals(new C1845rk("proto"))) {
                            c1370kW = new C1370kW();
                            c1370kW.k = bArr4;
                        } else if (c1845rk2.equals(new C1845rk("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            C1370kW c1370kW2 = new C1370kW();
                            c1370kW2.l = str4;
                            c1370kW = c1370kW2;
                        } else {
                            String B = AbstractC0868ct.B("CctTransportBackend");
                            if (Log.isLoggable(B, 5)) {
                                Log.w(B, "Received event of unsupported encoding " + c1845rk2 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                        c1370kW.h = Long.valueOf(c2070v73.d);
                        c1370kW.j = Long.valueOf(c2070v73.e);
                        String str5 = (String) c2070v73.f.get("tz-offset");
                        c1370kW.m = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        c1370kW.n = new A7((EnumC1813rE) EnumC1813rE.h.get(c2070v73.b("net-type")), (EnumC1748qE) EnumC1748qE.h.get(c2070v73.b("mobile-subtype")));
                        Integer num2 = c2070v73.b;
                        if (num2 != null) {
                            c1370kW.i = num2;
                        }
                        String str6 = ((Long) c1370kW.h) == null ? " eventTimeMs" : "";
                        if (((Long) c1370kW.j) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) c1370kW.m) == null) {
                            str6 = AbstractC1888sN.j(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new C2202x7(((Long) c1370kW.h).longValue(), (Integer) c1370kW.i, ((Long) c1370kW.j).longValue(), (byte[]) c1370kW.k, (String) c1370kW.l, ((Long) c1370kW.m).longValue(), (A7) c1370kW.n));
                        bArr2 = bArr3;
                        j2 = j3;
                    }
                    arrayList3.add(new C2268y7(a3, a4, c1872s7, num, str2, arrayList4));
                    i4 = 0;
                }
                bArr = bArr2;
                j = j2;
                C1806r7 c1806r7 = new C1806r7(arrayList3);
                URL url = c2033ua.d;
                if (bArr != null) {
                    try {
                        C1479m9 a5 = C1479m9.a(bArr);
                        str = a5.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a5.a;
                        if (str7 != null) {
                            url = C2033ua.b(str7);
                        }
                    } catch (IllegalArgumentException unused2) {
                        c1741q7 = new C1741q7(-1L, 3);
                    }
                } else {
                    str = null;
                }
                try {
                    C0950e6 c0950e6 = new C0950e6(url, c1806r7, str, 5);
                    C1932t2 c1932t2 = new C1932t2(2, c2033ua);
                    int i6 = 5;
                    do {
                        a = c1932t2.a(c0950e6);
                        URL url2 = a.b;
                        if (url2 != null) {
                            AbstractC0868ct.q("CctTransportBackend", "Following redirect to: %s", url2);
                            c0950e6 = new C0950e6(url2, (C1806r7) c0950e6.j, (String) c0950e6.k, 5);
                        } else {
                            c0950e6 = null;
                        }
                        if (c0950e6 == null) {
                            break;
                        } else {
                            i6--;
                        }
                    } while (i6 >= 1);
                    int i7 = a.a;
                    if (i7 == 200) {
                        c1741q7 = new C1741q7(a.c, 1);
                    } else if (i7 >= 500 || i7 == 404) {
                        c1741q7 = new C1741q7(-1L, 2);
                    } else if (i7 == 400) {
                        try {
                            c1741q7 = new C1741q7(-1L, 4);
                        } catch (IOException e) {
                            e = e;
                            AbstractC0868ct.r("CctTransportBackend", "Could not make request to the backend", e);
                            i2 = 2;
                            c1741q7 = new C1741q7(-1L, 2);
                            i3 = c1741q7.a;
                            if (i3 != i2) {
                            }
                        }
                    } else {
                        c1741q7 = new C1741q7(-1L, 3);
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            i3 = c1741q7.a;
            if (i3 != i2) {
                c1495mP.q(new KH(this, iterable, f7, j));
                this.d.a(f7, i + 1, true);
                return;
            }
            ay = this;
            f72 = f7;
            long j4 = j;
            c1495mP.q(new C1576ne(ay, 3, iterable));
            if (i3 == 1) {
                j2 = Math.max(j4, c1741q7.b);
                if (bArr != null) {
                    c1495mP.q(new C1932t2(9, ay));
                }
            } else {
                if (i3 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        String str8 = ((B7) it3.next()).c.a;
                        if (hashMap2.containsKey(str8)) {
                            hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                        } else {
                            hashMap2.put(str8, 1);
                        }
                    }
                    c1495mP.q(new C1576ne(ay, 4, hashMap2));
                }
                j2 = j4;
            }
            bArr2 = bArr;
        }
    }
}
