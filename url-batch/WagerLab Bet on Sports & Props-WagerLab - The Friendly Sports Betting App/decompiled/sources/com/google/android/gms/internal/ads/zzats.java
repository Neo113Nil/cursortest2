package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzats implements Runnable {
    private zzats() {
        throw null;
    }

    /* synthetic */ zzats(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzatt.zzd = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            countDownLatch = zzatt.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzatt.zzb;
        } catch (Throwable th) {
            zzatt.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
