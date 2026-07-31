package com.five_corp.ad.internal.cache;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class k implements Runnable {
    public final /* synthetic */ n a;

    public k(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            try {
                n nVar = this.a;
                ArrayList arrayList = nVar.f;
                boolean z = nVar.e;
                if (arrayList.isEmpty()) {
                    return;
                }
                this.a.f = new ArrayList();
                if (z) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((m) it.next()).a(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.Y5, null, null));
                    }
                    return;
                }
                com.five_corp.ad.internal.storage.a aVar = this.a.c;
                com.five_corp.ad.internal.storage.b bVar = aVar.a;
                String str = aVar.b;
                bVar.getClass();
                String absolutePath = new File(bVar.a, str).getAbsolutePath();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((m) it2.next()).a(absolutePath);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
