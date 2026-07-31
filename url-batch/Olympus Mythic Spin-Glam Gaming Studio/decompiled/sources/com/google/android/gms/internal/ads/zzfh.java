package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzfh implements zzea {

    @GuardedBy
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfh(Handler handler) {
        this.zzb = handler;
    }

    static /* synthetic */ void zzo(zzfg zzfgVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzfgVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzfg zzp() {
        zzfg zzfgVar;
        List list = zza;
        synchronized (list) {
            try {
                zzfgVar = list.isEmpty() ? new zzfg(null) : (zzfg) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzb(int i) {
        return this.zzb.hasMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zzc(int i) {
        Handler handler = this.zzb;
        zzfg zzp = zzp();
        zzp.zzb(handler.obtainMessage(i), this);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zzd(int i, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfg zzp = zzp();
        zzp.zzb(handler.obtainMessage(i, obj), this);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zze(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzfg zzp = zzp();
        zzp.zzb(handler.obtainMessage(i, i2, i3), this);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zzf(int i, int i2, int i3, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfg zzp = zzp();
        zzp.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzg(zzdz zzdzVar) {
        return ((zzfg) zzdzVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzh(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzi(int i, int i2) {
        return this.zzb.sendEmptyMessageDelayed(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzk(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzl(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzm(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzn(Runnable runnable, long j) {
        return this.zzb.postDelayed(runnable, 1000L);
    }
}
