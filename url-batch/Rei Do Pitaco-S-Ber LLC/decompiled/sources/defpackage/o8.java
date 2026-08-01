package defpackage;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public interface o8 extends p20, ReadableByteChannel {
    r8 c(long j);

    String d();

    String f(long j);

    int g(xv xvVar);

    void h(long j);

    long k();

    String l(Charset charset);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);
}
