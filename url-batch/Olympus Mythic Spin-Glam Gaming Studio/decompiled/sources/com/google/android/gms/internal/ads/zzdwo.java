package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public interface zzdwo extends zzdcw {
    @Override // com.google.android.gms.internal.ads.zzdcw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzdwp zzh();

    zzdwo zzb(@Nullable zzfic zzficVar);

    zzdwo zzc(@Nullable zzfiy zzfiyVar);

    zzdwo zzd(zzdcz zzdczVar);

    zzdwo zze(zzdjp zzdjpVar);

    @Override // com.google.android.gms.internal.ads.zzdcw
    /* bridge */ /* synthetic */ default zzdcw zzi(@Nullable zzfic zzficVar) {
        zzb(zzficVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    /* bridge */ /* synthetic */ default zzdcw zzj(@Nullable zzfiy zzfiyVar) {
        zzc(zzfiyVar);
        return this;
    }
}
