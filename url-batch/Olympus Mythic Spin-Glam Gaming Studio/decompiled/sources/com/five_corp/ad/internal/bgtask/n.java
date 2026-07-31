package com.five_corp.ad.internal.bgtask;

/* loaded from: classes5.dex */
public abstract class n {
    public final int a;
    public final com.five_corp.ad.internal.j b;

    public n(int i) {
        this.a = i;
        this.b = null;
    }

    public final void a() {
        boolean z;
        com.five_corp.ad.internal.g gVar;
        com.five_corp.ad.internal.j jVar = this.b;
        if (jVar != null) {
            synchronized (jVar.e) {
                try {
                    z = jVar.g;
                    jVar.g = false;
                    if (!z) {
                        jVar.f = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                jVar.d.a(jVar.a(6));
            } else {
                if (!(this instanceof com.five_corp.ad.internal.k) || (gVar = ((com.five_corp.ad.internal.k) this).i) == null) {
                    return;
                }
                jVar.d.a(gVar);
            }
        }
    }

    public final void b() {
        boolean z;
        com.five_corp.ad.internal.j jVar = this.b;
        if (jVar != null) {
            synchronized (jVar.e) {
                try {
                    z = jVar.g;
                    jVar.g = false;
                    if (!z) {
                        jVar.f = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                jVar.d.a(jVar.a(6));
            }
        }
    }

    public abstract boolean c();

    public n(com.five_corp.ad.internal.j jVar) {
        this.a = 3;
        this.b = jVar;
    }
}
