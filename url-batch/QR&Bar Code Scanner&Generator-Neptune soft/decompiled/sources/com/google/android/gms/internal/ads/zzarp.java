package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzarp {
    protected static final String zza = "zzarp";
    private final zzaqe zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzarp(zzaqe zzaqeVar, String str, String str2, Class... clsArr) {
        this.zzb = zzaqeVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzaqeVar.zzk().submit(new zzaro(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzarp zzarpVar) {
        CountDownLatch countDownLatch;
        Class loadClass;
        try {
            try {
                zzaqe zzaqeVar = zzarpVar.zzb;
                loadClass = zzaqeVar.zzi().loadClass(zzarpVar.zzc(zzaqeVar.zzu(), zzarpVar.zzc));
            } catch (zzapj | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (loadClass == null) {
                countDownLatch = zzarpVar.zzg;
            } else {
                zzarpVar.zze = loadClass.getMethod(zzarpVar.zzc(zzarpVar.zzb.zzu(), zzarpVar.zzd), zzarpVar.zzf);
                if (zzarpVar.zze == null) {
                    countDownLatch = zzarpVar.zzg;
                }
                countDownLatch = zzarpVar.zzg;
            }
        } catch (NullPointerException unused2) {
            countDownLatch = zzarpVar.zzg;
        } catch (Throwable th) {
            zzarpVar.zzg.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzapj, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
