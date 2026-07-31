package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcvc implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzcvc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzcvc zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzcvc(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza = ((zzcpa) this.zza).zza();
        JSONObject jSONObject = (JSONObject) this.zzb.zzb();
        String str = (String) this.zzc.zzb();
        boolean equals = "native".equals(str);
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzbfd(UUID.randomUUID().toString(), zza, str, jSONObject, false, equals);
    }
}
