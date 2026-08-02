package com.google.android.play.core.internal;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
public abstract class zzah implements Runnable {
    private final com.google.android.play.core.tasks.zzi zza;

    zzah() {
        this.zza = null;
    }

    public zzah(com.google.android.play.core.tasks.zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e) {
            zzc(e);
        }
    }

    protected abstract void zza();

    final com.google.android.play.core.tasks.zzi zzb() {
        return this.zza;
    }

    public final void zzc(Exception exc) {
        com.google.android.play.core.tasks.zzi zziVar = this.zza;
        if (zziVar != null) {
            zziVar.zzd(exc);
        }
    }
}
