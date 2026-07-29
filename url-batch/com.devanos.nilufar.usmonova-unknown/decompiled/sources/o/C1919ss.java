package o;

/* renamed from: o.ss, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1919ss {
    public static final /* synthetic */ int e = 0;
    public final boolean a;
    public final int b;
    public final int c;
    public final FA d;

    static {
        new C1919ss();
    }

    public C1919ss() {
        FA fa = FA.j;
        this.a = true;
        this.b = 1;
        this.c = 1;
        this.d = fa;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1919ss)) {
            return false;
        }
        C1919ss c1919ss = (C1919ss) obj;
        c1919ss.getClass();
        return this.a == c1919ss.a && this.b == c1919ss.b && this.c == c1919ss.c && AbstractC0048Bt.h(this.d, c1919ss.d);
    }

    public final int hashCode() {
        return this.d.h.hashCode() + ((Integer.hashCode(this.c) + ((Integer.hashCode(this.b) + ((Boolean.hashCode(this.a) + ((Integer.hashCode(0) + (Boolean.hashCode(false) * 31)) * 31)) * 31)) * 31)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb.append((Object) "None");
        sb.append(", autoCorrect=");
        sb.append(this.a);
        sb.append(", keyboardType=");
        int i = this.b;
        sb.append((Object) (i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i2 = this.c;
        if (i2 == -1) {
            str = "Unspecified";
        } else if (i2 != 0) {
            str = i2 == 1 ? "Default" : i2 == 2 ? "Go" : i2 == 3 ? "Search" : i2 == 4 ? "Send" : i2 == 5 ? "Previous" : i2 == 6 ? "Next" : i2 == 7 ? "Done" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
