package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgfq {
    private final Class zza;

    public zzgfq(Class cls) {
        this.zza = cls;
    }

    public abstract zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException;

    public abstract zzgso zzb(zzgpw zzgpwVar) throws zzgrq;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzgso zzgsoVar) throws GeneralSecurityException;

    public final Class zzg() {
        return this.zza;
    }
}
