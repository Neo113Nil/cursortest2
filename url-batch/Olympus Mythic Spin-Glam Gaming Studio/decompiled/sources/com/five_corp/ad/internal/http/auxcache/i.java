package com.five_corp.ad.internal.http.auxcache;

import com.five_corp.ad.internal.cache.n;
import com.five_corp.ad.internal.l;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class i implements com.five_corp.ad.internal.storage.h {
    public final com.five_corp.ad.internal.ad.h a;
    public final n b;
    public final ArrayList c;
    public final com.five_corp.ad.internal.http.connection.b d;
    public final h e;
    public final Object f;
    public com.five_corp.ad.internal.http.client.a g;
    public com.five_corp.ad.internal.storage.i h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public i(com.five_corp.ad.internal.ad.h hVar, n nVar, j jVar, com.five_corp.ad.internal.http.connection.b bVar, h hVar2) {
        this.a = hVar;
        this.b = nVar;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(jVar);
        this.d = bVar;
        this.e = hVar2;
        this.f = new Object();
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    public final void a() {
        com.five_corp.ad.internal.storage.i iVar;
        boolean z;
        synchronized (this.f) {
            this.g = null;
            iVar = this.h;
            this.h = null;
            z = this.j;
        }
        if (iVar != null) {
            iVar.d.post(new com.five_corp.ad.internal.storage.g(iVar));
        }
        if (!z) {
            c();
            return;
        }
        n nVar = this.b;
        nVar.b.post(new com.five_corp.ad.internal.cache.j(nVar));
        b();
    }

    public final void b(l lVar) {
        synchronized (this.f) {
            try {
                if (this.l) {
                    return;
                }
                this.l = true;
                h hVar = this.e;
                hVar.a.post(new f(hVar, this, lVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f) {
            try {
                if (this.l) {
                    return;
                }
                h hVar = this.e;
                hVar.a.post(new e(hVar, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f) {
            try {
                if (this.l) {
                    return;
                }
                h hVar = this.e;
                hVar.a.post(new d(hVar, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(l lVar) {
        com.five_corp.ad.internal.http.client.a aVar;
        synchronized (this.f) {
            aVar = this.g;
        }
        b(lVar);
        if (aVar != null) {
            aVar.a();
        }
    }
}
