package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import java.lang.reflect.Constructor;
import l.C0181C;
import l.C0201b0;
import l.C0226o;
import l.C0230q;

/* renamed from: g.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0093B {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2164b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2165c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2166e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2167f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2168g = {"android.widget.", "android.view.", "android.webkit."};
    public static final o.k h = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2169a = new Object[2];

    public C0226o a(Context context, AttributeSet attributeSet) {
        return new C0226o(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public C0230q c(Context context, AttributeSet attributeSet) {
        return new C0230q(context, attributeSet, com.football.transfertrivia.R.attr.checkboxStyle);
    }

    public C0181C d(Context context, AttributeSet attributeSet) {
        return new C0181C(context, attributeSet);
    }

    public C0201b0 e(Context context, AttributeSet attributeSet) {
        return new C0201b0(context, attributeSet);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2164b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2169a);
    }
}
