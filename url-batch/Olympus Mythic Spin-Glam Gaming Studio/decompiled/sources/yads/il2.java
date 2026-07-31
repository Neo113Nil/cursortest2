package yads;

import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes12.dex */
public abstract class il2 {
    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static hl2 a(byte[] bArr) {
        xb2 xb2Var = new xb2(bArr);
        if (xb2Var.c < 32) {
            return null;
        }
        xb2Var.e(0);
        if (xb2Var.a() != (xb2Var.c - xb2Var.b) + 4 || xb2Var.a() != 1886614376) {
            return null;
        }
        int a = (xb2Var.a() >> 24) & 255;
        if (a > 1) {
            mf1.a(a, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(xb2Var.g(), xb2Var.g());
        if (a == 1) {
            xb2Var.e(xb2Var.b + (xb2Var.n() * 16));
        }
        int n = xb2Var.n();
        if (n != xb2Var.c - xb2Var.b) {
            return null;
        }
        byte[] bArr2 = new byte[n];
        xb2Var.a(bArr2, 0, n);
        return new hl2(uuid, a, bArr2);
    }
}
