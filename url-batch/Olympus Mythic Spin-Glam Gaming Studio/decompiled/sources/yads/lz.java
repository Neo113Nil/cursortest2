package yads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface lz {
    static long a(lz lzVar) {
        byte[] bArr = (byte[]) ((zc0) lzVar).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
