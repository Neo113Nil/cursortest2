package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbbc {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzbbb zza(boolean z) {
        synchronized (this.zzb) {
            zzbbb zzbbbVar = null;
            if (this.zzc.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() < 2) {
                zzbbb zzbbbVar2 = (zzbbb) this.zzc.get(0);
                if (z) {
                    this.zzc.remove(0);
                } else {
                    zzbbbVar2.zzi();
                }
                return zzbbbVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzbbb zzbbbVar3 : this.zzc) {
                int zzb = zzbbbVar3.zzb();
                if (zzb > i2) {
                    i = i3;
                }
                int i4 = zzb > i2 ? zzb : i2;
                if (zzb > i2) {
                    zzbbbVar = zzbbbVar3;
                }
                i3++;
                i2 = i4;
            }
            this.zzc.remove(i);
            return zzbbbVar;
        }
    }

    public final void zzb(zzbbb zzbbbVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                com.google.android.gms.ads.internal.util.zze.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzbbbVar.zzj(i);
            zzbbbVar.zzn();
            this.zzc.add(zzbbbVar);
        }
    }

    public final boolean zzc(zzbbb zzbbbVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzbbb zzbbbVar2 = (zzbbb) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN() && zzbbbVar != zzbbbVar2 && zzbbbVar2.zzf().equals(zzbbbVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (zzbbbVar != zzbbbVar2 && zzbbbVar2.zzd().equals(zzbbbVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzbbb zzbbbVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbbbVar);
        }
    }
}
