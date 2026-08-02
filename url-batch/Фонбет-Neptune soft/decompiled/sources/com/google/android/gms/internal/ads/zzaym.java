package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzaym {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzayl zza(boolean z) {
        synchronized (this.zzb) {
            zzayl zzaylVar = null;
            if (this.zzc.isEmpty()) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() < 2) {
                zzayl zzaylVar2 = (zzayl) this.zzc.get(0);
                if (z) {
                    this.zzc.remove(0);
                } else {
                    zzaylVar2.zzi();
                }
                return zzaylVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzayl zzaylVar3 : this.zzc) {
                int zzb = zzaylVar3.zzb();
                if (zzb > i2) {
                    i = i3;
                }
                int i4 = zzb > i2 ? zzb : i2;
                if (zzb > i2) {
                    zzaylVar = zzaylVar3;
                }
                i3++;
                i2 = i4;
            }
            this.zzc.remove(i);
            return zzaylVar;
        }
    }

    public final void zzb(zzayl zzaylVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzaylVar.zzj(i);
            zzaylVar.zzn();
            this.zzc.add(zzaylVar);
        }
    }

    public final boolean zzc(zzayl zzaylVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzayl zzaylVar2 = (zzayl) it.next();
                if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP()) {
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ() && !zzaylVar.equals(zzaylVar2) && zzaylVar2.zzf().equals(zzaylVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzaylVar.equals(zzaylVar2) && zzaylVar2.zzd().equals(zzaylVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzayl zzaylVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzaylVar);
        }
    }
}
