package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wq {
    public static final wq b = new wq(new dx0((xq) null, (ch0) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 63));
    public static final wq c = new wq(new dx0((xq) (0 == true ? 1 : 0), (ch0) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 47));
    public final dx0 a;

    public wq(dx0 dx0Var) {
        this.a = dx0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wq) && ((wq) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        dx0 dx0Var = this.a;
        xq xqVar = dx0Var.a;
        sb.append(xqVar != null ? xqVar.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(dx0Var.b);
        return sb.toString();
    }
}
