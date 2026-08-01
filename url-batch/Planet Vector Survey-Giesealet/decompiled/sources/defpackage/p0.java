package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p0 extends m0 {
    public static p0 c;

    @Override // defpackage.m0
    public final int[] a(int i) {
        int length = c().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && c().charAt(i) == '\n' && (c().charAt(i) == '\n' || (i != 0 && c().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !e(i2)) {
            i2++;
        }
        return b(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // defpackage.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] d(int i) {
        int length = c().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && c().charAt(i - 1) == '\n' && !e(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (c().charAt(i2) == '\n' || (i2 != 0 && c().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return b(i2, i);
    }

    public final boolean e(int i) {
        if (i <= 0 || c().charAt(i - 1) == '\n') {
            return false;
        }
        return i == c().length() || c().charAt(i) == '\n';
    }
}
