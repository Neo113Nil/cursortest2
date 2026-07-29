package o;

import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class FB extends B {
    public final /* synthetic */ C0208Hx h;

    public FB(C0208Hx c0208Hx) {
        this.h = c0208Hx;
    }

    @Override // o.r, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String group = ((Matcher) this.h.i).group(i);
        return group == null ? "" : group;
    }

    @Override // o.B, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // o.r
    public final int j() {
        return ((Matcher) this.h.i).groupCount() + 1;
    }

    @Override // o.B, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
