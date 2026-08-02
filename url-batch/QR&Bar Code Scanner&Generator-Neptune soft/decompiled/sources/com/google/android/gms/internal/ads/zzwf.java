package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzwf {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzwg zzwgVar) {
        zzc(zzwgVar);
        this.zza.add(new zzwe(handler, zzwgVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzwe zzweVar = (zzwe) it.next();
            z = zzweVar.zzc;
            if (!z) {
                handler = zzweVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzwg zzwgVar;
                        zzwe zzweVar2 = zzwe.this;
                        int i2 = i;
                        long j3 = j;
                        long j4 = j2;
                        zzwgVar = zzweVar2.zzb;
                        zzwgVar.zzY(i2, j3, j4);
                    }
                });
            }
        }
    }

    public final void zzc(zzwg zzwgVar) {
        zzwg zzwgVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzwe zzweVar = (zzwe) it.next();
            zzwgVar2 = zzweVar.zzb;
            if (zzwgVar2 == zzwgVar) {
                zzweVar.zzc();
                this.zza.remove(zzweVar);
            }
        }
    }
}
