package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzged {
    private boolean zza;

    @Nullable
    private final zzgen zzd;
    private final zzgea zzb = zzgea.zza;
    private zzgee zze = null;

    @Nullable
    private zzgef zzf = null;

    @Nullable
    private final zzgdy zzc = null;

    /* synthetic */ zzged(zzgen zzgenVar, zzgec zzgecVar) {
        this.zzd = zzgenVar;
    }

    static /* bridge */ /* synthetic */ zzgdy zza(zzged zzgedVar) {
        zzgdy zzgdyVar = zzgedVar.zzc;
        return null;
    }

    public final zzged zzc() {
        zzgef zzgefVar = this.zzf;
        if (zzgefVar != null) {
            zzgefVar.zzd();
        }
        this.zza = true;
        return this;
    }

    public final zzged zzd() {
        zzgee zzgeeVar;
        zzgeeVar = zzgee.zza;
        this.zze = zzgeeVar;
        return this;
    }
}
