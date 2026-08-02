package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaju {
    private final Executor zza;

    public zzaju(Handler handler) {
        this.zza = new zzajs(this, handler);
    }

    public final void zza(zzakd zzakdVar, zzakm zzakmVar) {
        zzakdVar.zzm("post-error");
        zzakj zza = zzakj.zza(zzakmVar);
        Executor executor = this.zza;
        ((zzajs) executor).zza.post(new zzajt(zzakdVar, zza, null));
    }

    public final void zzb(zzakd zzakdVar, zzakj zzakjVar, Runnable runnable) {
        zzakdVar.zzq();
        zzakdVar.zzm("post-response");
        Executor executor = this.zza;
        ((zzajs) executor).zza.post(new zzajt(zzakdVar, zzakjVar, runnable));
    }
}
