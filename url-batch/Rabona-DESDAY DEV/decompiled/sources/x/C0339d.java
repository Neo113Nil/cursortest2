package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import w.AbstractC0330a;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0336a f4177a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4178b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4179c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4180e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4181f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4182g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4183j;

    /* renamed from: k, reason: collision with root package name */
    public View f4184k;

    /* renamed from: l, reason: collision with root package name */
    public View f4185l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4186m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4187n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4188o;

    public C0339d() {
        super(-2, -2);
        this.f4178b = false;
        this.f4179c = 0;
        this.d = 0;
        this.f4180e = -1;
        this.f4181f = -1;
        this.f4182g = 0;
        this.h = 0;
        this.f4188o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4186m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4187n;
    }

    public C0339d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0336a abstractC0336a;
        this.f4178b = false;
        this.f4179c = 0;
        this.d = 0;
        this.f4180e = -1;
        this.f4181f = -1;
        this.f4182g = 0;
        this.h = 0;
        this.f4188o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0330a.f4112b);
        this.f4179c = obtainStyledAttributes.getInteger(0, 0);
        this.f4181f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4180e = obtainStyledAttributes.getInteger(6, -1);
        this.f4182g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4178b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1268t;
            if (TextUtils.isEmpty(string)) {
                abstractC0336a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1268t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1270v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1269u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0336a = (AbstractC0336a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4177a = abstractC0336a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0336a abstractC0336a2 = this.f4177a;
        if (abstractC0336a2 != null) {
            abstractC0336a2.c(this);
        }
    }

    public C0339d(C0339d c0339d) {
        super((ViewGroup.MarginLayoutParams) c0339d);
        this.f4178b = false;
        this.f4179c = 0;
        this.d = 0;
        this.f4180e = -1;
        this.f4181f = -1;
        this.f4182g = 0;
        this.h = 0;
        this.f4188o = new Rect();
    }

    public C0339d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4178b = false;
        this.f4179c = 0;
        this.d = 0;
        this.f4180e = -1;
        this.f4181f = -1;
        this.f4182g = 0;
        this.h = 0;
        this.f4188o = new Rect();
    }

    public C0339d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4178b = false;
        this.f4179c = 0;
        this.d = 0;
        this.f4180e = -1;
        this.f4181f = -1;
        this.f4182g = 0;
        this.h = 0;
        this.f4188o = new Rect();
    }
}
