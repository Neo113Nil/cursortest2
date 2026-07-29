package o;

import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: o.k9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1347k9 implements Serializable, Comparable {
    public static final C1347k9 k = new C1347k9(new byte[0]);
    public final byte[] h;
    public transient int i;
    public transient String j;

    public C1347k9(byte[] bArr) {
        AbstractC0048Bt.n(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.h = bArr;
    }

    public static int e(C1347k9 c1347k9, C1347k9 c1347k92) {
        c1347k9.getClass();
        AbstractC0048Bt.n(c1347k92, "other");
        return c1347k9.d(c1347k92.f(), 0);
    }

    public static int i(C1347k9 c1347k9, C1347k9 c1347k92) {
        c1347k9.getClass();
        AbstractC0048Bt.n(c1347k92, "other");
        return c1347k9.h(c1347k92.f());
    }

    public static /* synthetic */ C1347k9 m(C1347k9 c1347k9, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return c1347k9.l(i, i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1347k9 c1347k9) {
        AbstractC0048Bt.n(c1347k9, "other");
        int b = b();
        int b2 = c1347k9.b();
        int min = Math.min(b, b2);
        for (int i = 0; i < min; i++) {
            int g = g(i) & 255;
            int g2 = c1347k9.g(i) & 255;
            if (g != g2) {
                return g < g2 ? -1 : 1;
            }
        }
        if (b == b2) {
            return 0;
        }
        return b < b2 ? -1 : 1;
    }

    public int b() {
        return this.h.length;
    }

    public String c() {
        byte[] bArr = this.h;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC1473m3.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int d(byte[] bArr, int i) {
        AbstractC0048Bt.n(bArr, "other");
        byte[] bArr2 = this.h;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!EB.e(max, 0, bArr.length, bArr2, bArr)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1347k9) {
            C1347k9 c1347k9 = (C1347k9) obj;
            int b = c1347k9.b();
            byte[] bArr = this.h;
            if (b == bArr.length && c1347k9.j(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.h;
    }

    public byte g(int i) {
        return this.h[i];
    }

    public int h(byte[] bArr) {
        AbstractC0048Bt.n(bArr, "other");
        int b = b();
        byte[] bArr2 = this.h;
        for (int min = Math.min(b, bArr2.length - bArr.length); -1 < min; min--) {
            if (EB.e(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i = this.i;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.h);
        this.i = hashCode;
        return hashCode;
    }

    public boolean j(int i, int i2, int i3, byte[] bArr) {
        AbstractC0048Bt.n(bArr, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.h;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && EB.e(i, i2, i3, bArr2, bArr);
    }

    public boolean k(int i, C1347k9 c1347k9, int i2) {
        AbstractC0048Bt.n(c1347k9, "other");
        return c1347k9.j(0, i, i2, this.h);
    }

    public C1347k9 l(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = b();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.h;
        if (i2 <= bArr.length) {
            if (i2 - i >= 0) {
                return (i == 0 && i2 == bArr.length) ? this : new C1347k9(P6.e0(bArr, i, i2));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }

    public C1347k9 n() {
        int i = 0;
        while (true) {
            byte[] bArr = this.h;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC0048Bt.m(copyOf, "copyOf(...)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C1347k9(copyOf);
            }
            i++;
        }
    }

    public final String o() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        byte[] f = f();
        AbstractC0048Bt.n(f, "<this>");
        String str2 = new String(f, AbstractC0470Sa.a);
        this.j = str2;
        return str2;
    }

    public void p(G8 g8, int i) {
        g8.m5write(this.h, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.h;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 > i9 || i9 >= 57344) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            i2 += 4;
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 != -1) {
            String o2 = o();
            String substring = o2.substring(0, i3);
            AbstractC0048Bt.m(substring, "substring(...)");
            String z = AbstractC0778bU.z(AbstractC0778bU.z(AbstractC0778bU.z(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= o2.length()) {
                return "[text=" + z + ']';
            }
            return "[size=" + bArr.length + " text=" + z + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 <= bArr.length) {
            sb.append((64 == bArr.length ? this : new C1347k9(P6.e0(bArr, 0, 64))).c());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }
}
