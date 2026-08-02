package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzggj {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzggj() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzggj zza(zzgfl zzgflVar) throws GeneralSecurityException {
        zzggl zzgglVar = new zzggl(zzgflVar.zzb(), zzgflVar.zza(), null);
        if (this.zzb.containsKey(zzgglVar)) {
            zzgfl zzgflVar2 = (zzgfl) this.zzb.get(zzgglVar);
            if (!zzgflVar2.equals(zzgflVar) || !zzgflVar.equals(zzgflVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgglVar.toString()));
            }
        } else {
            this.zzb.put(zzgglVar, zzgflVar);
        }
        return this;
    }

    public final zzggj zzb(zzgfo zzgfoVar) throws GeneralSecurityException {
        zzggn zzggnVar = new zzggn(zzgfoVar.zza(), zzgfoVar.zzb(), null);
        if (this.zza.containsKey(zzggnVar)) {
            zzgfo zzgfoVar2 = (zzgfo) this.zza.get(zzggnVar);
            if (!zzgfoVar2.equals(zzgfoVar) || !zzgfoVar.equals(zzgfoVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzggnVar.toString()));
            }
        } else {
            this.zza.put(zzggnVar, zzgfoVar);
        }
        return this;
    }

    public final zzggj zzc(zzggb zzggbVar) throws GeneralSecurityException {
        zzggl zzgglVar = new zzggl(zzggbVar.zzb(), zzggbVar.zza(), null);
        if (this.zzd.containsKey(zzgglVar)) {
            zzggb zzggbVar2 = (zzggb) this.zzd.get(zzgglVar);
            if (!zzggbVar2.equals(zzggbVar) || !zzggbVar.equals(zzggbVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgglVar.toString()));
            }
        } else {
            this.zzd.put(zzgglVar, zzggbVar);
        }
        return this;
    }

    public final zzggj zzd(zzgge zzggeVar) throws GeneralSecurityException {
        zzggn zzggnVar = new zzggn(zzggeVar.zza(), zzggeVar.zzb(), null);
        if (this.zzc.containsKey(zzggnVar)) {
            zzgge zzggeVar2 = (zzgge) this.zzc.get(zzggnVar);
            if (!zzggeVar2.equals(zzggeVar) || !zzggeVar.equals(zzggeVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzggnVar.toString()));
            }
        } else {
            this.zzc.put(zzggnVar, zzggeVar);
        }
        return this;
    }

    public zzggj(zzggp zzggpVar) {
        this.zza = new HashMap(zzggpVar.zza);
        this.zzb = new HashMap(zzggpVar.zzb);
        this.zzc = new HashMap(zzggpVar.zzc);
        this.zzd = new HashMap(zzggpVar.zzd);
    }
}
