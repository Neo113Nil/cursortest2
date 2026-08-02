package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbei extends PushbackInputStream {
    final /* synthetic */ zzbej zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbei(zzbej zzbejVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzbejVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzbel.zze(this.zza.zzc);
        super.close();
    }
}
