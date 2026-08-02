package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzcom;
import com.google.android.gms.internal.ads.zzcos;
import com.google.android.gms.internal.ads.zzcpc;
import com.google.android.gms.internal.ads.zzdxv;
import com.google.android.gms.internal.ads.zzffb;
import com.google.android.gms.internal.ads.zzfkm;
import com.google.android.gms.internal.ads.zzfzq;
import com.google.android.gms.internal.ads.zzgxi;
import com.google.android.gms.internal.ads.zzgxq;
import com.google.android.gms.internal.ads.zzgxv;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
public final class zzab implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;
    private final zzgxv zzf;
    private final zzgxv zzg;
    private final zzgxv zzh;
    private final zzgxv zzi;

    public zzab(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5, zzgxv zzgxvVar6, zzgxv zzgxvVar7, zzgxv zzgxvVar8, zzgxv zzgxvVar9) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
        this.zze = zzgxvVar5;
        this.zzf = zzgxvVar6;
        this.zzg = zzgxvVar7;
        this.zzh = zzgxvVar8;
        this.zzi = zzgxvVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcom zzcomVar = (zzcom) this.zza.zzb();
        Context zza = ((zzcos) this.zzb).zza();
        zzape zzapeVar = (zzape) this.zzc.zzb();
        zzffb zzffbVar = (zzffb) this.zzd.zzb();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return new zzaa(zzcomVar, zza, zzapeVar, zzffbVar, zzfzqVar, (ScheduledExecutorService) this.zzf.zzb(), (zzdxv) this.zzg.zzb(), (zzfkm) this.zzh.zzb(), ((zzcpc) this.zzi).zza());
    }
}
