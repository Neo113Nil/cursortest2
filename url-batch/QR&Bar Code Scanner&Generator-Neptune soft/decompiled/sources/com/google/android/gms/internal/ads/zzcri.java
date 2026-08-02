package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcri implements zzdyy {
    private final zzcpw zza;
    private Context zzb;
    private zzbqr zzc;

    /* synthetic */ zzcri(zzcpw zzcpwVar, zzcrh zzcrhVar) {
        this.zza = zzcpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyy
    public final /* synthetic */ zzdyy zza(zzbqr zzbqrVar) {
        Objects.requireNonNull(zzbqrVar);
        this.zzc = zzbqrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyy
    public final /* synthetic */ zzdyy zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyy
    public final zzdyz zzc() {
        zzgxq.zzc(this.zzb, Context.class);
        zzgxq.zzc(this.zzc, zzbqr.class);
        return new zzcrk(this.zza, this.zzb, this.zzc, null);
    }
}
