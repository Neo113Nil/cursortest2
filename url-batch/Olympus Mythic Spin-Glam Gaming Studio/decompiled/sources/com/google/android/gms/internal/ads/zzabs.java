package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzabs {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzabt zzabtVar) {
        zzb(zzabtVar);
        this.zza.add(new zzabr(handler, zzabtVar));
    }

    public final void zzb(zzabt zzabtVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzabr zzabrVar = (zzabr) it.next();
            if (zzabrVar.zzc() == zzabtVar) {
                zzabrVar.zza();
                copyOnWriteArrayList.remove(zzabrVar);
            }
        }
    }

    public final void zzc(final int i, final long j, final long j2) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzabr zzabrVar = (zzabr) it.next();
            if (!zzabrVar.zzd()) {
                zzabrVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzabr.this.zzc().zzX(i, j, j2);
                    }
                });
            }
        }
    }
}
