package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzidh extends Writer {
    private final Appendable zza;
    private final zzidg zzb = new zzidg(null);

    zzidh(Appendable appendable) {
        this.zza = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.zza.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        this.zza.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        Objects.requireNonNull(str);
        this.zza.append(str, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        this.zza.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        zzidg zzidgVar = this.zzb;
        zzidgVar.zza(cArr);
        this.zza.append(zzidgVar, i, i2 + i);
    }
}
