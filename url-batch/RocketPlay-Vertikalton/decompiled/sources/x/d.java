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
import w.AbstractC0377a;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0379a f4447a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4448b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4449c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4450e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4451f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4452g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4453j;

    /* renamed from: k, reason: collision with root package name */
    public View f4454k;

    /* renamed from: l, reason: collision with root package name */
    public View f4455l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4456m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4457n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4458o;

    public d() {
        super(-2, -2);
        this.f4448b = false;
        this.f4449c = 0;
        this.d = 0;
        this.f4450e = -1;
        this.f4451f = -1;
        this.f4452g = 0;
        this.h = 0;
        this.f4458o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4456m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4457n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0379a abstractC0379a;
        this.f4448b = false;
        this.f4449c = 0;
        this.d = 0;
        this.f4450e = -1;
        this.f4451f = -1;
        this.f4452g = 0;
        this.h = 0;
        this.f4458o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0377a.f4412b);
        this.f4449c = obtainStyledAttributes.getInteger(0, 0);
        this.f4451f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4450e = obtainStyledAttributes.getInteger(6, -1);
        this.f4452g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4448b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1801t;
            if (TextUtils.isEmpty(string)) {
                abstractC0379a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1801t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1803v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1802u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0379a = (AbstractC0379a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4447a = abstractC0379a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0379a abstractC0379a2 = this.f4447a;
        if (abstractC0379a2 != null) {
            abstractC0379a2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f4448b = false;
        this.f4449c = 0;
        this.d = 0;
        this.f4450e = -1;
        this.f4451f = -1;
        this.f4452g = 0;
        this.h = 0;
        this.f4458o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4448b = false;
        this.f4449c = 0;
        this.d = 0;
        this.f4450e = -1;
        this.f4451f = -1;
        this.f4452g = 0;
        this.h = 0;
        this.f4458o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4448b = false;
        this.f4449c = 0;
        this.d = 0;
        this.f4450e = -1;
        this.f4451f = -1;
        this.f4452g = 0;
        this.h = 0;
        this.f4458o = new Rect();
    }
}
