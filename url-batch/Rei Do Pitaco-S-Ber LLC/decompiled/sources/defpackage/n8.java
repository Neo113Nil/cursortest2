package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public interface n8 extends f20, WritableByteChannel {
    @Override // defpackage.f20, java.io.Flushable
    void flush();

    n8 i(String str);

    n8 j(r8 r8Var);

    n8 write(byte[] bArr);

    n8 writeByte(int i);

    n8 writeInt(int i);

    n8 writeShort(int i);
}
