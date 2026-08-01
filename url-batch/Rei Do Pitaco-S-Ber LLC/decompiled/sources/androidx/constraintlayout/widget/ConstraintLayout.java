package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a20;
import defpackage.cj;
import defpackage.d7;
import defpackage.ex;
import defpackage.g8;
import defpackage.gc;
import defpackage.gm;
import defpackage.hc;
import defpackage.hm;
import defpackage.ic;
import defpackage.jc;
import defpackage.kc;
import defpackage.l9;
import defpackage.lc;
import defpackage.o4;
import defpackage.pm;
import defpackage.q70;
import defpackage.sc;
import defpackage.tc;
import defpackage.tm;
import defpackage.uc;
import defpackage.vc;
import defpackage.vp;
import defpackage.w90;
import defpackage.y5;
import defpackage.ye;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static a20 u;
    public final SparseArray f;
    public final ArrayList g;
    public final uc h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public sc o;
    public o4 p;
    public int q;
    public HashMap r;
    public final SparseArray s;
    public final jc t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new uc();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = true;
        this.n = 257;
        this.o = null;
        this.p = null;
        this.q = -1;
        this.r = new HashMap();
        this.s = new SparseArray();
        this.t = new jc(this, this);
        i(attributeSet, 0);
    }

    public static ic g() {
        ic icVar = new ic(-2, -2);
        icVar.a = -1;
        icVar.b = -1;
        icVar.c = -1.0f;
        icVar.d = true;
        icVar.e = -1;
        icVar.f = -1;
        icVar.g = -1;
        icVar.h = -1;
        icVar.i = -1;
        icVar.j = -1;
        icVar.k = -1;
        icVar.l = -1;
        icVar.m = -1;
        icVar.n = -1;
        icVar.o = -1;
        icVar.p = -1;
        icVar.q = 0;
        icVar.r = 0.0f;
        icVar.s = -1;
        icVar.t = -1;
        icVar.u = -1;
        icVar.v = -1;
        icVar.w = Integer.MIN_VALUE;
        icVar.x = Integer.MIN_VALUE;
        icVar.y = Integer.MIN_VALUE;
        icVar.z = Integer.MIN_VALUE;
        icVar.A = Integer.MIN_VALUE;
        icVar.B = Integer.MIN_VALUE;
        icVar.C = Integer.MIN_VALUE;
        icVar.D = 0;
        icVar.E = 0.5f;
        icVar.F = 0.5f;
        icVar.G = null;
        icVar.H = -1.0f;
        icVar.I = -1.0f;
        icVar.J = 0;
        icVar.K = 0;
        icVar.L = 0;
        icVar.M = 0;
        icVar.N = 0;
        icVar.O = 0;
        icVar.P = 0;
        icVar.Q = 0;
        icVar.R = 1.0f;
        icVar.S = 1.0f;
        icVar.T = -1;
        icVar.U = -1;
        icVar.V = -1;
        icVar.W = false;
        icVar.X = false;
        icVar.Y = null;
        icVar.Z = 0;
        icVar.a0 = true;
        icVar.b0 = true;
        icVar.c0 = false;
        icVar.d0 = false;
        icVar.e0 = false;
        icVar.f0 = -1;
        icVar.g0 = -1;
        icVar.h0 = -1;
        icVar.i0 = -1;
        icVar.j0 = Integer.MIN_VALUE;
        icVar.k0 = Integer.MIN_VALUE;
        icVar.l0 = 0.5f;
        icVar.p0 = new tc();
        return icVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static a20 getSharedValues() {
        if (u == null) {
            a20 a20Var = new a20();
            new SparseIntArray();
            new HashMap();
            u = a20Var;
        }
        return u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ic;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((gc) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.m = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ic icVar = new ic(context, attributeSet);
        icVar.a = -1;
        icVar.b = -1;
        icVar.c = -1.0f;
        icVar.d = true;
        icVar.e = -1;
        icVar.f = -1;
        icVar.g = -1;
        icVar.h = -1;
        icVar.i = -1;
        icVar.j = -1;
        icVar.k = -1;
        icVar.l = -1;
        icVar.m = -1;
        icVar.n = -1;
        icVar.o = -1;
        icVar.p = -1;
        icVar.q = 0;
        icVar.r = 0.0f;
        icVar.s = -1;
        icVar.t = -1;
        icVar.u = -1;
        icVar.v = -1;
        icVar.w = Integer.MIN_VALUE;
        icVar.x = Integer.MIN_VALUE;
        icVar.y = Integer.MIN_VALUE;
        icVar.z = Integer.MIN_VALUE;
        icVar.A = Integer.MIN_VALUE;
        icVar.B = Integer.MIN_VALUE;
        icVar.C = Integer.MIN_VALUE;
        icVar.D = 0;
        icVar.E = 0.5f;
        icVar.F = 0.5f;
        icVar.G = null;
        icVar.H = -1.0f;
        icVar.I = -1.0f;
        icVar.J = 0;
        icVar.K = 0;
        icVar.L = 0;
        icVar.M = 0;
        icVar.N = 0;
        icVar.O = 0;
        icVar.P = 0;
        icVar.Q = 0;
        icVar.R = 1.0f;
        icVar.S = 1.0f;
        icVar.T = -1;
        icVar.U = -1;
        icVar.V = -1;
        icVar.W = false;
        icVar.X = false;
        icVar.Y = null;
        icVar.Z = 0;
        icVar.a0 = true;
        icVar.b0 = true;
        icVar.c0 = false;
        icVar.d0 = false;
        icVar.e0 = false;
        icVar.f0 = -1;
        icVar.g0 = -1;
        icVar.h0 = -1;
        icVar.i0 = -1;
        icVar.j0 = Integer.MIN_VALUE;
        icVar.k0 = Integer.MIN_VALUE;
        icVar.l0 = 0.5f;
        icVar.p0 = new tc();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ex.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = hc.a.get(index);
            switch (i2) {
                case 1:
                    icVar.V = obtainStyledAttributes.getInt(index, icVar.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, icVar.p);
                    icVar.p = resourceId;
                    if (resourceId == -1) {
                        icVar.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    icVar.q = obtainStyledAttributes.getDimensionPixelSize(index, icVar.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, icVar.r) % 360.0f;
                    icVar.r = f;
                    if (f < 0.0f) {
                        icVar.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    icVar.a = obtainStyledAttributes.getDimensionPixelOffset(index, icVar.a);
                    break;
                case 6:
                    icVar.b = obtainStyledAttributes.getDimensionPixelOffset(index, icVar.b);
                    break;
                case 7:
                    icVar.c = obtainStyledAttributes.getFloat(index, icVar.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, icVar.e);
                    icVar.e = resourceId2;
                    if (resourceId2 == -1) {
                        icVar.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, icVar.f);
                    icVar.f = resourceId3;
                    if (resourceId3 == -1) {
                        icVar.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, icVar.g);
                    icVar.g = resourceId4;
                    if (resourceId4 == -1) {
                        icVar.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, icVar.h);
                    icVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        icVar.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, icVar.i);
                    icVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        icVar.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, icVar.j);
                    icVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        icVar.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, icVar.k);
                    icVar.k = resourceId8;
                    if (resourceId8 == -1) {
                        icVar.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, icVar.l);
                    icVar.l = resourceId9;
                    if (resourceId9 == -1) {
                        icVar.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, icVar.m);
                    icVar.m = resourceId10;
                    if (resourceId10 == -1) {
                        icVar.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, icVar.s);
                    icVar.s = resourceId11;
                    if (resourceId11 == -1) {
                        icVar.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, icVar.t);
                    icVar.t = resourceId12;
                    if (resourceId12 == -1) {
                        icVar.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, icVar.u);
                    icVar.u = resourceId13;
                    if (resourceId13 == -1) {
                        icVar.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, icVar.v);
                    icVar.v = resourceId14;
                    if (resourceId14 == -1) {
                        icVar.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    icVar.w = obtainStyledAttributes.getDimensionPixelSize(index, icVar.w);
                    break;
                case 22:
                    icVar.x = obtainStyledAttributes.getDimensionPixelSize(index, icVar.x);
                    break;
                case 23:
                    icVar.y = obtainStyledAttributes.getDimensionPixelSize(index, icVar.y);
                    break;
                case 24:
                    icVar.z = obtainStyledAttributes.getDimensionPixelSize(index, icVar.z);
                    break;
                case 25:
                    icVar.A = obtainStyledAttributes.getDimensionPixelSize(index, icVar.A);
                    break;
                case 26:
                    icVar.B = obtainStyledAttributes.getDimensionPixelSize(index, icVar.B);
                    break;
                case 27:
                    icVar.W = obtainStyledAttributes.getBoolean(index, icVar.W);
                    break;
                case 28:
                    icVar.X = obtainStyledAttributes.getBoolean(index, icVar.X);
                    break;
                case 29:
                    icVar.E = obtainStyledAttributes.getFloat(index, icVar.E);
                    break;
                case 30:
                    icVar.F = obtainStyledAttributes.getFloat(index, icVar.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    icVar.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    icVar.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        icVar.N = obtainStyledAttributes.getDimensionPixelSize(index, icVar.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, icVar.N) == -2) {
                            icVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        icVar.P = obtainStyledAttributes.getDimensionPixelSize(index, icVar.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, icVar.P) == -2) {
                            icVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    icVar.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, icVar.R));
                    icVar.L = 2;
                    break;
                case 36:
                    try {
                        icVar.O = obtainStyledAttributes.getDimensionPixelSize(index, icVar.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, icVar.O) == -2) {
                            icVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        icVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, icVar.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, icVar.Q) == -2) {
                            icVar.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    icVar.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, icVar.S));
                    icVar.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            sc.h(icVar, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            icVar.H = obtainStyledAttributes.getFloat(index, icVar.H);
                            break;
                        case 46:
                            icVar.I = obtainStyledAttributes.getFloat(index, icVar.I);
                            break;
                        case 47:
                            icVar.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            icVar.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            icVar.T = obtainStyledAttributes.getDimensionPixelOffset(index, icVar.T);
                            break;
                        case 50:
                            icVar.U = obtainStyledAttributes.getDimensionPixelOffset(index, icVar.U);
                            break;
                        case 51:
                            icVar.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, icVar.n);
                            icVar.n = resourceId15;
                            if (resourceId15 == -1) {
                                icVar.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, icVar.o);
                            icVar.o = resourceId16;
                            if (resourceId16 == -1) {
                                icVar.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            icVar.D = obtainStyledAttributes.getDimensionPixelSize(index, icVar.D);
                            break;
                        case 55:
                            icVar.C = obtainStyledAttributes.getDimensionPixelSize(index, icVar.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    sc.g(icVar, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    sc.g(icVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    icVar.Z = obtainStyledAttributes.getInt(index, icVar.Z);
                                    break;
                                case 67:
                                    icVar.d = obtainStyledAttributes.getBoolean(index, icVar.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        icVar.a();
        return icVar;
    }

    public int getMaxHeight() {
        return this.l;
    }

    public int getMaxWidth() {
        return this.k;
    }

    public int getMinHeight() {
        return this.j;
    }

    public int getMinWidth() {
        return this.i;
    }

    public int getOptimizationLevel() {
        return this.h.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        uc ucVar = this.h;
        if (ucVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                ucVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                ucVar.j = "parent";
            }
        }
        if (ucVar.h0 == null) {
            ucVar.h0 = ucVar.j;
            Log.v("ConstraintLayout", " setDebugName " + ucVar.h0);
        }
        ArrayList arrayList = ucVar.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tc tcVar = (tc) obj;
            View view = tcVar.f0;
            if (view != null) {
                if (tcVar.j == null && (id = view.getId()) != -1) {
                    tcVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (tcVar.h0 == null) {
                    tcVar.h0 = tcVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + tcVar.h0);
                }
            }
        }
        ucVar.n(sb);
        return sb.toString();
    }

    public final tc h(View view) {
        if (view == this) {
            return this.h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof ic) {
            return ((ic) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof ic) {
            return ((ic) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        uc ucVar = this.h;
        ucVar.f0 = this;
        jc jcVar = this.t;
        ucVar.u0 = jcVar;
        ucVar.s0.f = jcVar;
        this.f.put(getId(), this);
        this.o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ex.b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 17) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(index, this.j);
                } else if (index == 14) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(index, this.k);
                } else if (index == 15) {
                    this.l = obtainStyledAttributes.getDimensionPixelOffset(index, this.l);
                } else if (index == 113) {
                    this.n = obtainStyledAttributes.getInt(index, this.n);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        sc scVar = new sc();
                        this.o = scVar;
                        scVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.o = null;
                    }
                    this.q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        ucVar.D0 = this.n;
        vp.q = ucVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        o4 o4Var = new o4(10, false);
        o4Var.g = new SparseArray();
        o4Var.h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            kc kcVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                o4Var.I(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                kc kcVar2 = new kc(context, xml);
                                ((SparseArray) o4Var.g).put(kcVar2.a, kcVar2);
                                kcVar = kcVar2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                lc lcVar = new lc(context, xml);
                                if (kcVar != null) {
                                    ((ArrayList) kcVar.c).add(lcVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.p = o4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(uc ucVar, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        char c;
        boolean z;
        int i7;
        int i8;
        boolean z2;
        ArrayList arrayList;
        jc jcVar;
        int i9;
        boolean z3;
        int i10;
        int i11;
        boolean k;
        jc jcVar2;
        boolean z4;
        boolean z5;
        jc jcVar3;
        boolean z6;
        tm tmVar;
        q70 q70Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int size;
        int i19;
        int size2;
        int i20;
        int mode = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size4 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i21 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        jc jcVar4 = this.t;
        jcVar4.b = max3;
        jcVar4.c = max4;
        jcVar4.d = paddingWidth;
        jcVar4.e = i21;
        jcVar4.f = i2;
        jcVar4.g = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i22 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i23 = size3 - paddingWidth;
        int i24 = size4 - i21;
        int i25 = jcVar4.e;
        int i26 = jcVar4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.k - i26, i23);
                    i22 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.i);
                i4 = max;
                i22 = 2;
            } else {
                i4 = 0;
                i22 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.i);
            i4 = max;
            i22 = 2;
        } else {
            i4 = i23;
            i22 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.l - i25, i24);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.j);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.j);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i24;
            i6 = 2;
        }
        int q = ucVar.q();
        ye yeVar = ucVar.s0;
        int[] iArr = ucVar.C;
        int i27 = i4;
        if (i27 == q && i5 == ucVar.k()) {
            c = 1;
        } else {
            yeVar.c = true;
            c = 1;
        }
        ucVar.Y = 0;
        ucVar.Z = 0;
        iArr[0] = this.k - i26;
        iArr[c] = this.l - i25;
        ucVar.b0 = 0;
        ucVar.c0 = 0;
        ucVar.M(i22);
        ucVar.O(i27);
        ucVar.N(i6);
        ucVar.L(i5);
        int i28 = this.i - i26;
        if (i28 < 0) {
            ucVar.b0 = 0;
        } else {
            ucVar.b0 = i28;
        }
        int i29 = this.j - i25;
        if (i29 < 0) {
            ucVar.c0 = 0;
        } else {
            ucVar.c0 = i29;
        }
        ucVar.x0 = max5;
        ucVar.y0 = max3;
        y5 y5Var = ucVar.r0;
        uc ucVar2 = (uc) y5Var.c;
        ArrayList arrayList2 = (ArrayList) y5Var.a;
        jc jcVar5 = ucVar.u0;
        int size5 = ucVar.q0.size();
        int q2 = ucVar.q();
        int k2 = ucVar.k();
        boolean v = g8.v(i, 128);
        boolean z8 = v || g8.v(i, 64);
        if (z8) {
            int i30 = 0;
            while (i30 < size5) {
                boolean z9 = z8;
                tc tcVar = (tc) ucVar.q0.get(i30);
                i7 = size5;
                int[] iArr2 = tcVar.p0;
                int i31 = i30;
                boolean z10 = (iArr2[0] == 3) && (iArr2[1] == 3) && tcVar.W > 0.0f;
                if ((tcVar.x() && z10) || ((tcVar.y() && z10) || (tcVar instanceof cj) || tcVar.x() || tcVar.y())) {
                    i8 = 1073741824;
                    z = false;
                    break;
                } else {
                    i30 = i31 + 1;
                    z8 = z9;
                    size5 = i7;
                }
            }
        }
        z = z8;
        i7 = size5;
        i8 = 1073741824;
        boolean z11 = z & ((mode == i8 && mode2 == i8) || v);
        if (z11) {
            int min = Math.min(iArr[0], i23);
            int min2 = Math.min(iArr[1], i24);
            int i32 = 1073741824;
            if (mode == 1073741824) {
                if (ucVar.q() != min) {
                    ucVar.O(min);
                    yeVar.b = true;
                }
                i32 = 1073741824;
            }
            if (mode2 == i32 && ucVar.k() != min2) {
                ucVar.L(min2);
                yeVar.b = true;
            }
            if (mode == i32 && mode2 == i32) {
                ArrayList arrayList3 = yeVar.e;
                uc ucVar3 = yeVar.a;
                if (yeVar.b || yeVar.c) {
                    ArrayList arrayList4 = ucVar3.q0;
                    int size6 = arrayList4.size();
                    z2 = z11;
                    int i33 = 0;
                    while (i33 < size6) {
                        Object obj = arrayList4.get(i33);
                        int i34 = i33 + 1;
                        tc tcVar2 = (tc) obj;
                        tcVar2.h();
                        tcVar2.a = false;
                        tcVar2.d.n();
                        tcVar2.e.m();
                        arrayList4 = arrayList4;
                        i33 = i34;
                    }
                    ucVar3.h();
                    i14 = 0;
                    ucVar3.a = false;
                    ucVar3.d.n();
                    ucVar3.e.m();
                    yeVar.c = false;
                } else {
                    z2 = z11;
                    i14 = 0;
                }
                yeVar.b(yeVar.d);
                ucVar3.Y = i14;
                int[] iArr3 = ucVar3.p0;
                ucVar3.Z = i14;
                int j = ucVar3.j(i14);
                int j2 = ucVar3.j(1);
                if (yeVar.b) {
                    yeVar.c();
                }
                int r = ucVar3.r();
                jcVar = jcVar5;
                int s = ucVar3.s();
                arrayList = arrayList2;
                ucVar3.d.h.d(r);
                ucVar3.e.h.d(s);
                yeVar.g();
                if (j == 2 || j2 == 2) {
                    if (v) {
                        int size7 = arrayList3.size();
                        i15 = s;
                        int i35 = 0;
                        while (true) {
                            if (i35 >= size7) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i35);
                            i35++;
                            if (!((w90) obj2).k()) {
                                v = false;
                                break;
                            }
                        }
                    } else {
                        i15 = s;
                    }
                    if (v && j == 2) {
                        ucVar3.M(1);
                        ucVar3.O(yeVar.d(ucVar3, 0));
                        ucVar3.d.e.d(ucVar3.q());
                    }
                    if (v && j2 == 2) {
                        i16 = 1;
                        ucVar3.N(1);
                        ucVar3.L(yeVar.d(ucVar3, 1));
                        ucVar3.e.e.d(ucVar3.k());
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q3 = ucVar3.q() + r;
                            ucVar3.d.i.d(q3);
                            ucVar3.d.e.d(q3 - r);
                            yeVar.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = ucVar3.k() + i15;
                                ucVar3.e.i.d(k3);
                                ucVar3.e.e.d(k3 - i15);
                            }
                            yeVar.g();
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        size = arrayList3.size();
                        i19 = 0;
                        while (i19 < size) {
                            Object obj3 = arrayList3.get(i19);
                            i19++;
                            w90 w90Var = (w90) obj3;
                            if (w90Var.b != ucVar3 || w90Var.g) {
                                w90Var.e();
                            }
                        }
                        size2 = arrayList3.size();
                        i20 = 0;
                        while (i20 < size2) {
                            Object obj4 = arrayList3.get(i20);
                            i20++;
                            w90 w90Var2 = (w90) obj4;
                            if (z7 || w90Var2.b != ucVar3) {
                                if (!w90Var2.h.j || ((!w90Var2.i.j && !(w90Var2 instanceof hm)) || (!w90Var2.e.j && !(w90Var2 instanceof l9) && !(w90Var2 instanceof hm)))) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z3 = true;
                        ucVar3.M(j);
                        ucVar3.N(j2);
                        i9 = 2;
                        i13 = 1073741824;
                    }
                } else {
                    i15 = s;
                }
                i16 = 1;
                i17 = iArr3[0];
                if (i17 != i16) {
                }
                int q32 = ucVar3.q() + r;
                ucVar3.d.i.d(q32);
                ucVar3.d.e.d(q32 - r);
                yeVar.g();
                i18 = iArr3[1];
                if (i18 != 1) {
                }
                int k32 = ucVar3.k() + i15;
                ucVar3.e.i.d(k32);
                ucVar3.e.e.d(k32 - i15);
                yeVar.g();
                z7 = true;
                size = arrayList3.size();
                i19 = 0;
                while (i19 < size) {
                }
                size2 = arrayList3.size();
                i20 = 0;
                while (i20 < size2) {
                }
                z3 = true;
                ucVar3.M(j);
                ucVar3.N(j2);
                i9 = 2;
                i13 = 1073741824;
            } else {
                z2 = z11;
                arrayList = arrayList2;
                jcVar = jcVar5;
                uc ucVar4 = yeVar.a;
                if (yeVar.b) {
                    ArrayList arrayList5 = ucVar4.q0;
                    int size8 = arrayList5.size();
                    int i36 = 0;
                    while (i36 < size8) {
                        Object obj5 = arrayList5.get(i36);
                        i36++;
                        tc tcVar3 = (tc) obj5;
                        tcVar3.h();
                        tcVar3.a = false;
                        tm tmVar2 = tcVar3.d;
                        ArrayList arrayList6 = arrayList5;
                        tmVar2.e.j = false;
                        tmVar2.g = false;
                        tmVar2.n();
                        q70 q70Var2 = tcVar3.e;
                        q70Var2.e.j = false;
                        q70Var2.g = false;
                        q70Var2.m();
                        arrayList5 = arrayList6;
                    }
                    i12 = 0;
                    ucVar4.h();
                    ucVar4.a = false;
                    tm tmVar3 = ucVar4.d;
                    tmVar3.e.j = false;
                    tmVar3.g = false;
                    tmVar3.n();
                    q70 q70Var3 = ucVar4.e;
                    q70Var3.e.j = false;
                    q70Var3.g = false;
                    q70Var3.m();
                    yeVar.c();
                } else {
                    i12 = 0;
                }
                yeVar.b(yeVar.d);
                ucVar4.Y = i12;
                ucVar4.Z = i12;
                ucVar4.d.h.d(i12);
                ucVar4.e.h.d(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    z3 = ucVar.T(i12, v);
                    i9 = 1;
                } else {
                    i9 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= ucVar.T(1, v);
                    i9++;
                }
            }
            if (z3) {
                ucVar.P(mode == i13, mode2 == i13);
            }
        } else {
            z2 = z11;
            arrayList = arrayList2;
            jcVar = jcVar5;
            i9 = 0;
            z3 = false;
        }
        if (z3 && i9 == 2) {
            return;
        }
        int i37 = ucVar.D0;
        if (i7 > 0) {
            int size9 = ucVar.q0.size();
            boolean W = ucVar.W(64);
            jc jcVar6 = ucVar.u0;
            for (int i38 = 0; i38 < size9; i38++) {
                tc tcVar4 = (tc) ucVar.q0.get(i38);
                if (!(tcVar4 instanceof gm) && !(tcVar4 instanceof d7) && !tcVar4.F && (!W || (tmVar = tcVar4.d) == null || (q70Var = tcVar4.e) == null || !tmVar.e.j || !q70Var.e.j)) {
                    int j3 = tcVar4.j(0);
                    int j4 = tcVar4.j(1);
                    boolean z12 = j3 == 3 && tcVar4.r != 1 && j4 == 3 && tcVar4.s != 1;
                    if (!z12 && ucVar.W(1) && !(tcVar4 instanceof cj)) {
                        if (j3 == 3 && tcVar4.r == 0 && j4 != 3 && !tcVar4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 && tcVar4.s == 0 && j3 != 3 && !tcVar4.x()) {
                            z12 = true;
                        }
                        if ((j3 == 3 || j4 == 3) && tcVar4.W > 0.0f) {
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        y5Var.k(0, jcVar6, tcVar4);
                    }
                }
            }
            ConstraintLayout constraintLayout = jcVar6.a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.g;
            for (int i39 = 0; i39 < childCount2; i39++) {
                constraintLayout.getChildAt(i39);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i40 = 0; i40 < size10; i40++) {
                    ((gc) arrayList7.get(i40)).getClass();
                }
            }
        }
        y5Var.p(ucVar);
        int size11 = arrayList.size();
        if (i7 > 0) {
            y5Var.o(ucVar, 0, q2, k2);
        }
        if (size11 > 0) {
            int[] iArr4 = ucVar.p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int max7 = Math.max(ucVar.q(), ucVar2.b0);
            int max8 = Math.max(ucVar.k(), ucVar2.c0);
            int i41 = 0;
            boolean z15 = false;
            while (i41 < size11) {
                ArrayList arrayList8 = arrayList;
                tc tcVar5 = (tc) arrayList8.get(i41);
                if (tcVar5 instanceof cj) {
                    int q4 = tcVar5.q();
                    int k4 = tcVar5.k();
                    z4 = z14;
                    z5 = z13;
                    jcVar3 = jcVar;
                    boolean k5 = z15 | y5Var.k(1, jcVar3, tcVar5);
                    int q5 = tcVar5.q();
                    int k6 = tcVar5.k();
                    if (q5 != q4) {
                        tcVar5.O(q5);
                        if (z5 && tcVar5.r() + tcVar5.U > max7) {
                            max7 = Math.max(max7, tcVar5.i(4).e() + tcVar5.r() + tcVar5.U);
                        }
                        z6 = true;
                    } else {
                        z6 = k5;
                    }
                    if (k6 != k4) {
                        tcVar5.L(k6);
                        if (z4 && tcVar5.s() + tcVar5.V > max8) {
                            max8 = Math.max(max8, tcVar5.i(5).e() + tcVar5.s() + tcVar5.V);
                        }
                        z6 = true;
                    }
                    z15 = ((cj) tcVar5).y0 | z6;
                } else {
                    z4 = z14;
                    z5 = z13;
                    jcVar3 = jcVar;
                }
                i41++;
                jcVar = jcVar3;
                arrayList = arrayList8;
                z13 = z5;
                z14 = z4;
            }
            boolean z16 = z14;
            boolean z17 = z13;
            ArrayList arrayList9 = arrayList;
            int i42 = 0;
            while (true) {
                jc jcVar7 = jcVar;
                if (i42 >= 2) {
                    break;
                }
                int i43 = 0;
                while (i43 < size11) {
                    tc tcVar6 = (tc) arrayList9.get(i43);
                    if (((tcVar6 instanceof pm) && !(tcVar6 instanceof cj)) || (tcVar6 instanceof gm) || tcVar6.g0 == 8 || ((z2 && tcVar6.d.e.j && tcVar6.e.e.j) || (tcVar6 instanceof cj))) {
                        i10 = size11;
                        jcVar2 = jcVar7;
                        i11 = i43;
                        k = z15;
                    } else {
                        int q6 = tcVar6.q();
                        int k7 = tcVar6.k();
                        i10 = size11;
                        int i44 = tcVar6.a0;
                        i11 = i43;
                        k = y5Var.k(i42 == 1 ? 2 : 1, jcVar7, tcVar6) | z15;
                        int q7 = tcVar6.q();
                        jcVar2 = jcVar7;
                        int k8 = tcVar6.k();
                        if (q7 != q6) {
                            tcVar6.O(q7);
                            if (z17 && tcVar6.r() + tcVar6.U > max7) {
                                max7 = Math.max(max7, tcVar6.i(4).e() + tcVar6.r() + tcVar6.U);
                            }
                            k = true;
                        }
                        if (k8 != k7) {
                            tcVar6.L(k8);
                            if (z16 && tcVar6.s() + tcVar6.V > max8) {
                                max8 = Math.max(max8, tcVar6.i(5).e() + tcVar6.s() + tcVar6.V);
                            }
                            k = true;
                        }
                        if (tcVar6.E && i44 != tcVar6.a0) {
                            k = true;
                        }
                    }
                    z15 = k;
                    jcVar7 = jcVar2;
                    i43 = i11 + 1;
                    size11 = i10;
                }
                int i45 = size11;
                jcVar = jcVar7;
                if (!z15) {
                    break;
                }
                i42++;
                y5Var.o(ucVar, i42, q2, k2);
                size11 = i45;
                z15 = false;
            }
        }
        ucVar.D0 = i37;
        vp.q = ucVar.W(512);
    }

    public final void l(tc tcVar, ic icVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f.get(i);
        tc tcVar2 = (tc) sparseArray.get(i);
        if (tcVar2 == null || view == null || !(view.getLayoutParams() instanceof ic)) {
            return;
        }
        icVar.c0 = true;
        if (i2 == 6) {
            ic icVar2 = (ic) view.getLayoutParams();
            icVar2.c0 = true;
            icVar2.p0.E = true;
        }
        tcVar.i(6).b(tcVar2.i(i2), icVar.D, icVar.C, true);
        tcVar.E = true;
        tcVar.i(3).j();
        tcVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ic icVar = (ic) childAt.getLayoutParams();
            tc tcVar = icVar.p0;
            if (childAt.getVisibility() != 8 || icVar.d0 || icVar.e0 || isInEditMode) {
                int r = tcVar.r();
                int s = tcVar.s();
                childAt.layout(r, s, tcVar.q() + r, tcVar.k() + s);
            }
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((gc) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x034c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        tc tcVar;
        int i4;
        tc tcVar2;
        int i5;
        int i6;
        int i7;
        tc tcVar3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        tc tcVar4;
        int i13;
        int i14;
        tc tcVar5;
        ic icVar;
        int i15;
        tc tcVar6;
        float f;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float parseFloat;
        int i21;
        char c;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int f2;
        int i22;
        String resourceName;
        int id;
        tc tcVar7;
        ConstraintLayout constraintLayout = this;
        boolean z3 = constraintLayout.m;
        constraintLayout.m = z3;
        int i23 = 1;
        int i24 = 0;
        if (!z3) {
            int childCount = constraintLayout.getChildCount();
            int i25 = 0;
            while (true) {
                if (i25 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i25).isLayoutRequested()) {
                    constraintLayout.m = true;
                    break;
                }
                i25++;
            }
        }
        boolean z4 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        uc ucVar = constraintLayout.h;
        ucVar.v0 = z4;
        if (constraintLayout.m) {
            constraintLayout.m = false;
            int childCount2 = constraintLayout.getChildCount();
            int i26 = 0;
            while (true) {
                if (i26 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i26).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i26++;
                }
            }
            if (z) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i27 = 0; i27 < childCount3; i27++) {
                    tc h = constraintLayout.h(constraintLayout.getChildAt(i27));
                    if (h != null) {
                        h.C();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.f;
                if (isInEditMode) {
                    int i28 = 0;
                    while (i28 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i28);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i22 = i23;
                                try {
                                    if (constraintLayout.r == null) {
                                        constraintLayout.r = new HashMap();
                                    }
                                    int indexOf = resourceName.indexOf("/");
                                    constraintLayout.r.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i22 = i23;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i22 = i23;
                        }
                        if (id != 0) {
                            View view = (View) sparseArray3.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                tcVar7 = view == null ? null : ((ic) view.getLayoutParams()).p0;
                                tcVar7.h0 = resourceName;
                                i28++;
                                i23 = i22;
                            }
                        }
                        tcVar7 = ucVar;
                        tcVar7.h0 = resourceName;
                        i28++;
                        i23 = i22;
                    }
                }
                int i29 = i23;
                if (constraintLayout.q != -1) {
                    for (int i30 = 0; i30 < childCount3; i30++) {
                        constraintLayout.getChildAt(i30).getId();
                    }
                }
                sc scVar = constraintLayout.o;
                if (scVar != null) {
                    scVar.a(constraintLayout);
                }
                ucVar.q0.clear();
                ArrayList arrayList3 = constraintLayout.g;
                int size = arrayList3.size();
                if (size > 0) {
                    int i31 = 0;
                    while (i31 < size) {
                        gc gcVar = (gc) arrayList3.get(i31);
                        HashMap hashMap = gcVar.l;
                        if (gcVar.isInEditMode()) {
                            gcVar.setIds(gcVar.j);
                        }
                        pm pmVar = gcVar.i;
                        if (pmVar == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            pmVar.r0 = i24;
                            Arrays.fill(pmVar.q0, (Object) null);
                            int i32 = i24;
                            while (i32 < gcVar.g) {
                                int i33 = gcVar.f[i32];
                                View view2 = (View) sparseArray3.get(i33);
                                if (view2 != null || (f2 = gcVar.f(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i33))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    gcVar.f[i32] = f2;
                                    hashMap.put(Integer.valueOf(f2), str);
                                    view2 = (View) sparseArray3.get(f2);
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    pm pmVar2 = gcVar.i;
                                    tc h2 = constraintLayout.h(view3);
                                    pmVar2.getClass();
                                    if (h2 != pmVar2 && h2 != null) {
                                        int i34 = pmVar2.r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        tc[] tcVarArr = pmVar2.q0;
                                        if (i34 > tcVarArr.length) {
                                            pmVar2.q0 = (tc[]) Arrays.copyOf(tcVarArr, tcVarArr.length * 2);
                                        }
                                        tc[] tcVarArr2 = pmVar2.q0;
                                        int i35 = pmVar2.r0;
                                        tcVarArr2[i35] = h2;
                                        pmVar2.r0 = i35 + 1;
                                        i32++;
                                        sparseArray3 = sparseArray2;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                sparseArray2 = sparseArray3;
                                i32++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            gcVar.i.S();
                        }
                        i31++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i24 = 0;
                    }
                }
                int i36 = 2;
                for (int i37 = 0; i37 < childCount3; i37++) {
                    constraintLayout.getChildAt(i37);
                }
                SparseArray sparseArray4 = constraintLayout.s;
                sparseArray4.clear();
                sparseArray4.put(0, ucVar);
                sparseArray4.put(constraintLayout.getId(), ucVar);
                for (int i38 = 0; i38 < childCount3; i38++) {
                    View childAt2 = constraintLayout.getChildAt(i38);
                    sparseArray4.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i39 = 0;
                while (i39 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i39);
                    tc h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        ic icVar2 = (ic) childAt3.getLayoutParams();
                        ucVar.q0.add(h3);
                        tc tcVar8 = h3.T;
                        if (tcVar8 != null) {
                            ((uc) tcVar8).q0.remove(h3);
                            h3.C();
                        }
                        h3.T = ucVar;
                        icVar2.a();
                        h3.g0 = childAt3.getVisibility();
                        h3.f0 = childAt3;
                        if (childAt3 instanceof gc) {
                            ((gc) childAt3).h(h3, ucVar.v0);
                        }
                        if (icVar2.d0) {
                            gm gmVar = (gm) h3;
                            int i40 = icVar2.m0;
                            int i41 = icVar2.n0;
                            float f3 = icVar2.o0;
                            if (f3 == -1.0f) {
                                c = 65535;
                                if (i40 != -1) {
                                    if (i40 > -1) {
                                        gmVar.q0 = -1.0f;
                                        gmVar.r0 = i40;
                                        gmVar.s0 = -1;
                                    }
                                } else if (i41 != -1 && i41 > -1) {
                                    gmVar.q0 = -1.0f;
                                    gmVar.r0 = -1;
                                    gmVar.s0 = i41;
                                }
                                i3 = i39;
                                z2 = z;
                                i18 = i36;
                            } else if (f3 > -1.0f) {
                                gmVar.q0 = f3;
                                c = 65535;
                                gmVar.r0 = -1;
                                gmVar.s0 = -1;
                                i3 = i39;
                                z2 = z;
                                i18 = i36;
                            }
                        } else {
                            int i42 = icVar2.f0;
                            int i43 = icVar2.g0;
                            int i44 = icVar2.h0;
                            int i45 = icVar2.i0;
                            int i46 = icVar2.j0;
                            int i47 = icVar2.k0;
                            i3 = i39;
                            float f4 = icVar2.l0;
                            int i48 = icVar2.p;
                            z2 = z;
                            if (i48 != -1) {
                                tc tcVar9 = (tc) sparseArray4.get(i48);
                                if (tcVar9 != null) {
                                    float f5 = icVar2.r;
                                    h3.v(7, 7, icVar2.q, 0, tcVar9);
                                    h3.D = f5;
                                }
                                constraintLayout = this;
                                tcVar6 = h3;
                                icVar = icVar2;
                                i8 = 4;
                                i7 = 2;
                            } else {
                                if (i42 != -1) {
                                    tc tcVar10 = (tc) sparseArray4.get(i42);
                                    if (tcVar10 != null) {
                                        tcVar = h3;
                                        i4 = 2;
                                        tcVar.v(2, 2, ((ViewGroup.MarginLayoutParams) icVar2).leftMargin, i46, tcVar10);
                                    } else {
                                        tcVar = h3;
                                        i4 = 2;
                                    }
                                } else {
                                    tcVar = h3;
                                    i4 = 2;
                                    if (i43 != -1 && (tcVar2 = (tc) sparseArray4.get(i43)) != null) {
                                        tcVar.v(2, 4, ((ViewGroup.MarginLayoutParams) icVar2).leftMargin, i46, tcVar2);
                                        i5 = 2;
                                        i6 = 4;
                                        if (i44 == -1) {
                                            tc tcVar11 = (tc) sparseArray4.get(i44);
                                            if (tcVar11 != null) {
                                                tcVar.v(i6, i5, ((ViewGroup.MarginLayoutParams) icVar2).rightMargin, i47, tcVar11);
                                            }
                                            i7 = i5;
                                        } else {
                                            i7 = i5;
                                            if (i45 != -1 && (tcVar3 = (tc) sparseArray4.get(i45)) != null) {
                                                tcVar.v(i6, i6, ((ViewGroup.MarginLayoutParams) icVar2).rightMargin, i47, tcVar3);
                                            }
                                        }
                                        i8 = i6;
                                        i9 = icVar2.i;
                                        if (i9 == -1) {
                                            tc tcVar12 = (tc) sparseArray4.get(i9);
                                            if (tcVar12 != null) {
                                                i16 = 3;
                                                tcVar.v(3, 3, ((ViewGroup.MarginLayoutParams) icVar2).topMargin, icVar2.x, tcVar12);
                                            } else {
                                                i16 = 3;
                                            }
                                            i11 = i16;
                                            i12 = 5;
                                            i10 = -1;
                                        } else {
                                            int i49 = icVar2.j;
                                            i10 = -1;
                                            if (i49 == -1 || (tcVar4 = (tc) sparseArray4.get(i49)) == null) {
                                                i11 = 3;
                                                i12 = 5;
                                            } else {
                                                tcVar.v(3, 5, ((ViewGroup.MarginLayoutParams) icVar2).topMargin, icVar2.x, tcVar4);
                                                i11 = 3;
                                                i12 = 5;
                                            }
                                        }
                                        i13 = icVar2.k;
                                        if (i13 == i10) {
                                            tc tcVar13 = (tc) sparseArray4.get(i13);
                                            if (tcVar13 != null) {
                                                int i50 = i11;
                                                tcVar.v(i12, i50, ((ViewGroup.MarginLayoutParams) icVar2).bottomMargin, icVar2.z, tcVar13);
                                                i14 = i50;
                                            } else {
                                                i14 = i11;
                                            }
                                        } else {
                                            i14 = i11;
                                            int i51 = icVar2.l;
                                            if (i51 != i10 && (tcVar5 = (tc) sparseArray4.get(i51)) != null) {
                                                tcVar.v(i12, i12, ((ViewGroup.MarginLayoutParams) icVar2).bottomMargin, icVar2.z, tcVar5);
                                            }
                                        }
                                        icVar = icVar2;
                                        i15 = icVar.m;
                                        if (i15 == -1) {
                                            constraintLayout = this;
                                            tcVar6 = tcVar;
                                            constraintLayout.l(tcVar6, icVar, sparseArray4, i15, 6);
                                        } else {
                                            int i52 = icVar.n;
                                            if (i52 != -1) {
                                                constraintLayout = this;
                                                tcVar6 = tcVar;
                                                constraintLayout.l(tcVar6, icVar, sparseArray4, i52, i14);
                                            } else {
                                                int i53 = icVar.o;
                                                constraintLayout = this;
                                                tcVar6 = tcVar;
                                                int i54 = i12;
                                                if (i53 != -1) {
                                                    constraintLayout.l(tcVar6, icVar, sparseArray4, i53, i54);
                                                }
                                                if (f4 >= 0.0f) {
                                                    tcVar6.d0 = f4;
                                                }
                                                f = icVar.F;
                                                if (f >= 0.0f) {
                                                    tcVar6.e0 = f;
                                                }
                                            }
                                        }
                                        if (f4 >= 0.0f) {
                                        }
                                        f = icVar.F;
                                        if (f >= 0.0f) {
                                        }
                                    }
                                }
                                i5 = i4;
                                i6 = 4;
                                if (i44 == -1) {
                                }
                                i8 = i6;
                                i9 = icVar2.i;
                                if (i9 == -1) {
                                }
                                i13 = icVar2.k;
                                if (i13 == i10) {
                                }
                                icVar = icVar2;
                                i15 = icVar.m;
                                if (i15 == -1) {
                                }
                                if (f4 >= 0.0f) {
                                }
                                f = icVar.F;
                                if (f >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i21 = icVar.T) != -1 || icVar.U != -1)) {
                                int i55 = icVar.U;
                                tcVar6.Y = i21;
                                tcVar6.Z = i55;
                            }
                            if (icVar.a0) {
                                tcVar6.M(i29);
                                tcVar6.O(((ViewGroup.MarginLayoutParams) icVar).width);
                                if (((ViewGroup.MarginLayoutParams) icVar).width == -2) {
                                    tcVar6.M(i36);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) icVar).width == -1) {
                                if (icVar.W) {
                                    tcVar6.M(3);
                                } else {
                                    tcVar6.M(4);
                                }
                                tcVar6.i(i7).g = ((ViewGroup.MarginLayoutParams) icVar).leftMargin;
                                tcVar6.i(i8).g = ((ViewGroup.MarginLayoutParams) icVar).rightMargin;
                            } else {
                                tcVar6.M(3);
                                tcVar6.O(0);
                            }
                            if (icVar.b0) {
                                i17 = -1;
                                tcVar6.N(1);
                                tcVar6.L(((ViewGroup.MarginLayoutParams) icVar).height);
                                if (((ViewGroup.MarginLayoutParams) icVar).height == -2) {
                                    tcVar6.N(2);
                                }
                            } else {
                                i17 = -1;
                                if (((ViewGroup.MarginLayoutParams) icVar).height == -1) {
                                    if (icVar.X) {
                                        tcVar6.N(3);
                                    } else {
                                        tcVar6.N(4);
                                    }
                                    tcVar6.i(3).g = ((ViewGroup.MarginLayoutParams) icVar).topMargin;
                                    tcVar6.i(5).g = ((ViewGroup.MarginLayoutParams) icVar).bottomMargin;
                                } else {
                                    tcVar6.N(3);
                                    tcVar6.L(0);
                                }
                            }
                            String str2 = icVar.G;
                            if (str2 == null || str2.length() == 0) {
                                tcVar6.W = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i19 = i17;
                                    i20 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i19 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i17;
                                    i20 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i20);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i20, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i19 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    tcVar6.W = parseFloat;
                                    tcVar6.X = i19;
                                }
                            }
                            float f6 = icVar.H;
                            float[] fArr = tcVar6.k0;
                            fArr[0] = f6;
                            i29 = 1;
                            fArr[1] = icVar.I;
                            tcVar6.i0 = icVar.J;
                            tcVar6.j0 = icVar.K;
                            int i56 = icVar.Z;
                            if (i56 >= 0 && i56 <= 3) {
                                tcVar6.q = i56;
                            }
                            int i57 = icVar.L;
                            int i58 = icVar.N;
                            int i59 = icVar.P;
                            float f7 = icVar.R;
                            tcVar6.r = i57;
                            tcVar6.u = i58;
                            if (i59 == Integer.MAX_VALUE) {
                                i59 = 0;
                            }
                            tcVar6.v = i59;
                            tcVar6.w = f7;
                            if (f7 > 0.0f && f7 < 1.0f && i57 == 0) {
                                tcVar6.r = 2;
                            }
                            int i60 = icVar.M;
                            int i61 = icVar.O;
                            int i62 = icVar.Q;
                            float f8 = icVar.S;
                            tcVar6.s = i60;
                            tcVar6.x = i61;
                            if (i62 == Integer.MAX_VALUE) {
                                i62 = 0;
                            }
                            tcVar6.y = i62;
                            tcVar6.z = f8;
                            if (f8 <= 0.0f || f8 >= 1.0f || i60 != 0) {
                                i18 = 2;
                            } else {
                                i18 = 2;
                                tcVar6.s = 2;
                            }
                        }
                        i39 = i3 + 1;
                        i36 = i18;
                        z = z2;
                    }
                    i3 = i39;
                    z2 = z;
                    i18 = i36;
                    i39 = i3 + 1;
                    i36 = i18;
                    z = z2;
                }
            }
            if (z) {
                ucVar.r0.p(ucVar);
            }
        }
        ucVar.w0.getClass();
        constraintLayout.k(ucVar, constraintLayout.n, i, i2);
        int q = ucVar.q();
        int k = ucVar.k();
        boolean z5 = ucVar.E0;
        boolean z6 = ucVar.F0;
        jc jcVar = constraintLayout.t;
        int i63 = jcVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(q + jcVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k + i63, i2, 0) & 16777215;
        int min = Math.min(constraintLayout.k, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.l, resolveSizeAndState2);
        if (z5) {
            min |= 16777216;
        }
        if (z6) {
            min2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        tc h = h(view);
        if ((view instanceof Guideline) && !(h instanceof gm)) {
            ic icVar = (ic) view.getLayoutParams();
            gm gmVar = new gm();
            icVar.p0 = gmVar;
            icVar.d0 = true;
            gmVar.S(icVar.V);
        }
        if (view instanceof gc) {
            gc gcVar = (gc) view;
            gcVar.i();
            ((ic) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.g;
            if (!arrayList.contains(gcVar)) {
                arrayList.add(gcVar);
            }
        }
        this.f.put(view.getId(), view);
        this.m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f.remove(view.getId());
        tc h = h(view);
        this.h.q0.remove(h);
        h.C();
        this.g.remove(view);
        this.m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.m = true;
        super.requestLayout();
    }

    public void setConstraintSet(sc scVar) {
        this.o = scVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.l) {
            return;
        }
        this.l = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.j) {
            return;
        }
        this.j = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(vc vcVar) {
        o4 o4Var = this.p;
        if (o4Var != null) {
            o4Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.n = i;
        uc ucVar = this.h;
        ucVar.D0 = i;
        vp.q = ucVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new SparseArray();
        this.g = new ArrayList(4);
        this.h = new uc();
        this.i = 0;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = true;
        this.n = 257;
        this.o = null;
        this.p = null;
        this.q = -1;
        this.r = new HashMap();
        this.s = new SparseArray();
        this.t = new jc(this, this);
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ic icVar = new ic(layoutParams);
        icVar.a = -1;
        icVar.b = -1;
        icVar.c = -1.0f;
        icVar.d = true;
        icVar.e = -1;
        icVar.f = -1;
        icVar.g = -1;
        icVar.h = -1;
        icVar.i = -1;
        icVar.j = -1;
        icVar.k = -1;
        icVar.l = -1;
        icVar.m = -1;
        icVar.n = -1;
        icVar.o = -1;
        icVar.p = -1;
        icVar.q = 0;
        icVar.r = 0.0f;
        icVar.s = -1;
        icVar.t = -1;
        icVar.u = -1;
        icVar.v = -1;
        icVar.w = Integer.MIN_VALUE;
        icVar.x = Integer.MIN_VALUE;
        icVar.y = Integer.MIN_VALUE;
        icVar.z = Integer.MIN_VALUE;
        icVar.A = Integer.MIN_VALUE;
        icVar.B = Integer.MIN_VALUE;
        icVar.C = Integer.MIN_VALUE;
        icVar.D = 0;
        icVar.E = 0.5f;
        icVar.F = 0.5f;
        icVar.G = null;
        icVar.H = -1.0f;
        icVar.I = -1.0f;
        icVar.J = 0;
        icVar.K = 0;
        icVar.L = 0;
        icVar.M = 0;
        icVar.N = 0;
        icVar.O = 0;
        icVar.P = 0;
        icVar.Q = 0;
        icVar.R = 1.0f;
        icVar.S = 1.0f;
        icVar.T = -1;
        icVar.U = -1;
        icVar.V = -1;
        icVar.W = false;
        icVar.X = false;
        icVar.Y = null;
        icVar.Z = 0;
        icVar.a0 = true;
        icVar.b0 = true;
        icVar.c0 = false;
        icVar.d0 = false;
        icVar.e0 = false;
        icVar.f0 = -1;
        icVar.g0 = -1;
        icVar.h0 = -1;
        icVar.i0 = -1;
        icVar.j0 = Integer.MIN_VALUE;
        icVar.k0 = Integer.MIN_VALUE;
        icVar.l0 = 0.5f;
        icVar.p0 = new tc();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) icVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) icVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) icVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) icVar).bottomMargin = marginLayoutParams.bottomMargin;
            icVar.setMarginStart(marginLayoutParams.getMarginStart());
            icVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof ic)) {
            return icVar;
        }
        ic icVar2 = (ic) layoutParams;
        icVar.a = icVar2.a;
        icVar.b = icVar2.b;
        icVar.c = icVar2.c;
        icVar.d = icVar2.d;
        icVar.e = icVar2.e;
        icVar.f = icVar2.f;
        icVar.g = icVar2.g;
        icVar.h = icVar2.h;
        icVar.i = icVar2.i;
        icVar.j = icVar2.j;
        icVar.k = icVar2.k;
        icVar.l = icVar2.l;
        icVar.m = icVar2.m;
        icVar.n = icVar2.n;
        icVar.o = icVar2.o;
        icVar.p = icVar2.p;
        icVar.q = icVar2.q;
        icVar.r = icVar2.r;
        icVar.s = icVar2.s;
        icVar.t = icVar2.t;
        icVar.u = icVar2.u;
        icVar.v = icVar2.v;
        icVar.w = icVar2.w;
        icVar.x = icVar2.x;
        icVar.y = icVar2.y;
        icVar.z = icVar2.z;
        icVar.A = icVar2.A;
        icVar.B = icVar2.B;
        icVar.C = icVar2.C;
        icVar.D = icVar2.D;
        icVar.E = icVar2.E;
        icVar.F = icVar2.F;
        icVar.G = icVar2.G;
        icVar.H = icVar2.H;
        icVar.I = icVar2.I;
        icVar.J = icVar2.J;
        icVar.K = icVar2.K;
        icVar.W = icVar2.W;
        icVar.X = icVar2.X;
        icVar.L = icVar2.L;
        icVar.M = icVar2.M;
        icVar.N = icVar2.N;
        icVar.P = icVar2.P;
        icVar.O = icVar2.O;
        icVar.Q = icVar2.Q;
        icVar.R = icVar2.R;
        icVar.S = icVar2.S;
        icVar.T = icVar2.T;
        icVar.U = icVar2.U;
        icVar.V = icVar2.V;
        icVar.a0 = icVar2.a0;
        icVar.b0 = icVar2.b0;
        icVar.c0 = icVar2.c0;
        icVar.d0 = icVar2.d0;
        icVar.f0 = icVar2.f0;
        icVar.g0 = icVar2.g0;
        icVar.h0 = icVar2.h0;
        icVar.i0 = icVar2.i0;
        icVar.j0 = icVar2.j0;
        icVar.k0 = icVar2.k0;
        icVar.l0 = icVar2.l0;
        icVar.Y = icVar2.Y;
        icVar.Z = icVar2.Z;
        icVar.p0 = icVar2.p0;
        return icVar;
    }
}
