package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* compiled from: SegmentPool.java */
/* loaded from: classes4.dex */
final class p {

    @Nullable
    static o a;
    static long b;

    private p() {
    }

    static o a() {
        synchronized (p.class) {
            try {
                o oVar = a;
                if (oVar == null) {
                    return new o();
                }
                a = oVar.f;
                oVar.f = null;
                b -= 8192;
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void a(o oVar) {
        if (oVar.f == null && oVar.g == null) {
            if (oVar.d) {
                return;
            }
            synchronized (p.class) {
                try {
                    long j = b + 8192;
                    if (j > 65536) {
                        return;
                    }
                    b = j;
                    oVar.f = a;
                    oVar.c = 0;
                    oVar.b = 0;
                    a = oVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
