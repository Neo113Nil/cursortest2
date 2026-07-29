package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zztg implements zzsn {
    private final zzeq zzc;
    private int zzd;
    private final zztf zze;
    private final zzwa zzf;
    private final zzpa zzg;

    public zztg(zzeq zzeqVar, zztf zztfVar, byte[] bArr) {
        zzpa zzpaVar = new zzpa();
        zzwa zzwaVar = new zzwa(-1);
        this.zzc = zzeqVar;
        this.zze = zztfVar;
        this.zzg = zzpaVar;
        this.zzf = zzwaVar;
        this.zzd = 1048576;
    }

    public final zztg zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzti zzb(zzbb zzbbVar) {
        Objects.requireNonNull(zzbbVar.zzd);
        return new zzti(zzbbVar, this.zzc, this.zze, zzpj.zza, this.zzf, this.zzd, null, null);
    }
}
