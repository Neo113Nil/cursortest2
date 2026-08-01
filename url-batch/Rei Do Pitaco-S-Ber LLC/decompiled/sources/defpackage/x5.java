package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class x5 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final e20 h = new e20(0);
    public final Object[] a = new Object[2];

    public c3 a(Context context, AttributeSet attributeSet) {
        return new c3(context, attributeSet);
    }

    public d3 b(Context context, AttributeSet attributeSet) {
        return new d3(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.buttonStyle);
    }

    public f3 c(Context context, AttributeSet attributeSet) {
        return new f3(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.checkboxStyle);
    }

    public p4 d(Context context, AttributeSet attributeSet) {
        return new p4(context, attributeSet);
    }

    public p5 e(Context context, AttributeSet attributeSet) {
        return new p5(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        e20 e20Var = h;
        Constructor constructor = (Constructor) e20Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            e20Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
