package yads;

/* loaded from: classes4.dex */
public final class xt extends wt {
    public final char b;

    public xt(char c) {
        this.b = c;
    }

    @Override // yads.wt
    public final boolean a(char c) {
        return c == this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char c = this.b;
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
