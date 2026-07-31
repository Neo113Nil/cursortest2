package yads;

import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class to3 {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static long a(String str) {
        int i = sb3.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static void a(xb2 xb2Var) {
        int i = xb2Var.b;
        String b = xb2Var.b();
        if (b == null || !b.startsWith("WEBVTT")) {
            xb2Var.e(i);
            throw new cc2("Expected WEBVTT. Got " + xb2Var.b(), null, true, 1);
        }
    }
}
