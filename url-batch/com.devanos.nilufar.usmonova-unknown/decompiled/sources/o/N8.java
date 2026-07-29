package o;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface N8 extends HS, ReadableByteChannel {
    long G();

    String H(Charset charset);

    InputStream J();

    G8 a();

    boolean d(C1347k9 c1347k9);

    long f(C1347k9 c1347k9);

    C1347k9 h();

    C1347k9 i(long j);

    boolean l(long j);

    String n();

    long o(M8 m8);

    byte[] p();

    JL peek();

    byte readByte();

    int readInt();

    short readShort();

    long s(C1347k9 c1347k9);

    void skip(long j);

    String u(long j);

    int w(NG ng);

    void y(long j);
}
