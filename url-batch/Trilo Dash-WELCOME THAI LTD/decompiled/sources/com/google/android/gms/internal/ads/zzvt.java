package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzvt {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzvu zzvuVar) {
        zzc(zzvuVar);
        this.zza.add(new zzvs(handler, zzvuVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzvs zzvsVar = (zzvs) it.next();
            z = zzvsVar.zzc;
            if (!z) {
                handler = zzvsVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzvu zzvuVar;
                        zzvs zzvsVar2 = zzvs.this;
                        int i2 = i;
                        long j3 = j;
                        long j4 = j2;
                        zzvuVar = zzvsVar2.zzb;
                        zzvuVar.zzY(i2, j3, j4);
                    }
                });
            }
        }
    }

    public final void zzc(zzvu zzvuVar) {
        zzvu zzvuVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzvs zzvsVar = (zzvs) it.next();
            zzvuVar2 = zzvsVar.zzb;
            if (zzvuVar2 == zzvuVar) {
                zzvsVar.zzc();
                this.zza.remove(zzvsVar);
            }
        }
    }
}
