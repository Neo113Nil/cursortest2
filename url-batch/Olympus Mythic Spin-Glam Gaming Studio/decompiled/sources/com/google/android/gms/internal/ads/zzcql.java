package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcql implements zzeig {
    private final zzcpp zza;
    private Context zzb;

    /* synthetic */ zzcql(zzcpp zzcppVar, byte[] bArr) {
        this.zza = zzcppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeig
    public final zzeih zza() {
        zzioe.zzc(this.zzb, Context.class);
        return new zzcqm(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeig
    public final /* bridge */ /* synthetic */ zzeig zzb(Context context) {
        this.zzb = context;
        return this;
    }
}
