package o;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface M8 extends YR, WritableByteChannel {
    M8 A(long j);

    long E(HS hs);

    G8 a();

    M8 e(String str, int i, int i2);

    @Override // o.YR, java.io.Flushable
    void flush();

    M8 g(long j);

    M8 r(C1347k9 c1347k9);

    M8 write(byte[] bArr);

    M8 write(byte[] bArr, int i, int i2);

    M8 writeByte(int i);

    M8 writeInt(int i);

    M8 writeShort(int i);

    M8 z(String str);
}
