package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdcv implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;
    private final zziof zzg;
    private final zziof zzh;
    private final zziof zzi;
    private final zziof zzj;
    private final zziof zzk;

    private zzdcv(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10, zziof zziofVar11, zziof zziofVar12) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar6;
        this.zzf = zziofVar7;
        this.zzg = zziofVar8;
        this.zzh = zziofVar9;
        this.zzi = zziofVar10;
        this.zzj = zziofVar11;
        this.zzk = zziofVar12;
    }

    public static zzdcv zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10, zziof zziofVar11, zziof zziofVar12) {
        return new zzdcv(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7, zziofVar8, zziofVar9, zziofVar10, zziofVar11, zziofVar12);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdcu zzb() {
        return new zzdcu((zzfqi) this.zza.zzb(), ((zzcpa) this.zzb).zza(), (ApplicationInfo) this.zzc.zzb(), ((zzefw) this.zzd).zzb(), zzeyp.zzc(), (PackageInfo) this.zze.zzb(), zzinv.zzc(this.zzf), ((zzcoe) this.zzg).zzb(), (String) this.zzh.zzb(), ((zzfdm) this.zzi).zzb(), ((zzddg) this.zzj).zza(), (zzdji) this.zzk.zzb());
    }
}
