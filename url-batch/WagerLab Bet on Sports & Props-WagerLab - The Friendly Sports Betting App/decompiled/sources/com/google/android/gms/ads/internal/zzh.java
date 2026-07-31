package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfpf;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes4.dex */
final class zzh implements zzfpf {
    final /* synthetic */ zzk zza;

    zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zza(int i, long j) {
        this.zza.zzo().zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zzb(int i, long j, String str) {
        this.zza.zzo().zzf(i, System.currentTimeMillis() - j, str);
    }
}
