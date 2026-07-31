package yads;

/* loaded from: classes5.dex */
public final class qj0 {
    public final String a;

    public qj0(String str) {
        this.a = str;
    }

    public static qj0 a(xb2 xb2Var) {
        String str;
        xb2Var.e(xb2Var.b + 2);
        int k = xb2Var.k();
        int i = k >> 1;
        int k2 = ((xb2Var.k() >> 3) & 31) | ((k & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(k2 >= 10 ? "." : ".0");
        sb.append(k2);
        return new qj0(sb.toString());
    }
}
