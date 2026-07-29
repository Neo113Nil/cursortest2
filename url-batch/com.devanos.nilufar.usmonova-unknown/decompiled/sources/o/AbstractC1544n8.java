package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.n8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1544n8 {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static byte[] a(String[] strArr) {
        if (strArr == null) {
            Object[] objArr = new Object[3];
            objArr[0] = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
            switch (7) {
                case 1:
                case 3:
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                case 8:
                case 10:
                case 12:
                case 14:
                    break;
                case 2:
                    objArr[2] = "encode8to7";
                    break;
                case 4:
                    objArr[2] = "addModuloByte";
                    break;
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    objArr[2] = "splitBytesToStringArray";
                    break;
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[2] = "decodeBytes";
                    break;
                case 9:
                    objArr[2] = "dropMarker";
                    break;
                case 11:
                    objArr[2] = "combineStringArrayIntoBytes";
                    break;
                case 13:
                    objArr[2] = "decode7to8";
                    break;
                default:
                    objArr[2] = "encodeBytes";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                int i = 0;
                for (String str : strArr2) {
                    i += str.length();
                }
                byte[] bArr = new byte[i];
                int i2 = 0;
                for (String str2 : strArr2) {
                    int length = str2.length();
                    int i3 = 0;
                    while (i3 < length) {
                        bArr[i2] = (byte) str2.charAt(i3);
                        i3++;
                        i2++;
                    }
                }
                return bArr;
            }
            if (charAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int i4 = 0;
        for (String str3 : strArr) {
            i4 += str3.length();
        }
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (String str4 : strArr) {
            int length2 = str4.length();
            int i6 = 0;
            while (i6 < length2) {
                bArr2[i5] = (byte) str4.charAt(i6);
                i6++;
                i5++;
            }
        }
        for (int i7 = 0; i7 < i4; i7++) {
            bArr2[i7] = (byte) ((bArr2[i7] + Byte.MAX_VALUE) & 127);
        }
        int i8 = (i4 * 7) / 8;
        byte[] bArr3 = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = i9 + 1;
            int i13 = i10 + 1;
            bArr3[i11] = (byte) (((bArr2[i9] & 255) >>> i10) + ((bArr2[i12] & ((1 << i13) - 1)) << (7 - i10)));
            if (i10 == 6) {
                i9 += 2;
                i10 = 0;
            } else {
                i9 = i12;
                i10 = i13;
            }
        }
        return bArr3;
    }
}
