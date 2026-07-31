package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzdsp implements zzhcv {
    final /* synthetic */ zzdsr zza;

    zzdsp(zzdsr zzdsrVar) {
        Objects.requireNonNull(zzdsrVar);
        this.zza = zzdsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgy)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzclm zzclmVar = (zzclm) list.get(0);
            if (zzclmVar != null) {
                this.zza.zza(zzclmVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgy)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid native display exp");
            }
        }
    }
}
