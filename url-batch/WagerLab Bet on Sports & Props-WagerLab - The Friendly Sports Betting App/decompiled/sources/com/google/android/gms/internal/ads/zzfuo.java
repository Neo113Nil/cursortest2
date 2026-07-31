package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfuo implements zzfuf {
    private ExecutorService zza;
    private Context zzb;
    private zzfui zzc;

    private zzfuo() {
        throw null;
    }

    /* synthetic */ zzfuo(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final zzfug zza() {
        zzhqf.zzc(this.zza, ExecutorService.class);
        zzhqf.zzc(this.zzb, Context.class);
        zzhqf.zzc(this.zzc, zzfui.class);
        return new zzfun(new zzfzz(), new zzgab(), new zzgad(), this.zza, this.zzb, this.zzc);
    }

    public final zzfuo zzb(ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
        return this;
    }

    public final zzfuo zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzfuo zzd(zzfui zzfuiVar) {
        zzfuiVar.getClass();
        this.zzc = zzfuiVar;
        return this;
    }
}
