package yads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class by0 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final void a(ht1 ht1Var) {
        int i = 0;
        while (true) {
            gt1[] gt1VarArr = ht1Var.b;
            if (i >= gt1VarArr.length) {
                return;
            }
            gt1 gt1Var = gt1VarArr[i];
            if (gt1Var instanceof ix) {
                ix ixVar = (ix) gt1Var;
                if ("iTunSMPB".equals(ixVar.d) && a(ixVar.e)) {
                    return;
                }
            } else if (gt1Var instanceof nb1) {
                nb1 nb1Var = (nb1) gt1Var;
                if ("com.apple.iTunes".equals(nb1Var.c) && "iTunSMPB".equals(nb1Var.d) && a(nb1Var.e)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = sb3.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
