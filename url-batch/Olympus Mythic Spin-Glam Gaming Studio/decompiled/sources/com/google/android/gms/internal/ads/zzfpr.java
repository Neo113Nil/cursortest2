package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfpr {
    final /* synthetic */ zzfqa zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfpr(zzfqa zzfqaVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfqaVar);
        this.zza = zzfqaVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfpz zza(Callable callable) {
        List list = this.zzc;
        zzhcx zzp = zzhcy.zzp(list);
        ListenableFuture zza = zzp.zza(zzfpq.zza, zzcgj.zzh);
        zzfqa zzfqaVar = this.zza;
        return new zzfpz(zzfqaVar, this.zzb, null, zza, list, zzp.zza(callable, zzfqaVar.zze()), null);
    }
}
