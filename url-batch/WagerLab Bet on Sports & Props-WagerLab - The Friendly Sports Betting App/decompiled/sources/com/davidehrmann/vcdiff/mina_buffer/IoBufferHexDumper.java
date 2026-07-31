package com.davidehrmann.vcdiff.mina_buffer;

/* loaded from: classes3.dex */
class IoBufferHexDumper {
    private static final byte[] highDigits;
    private static final byte[] lowDigits;

    IoBufferHexDumper() {
    }

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr2[i] = bArr[i >>> 4];
            bArr3[i] = bArr[i & 15];
        }
        highDigits = bArr2;
        lowDigits = bArr3;
    }

    public static String getHexdump(IoBuffer ioBuffer, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("lengthLimit: " + i + " (expected: 1+)");
        }
        boolean z = ioBuffer.remaining() > i;
        if (!z) {
            i = ioBuffer.remaining();
        }
        if (i == 0) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder((i * 3) + 3);
        int position = ioBuffer.position();
        int i2 = ioBuffer.get() & 255;
        sb.append((char) highDigits[i2]);
        sb.append((char) lowDigits[i2]);
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            sb.append(' ');
            int i3 = ioBuffer.get() & 255;
            sb.append((char) highDigits[i3]);
            sb.append((char) lowDigits[i3]);
        }
        ioBuffer.position(position);
        if (z) {
            sb.append("...");
        }
        return sb.toString();
    }
}
