package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzto implements zzsu {
    private final zzew zzc;
    private int zzd;
    private final zztn zze;
    private final zzwm zzf;
    private final zzph zzg;

    public zzto(zzew zzewVar, zztn zztnVar, byte[] bArr) {
        zzph zzphVar = new zzph();
        zzwm zzwmVar = new zzwm(-1);
        this.zzc = zzewVar;
        this.zze = zztnVar;
        this.zzg = zzphVar;
        this.zzf = zzwmVar;
        this.zzd = 1048576;
    }

    public final zzto zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zztq zzb(zzbg zzbgVar) {
        Objects.requireNonNull(zzbgVar.zzd);
        return new zztq(zzbgVar, this.zzc, this.zze, zzpq.zza, this.zzf, this.zzd, null, null);
    }
}
