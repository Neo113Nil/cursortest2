package com.five_corp.ad.internal.system;

import java.util.ArrayList;
import java.util.TimerTask;

/* loaded from: classes5.dex */
public final class j extends TimerTask {
    public final /* synthetic */ l a;

    public j(l lVar) {
        this.a = lVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        l lVar = this.a;
        synchronized (lVar.a) {
            try {
                com.five_corp.ad.internal.util.d dVar = lVar.d;
                dVar.getClass();
                arrayList = new ArrayList();
                dVar.a(arrayList);
                if (lVar.e != null && arrayList.isEmpty()) {
                    lVar.e.cancel();
                    lVar.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        lVar.b.post(new k(arrayList));
    }
}
