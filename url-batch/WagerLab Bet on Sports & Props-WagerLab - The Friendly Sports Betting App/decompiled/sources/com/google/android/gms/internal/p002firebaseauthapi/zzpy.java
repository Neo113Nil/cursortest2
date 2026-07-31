package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzpy {
    private final Map<zzpx, zzps<?, ?>> zza;
    private final Map<Class<?>, zzpz<?, ?>> zzb;

    public final <KeyT extends zzbi, PrimitiveT> zzpy zza(zzps<KeyT, PrimitiveT> zzpsVar) throws GeneralSecurityException {
        if (zzpsVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzpx zzpxVar = new zzpx(zzpsVar.zza(), zzpsVar.zzb());
        if (!this.zza.containsKey(zzpxVar)) {
            this.zza.put(zzpxVar, zzpsVar);
            return this;
        }
        zzps<?, ?> zzpsVar2 = this.zza.get(zzpxVar);
        if (zzpsVar2.equals(zzpsVar) && zzpsVar.equals(zzpsVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + String.valueOf(zzpxVar));
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzpy zza(zzpz<InputPrimitiveT, WrapperPrimitiveT> zzpzVar) throws GeneralSecurityException {
        if (zzpzVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class<WrapperPrimitiveT> zzb = zzpzVar.zzb();
        if (this.zzb.containsKey(zzb)) {
            zzpz<?, ?> zzpzVar2 = this.zzb.get(zzb);
            if (zzpzVar2.equals(zzpzVar) && zzpzVar.equals(zzpzVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + String.valueOf(zzb));
        }
        this.zzb.put(zzb, zzpzVar);
        return this;
    }

    public final zzpw zza() {
        return new zzpw(this);
    }

    private zzpy() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzpy(zzpw zzpwVar) {
        Map map;
        Map map2;
        map = zzpwVar.zza;
        this.zza = new HashMap(map);
        map2 = zzpwVar.zzb;
        this.zzb = new HashMap(map2);
    }
}
