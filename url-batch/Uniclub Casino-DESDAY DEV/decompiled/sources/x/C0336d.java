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
import w.AbstractC0327a;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0333a f4100a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4101b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4102c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4103e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4104f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4105g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4106j;

    /* renamed from: k, reason: collision with root package name */
    public View f4107k;

    /* renamed from: l, reason: collision with root package name */
    public View f4108l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4109m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4110n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4111o;

    public C0336d() {
        super(-2, -2);
        this.f4101b = false;
        this.f4102c = 0;
        this.d = 0;
        this.f4103e = -1;
        this.f4104f = -1;
        this.f4105g = 0;
        this.h = 0;
        this.f4111o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f4109m;
        }
        if (i != 1) {
            return false;
        }
        return this.f4110n;
    }

    public C0336d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0333a abstractC0333a;
        this.f4101b = false;
        this.f4102c = 0;
        this.d = 0;
        this.f4103e = -1;
        this.f4104f = -1;
        this.f4105g = 0;
        this.h = 0;
        this.f4111o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0327a.f4088b);
        this.f4102c = obtainStyledAttributes.getInteger(0, 0);
        this.f4104f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f4103e = obtainStyledAttributes.getInteger(6, -1);
        this.f4105g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f4101b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1267t;
            if (TextUtils.isEmpty(string)) {
                abstractC0333a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1267t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1269v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1268u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0333a = (AbstractC0333a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4100a = abstractC0333a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0333a abstractC0333a2 = this.f4100a;
        if (abstractC0333a2 != null) {
            abstractC0333a2.c(this);
        }
    }

    public C0336d(C0336d c0336d) {
        super((ViewGroup.MarginLayoutParams) c0336d);
        this.f4101b = false;
        this.f4102c = 0;
        this.d = 0;
        this.f4103e = -1;
        this.f4104f = -1;
        this.f4105g = 0;
        this.h = 0;
        this.f4111o = new Rect();
    }

    public C0336d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4101b = false;
        this.f4102c = 0;
        this.d = 0;
        this.f4103e = -1;
        this.f4104f = -1;
        this.f4105g = 0;
        this.h = 0;
        this.f4111o = new Rect();
    }

    public C0336d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4101b = false;
        this.f4102c = 0;
        this.d = 0;
        this.f4103e = -1;
        this.f4104f = -1;
        this.f4105g = 0;
        this.h = 0;
        this.f4111o = new Rect();
    }
}
