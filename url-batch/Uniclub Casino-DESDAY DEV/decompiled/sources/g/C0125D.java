package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0198E;
import l.C0219d0;
import l.C0242p;
import l.C0246r;
import l.C0248s;

/* renamed from: g.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0125D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2250b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2251c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2252e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2253f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2254g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2255a = new Object[2];

    public C0242p a(Context context, AttributeSet attributeSet) {
        return new C0242p(context, attributeSet);
    }

    public C0246r b(Context context, AttributeSet attributeSet) {
        return new C0246r(context, attributeSet, com.fortuneodd.shadegrid.R.attr.buttonStyle);
    }

    public C0248s c(Context context, AttributeSet attributeSet) {
        return new C0248s(context, attributeSet, com.fortuneodd.shadegrid.R.attr.checkboxStyle);
    }

    public C0198E d(Context context, AttributeSet attributeSet) {
        return new C0198E(context, attributeSet);
    }

    public C0219d0 e(Context context, AttributeSet attributeSet) {
        return new C0219d0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        o.k kVar = h;
        Constructor constructor = (Constructor) kVar.getOrDefault(str, null);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2250b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2255a);
    }
}
