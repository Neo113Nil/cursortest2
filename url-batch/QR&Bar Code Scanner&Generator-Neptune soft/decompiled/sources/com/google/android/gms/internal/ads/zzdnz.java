package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdnz implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;

    public zzdnz(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgv zza = ((zzcpc) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzbbm(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
