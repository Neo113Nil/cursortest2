package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzaty {

    @Nullable
    public final Object zza;

    @Nullable
    public final zzatb zzb;

    @Nullable
    public final zzaub zzc;
    public boolean zzd;

    private zzaty(zzaub zzaubVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaubVar;
    }

    private zzaty(@Nullable Object obj, @Nullable zzatb zzatbVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzatbVar;
        this.zzc = null;
    }

    public static zzaty zza(@Nullable Object obj, @Nullable zzatb zzatbVar) {
        return new zzaty(obj, zzatbVar);
    }

    public static zzaty zzb(zzaub zzaubVar) {
        return new zzaty(zzaubVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
