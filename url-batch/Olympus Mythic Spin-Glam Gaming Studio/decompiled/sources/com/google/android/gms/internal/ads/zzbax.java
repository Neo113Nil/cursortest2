package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbax {

    @VisibleForTesting
    protected volatile Boolean zzb;
    private final zzbcg zzc;
    private static final ConditionVariable zzd = new ConditionVariable();

    @VisibleForTesting
    protected static volatile zzgae zza = null;
    private static volatile Random zze = null;

    public zzbax(zzbcg zzbcgVar) {
        this.zzc = zzbcgVar;
        zzbcgVar.zzd().execute(new zzbaw(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzbax.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i, int i2, long j, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzaxg zza2 = zzaxk.zza();
            zza2.zza(this.zzc.zza.getPackageName());
            zza2.zzb(j);
            if (str != null) {
                zza2.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzc(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzgad zza3 = zza.zza(((zzaxk) zza2.zzbu()).zzaN());
            zza3.zzc(i);
            if (i2 != -1) {
                zza3.zzb(i2);
            }
            zza3.zza();
        } catch (Exception unused) {
        }
    }

    final /* synthetic */ zzbcg zzb() {
        return this.zzc;
    }
}
