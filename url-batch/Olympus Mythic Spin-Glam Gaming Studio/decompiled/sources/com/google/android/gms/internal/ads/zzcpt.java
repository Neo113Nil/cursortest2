package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcpt implements zzfge {
    private final zzcpp zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcpt(zzcpp zzcppVar, byte[] bArr) {
        this.zza = zzcppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfge
    public final zzfgf zza() {
        zzioe.zzc(this.zzb, Context.class);
        zzioe.zzc(this.zzc, String.class);
        return new zzcpu(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfge
    public final /* bridge */ /* synthetic */ zzfge zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfge
    public final /* bridge */ /* synthetic */ zzfge zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
