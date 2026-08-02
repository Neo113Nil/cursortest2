package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaqx implements Callable {
    private final zzaqe zza;
    private final zzamk zzb;

    public zzaqx(zzaqe zzaqeVar, zzamk zzamkVar) {
        this.zza = zzaqeVar;
        this.zzb = zzamkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzana zzc = this.zza.zzc();
        if (zzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                zzamk zzamkVar = this.zzb;
                byte[] zzax = zzc.zzax();
                zzamkVar.zzal(zzax, 0, zzax.length, zzgqq.zza());
            }
            return null;
        } catch (zzgrq | NullPointerException unused) {
            return null;
        }
    }
}
