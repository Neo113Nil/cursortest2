package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzauu extends ByteArrayOutputStream {
    private final zzauj zza;

    public zzauu(zzauj zzaujVar, int i) {
        this.zza = zzaujVar;
        ((ByteArrayOutputStream) this).buf = zzaujVar.zza(Math.max(i, 256));
    }

    private final void zza(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        zzauj zzaujVar = this.zza;
        int i3 = i2 + i;
        byte[] zza = zzaujVar.zza(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, zza, 0, ((ByteArrayOutputStream) this).count);
        zzaujVar.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = zza;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zza(i2);
        super.write(bArr, i, i2);
    }
}
