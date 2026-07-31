package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.c0;
import com.my.tracker.obfuscated.j;
import com.my.tracker.obfuscated.o1;
import com.my.tracker.obfuscated.x1;
import com.my.tracker.obfuscated.y2;
import com.my.tracker.obfuscated.z1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class g1 extends q1 {
    protected g1() {
    }

    private static int a(int i) {
        switch (i) {
            case 1:
                return 12;
            case 2:
                return 13;
            case 3:
                return 11;
            case 4:
            case 11:
            case 12:
            case 16:
            case 30:
            default:
                return -1;
            case 5:
                return 17;
            case 6:
                return 22;
            case 7:
                return 18;
            case 8:
                return 19;
            case 9:
                return 20;
            case 10:
                return 23;
            case 13:
                return 21;
            case 14:
                return 14;
            case 15:
                return 16;
            case 17:
                return 25;
            case 18:
                return 26;
            case 19:
                return 27;
            case 20:
                return 28;
            case 21:
                return 29;
            case 22:
                return 30;
            case 23:
                return 31;
            case 24:
                return 32;
            case 25:
                return 33;
            case 26:
                return 34;
            case 27:
                return 35;
            case 28:
                return 36;
            case 29:
                return 37;
            case 31:
                return 39;
            case 32:
                return 40;
            case 33:
                return 41;
        }
    }

    protected static void a(r1 r1Var, MyTrackerParams.a aVar, q qVar) {
        qVar.a();
        qVar.a(1, aVar.a);
        qVar.a(2, aVar.c);
        qVar.a(3, aVar.b);
        if (qVar.b() > 0) {
            r1Var.a(24, qVar);
        }
    }

    public static g1 b() {
        return new g1();
    }

    public synchronized byte[] c(long j) {
        try {
            this.a.a();
            this.a.a(2, j);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 29", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(boolean z, String str, String str2, Map map) {
        return a(8, z, str, str2, map);
    }

    public synchronized byte[] b(Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 13", th);
            return null;
        }
        return this.a.c();
    }

    protected static void a(r1 r1Var, y2.a aVar, q qVar) {
        qVar.a();
        int i = aVar.b;
        if (i >= 0) {
            qVar.a(1, i);
        }
        if (aVar.e == 0) {
            qVar.a(2, 0);
        }
        if (!aVar.g) {
            qVar.a(3, 0);
        }
        if (!aVar.f) {
            qVar.a(4, 0);
        }
        int i2 = aVar.c;
        if (i2 != 900) {
            qVar.a(5, i2);
        }
        int i3 = aVar.d;
        if (i3 != 0) {
            qVar.a(6, i3);
        }
        if (!aVar.h) {
            qVar.a(7, 0);
        }
        if (!aVar.i) {
            qVar.a(8, 0);
        }
        if (!aVar.j) {
            qVar.a(9, 0);
        }
        AntiFraudConfig antiFraudConfig = aVar.l;
        if (!antiFraudConfig.useLightSensor) {
            qVar.a(11, 0);
        }
        if (!antiFraudConfig.useMagneticFieldSensor) {
            qVar.a(12, 0);
        }
        if (!antiFraudConfig.useGyroscope) {
            qVar.a(13, 0);
        }
        if (!antiFraudConfig.usePressureSensor) {
            qVar.a(14, 0);
        }
        if (!antiFraudConfig.useProximitySensor) {
            qVar.a(15, 0);
        }
        if (qVar.b() > 0) {
            r1Var.a(27, qVar);
        }
    }

    public synchronized byte[] b(String str, String str2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 2", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(String str, String str2, long j, long j2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
            this.a.a(3, j2);
            this.a.a(4, j);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 31", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(long j, long j2, long j3) {
        try {
            this.a.a();
            this.a.a(2, j);
            this.a.a(3, j2);
            this.a.a(4, j3);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 26", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(long j) {
        try {
            this.a.a();
            this.a.a(2, j);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 28", th);
            return null;
        }
        return this.a.c();
    }

    protected static void a(r1 r1Var, j jVar, q qVar) {
        if (jVar.a.isEmpty()) {
            return;
        }
        for (j.a aVar : jVar.a) {
            qVar.a();
            qVar.a(1, aVar.a);
            qVar.a(2, aVar.b);
            r1Var.a(31, qVar);
        }
    }

    protected static void a(r1 r1Var, List list, q qVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0.b bVar = (c0.b) it.next();
            if (bVar instanceof c0.c) {
                a(r1Var, (c0.c) bVar, qVar);
            } else if (bVar instanceof c0.d) {
                a(r1Var, (c0.d) bVar, qVar);
            } else if (bVar instanceof c0.e) {
                a(r1Var, (c0.e) bVar, qVar);
            } else if (bVar instanceof c0.i) {
                a(r1Var, (c0.i) bVar, qVar);
            } else if (bVar instanceof c0.g) {
                a(r1Var, (c0.g) bVar, qVar);
            } else if (bVar instanceof c0.f) {
                a(r1Var, (c0.f) bVar, qVar);
            } else if (bVar instanceof c0.h) {
                a(r1Var, (c0.h) bVar, qVar);
            } else {
                x2.a("Unknown cell-info");
            }
        }
    }

    private static int a(q qVar, int i, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return qVar.a(i, i2);
        }
        return 0;
    }

    private static int a(q qVar, int i, long j) {
        if (j != Long.MAX_VALUE) {
            return qVar.a(i, j);
        }
        return 0;
    }

    private static void a(r1 r1Var, c0.c cVar, q qVar) {
        qVar.a();
        a(qVar, 1, cVar.a);
        a(qVar, 2, cVar.b);
        a(qVar, 3, cVar.c);
        a(qVar, 4, cVar.d);
        a(qVar, 5, cVar.e);
        a(qVar, 6, cVar.f);
        a(qVar, 7, cVar.g);
        a(qVar, 8, cVar.h);
        a(qVar, 9, cVar.i);
        a(qVar, 10, cVar.j);
        a(qVar, 11, cVar.k);
        a(qVar, 12, cVar.l);
        r1Var.a(32, qVar);
    }

    private static void a(r1 r1Var, c0.d dVar, q qVar) {
        qVar.a();
        qVar.a(1, dVar.a);
        qVar.a(2, dVar.b);
        a(qVar, 3, dVar.c);
        a(qVar, 4, dVar.d);
        a(qVar, 5, dVar.e);
        a(qVar, 6, dVar.f);
        a(qVar, 7, dVar.g);
        a(qVar, 8, dVar.h);
        a(qVar, 9, dVar.i);
        a(qVar, 10, dVar.j);
        r1Var.a(33, qVar);
    }

    private static void a(r1 r1Var, c0.e eVar, q qVar) {
        qVar.a();
        qVar.a(1, eVar.a);
        qVar.a(2, eVar.b);
        a(qVar, 3, eVar.c);
        a(qVar, 4, eVar.d);
        a(qVar, 5, eVar.e);
        a(qVar, 6, eVar.f);
        a(qVar, 7, eVar.g);
        a(qVar, 8, eVar.h);
        a(qVar, 9, eVar.i);
        a(qVar, 10, eVar.j);
        r1Var.a(34, qVar);
    }

    private static void a(r1 r1Var, c0.i iVar, q qVar) {
        qVar.a();
        qVar.a(1, iVar.a);
        qVar.a(2, iVar.b);
        a(qVar, 3, iVar.c);
        a(qVar, 4, iVar.d);
        a(qVar, 5, iVar.e);
        a(qVar, 6, iVar.f);
        a(qVar, 7, iVar.g);
        a(qVar, 8, iVar.h);
        a(qVar, 9, iVar.i);
        r1Var.a(35, qVar);
    }

    private static void a(r1 r1Var, c0.g gVar, q qVar) {
        qVar.a();
        qVar.a(1, gVar.a);
        qVar.a(2, gVar.b);
        a(qVar, 3, gVar.c);
        a(qVar, 4, gVar.d);
        a(qVar, 5, gVar.e);
        a(qVar, 6, gVar.f);
        a(qVar, 7, gVar.g);
        a(qVar, 8, gVar.h);
        a(qVar, 9, gVar.i);
        r1Var.a(36, qVar);
    }

    private static void a(r1 r1Var, c0.f fVar, q qVar) {
        qVar.a();
        qVar.a(1, fVar.a);
        qVar.a(2, fVar.b);
        a(qVar, 3, fVar.c);
        a(qVar, 4, fVar.d);
        a(qVar, 5, fVar.e);
        a(qVar, 6, fVar.f);
        a(qVar, 7, fVar.g);
        a(qVar, 8, fVar.h);
        a(qVar, 9, fVar.i);
        r1Var.a(37, qVar);
    }

    private static void a(r1 r1Var, c0.h hVar, q qVar) {
        qVar.a();
        qVar.a(1, hVar.a);
        qVar.a(2, hVar.b);
        a(qVar, 3, hVar.c);
        a(qVar, 4, hVar.d);
        r1Var.a(33, qVar);
    }

    protected static void a(r1 r1Var, c0.k kVar, q qVar) {
        if (kVar.a != null) {
            qVar.a();
            qVar.a(1, kVar.a.b);
            qVar.a(2, kVar.a.a);
            qVar.a(3, kVar.a.c);
            qVar.a(5, kVar.a.d);
            qVar.a(6, kVar.a.e);
            r1Var.a(28, qVar);
        }
        for (c0.a aVar : kVar.b) {
            qVar.a();
            qVar.a(1, aVar.b);
            qVar.a(2, aVar.a);
            qVar.a(3, aVar.c);
            r1Var.a(29, qVar);
        }
    }

    protected static int a(r1 r1Var, x1 x1Var, q qVar) {
        int i;
        int i2 = 0;
        try {
            x1.a a = x1Var.a();
            i = 0;
            while (a.b()) {
                try {
                    try {
                        int g = (int) a.g();
                        try {
                            qVar.a();
                            x1.b d = a.d();
                            while (d.b()) {
                                try {
                                    qVar.a(2, (int) d.e());
                                } catch (Throwable th) {
                                    if (d != null) {
                                        try {
                                            d.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            d.close();
                            if (qVar.b() == 0) {
                                x2.b("Error: no timestamps for event " + g + ", event ignored");
                            } else {
                                qVar.a(1, g);
                                long c = a.c();
                                if (c > 0) {
                                    qVar.a(3, (int) c);
                                }
                                byte[] l = a.l();
                                if (l.length > 0) {
                                    int a2 = a(g);
                                    if (a2 == -1) {
                                        x2.b("Error: unrecognized eventType " + g + ", event ignored");
                                    } else {
                                        qVar.a(a2, l);
                                    }
                                }
                                i += r1Var.a(41, qVar);
                                i2++;
                            }
                        } catch (Throwable th3) {
                            x2.b("Error: failed to pack event " + g, th3);
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    x2.b("Error: failed to get stored events", th);
                    x2.a("Written: events=" + i2 + ", bytes=" + i);
                    return i;
                }
            }
            a.close();
        } catch (Throwable th5) {
            th = th5;
            i = 0;
        }
        x2.a("Written: events=" + i2 + ", bytes=" + i);
        return i;
    }

    protected static int a(r1 r1Var, z1 z1Var, q qVar, q qVar2) {
        int i;
        int i2 = 0;
        try {
            z1.a a = z1Var.a();
            i = 0;
            while (a.b()) {
                try {
                    try {
                        String k = a.k();
                        qVar.a();
                        try {
                            z1.b d = a.d();
                            while (d.b()) {
                                try {
                                    qVar2.a();
                                    qVar2.a(1, (int) d.h());
                                    if (!d.f()) {
                                        qVar2.a(2, (int) d.j());
                                    }
                                    qVar.a(1, qVar2);
                                } catch (Throwable th) {
                                    if (d != null) {
                                        try {
                                            d.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            d.close();
                        } catch (Throwable th3) {
                            x2.b("Error: failed to read session " + k + ": ", th3);
                        }
                        if (qVar.b() == 0) {
                            x2.a("No periods for session " + k + ", id=" + a.a() + ", session ignored");
                        } else {
                            int c = (int) a.c();
                            if (c > 0) {
                                qVar.a(2, c);
                            }
                            i2 += r1Var.a(42, qVar);
                            i++;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        x2.b("Error: failed to get stored sessions", th);
                        x2.a("Written: sessions=" + i + ", bytes=" + i2);
                        return i2;
                    }
                } finally {
                }
            }
            a.close();
        } catch (Throwable th5) {
            th = th5;
            i = 0;
        }
        x2.a("Written: sessions=" + i + ", bytes=" + i2);
        return i2;
    }

    public synchronized boolean a(r1 r1Var, long j) {
        if (j > 0) {
            try {
                r1Var.a(4, j);
            } catch (Exception e) {
                x2.a("Write timestamp send error: " + e, e);
                return false;
            }
        }
        return true;
    }

    public synchronized int a(r1 r1Var, y2.a aVar, boolean z, b3 b3Var, String str, f0 f0Var, long j, long j2, x1 x1Var, z1 z1Var) {
        String str2;
        String str3;
        try {
            if (a(r1Var, x1Var, this.a) + a(r1Var, z1Var, this.a, this.b) == 0) {
                x2.a("No events to send");
                return 3;
            }
            r1Var.a(1, MyTracker.VERSION);
            r1Var.a(2, aVar.a);
            if (j != -1) {
                r1Var.a(3, j);
            }
            if (j2 > 0) {
                r1Var.a(5, (int) j2);
            }
            Map map = aVar.k.e;
            r1Var.a(43, map, this.b);
            if (z || map.isEmpty()) {
                str2 = null;
                str3 = null;
            } else {
                String str4 = (String) map.get("android_id");
                str3 = (String) map.get("mac");
                str2 = str4;
            }
            q1.a(r1Var, f0Var.a, f0Var.c, this.a, this.b);
            q1.a(r1Var, z, b3Var, this.a);
            q1.a(r1Var, str2, str3, f0Var, this.a, this.b);
            if (!z) {
                a(r1Var, aVar.k, this.a);
            }
            q1.a(r1Var, f0Var.f, f0Var.b, f0Var.c, this.a);
            a(r1Var, aVar, this.a);
            if (!z) {
                q1.a(r1Var, f0Var.g, this.a);
            }
            a(r1Var, f0Var.h, this.a);
            if (!z) {
                a(r1Var, f0Var.i.a, this.a);
                a(r1Var, f0Var.i.b, this.a);
            }
            if (!TextUtils.isEmpty(str)) {
                r1Var.a(44, str.length() > 255 ? str.substring(0, 255) : str);
            }
            a();
            return 1;
        } catch (Exception e) {
            x2.a("Create packet error: " + e, e);
            a();
            return 2;
        }
    }

    public synchronized byte[] a(String str, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, str);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 6", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(boolean z, String str, String str2, Map map) {
        return a(7, z, str, str2, map);
    }

    public synchronized byte[] a(Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 9", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(int i, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, i);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 13", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(long j, String str, o1.a aVar) {
        try {
            this.a.a();
            this.a.a(1, j);
            this.b.a();
            if (!TextUtils.isEmpty(str)) {
                this.b.a(1, str);
            }
            if (aVar != null) {
                this.b.a(2, aVar.a);
            }
            if (aVar != null) {
                this.b.a(3, aVar.b);
            }
            if (aVar != null) {
                this.b.a(4, aVar.c);
            }
            if (this.b.b() > 0) {
                this.a.a(2, this.b);
            }
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 1", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, long j, long j2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
            this.a.a(3, j2);
            this.a.a(4, j);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 14", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str) {
        try {
            this.a.a();
            this.a.a(1, str);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 33", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5) {
        try {
            this.a.a();
            this.a.a(1, str3);
            this.a.a(2, str4);
            this.a.a(3, str);
            this.a.a(4, str2);
            if (!TextUtils.isEmpty(str5)) {
                this.b.a();
                this.b.a(1, str5);
                if (this.b.b() > 0) {
                    this.a.a(5, this.b);
                }
            }
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 5", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.b.a();
            this.b.a(1, str2);
            this.b.a(2, str);
            this.b.a(3, str3);
            if (this.b.b() > 0) {
                this.a.a(2, this.b);
            }
            if (str3 != null) {
                this.a.a(4, str4);
                this.a.a(5, str5);
            }
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 10", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, int i, String str5, String str6, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, str2);
            this.a.a(3, str);
            this.a.a(4, str3);
            if (str != null) {
                this.a.a(5, str5);
                this.a.a(6, str6);
            }
            this.a.a(7, str4);
            this.a.a(8, i);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 32", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 15", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(AdEvent adEvent, String str) {
        try {
            this.a.a();
            this.a.a(1, adEvent.network);
            if (adEvent.a == 19) {
                this.a.a(2, str);
                this.a.a(3, adEvent.currency);
            }
            this.a.a(4, adEvent.source);
            this.a.a(5, adEvent.placementId);
            this.a.a(6, adEvent.adId);
            this.a.a(7, adEvent.adFormat);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: " + adEvent.a, th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(int i, String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, str2);
            this.a.a(3, str4);
            this.a.a(4, str5);
            this.a.a(5, str);
            this.a.a(6, str3);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: " + i, th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(long j) {
        try {
            this.a.a();
            this.a.a(2, j);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 25", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(long j, long j2, long j3) {
        try {
            this.a.a();
            this.a.a(2, j);
            this.a.a(3, j2);
            this.a.a(4, j3);
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: 27", th);
            return null;
        }
        return this.a.c();
    }

    private byte[] a(int i, boolean z, String str, String str2, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            if (!z) {
                this.a.a(2, str);
                this.a.a(3, str2);
            }
            return this.a.c();
        } catch (Throwable th) {
            x2.b("Event serialization failed, type: " + i, th);
            return null;
        }
    }
}
