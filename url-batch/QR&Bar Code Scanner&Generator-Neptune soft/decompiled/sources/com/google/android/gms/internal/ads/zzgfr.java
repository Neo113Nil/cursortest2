package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgfr {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzgfr(Class cls, zzggf... zzggfVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzggf zzggfVar = zzggfVarArr[i];
            if (hashMap.containsKey(zzggfVar.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzggfVar.zzb().getCanonicalName())));
            }
            hashMap.put(zzggfVar.zzb(), zzggfVar);
        }
        this.zzc = zzggfVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgfq zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgso zzb(zzgpw zzgpwVar) throws zzgrq;

    public abstract String zzc();

    public abstract void zzd(zzgso zzgsoVar) throws GeneralSecurityException;

    public int zze() {
        return 1;
    }

    public abstract int zzf();

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgso zzgsoVar, Class cls) throws GeneralSecurityException {
        zzggf zzggfVar = (zzggf) this.zzb.get(cls);
        if (zzggfVar != null) {
            return zzggfVar.zza(zzgsoVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
