package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzcqy implements zzinw {
    private final zzcqx zza;

    private zzcqy(zzcqx zzcqxVar) {
        this.zza = zzcqxVar;
    }

    public static zzcqy zzc(zzcqx zzcqxVar) {
        return new zzcqy(zzcqxVar);
    }

    public static com.google.android.gms.ads.internal.zza zzd(zzcqx zzcqxVar) {
        return new com.google.android.gms.ads.internal.zza(new zzcjc(), new zzchx());
    }

    public final com.google.android.gms.ads.internal.zza zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
