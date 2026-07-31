package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.media3.common.C;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzwj extends zzbe {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzaj zzf;
    private final zzae zzg;

    static {
        zzy zzyVar = new zzy();
        zzyVar.zza("SinglePeriodTimeline");
        zzyVar.zzb(Uri.EMPTY);
        zzyVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i, zzbd zzbdVar, long j) {
        zzghc.zzm(i, 1, FirebaseAnalytics.Param.INDEX);
        boolean z = this.zze;
        zzbdVar.zza(zzbd.zza, this.zzf, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, z, false, this.zzg, 0L, this.zzd, 0, 0, 0L);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z) {
        zzghc.zzm(i, 1, FirebaseAnalytics.Param.INDEX);
        zzbcVar.zza(null, z ? zzb : null, 0, this.zzc, 0L, zzb.zza, false);
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i) {
        zzghc.zzm(i, 1, FirebaseAnalytics.Param.INDEX);
        return zzb;
    }

    public zzwj(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, zzaj zzajVar, zzae zzaeVar) {
        this.zzc = j4;
        this.zzd = j5;
        this.zze = z;
        zzajVar.getClass();
        this.zzf = zzajVar;
        this.zzg = zzaeVar;
    }
}
