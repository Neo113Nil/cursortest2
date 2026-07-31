package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzxb extends zzalf<zzxb, zza> implements zzamo {
    private static final zzxb zzc;
    private static volatile zzamv<zzxb> zzd;
    private String zze = "";
    private zzajv zzf = zzajv.zza;
    private int zzg;

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zza zza(zzxb zzxbVar) {
        return (zza) zzc.zzm().zza(zzxbVar);
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzxb, zza> implements zzamo {
        public final zza zza(zzxz zzxzVar) {
            zzg();
            zzxb.zza((zzxb) this.zza, zzxzVar);
            return this;
        }

        public final zza zza(String str) {
            zzg();
            zzxb.zza((zzxb) this.zza, str);
            return this;
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzxb.zza((zzxb) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzxb.zzc);
        }
    }

    public static zzxb zzc() {
        return zzc;
    }

    public static zzxb zza(byte[] bArr, zzaku zzakuVar) throws zzall {
        return (zzxb) zzalf.zza(zzc, bArr, zzakuVar);
    }

    public final zzxz zzd() {
        zzxz zza2 = zzxz.zza(this.zzg);
        return zza2 == null ? zzxz.UNRECOGNIZED : zza2;
    }

    public final zzajv zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzxd.zza[i - 1]) {
            case 1:
                return new zzxb();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzxb> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzxb.class) {
                    zzamvVar = zzd;
                    if (zzamvVar == null) {
                        zzamvVar = new zzalf.zza(zzc);
                        zzd = zzamvVar;
                    }
                }
                return zzamvVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final String zzf() {
        return this.zze;
    }

    static /* synthetic */ void zza(zzxb zzxbVar, zzxz zzxzVar) {
        zzxbVar.zzg = zzxzVar.zza();
    }

    static /* synthetic */ void zza(zzxb zzxbVar, String str) {
        str.getClass();
        zzxbVar.zze = str;
    }

    static /* synthetic */ void zza(zzxb zzxbVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzxbVar.zzf = zzajvVar;
    }

    static {
        zzxb zzxbVar = new zzxb();
        zzc = zzxbVar;
        zzalf.zza((Class<zzxb>) zzxb.class, zzxbVar);
    }

    private zzxb() {
    }
}
