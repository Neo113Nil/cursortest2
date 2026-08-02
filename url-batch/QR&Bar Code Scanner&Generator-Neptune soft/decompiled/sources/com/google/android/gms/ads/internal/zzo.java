package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzcgv;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
final class zzo implements Callable {
    final /* synthetic */ zzs zza;

    zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcgv zzcgvVar;
        Context context;
        zzs zzsVar = this.zza;
        zzcgvVar = zzsVar.zza;
        String str = zzcgvVar.zza;
        context = zzsVar.zzd;
        return new zzape(zzapd.zzs(str, context, false));
    }
}
