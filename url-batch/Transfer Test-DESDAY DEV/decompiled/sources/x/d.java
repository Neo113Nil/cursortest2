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
import w.AbstractC0344a;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0346a f4050a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4051b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4052c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4053e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4054f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4055g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4056j;

    /* renamed from: k, reason: collision with root package name */
    public View f4057k;

    /* renamed from: l, reason: collision with root package name */
    public View f4058l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4059m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4060n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4061o;

    public d() {
        super(-2, -2);
        this.f4051b = false;
        this.f4052c = 0;
        this.d = 0;
        this.f4053e = -1;
        this.f4054f = -1;
        this.f4055g = 0;
        this.h = 0;
        this.f4061o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4059m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4060n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0346a abstractC0346a;
        this.f4051b = false;
        this.f4052c = 0;
        this.d = 0;
        this.f4053e = -1;
        this.f4054f = -1;
        this.f4055g = 0;
        this.h = 0;
        this.f4061o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0344a.f4047b);
        this.f4052c = obtainStyledAttributes.getInteger(0, 0);
        this.f4054f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4053e = obtainStyledAttributes.getInteger(6, -1);
        this.f4055g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4051b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1415t;
            if (TextUtils.isEmpty(string)) {
                abstractC0346a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1415t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1417v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1416u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0346a = (AbstractC0346a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4050a = abstractC0346a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0346a abstractC0346a2 = this.f4050a;
        if (abstractC0346a2 != null) {
            abstractC0346a2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f4051b = false;
        this.f4052c = 0;
        this.d = 0;
        this.f4053e = -1;
        this.f4054f = -1;
        this.f4055g = 0;
        this.h = 0;
        this.f4061o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4051b = false;
        this.f4052c = 0;
        this.d = 0;
        this.f4053e = -1;
        this.f4054f = -1;
        this.f4055g = 0;
        this.h = 0;
        this.f4061o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4051b = false;
        this.f4052c = 0;
        this.d = 0;
        this.f4053e = -1;
        this.f4054f = -1;
        this.f4055g = 0;
        this.h = 0;
        this.f4061o = new Rect();
    }
}
