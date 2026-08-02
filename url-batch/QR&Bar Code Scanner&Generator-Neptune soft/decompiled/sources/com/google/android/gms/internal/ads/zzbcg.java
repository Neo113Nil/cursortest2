package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbcg {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzbcf zza(boolean z) {
        synchronized (this.zzb) {
            zzbcf zzbcfVar = null;
            if (this.zzc.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() < 2) {
                zzbcf zzbcfVar2 = (zzbcf) this.zzc.get(0);
                if (z) {
                    this.zzc.remove(0);
                } else {
                    zzbcfVar2.zzi();
                }
                return zzbcfVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzbcf zzbcfVar3 : this.zzc) {
                int zzb = zzbcfVar3.zzb();
                if (zzb > i2) {
                    i = i3;
                }
                int i4 = zzb > i2 ? zzb : i2;
                if (zzb > i2) {
                    zzbcfVar = zzbcfVar3;
                }
                i3++;
                i2 = i4;
            }
            this.zzc.remove(i);
            return zzbcfVar;
        }
    }

    public final void zzb(zzbcf zzbcfVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                com.google.android.gms.ads.internal.util.zze.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzbcfVar.zzj(i);
            zzbcfVar.zzn();
            this.zzc.add(zzbcfVar);
        }
    }

    public final boolean zzc(zzbcf zzbcfVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzbcf zzbcfVar2 = (zzbcf) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN() && !zzbcfVar.equals(zzbcfVar2) && zzbcfVar2.zzf().equals(zzbcfVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzbcfVar.equals(zzbcfVar2) && zzbcfVar2.zzd().equals(zzbcfVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzbcf zzbcfVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbcfVar);
        }
    }
}
