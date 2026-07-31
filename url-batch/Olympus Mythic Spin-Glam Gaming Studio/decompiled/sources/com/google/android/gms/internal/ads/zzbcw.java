package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbcw extends zzbdt {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbcw(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2) {
        super(zzbcgVar, "c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", zzayaVar, i, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            zzayaVar.zzB(zzh.longValue());
        }
    }
}
