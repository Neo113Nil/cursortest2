package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbdg extends zzbdt {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzbdg(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2) {
        super(zzbcgVar, "XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", zzayaVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zza("E");
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            zzayaVar.zza(zzh);
        }
    }
}
