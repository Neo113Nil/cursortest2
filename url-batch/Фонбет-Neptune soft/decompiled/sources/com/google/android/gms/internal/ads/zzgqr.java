package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgqr extends zzgxy implements zzgzk {
    private static final zzgqr zza;
    private static volatile zzgzr zzb;
    private int zzc;

    static {
        zzgqr zzgqrVar = new zzgqr();
        zza = zzgqrVar;
        zzgxy.zzcb(zzgqr.class, zzgqrVar);
    }

    private zzgqr() {
    }

    public static zzgqq zzc() {
        return (zzgqq) zza.zzaZ();
    }

    public static zzgqr zze() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    protected final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        zzgqp zzgqpVar = null;
        switch (zzgxxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgqr();
            case NEW_BUILDER:
                return new zzgqq(zzgqpVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgqr.class) {
                        zzgzrVar = zzb;
                        if (zzgzrVar == null) {
                            zzgzrVar = new zzgxt(zza);
                            zzb = zzgzrVar;
                        }
                    }
                }
                return zzgzrVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
