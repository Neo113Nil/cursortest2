package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzewu implements zzevo {
    private final Executor zza;
    private final String zzb;

    public zzewu(zzbyv zzbyvVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return zzgcj.zzf(zzgcj.zzm(zzgcj.zzh(this.zzb), new zzful() { // from class: com.google.android.gms.internal.ads.zzews
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return new zzewv((String) obj);
            }
        }, this.zza), Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzewt
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzewu.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        return zzgcj.zzh(new zzewv(this.zzb));
    }
}
