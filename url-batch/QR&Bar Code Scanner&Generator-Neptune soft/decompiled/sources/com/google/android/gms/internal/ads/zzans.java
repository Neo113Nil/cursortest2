package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzans implements Runnable {
    private zzans() {
    }

    /* synthetic */ zzans(zzanr zzanrVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzant.zzc = MessageDigest.getInstance("MD5");
            countDownLatch = zzant.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzant.zzb;
        } catch (Throwable th) {
            zzant.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
