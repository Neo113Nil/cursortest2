package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C4701ic;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: BasicNetwork.java */
/* loaded from: classes11.dex */
public class b implements com.mbridge.msdk.tracker.network.m {
    private final a a;
    protected final c b;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    private static p b(t<?> tVar) {
        if (tVar == null) {
            return null;
        }
        try {
            if (!tVar.a() || TextUtils.isEmpty(tVar.t())) {
                return null;
            }
            p pVar = new p(tVar.p(), tVar.g() == 0 ? C4701ic.a : "POST");
            pVar.d("queue");
            pVar.e(tVar.d("local_id"));
            pVar.a(tVar.d("ad_type"));
            pVar.i(tVar.r());
            tVar.a(pVar);
            return pVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.tracker.network.m
    public q a(t<?> tVar) throws b0 {
        IOException iOException;
        g gVar;
        byte[] bArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p b = b(tVar);
        while (true) {
            Collections.emptyList();
            try {
                g a = this.a.a(tVar, f.a(tVar.d()));
                try {
                    int d = a.d();
                    a(b, d);
                    List<com.mbridge.msdk.tracker.network.g> c = a.c();
                    if (d == 304) {
                        return k.a(tVar, SystemClock.elapsedRealtime() - elapsedRealtime, c);
                    }
                    InputStream a2 = a.a();
                    byte[] a3 = a2 != null ? k.a(a2, a.b(), this.b, b) : new byte[0];
                    try {
                        k.a(SystemClock.elapsedRealtime() - elapsedRealtime, tVar, a3, d);
                        if (d < 200 || d > 299) {
                            throw new IOException();
                        }
                        a(b, 1, null);
                        return new q(d, a3, false, SystemClock.elapsedRealtime() - elapsedRealtime, c);
                    } catch (IOException e) {
                        e = e;
                        gVar = a;
                        bArr = a3;
                        iOException = e;
                        a(b, TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
                        k.a(tVar, k.a(tVar, iOException, elapsedRealtime, gVar, bArr));
                    }
                } catch (IOException e2) {
                    e = e2;
                    bArr = null;
                    gVar = a;
                }
            } catch (IOException e3) {
                iOException = e3;
                gVar = null;
                bArr = null;
            }
            a(b, TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
            k.a(tVar, k.a(tVar, iOException, elapsedRealtime, gVar, bArr));
        }
    }

    public b(a aVar, c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    private static void a(p pVar, int i, Exception exc) {
        if (pVar != null) {
            try {
                pVar.a(exc);
                pVar.a(i);
            } catch (Exception unused) {
            }
        }
    }

    private static void a(p pVar, int i) {
        if (pVar != null) {
            try {
                pVar.b(i);
            } catch (Exception unused) {
            }
        }
    }
}
