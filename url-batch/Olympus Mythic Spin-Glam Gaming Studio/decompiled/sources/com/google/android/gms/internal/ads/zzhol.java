package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhol {
    private final Map zza;
    private final Map zzb;

    private zzhol() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzhol zza(zzhok zzhokVar) throws GeneralSecurityException {
        if (zzhokVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzhom zzhomVar = new zzhom(zzhokVar.zzb(), zzhokVar.zzc(), null);
        Map map = this.zza;
        if (map.containsKey(zzhomVar)) {
            zzhok zzhokVar2 = (zzhok) map.get(zzhomVar);
            if (!zzhokVar2.equals(zzhokVar) || !zzhokVar.equals(zzhokVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzhomVar.toString()));
            }
        } else {
            map.put(zzhomVar, zzhokVar);
        }
        return this;
    }

    public final zzhol zzb(zzhoq zzhoqVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class zza = zzhoqVar.zza();
        if (map.containsKey(zza)) {
            zzhoq zzhoqVar2 = (zzhoq) map.get(zza);
            if (!zzhoqVar2.equals(zzhoqVar) || !zzhoqVar.equals(zzhoqVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zza.toString()));
            }
        } else {
            map.put(zza, zzhoqVar);
        }
        return this;
    }

    final /* synthetic */ Map zzc() {
        return this.zza;
    }

    final /* synthetic */ Map zzd() {
        return this.zzb;
    }

    /* synthetic */ zzhol(zzhoo zzhooVar, byte[] bArr) {
        this.zza = new HashMap(zzhooVar.zzc());
        this.zzb = new HashMap(zzhooVar.zzd());
    }

    /* synthetic */ zzhol(byte[] bArr) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
