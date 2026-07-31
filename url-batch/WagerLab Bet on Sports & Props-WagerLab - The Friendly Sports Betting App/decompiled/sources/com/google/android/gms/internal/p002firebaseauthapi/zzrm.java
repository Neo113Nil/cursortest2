package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzrm implements zzpz<zzcc, zzcc> {
    private static final zzrm zza = new zzrm();
    private static final zzps<zzof, zzcc> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrp
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzsm.zza((zzof) zzbiVar);
        }
    }, zzof.class, zzcc.class);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzcc> zza() {
        return zzcc.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzcc> zzb() {
        return zzcc.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final /* synthetic */ zzcc zza(zzob zzobVar, zzok zzokVar, zzqc<zzcc> zzqcVar) throws GeneralSecurityException {
        zzoo zzooVar;
        zzoo zzooVar2;
        zzaaj zzc;
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < zzobVar.zza(); i++) {
            zzoa zza2 = zzobVar.zza(i);
            if (zza2.zzc().equals(zzbk.zza)) {
                zzcc zza3 = zzqcVar.zza(zza2);
                zzbi zzb2 = zza2.zzb();
                if (zzb2 instanceof zzrk) {
                    zzc = ((zzrk) zzb2).zze();
                } else if (zzb2 instanceof zzof) {
                    zzc = ((zzof) zzb2).zzc();
                } else {
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzb2.getClass().getName() + " with parameters " + String.valueOf(zzb2.zza()));
                }
                zzpnVar.zza(zzc, new zzro(zza3, zza2.zza()));
            }
        }
        if (!zzokVar.zza()) {
            zzol zza4 = zzow.zzb().zza();
            zzooVar = zza4.zza(zzobVar, zzokVar, "mac", "compute");
            zzooVar2 = zza4.zza(zzobVar, zzokVar, "mac", "verify");
        } else {
            zzooVar = zzon.zza;
            zzooVar2 = zzon.zza;
        }
        return new zzrr(new zzro(zzqcVar.zza(zzobVar.zzc()), zzobVar.zzc().zza()), zzpnVar.zza(), zzooVar, zzooVar2);
    }

    zzrm() {
    }

    static void zzc() throws GeneralSecurityException {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }
}
