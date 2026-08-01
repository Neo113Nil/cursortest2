package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C0224D;
import l.C0244c0;
import l.C0269p;
import l.C0273r;
import l.C0275s;

/* renamed from: g.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0115C {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2587b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2588c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2589e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2590f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2591g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2592a = new Object[2];

    public C0269p a(Context context, AttributeSet attributeSet) {
        return new C0269p(context, attributeSet);
    }

    public C0273r b(Context context, AttributeSet attributeSet) {
        return new C0273r(context, attributeSet, com.luckycounter.drinkwater.R.attr.buttonStyle);
    }

    public C0275s c(Context context, AttributeSet attributeSet) {
        return new C0275s(context, attributeSet, com.luckycounter.drinkwater.R.attr.checkboxStyle);
    }

    public C0224D d(Context context, AttributeSet attributeSet) {
        return new C0224D(context, attributeSet);
    }

    public C0244c0 e(Context context, AttributeSet attributeSet) {
        return new C0244c0(context, attributeSet);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2587b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2592a);
    }
}
