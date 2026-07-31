package yads;

/* loaded from: classes4.dex */
public final class v73 {
    public final boolean a;
    public final String b;
    public final b83 c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r7.equals("cbc1") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v73(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 2;
        char c = 0;
        if (!((i == 0) ^ (bArr2 == null))) {
            throw new IllegalArgumentException();
        }
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    break;
                default:
                    gh1.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    i4 = 1;
                    break;
            }
            this.c = new b83(i4, i2, i3, bArr);
        }
        i4 = 1;
        this.c = new b83(i4, i2, i3, bArr);
    }
}
