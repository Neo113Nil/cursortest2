package o;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: o.aN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705aN implements Serializable {
    public final Pattern h;

    public C0705aN(String str) {
        Pattern compile = Pattern.compile(str);
        AbstractC0048Bt.m(compile, "compile(...)");
        this.h = compile;
    }

    public final String toString() {
        String pattern = this.h.toString();
        AbstractC0048Bt.m(pattern, "toString(...)");
        return pattern;
    }
}
