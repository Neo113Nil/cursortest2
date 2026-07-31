package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
public final class zztu extends zznd implements zzoj {
    private static final zztu zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zztu zztuVar = new zztu();
        zzb = zztuVar;
        zznd.zzI(zztu.class, zztuVar);
    }

    private zztu() {
    }

    public static zztu zzg(InputStream inputStream) throws IOException {
        return (zztu) zznd.zzw(zzb, inputStream);
    }

    public final zztv zzi() {
        zztv zzb2 = zztv.zzb(this.zzg);
        return zzb2 == null ? zztv.UNRECOGNIZED : zzb2;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i, Object obj, Object obj2) {
        zzoq zzoqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zztu();
        }
        zzug zzugVar = null;
        if (i2 == 4) {
            return new zztt(zzugVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzoq zzoqVar2 = zzd;
        if (zzoqVar2 != null) {
            return zzoqVar2;
        }
        synchronized (zztu.class) {
            zzoqVar = zzd;
            if (zzoqVar == null) {
                zzoqVar = new zzmy(zzb);
                zzd = zzoqVar;
            }
        }
        return zzoqVar;
    }
}
