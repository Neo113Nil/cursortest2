package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgfy {
    private static final zzgfy zza = new zzgfy();
    private final AtomicReference zzb = new AtomicReference(new zzggp(new zzggj(), null));

    public static zzgfy zza() {
        return zza;
    }

    public final synchronized void zzb(zzgfl zzgflVar) throws GeneralSecurityException {
        zzggj zzggjVar = new zzggj((zzggp) this.zzb.get());
        zzggjVar.zza(zzgflVar);
        this.zzb.set(new zzggp(zzggjVar, null));
    }

    public final synchronized void zzc(zzgfo zzgfoVar) throws GeneralSecurityException {
        zzggj zzggjVar = new zzggj((zzggp) this.zzb.get());
        zzggjVar.zzb(zzgfoVar);
        this.zzb.set(new zzggp(zzggjVar, null));
    }

    public final synchronized void zzd(zzggb zzggbVar) throws GeneralSecurityException {
        zzggj zzggjVar = new zzggj((zzggp) this.zzb.get());
        zzggjVar.zzc(zzggbVar);
        this.zzb.set(new zzggp(zzggjVar, null));
    }

    public final synchronized void zze(zzgge zzggeVar) throws GeneralSecurityException {
        zzggj zzggjVar = new zzggj((zzggp) this.zzb.get());
        zzggjVar.zzd(zzggeVar);
        this.zzb.set(new zzggp(zzggjVar, null));
    }
}
