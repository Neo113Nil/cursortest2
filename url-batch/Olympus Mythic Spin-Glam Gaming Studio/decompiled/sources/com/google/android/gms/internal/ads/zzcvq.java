package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public interface zzcvq extends zzdcw {
    @Override // com.google.android.gms.internal.ads.zzdcw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzcvr zzh();

    zzcvq zzb(@Nullable zzfic zzficVar);

    zzcvq zzc(@Nullable zzfiy zzfiyVar);

    zzcvq zzd(zzdcz zzdczVar);

    zzcvq zze(zzdjp zzdjpVar);

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
