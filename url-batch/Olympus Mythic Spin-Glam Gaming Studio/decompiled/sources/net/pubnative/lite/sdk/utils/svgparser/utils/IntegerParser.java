package net.pubnative.lite.sdk.utils.svgparser.utils;

/* loaded from: classes4.dex */
class IntegerParser {
    private final int pos;
    private final long value;

    IntegerParser(long j, int i) {
        this.value = j;
        this.pos = i;
    }

    static IntegerParser parseHex(String str, int i, int i2) {
        long j;
        int i3;
        if (i >= i2) {
            return null;
        }
        long j2 = 0;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                if (charAt >= 'A' && charAt <= 'F') {
                    j = j2 * 16;
                    i3 = charAt - 'A';
                } else {
                    if (charAt < 'a' || charAt > 'f') {
                        break;
                    }
                    j = j2 * 16;
                    i3 = charAt - 'a';
                }
                j2 = j + i3 + 10;
            } else {
                j2 = (j2 * 16) + (charAt - '0');
            }
            if (j2 > 4294967295L) {
                return null;
            }
            i4++;
        }
        if (i4 == i) {
            return null;
        }
        return new IntegerParser(j2, i4);
    }

    static IntegerParser parseInt(String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return null;
        }
        if (z) {
            char charAt = str.charAt(i);
            if (charAt != '+') {
                r1 = charAt == '-';
            }
            i++;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt2 = str.charAt(i3);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            long j2 = j * 10;
            long j3 = charAt2 - '0';
            if (r1) {
                j = j2 - j3;
                if (j < -2147483648L) {
                    return null;
                }
            } else {
                j = j2 + j3;
                if (j > 2147483647L) {
                    return null;
                }
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new IntegerParser(j, i3);
    }

    int getEndPos() {
        return this.pos;
    }

    public int value() {
        return (int) this.value;
    }
}
