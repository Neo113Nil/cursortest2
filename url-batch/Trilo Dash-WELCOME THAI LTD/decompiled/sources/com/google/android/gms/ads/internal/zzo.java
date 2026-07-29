package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaob;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzcfo;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzo implements Callable {
    final /* synthetic */ zzs zza;

    zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcfo zzcfoVar;
        Context context;
        zzs zzsVar = this.zza;
        zzcfoVar = zzsVar.zza;
        String str = zzcfoVar.zza;
        context = zzsVar.zzd;
        return new zzaoc(zzaob.zzs(str, context, false));
    }
}
