package o;

import android.text.TextUtils;

/* renamed from: o.Rn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457Rn implements InterfaceC0531Uj {
    public static final C0457Rn j;
    public static final C0457Rn k;
    public static final C0457Rn l;
    public static final C0457Rn m;
    public static final C0457Rn n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0457Rn f99o;
    public final /* synthetic */ int h;
    public final String i;

    static {
        int i = 0;
        j = new C0457Rn("NONE", i);
        k = new C0457Rn("FULL", i);
        int i2 = 1;
        l = new C0457Rn("FLAT", i2);
        m = new C0457Rn("HALF_OPENED", i2);
        int i3 = 2;
        n = new C0457Rn("FOLD", i3);
        f99o = new C0457Rn("HINGE", i3);
    }

    public /* synthetic */ C0457Rn(String str, int i) {
        this.h = i;
        this.i = str;
    }

    public String toString() {
        switch (this.h) {
            case 0:
                return this.i;
            case 1:
                return this.i;
            case 2:
                return this.i;
            case 3:
            default:
                return super.toString();
            case 4:
                return this.i;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return AbstractC2188wx.h(new StringBuilder("<"), this.i, '>');
        }
    }

    @Override // o.InterfaceC0531Uj
    public boolean u(CharSequence charSequence, int i, int i2, HX hx) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.i)) {
            return true;
        }
        hx.c = (hx.c & 3) | 4;
        return false;
    }

    @Override // o.InterfaceC0531Uj
    public Object b() {
        return this;
    }
}
