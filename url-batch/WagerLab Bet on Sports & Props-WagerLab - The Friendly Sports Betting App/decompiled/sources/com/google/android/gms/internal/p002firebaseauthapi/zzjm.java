package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzjm implements zzpz<zzbe, zzbe> {
    private static final zzjm zza = new zzjm();
    private static final zzps<zzof, zzbe> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjl
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzjv.zza((zzof) zzbiVar);
        }
    }, zzof.class, zzbe.class);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzbe> zza() {
        return zzbe.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzbe> zzb() {
        return zzbe.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final /* synthetic */ zzbe zza(zzob zzobVar, zzok zzokVar, zzqc<zzbe> zzqcVar) throws GeneralSecurityException {
        zzoo zzooVar;
        zzoo zzooVar2;
        zzaaj zzc;
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < zzobVar.zza(); i++) {
            zzoa zza2 = zzobVar.zza(i);
            if (zza2.zzc().equals(zzbk.zza)) {
                zzbe zza3 = zzqcVar.zza(zza2);
                zzbi zzb2 = zza2.zzb();
                if (zzb2 instanceof zzjk) {
                    zzc = ((zzjk) zzb2).zze();
                } else if (zzb2 instanceof zzof) {
                    zzc = ((zzof) zzb2).zzc();
                } else {
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzb2.getClass().getName() + " with parameters " + String.valueOf(zzb2.zza()));
                }
                zzpnVar.zza(zzc, new zzjo(zza3, zza2.zza()));
            }
        }
        if (!zzokVar.zza()) {
            zzol zza4 = zzow.zzb().zza();
            zzooVar = zza4.zza(zzobVar, zzokVar, "daead", "encrypt");
            zzooVar2 = zza4.zza(zzobVar, zzokVar, "daead", "decrypt");
        } else {
            zzooVar = zzon.zza;
            zzooVar2 = zzon.zza;
        }
        return new zzjn(new zzjo(zzqcVar.zza(zzobVar.zzc()), zzobVar.zzc().zza()), zzpnVar.zza(), zzooVar, zzooVar2);
    }

    zzjm() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }
}
