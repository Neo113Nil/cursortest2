package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class di0 {
    public static final di0 b = new di0(new wd());
    public final wd a;

    public di0(wd wdVar) {
        this.a = wdVar;
        if (Float.isNaN(0.0f)) {
            g8.r("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof di0) && this.a.equals(((di0) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() + (Float.floatToIntBits(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.a + ", steps=0)";
    }
}
