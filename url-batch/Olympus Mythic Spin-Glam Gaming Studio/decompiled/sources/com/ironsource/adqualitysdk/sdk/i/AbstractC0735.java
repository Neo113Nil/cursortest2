package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ป, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0735 {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00df, code lost:
    
        if (r7 != 4) goto L57;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m4151(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        int i = (length * 3) / 4;
        byte[] bArr = new byte[i];
        int[] iArr = AbstractC0736.f1659;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length) {
            if (i3 == 0) {
                while (true) {
                    int i6 = i2 + 4;
                    if (i6 > length || (i4 = (iArr[bytes[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 18) | (iArr[bytes[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 12) | (iArr[bytes[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 6) | iArr[bytes[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED]) < 0) {
                        break;
                    }
                    bArr[i5 + 2] = (byte) i4;
                    bArr[i5 + 1] = (byte) (i4 >> 8);
                    bArr[i5] = (byte) (i4 >> 16);
                    i5 += 3;
                    i2 = i6;
                }
                if (i2 >= length) {
                    break;
                }
            }
            int i7 = i2 + 1;
            int i8 = iArr[bytes[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            if (i3 != 0) {
                if (i3 == 1) {
                    if (i8 < 0) {
                        if (i8 != -1) {
                            break;
                        }
                        i2 = i7;
                    }
                    i4 = (i4 << 6) | i8;
                } else if (i3 == 2) {
                    if (i8 < 0) {
                        if (i8 != -2) {
                            if (i8 != -1) {
                                break;
                            }
                        } else {
                            bArr[i5] = (byte) (i4 >> 4);
                            i3 = 4;
                            i5++;
                        }
                        i2 = i7;
                    }
                    i4 = (i4 << 6) | i8;
                } else if (i3 == 3) {
                    if (i8 < 0) {
                        if (i8 != -2) {
                            if (i8 != -1) {
                                break;
                            }
                        } else {
                            bArr[i5 + 1] = (byte) (i4 >> 2);
                            bArr[i5] = (byte) (i4 >> 10);
                            i5 += 2;
                            i3 = 5;
                        }
                    } else {
                        i4 = (i4 << 6) | i8;
                        bArr[i5 + 2] = (byte) i4;
                        bArr[i5 + 1] = (byte) (i4 >> 8);
                        bArr[i5] = (byte) (i4 >> 16);
                        i5 += 3;
                        i3 = 0;
                    }
                    i2 = i7;
                } else if (i3 == 4) {
                    if (i8 != -2) {
                        if (i8 != -1) {
                            break;
                        }
                        i2 = i7;
                    }
                } else {
                    if (i3 == 5 && i8 != -1) {
                        break;
                    }
                    i2 = i7;
                }
                i3++;
                i2 = i7;
            } else {
                if (i8 < 0) {
                    if (i8 != -1) {
                        break;
                    }
                } else {
                    i3++;
                    i4 = i8;
                }
                i2 = i7;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                bArr[i5] = (byte) (i4 >> 4);
                i5++;
            } else if (i3 == 3) {
                int i9 = i5 + 1;
                bArr[i5] = (byte) (i4 >> 10);
                i5 += 2;
                bArr[i9] = (byte) (i4 >> 2);
            }
            if (i5 == i) {
                return bArr;
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, 0, i5);
            return bArr2;
        }
        throw new IllegalArgumentException(StringFog.decrypt("eW8Te/x60hw2OEM=\n", "Gw53W54boXk=\n"));
    }
}
