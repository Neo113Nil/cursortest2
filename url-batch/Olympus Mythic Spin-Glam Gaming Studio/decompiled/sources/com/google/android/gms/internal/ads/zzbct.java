package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbct extends zzbdt {
    private static final zzbdu zzh = new zzbdu();
    private final Context zzi;

    public zzbct(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2, Context context) {
        super(zzbcgVar, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", zzayaVar, i, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzp("E");
        Context context = this.zzi;
        AtomicReference zza = zzh.zza(context.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                try {
                    if (zza.get() == null) {
                        zza.set((String) this.zze.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) zza.get();
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            zzayaVar.zzp(zzazw.zza(str.getBytes(), true));
        }
    }
}
