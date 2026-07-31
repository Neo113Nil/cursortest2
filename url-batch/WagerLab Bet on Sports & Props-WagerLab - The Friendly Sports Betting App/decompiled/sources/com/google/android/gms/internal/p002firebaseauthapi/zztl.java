package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zztl extends zzalf<zztl, zza> implements zzamo {
    private static final zztl zzc;
    private static volatile zzamv<zztl> zzd;
    private int zze;
    private int zzf;
    private zztr zzg;
    private zzajv zzh = zzajv.zza;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zztl, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zztl.zza((zztl) this.zza, zzajvVar);
            return this;
        }

        public final zza zza(zztr zztrVar) {
            zzg();
            zztl.zza((zztl) this.zza, zztrVar);
            return this;
        }

        private zza() {
            super(zztl.zzc);
        }
    }

    public static zztl zzd() {
        return zzc;
    }

    public final zztr zze() {
        zztr zztrVar = this.zzg;
        return zztrVar == null ? zztr.zzd() : zztrVar;
    }

    public final zzajv zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zztn.zza[i - 1]) {
            case 1:
                return new zztl();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zztl> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zztl.class) {
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

    static /* synthetic */ void zza(zztl zztlVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zztlVar.zzh = zzajvVar;
    }

    static /* synthetic */ void zza(zztl zztlVar, zztr zztrVar) {
        zztrVar.getClass();
        zztlVar.zzg = zztrVar;
        zztlVar.zze |= 1;
    }

    static {
        zztl zztlVar = new zztl();
        zzc = zztlVar;
        zzalf.zza((Class<zztl>) zztl.class, zztlVar);
    }

    private zztl() {
    }
}
