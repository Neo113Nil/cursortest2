package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcrs implements zzfbp {
    private final zzcpw zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    /* synthetic */ zzcrs(zzcpw zzcpwVar, zzcrr zzcrrVar) {
        this.zza = zzcpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbp
    public final /* synthetic */ zzfbp zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbp
    public final /* synthetic */ zzfbp zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbp
    public final /* synthetic */ zzfbp zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbp
    public final zzfbq zzd() {
        zzgxq.zzc(this.zzb, Context.class);
        zzgxq.zzc(this.zzc, String.class);
        zzgxq.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcru(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
