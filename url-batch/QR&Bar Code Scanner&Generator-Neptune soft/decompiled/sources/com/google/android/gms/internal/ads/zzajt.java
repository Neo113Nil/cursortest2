package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzajt implements Runnable {
    private final zzakd zza;
    private final zzakj zzb;
    private final Runnable zzc;

    public zzajt(zzakd zzakdVar, zzakj zzakjVar, Runnable runnable) {
        this.zza = zzakdVar;
        this.zzb = zzakjVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzakj zzakjVar = this.zzb;
        if (zzakjVar.zzc()) {
            this.zza.zzo(zzakjVar.zza);
        } else {
            this.zza.zzn(zzakjVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
