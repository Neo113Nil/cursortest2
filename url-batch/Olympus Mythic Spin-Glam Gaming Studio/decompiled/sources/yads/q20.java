package yads;

import android.media.MediaCodec;

/* loaded from: classes14.dex */
public final class q20 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final p20 j;

    public q20() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = sb3.a >= 24 ? new p20(cryptoInfo) : null;
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.b = bArr;
        this.a = bArr2;
        this.c = i2;
        this.g = i3;
        this.h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (sb3.a >= 24) {
            p20 p20Var = this.j;
            p20Var.getClass();
            p20Var.a(i3, i4);
        }
    }
}
