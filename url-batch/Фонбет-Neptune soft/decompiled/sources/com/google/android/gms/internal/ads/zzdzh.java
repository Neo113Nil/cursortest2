package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdzh {
    private final zzgcu zza;
    private final zzgcu zzb;
    private final zzeac zzc;
    private final zzhew zzd;

    zzdzh(zzgcu zzgcuVar, zzgcu zzgcuVar2, zzeac zzeacVar, zzhew zzhewVar) {
        this.zza = zzgcuVar;
        this.zzb = zzgcuVar2;
        this.zzc = zzeacVar;
        this.zzd = zzhewVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbug zzbugVar) throws Exception {
        return this.zzc.zza(zzbugVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkH)).longValue());
    }

    final /* synthetic */ ListenableFuture zzb(zzbug zzbugVar, int i, zzdyp zzdypVar) throws Exception {
        return ((zzebi) this.zzd.zzb()).zzb(zzbugVar, i);
    }

    public final ListenableFuture zzc(final zzbug zzbugVar) {
        String str = zzbugVar.zzf;
        com.google.android.gms.ads.internal.zzu.zzp();
        ListenableFuture zzg = com.google.android.gms.ads.internal.util.zzt.zzC(str) ? zzgcj.zzg(new zzdyp(1, "Ads service proxy force local")) : zzgcj.zzf(zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.internal.ads.zzdze
            @Override // com.google.android.gms.internal.ads.zzgbp
            public final ListenableFuture zza() {
                return zzdzh.this.zza(zzbugVar);
            }
        }, this.zza), ExecutionException.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdzf
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                Throwable th = executionException;
                if (cause != null) {
                    th = executionException.getCause();
                }
                return zzgcj.zzg(th);
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzgcj.zzf(zzg, zzdyp.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdzg
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzdzh.this.zzb(zzbugVar, callingUid, (zzdyp) obj);
            }
        }, this.zzb);
    }
}
