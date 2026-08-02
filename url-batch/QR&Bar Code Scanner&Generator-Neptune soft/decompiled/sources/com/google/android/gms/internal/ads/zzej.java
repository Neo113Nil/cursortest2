package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzej implements zzdn {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzej(Handler handler) {
        this.zzb = handler;
    }

    static /* bridge */ /* synthetic */ void zzk(zzei zzeiVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzeiVar);
            }
        }
    }

    private static zzei zzl() {
        zzei zzeiVar;
        List list = zza;
        synchronized (list) {
            zzeiVar = list.isEmpty() ? new zzei(null) : (zzei) list.remove(list.size() - 1);
        }
        return zzeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final zzdm zza(int i) {
        zzei zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final zzdm zzb(int i, Object obj) {
        zzei zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i, obj), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final zzdm zzc(int i, int i2, int i3) {
        zzei zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(1, i2, i3), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final void zzd(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final void zze(int i) {
        this.zzb.removeMessages(2);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final boolean zzf(int i) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final boolean zzg(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final boolean zzh(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final boolean zzi(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final boolean zzj(zzdm zzdmVar) {
        return ((zzei) zzdmVar).zzc(this.zzb);
    }
}
