package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzevz implements zzeve {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcfp zzd;

    public zzevz(zzcfp zzcfpVar, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.zzd = zzcfpVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return zzfzg.zzg(zzfzg.zzm(zzfzg.zzi(this.zzb), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzevx
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                return new zzewa((String) obj);
            }
        }, this.zza), Throwable.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzevy
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzevz.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    final /* synthetic */ zzfzp zzc(Throwable th) throws Exception {
        return zzfzg.zzi(new zzewa(this.zzb));
    }
}
