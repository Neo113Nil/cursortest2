package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgar {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzgar(Class cls, zzgaq... zzgaqVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzgaq zzgaqVar = zzgaqVarArr[i];
            if (hashMap.containsKey(zzgaqVar.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgaqVar.zzb().getCanonicalName())));
            }
            hashMap.put(zzgaqVar.zzb(), zzgaqVar);
        }
        this.zzc = zzgaqVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgap zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgly zzb(zzgjg zzgjgVar) throws zzgla;

    public abstract String zzc();

    public abstract void zzd(zzgly zzglyVar) throws GeneralSecurityException;

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

    public final Object zzk(zzgly zzglyVar, Class cls) throws GeneralSecurityException {
        zzgaq zzgaqVar = (zzgaq) this.zzb.get(cls);
        if (zzgaqVar != null) {
            return zzgaqVar.zza(zzglyVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
