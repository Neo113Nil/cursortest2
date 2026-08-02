package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcqk implements zzeyi {
    private final zzcpw zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcqk(zzcpw zzcpwVar, zzcqj zzcqjVar) {
        this.zza = zzcpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyi
    public final /* synthetic */ zzeyi zza(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyi
    public final /* synthetic */ zzeyi zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyi
    public final zzeyj zzc() {
        zzgxq.zzc(this.zzb, Context.class);
        zzgxq.zzc(this.zzc, String.class);
        return new zzcqm(this.zza, this.zzb, this.zzc, null);
    }
}
