package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcdk implements zzfzc {
    final /* synthetic */ zzfzp zza;

    zzcdk(zzcdl zzcdlVar, zzfzp zzfzpVar) {
        this.zza = zzfzpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        List list;
        list = zzcdl.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzcdl.zzc;
        list.remove(this.zza);
    }
}
