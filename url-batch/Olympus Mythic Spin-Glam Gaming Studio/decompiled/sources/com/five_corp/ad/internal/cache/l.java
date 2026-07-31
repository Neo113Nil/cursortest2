package com.five_corp.ad.internal.cache;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class l implements Runnable {
    public final /* synthetic */ n a;

    public l(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        com.five_corp.ad.internal.storage.i iVar;
        synchronized (this.a.a) {
            try {
                n nVar = this.a;
                arrayList = nVar.f;
                nVar.f = new ArrayList();
                WeakReference weakReference = this.a.h;
                iVar = weakReference != null ? (com.five_corp.ad.internal.storage.i) weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVar != null) {
            iVar.a();
        }
        com.five_corp.ad.internal.storage.a aVar = this.a.c;
        aVar.a.a(aVar.b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.Z5, null, null));
        }
    }
}
