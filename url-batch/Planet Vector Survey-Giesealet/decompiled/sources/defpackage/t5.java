package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class t5 {
    public final XmlPullParser a;
    public int b = 0;
    public final z1 c;

    public t5(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        z1 z1Var = new z1();
        z1Var.b = new float[64];
        this.c = z1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r8 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a7 a(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        a7 a7Var;
        if (ud0.m(this.a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    a7Var = a7.c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    a7Var = null;
                }
            } else {
                a7Var = new a7(typedValue.data, 1, null);
            }
            c(typedArray.getChangingConfigurations());
            return a7Var;
        }
        a7Var = new a7(0, 1, null);
        c(typedArray.getChangingConfigurations());
        return a7Var;
    }

    public final float b(TypedArray typedArray, String str, int i, float f) {
        if (ud0.m(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        c(typedArray.getChangingConfigurations());
        return f;
    }

    public final void c(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return nz.l(this.a, t5Var.a) && this.b == t5Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.b + ')';
    }
}
