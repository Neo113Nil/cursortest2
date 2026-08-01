package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class kq {
    public static final kq b = new kq(new dx0((xq) null, (ch0) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 63));
    public final dx0 a;

    public kq(dx0 dx0Var) {
        this.a = dx0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kq) && ((kq) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        xq xqVar = this.a.a;
        sb.append(xqVar != null ? xqVar.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
