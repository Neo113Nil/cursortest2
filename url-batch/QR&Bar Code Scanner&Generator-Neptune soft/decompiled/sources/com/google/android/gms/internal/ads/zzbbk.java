package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbbk {
    private final Handler zza;
    private final zzbbl zzb;

    public zzbbk(Handler handler, zzbbl zzbblVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzbblVar;
    }

    public final void zzb(String str, long j, long j2) {
        this.zza.post(new zzbbe(this, str, j, j2));
    }

    public final void zzc(zzauq zzauqVar) {
        this.zza.post(new zzbbj(this, zzauqVar));
    }

    public final void zzd(int i, long j) {
        this.zza.post(new zzbbg(this, i, j));
    }

    public final void zze(zzauq zzauqVar) {
        this.zza.post(new zzbbd(this, zzauqVar));
    }

    public final void zzf(zzasw zzaswVar) {
        this.zza.post(new zzbbf(this, zzaswVar));
    }

    public final void zzg(Surface surface) {
        this.zza.post(new zzbbi(this, surface));
    }

    public final void zzh(int i, int i2, int i3, float f) {
        this.zza.post(new zzbbh(this, i, i2, i3, f));
    }
}
