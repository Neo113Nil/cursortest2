package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class i63 {
    public static final Pattern b = Pattern.compile("\\s+");
    public static final q41 c = q41.b(2, "auto", "none");
    public static final q41 d = q41.b(3, "dot", "sesame", "circle");
    public static final q41 e = q41.b(2, "filled", "open");
    public static final q41 f = q41.b(3, "after", "before", "outside");
    public final int a;

    public i63(int i, int i2, int i3) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x015a, code lost:
    
        if (r3.equals("dot") != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i63 a(String str) {
        boolean z;
        int i;
        int hashCode;
        if (str == null) {
            return null;
        }
        String a = lh.a(str.trim());
        if (a.isEmpty()) {
            return null;
        }
        String[] split = TextUtils.split(a, b);
        int length = split.length;
        boolean z2 = false;
        int i2 = 1;
        q41 b2 = length != 0 ? length != 1 ? q41.b(split.length, (Object[]) split.clone()) : new i03(split[0]) : an2.j;
        q41 q41Var = f;
        if (q41Var == null) {
            throw new NullPointerException("set1");
        }
        if (b2 == null) {
            throw new NullPointerException("set2");
        }
        vy2 vy2Var = new vy2(new wy2(q41Var, b2));
        String str2 = (String) (vy2Var.hasNext() ? vy2Var.next() : "outside");
        int hashCode2 = str2.hashCode();
        int i3 = -1;
        if (hashCode2 == -1392885889) {
            if (str2.equals("before")) {
                z = 2;
            }
            z = -1;
        } else if (hashCode2 != -1106037339) {
            if (hashCode2 == 92734940 && str2.equals("after")) {
                z = false;
            }
            z = -1;
        } else {
            if (str2.equals("outside")) {
                z = true;
            }
            z = -1;
        }
        int i4 = z ? !z ? 1 : -2 : 2;
        q41 q41Var2 = c;
        if (q41Var2 == null) {
            throw new NullPointerException("set1");
        }
        wy2 wy2Var = new wy2(q41Var2, b2);
        if (!Collections.disjoint(b2, q41Var2)) {
            String str3 = (String) new vy2(wy2Var).next();
            int hashCode3 = str3.hashCode();
            if (hashCode3 == 3005871) {
                str3.equals("auto");
            } else if (hashCode3 == 3387192 && str3.equals("none")) {
                i3 = 0;
            }
            return new i63(i3, 0, i4);
        }
        q41 q41Var3 = e;
        if (q41Var3 == null) {
            throw new NullPointerException("set1");
        }
        wy2 wy2Var2 = new wy2(q41Var3, b2);
        q41 q41Var4 = d;
        if (q41Var4 == null) {
            throw new NullPointerException("set1");
        }
        wy2 wy2Var3 = new wy2(q41Var4, b2);
        if (Collections.disjoint(b2, q41Var3) && Collections.disjoint(b2, q41Var4)) {
            return new i63(-1, 0, i4);
        }
        vy2 vy2Var2 = new vy2(wy2Var2);
        String str4 = (String) (vy2Var2.hasNext() ? vy2Var2.next() : "filled");
        int hashCode4 = str4.hashCode();
        if (hashCode4 == -1274499742) {
            str4.equals("filled");
        } else if (hashCode4 == 3417674 && str4.equals("open")) {
            i = 2;
            vy2 vy2Var3 = new vy2(wy2Var3);
            String str5 = (String) (!vy2Var3.hasNext() ? vy2Var3.next() : "circle");
            hashCode = str5.hashCode();
            if (hashCode != -1360216880) {
                if (str5.equals("circle")) {
                    z2 = 2;
                }
                z2 = -1;
            } else if (hashCode != -905816648) {
                if (hashCode == 99657) {
                }
                z2 = -1;
            } else {
                if (str5.equals("sesame")) {
                    z2 = true;
                }
                z2 = -1;
            }
            if (z2) {
                i2 = 2;
            } else if (z2) {
                i2 = 3;
            }
            return new i63(i2, i, i4);
        }
        i = 1;
        vy2 vy2Var32 = new vy2(wy2Var3);
        String str52 = (String) (!vy2Var32.hasNext() ? vy2Var32.next() : "circle");
        hashCode = str52.hashCode();
        if (hashCode != -1360216880) {
        }
        if (z2) {
        }
        return new i63(i2, i, i4);
    }
}
