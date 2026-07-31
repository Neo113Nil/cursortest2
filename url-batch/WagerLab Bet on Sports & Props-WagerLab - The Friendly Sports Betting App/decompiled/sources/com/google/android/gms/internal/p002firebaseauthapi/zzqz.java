package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzqz implements zzpz<zzqw, zzqw> {
    private static final zzqz zza = new zzqz();

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzqw> zza() {
        return zzqw.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzqw> zzb() {
        return zzqw.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final /* synthetic */ zzqw zza(zzob zzobVar, zzok zzokVar, zzqc<zzqw> zzqcVar) throws GeneralSecurityException {
        zzaaj zzc;
        zzoa zzc2 = zzobVar.zzc();
        if (zzc2 == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < zzobVar.zza(); i++) {
            zzoa zza2 = zzobVar.zza(i);
            if (zza2.zzc().equals(zzbk.zza)) {
                zzqw zza3 = zzqcVar.zza(zza2);
                zzbi zzb = zza2.zzb();
                if (zzb instanceof zzrk) {
                    zzc = ((zzrk) zzb).zze();
                } else if (zzb instanceof zzof) {
                    zzc = ((zzof) zzb).zzc();
                } else {
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzb.getClass().getName() + " with parameters " + String.valueOf(zzb.zza()));
                }
                zzpnVar.zza(zzc, zza3);
            }
        }
        return new zzqy(zzpnVar.zza(), zzqcVar.zza(zzc2));
    }

    private zzqz() {
    }

    static void zzc() throws GeneralSecurityException {
        zzpa.zza().zza(zza);
    }
}
