package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzefw implements zzinw {
    private final zziof zza;

    private zzefw(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzefw zzc(zziof zziofVar) {
        return new zzefw(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcok) this.zza).zza().getPackageName();
        zzioe.zzb(packageName);
        return packageName;
    }
}
