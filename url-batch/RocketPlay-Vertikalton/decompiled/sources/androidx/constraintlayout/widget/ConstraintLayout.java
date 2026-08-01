package androidx.constraintlayout.widget;

import B.j;
import E1.A;
import K.C0019l;
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
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import q.C0330c;
import s.C0361a;
import s.d;
import s.e;
import s.h;
import t.C0366c;
import t.C0368e;
import t.i;
import t.k;
import t.m;
import t.p;
import v.c;
import v.f;
import v.g;
import v.n;
import v.o;
import v.r;
import v.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1786r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1787a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1788b;

    /* renamed from: c, reason: collision with root package name */
    public final e f1789c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1790e;

    /* renamed from: f, reason: collision with root package name */
    public int f1791f;

    /* renamed from: g, reason: collision with root package name */
    public int f1792g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public n f1793j;

    /* renamed from: k, reason: collision with root package name */
    public j f1794k;

    /* renamed from: l, reason: collision with root package name */
    public int f1795l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1796m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1797n;

    /* renamed from: o, reason: collision with root package name */
    public final f f1798o;

    /* renamed from: p, reason: collision with root package name */
    public int f1799p;

    /* renamed from: q, reason: collision with root package name */
    public int f1800q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1787a = new SparseArray();
        this.f1788b = new ArrayList(4);
        this.f1789c = new e();
        this.d = 0;
        this.f1790e = 0;
        this.f1791f = Integer.MAX_VALUE;
        this.f1792g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1793j = null;
        this.f1794k = null;
        this.f1795l = -1;
        this.f1796m = new HashMap();
        this.f1797n = new SparseArray();
        this.f1798o = new f(this, this);
        this.f1799p = 0;
        this.f1800q = 0;
        i(attributeSet, 0);
    }

    public static v.e g() {
        v.e eVar = new v.e(-2, -2);
        eVar.f4249a = -1;
        eVar.f4251b = -1;
        eVar.f4253c = -1.0f;
        eVar.d = true;
        eVar.f4256e = -1;
        eVar.f4258f = -1;
        eVar.f4260g = -1;
        eVar.h = -1;
        eVar.i = -1;
        eVar.f4264j = -1;
        eVar.f4266k = -1;
        eVar.f4268l = -1;
        eVar.f4270m = -1;
        eVar.f4272n = -1;
        eVar.f4273o = -1;
        eVar.f4275p = -1;
        eVar.f4277q = 0;
        eVar.f4278r = RecyclerView.f1949A0;
        eVar.f4279s = -1;
        eVar.f4280t = -1;
        eVar.f4281u = -1;
        eVar.f4282v = -1;
        eVar.f4283w = Integer.MIN_VALUE;
        eVar.f4284x = Integer.MIN_VALUE;
        eVar.f4285y = Integer.MIN_VALUE;
        eVar.f4286z = Integer.MIN_VALUE;
        eVar.f4224A = Integer.MIN_VALUE;
        eVar.f4225B = Integer.MIN_VALUE;
        eVar.f4226C = Integer.MIN_VALUE;
        eVar.f4227D = 0;
        eVar.f4228E = 0.5f;
        eVar.F = 0.5f;
        eVar.f4229G = null;
        eVar.f4230H = -1.0f;
        eVar.f4231I = -1.0f;
        eVar.f4232J = 0;
        eVar.f4233K = 0;
        eVar.f4234L = 0;
        eVar.f4235M = 0;
        eVar.f4236N = 0;
        eVar.f4237O = 0;
        eVar.f4238P = 0;
        eVar.f4239Q = 0;
        eVar.f4240R = 1.0f;
        eVar.f4241S = 1.0f;
        eVar.f4242T = -1;
        eVar.f4243U = -1;
        eVar.f4244V = -1;
        eVar.f4245W = false;
        eVar.f4246X = false;
        eVar.f4247Y = null;
        eVar.f4248Z = 0;
        eVar.f4250a0 = true;
        eVar.f4252b0 = true;
        eVar.f4254c0 = false;
        eVar.f4255d0 = false;
        eVar.f4257e0 = false;
        eVar.f4259f0 = -1;
        eVar.f4261g0 = -1;
        eVar.f4262h0 = -1;
        eVar.f4263i0 = -1;
        eVar.f4265j0 = Integer.MIN_VALUE;
        eVar.f4267k0 = Integer.MIN_VALUE;
        eVar.f4269l0 = 0.5f;
        eVar.f4276p0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f1786r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f1786r = sVar;
        }
        return f1786r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1788b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((c) arrayList.get(i)).getClass();
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
                        float f2 = i3;
                        float f3 = i4;
                        float f4 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        v.e eVar = new v.e(context, attributeSet);
        eVar.f4249a = -1;
        eVar.f4251b = -1;
        eVar.f4253c = -1.0f;
        eVar.d = true;
        eVar.f4256e = -1;
        eVar.f4258f = -1;
        eVar.f4260g = -1;
        eVar.h = -1;
        eVar.i = -1;
        eVar.f4264j = -1;
        eVar.f4266k = -1;
        eVar.f4268l = -1;
        eVar.f4270m = -1;
        eVar.f4272n = -1;
        eVar.f4273o = -1;
        eVar.f4275p = -1;
        eVar.f4277q = 0;
        eVar.f4278r = RecyclerView.f1949A0;
        eVar.f4279s = -1;
        eVar.f4280t = -1;
        eVar.f4281u = -1;
        eVar.f4282v = -1;
        eVar.f4283w = Integer.MIN_VALUE;
        eVar.f4284x = Integer.MIN_VALUE;
        eVar.f4285y = Integer.MIN_VALUE;
        eVar.f4286z = Integer.MIN_VALUE;
        eVar.f4224A = Integer.MIN_VALUE;
        eVar.f4225B = Integer.MIN_VALUE;
        eVar.f4226C = Integer.MIN_VALUE;
        eVar.f4227D = 0;
        eVar.f4228E = 0.5f;
        eVar.F = 0.5f;
        eVar.f4229G = null;
        eVar.f4230H = -1.0f;
        eVar.f4231I = -1.0f;
        eVar.f4232J = 0;
        eVar.f4233K = 0;
        eVar.f4234L = 0;
        eVar.f4235M = 0;
        eVar.f4236N = 0;
        eVar.f4237O = 0;
        eVar.f4238P = 0;
        eVar.f4239Q = 0;
        eVar.f4240R = 1.0f;
        eVar.f4241S = 1.0f;
        eVar.f4242T = -1;
        eVar.f4243U = -1;
        eVar.f4244V = -1;
        eVar.f4245W = false;
        eVar.f4246X = false;
        eVar.f4247Y = null;
        eVar.f4248Z = 0;
        eVar.f4250a0 = true;
        eVar.f4252b0 = true;
        eVar.f4254c0 = false;
        eVar.f4255d0 = false;
        eVar.f4257e0 = false;
        eVar.f4259f0 = -1;
        eVar.f4261g0 = -1;
        eVar.f4262h0 = -1;
        eVar.f4263i0 = -1;
        eVar.f4265j0 = Integer.MIN_VALUE;
        eVar.f4267k0 = Integer.MIN_VALUE;
        eVar.f4269l0 = 0.5f;
        eVar.f4276p0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4402b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = v.d.f4223a.get(index);
            switch (i2) {
                case 1:
                    eVar.f4244V = obtainStyledAttributes.getInt(index, eVar.f4244V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, eVar.f4275p);
                    eVar.f4275p = resourceId;
                    if (resourceId == -1) {
                        eVar.f4275p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    eVar.f4277q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4277q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, eVar.f4278r) % 360.0f;
                    eVar.f4278r = f2;
                    if (f2 < RecyclerView.f1949A0) {
                        eVar.f4278r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f4249a = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f4249a);
                    break;
                case 6:
                    eVar.f4251b = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f4251b);
                    break;
                case 7:
                    eVar.f4253c = obtainStyledAttributes.getFloat(index, eVar.f4253c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, eVar.f4256e);
                    eVar.f4256e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f4256e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, eVar.f4258f);
                    eVar.f4258f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f4258f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, eVar.f4260g);
                    eVar.f4260g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f4260g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, eVar.h);
                    eVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, eVar.i);
                    eVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, eVar.f4264j);
                    eVar.f4264j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f4264j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, eVar.f4266k);
                    eVar.f4266k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f4266k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, eVar.f4268l);
                    eVar.f4268l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f4268l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, eVar.f4270m);
                    eVar.f4270m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f4270m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, eVar.f4279s);
                    eVar.f4279s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f4279s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, eVar.f4280t);
                    eVar.f4280t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f4280t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, eVar.f4281u);
                    eVar.f4281u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f4281u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, eVar.f4282v);
                    eVar.f4282v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f4282v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f4283w = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4283w);
                    break;
                case 22:
                    eVar.f4284x = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4284x);
                    break;
                case 23:
                    eVar.f4285y = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4285y);
                    break;
                case 24:
                    eVar.f4286z = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4286z);
                    break;
                case 25:
                    eVar.f4224A = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4224A);
                    break;
                case 26:
                    eVar.f4225B = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4225B);
                    break;
                case 27:
                    eVar.f4245W = obtainStyledAttributes.getBoolean(index, eVar.f4245W);
                    break;
                case 28:
                    eVar.f4246X = obtainStyledAttributes.getBoolean(index, eVar.f4246X);
                    break;
                case 29:
                    eVar.f4228E = obtainStyledAttributes.getFloat(index, eVar.f4228E);
                    break;
                case 30:
                    eVar.F = obtainStyledAttributes.getFloat(index, eVar.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    eVar.f4234L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    eVar.f4235M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        eVar.f4236N = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4236N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, eVar.f4236N) == -2) {
                            eVar.f4236N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        eVar.f4238P = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4238P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, eVar.f4238P) == -2) {
                            eVar.f4238P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    eVar.f4240R = Math.max(RecyclerView.f1949A0, obtainStyledAttributes.getFloat(index, eVar.f4240R));
                    eVar.f4234L = 2;
                    break;
                case 36:
                    try {
                        eVar.f4237O = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4237O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, eVar.f4237O) == -2) {
                            eVar.f4237O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        eVar.f4239Q = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4239Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, eVar.f4239Q) == -2) {
                            eVar.f4239Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    eVar.f4241S = Math.max(RecyclerView.f1949A0, obtainStyledAttributes.getFloat(index, eVar.f4241S));
                    eVar.f4235M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            n.h(eVar, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.f4230H = obtainStyledAttributes.getFloat(index, eVar.f4230H);
                            break;
                        case 46:
                            eVar.f4231I = obtainStyledAttributes.getFloat(index, eVar.f4231I);
                            break;
                        case 47:
                            eVar.f4232J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.f4233K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.f4242T = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f4242T);
                            break;
                        case 50:
                            eVar.f4243U = obtainStyledAttributes.getDimensionPixelOffset(index, eVar.f4243U);
                            break;
                        case 51:
                            eVar.f4247Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, eVar.f4272n);
                            eVar.f4272n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f4272n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, eVar.f4273o);
                            eVar.f4273o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f4273o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            eVar.f4227D = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4227D);
                            break;
                        case 55:
                            eVar.f4226C = obtainStyledAttributes.getDimensionPixelSize(index, eVar.f4226C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    n.g(eVar, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(eVar, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.f4248Z = obtainStyledAttributes.getInt(index, eVar.f4248Z);
                                    break;
                                case 67:
                                    eVar.d = obtainStyledAttributes.getBoolean(index, eVar.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f1792g;
    }

    public int getMaxWidth() {
        return this.f1791f;
    }

    public int getMinHeight() {
        return this.f1790e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.f1789c.f4019D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f1789c;
        if (eVar.f3994j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f3994j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f3994j = "parent";
            }
        }
        if (eVar.f3992h0 == null) {
            eVar.f3992h0 = eVar.f3994j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f3992h0);
        }
        Iterator it = eVar.f4027q0.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            View view = dVar.f3989f0;
            if (view != null) {
                if (dVar.f3994j == null && (id = view.getId()) != -1) {
                    dVar.f3994j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f3992h0 == null) {
                    dVar.f3992h0 = dVar.f3994j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f3992h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.f1789c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof v.e) {
            return ((v.e) view.getLayoutParams()).f4276p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof v.e) {
            return ((v.e) view.getLayoutParams()).f4276p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        e eVar = this.f1789c;
        eVar.f3989f0 = this;
        f fVar = this.f1798o;
        eVar.f4030u0 = fVar;
        eVar.f4028s0.f4132f = fVar;
        this.f1787a.put(getId(), this);
        this.f1793j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4402b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.f1790e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1790e);
                } else if (index == 14) {
                    this.f1791f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1791f);
                } else if (index == 15) {
                    this.f1792g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1792g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1794k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1793j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1793j = null;
                    }
                    this.f1795l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.f4019D0 = this.i;
        C0330c.f3826p = eVar.W(512);
    }

    public final void j(int i) {
        int eventType;
        A a2;
        Context context = getContext();
        j jVar = new j(18, false);
        jVar.f72b = new SparseArray();
        jVar.f73c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            a2 = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1794k = jVar;
                return;
            }
            if (eventType == 0) {
                xml.getName();
            } else if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 2) {
                    a2 = new A(context, xml);
                    ((SparseArray) jVar.f72b).put(a2.f281a, a2);
                } else if (c2 == 3) {
                    g gVar = new g(context, xml);
                    if (a2 != null) {
                        ((ArrayList) a2.f283c).add(gVar);
                    }
                } else if (c2 == 4) {
                    jVar.I(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(e eVar, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        f fVar;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        f fVar2;
        int i12;
        f fVar3;
        boolean z4;
        k kVar;
        m mVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z5;
        Iterator it;
        Iterator it2;
        boolean z6;
        e eVar2 = eVar;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        f fVar4 = this.f1798o;
        fVar4.f4288b = max3;
        fVar4.f4289c = max4;
        fVar4.d = paddingWidth;
        fVar4.f4290e = i19;
        fVar4.f4291f = i2;
        fVar4.f4292g = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i20 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i21 = size - paddingWidth;
        int i22 = size2 - i19;
        int i23 = fVar4.f4290e;
        int i24 = fVar4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1791f - i24, i21);
                    i20 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.d);
                i4 = max;
                i20 = 2;
            } else {
                i4 = 0;
                i20 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.d);
            i4 = max;
            i20 = 2;
        } else {
            i4 = i21;
            i20 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1792g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1790e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1790e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = eVar.q();
        C0368e c0368e = eVar2.f4028s0;
        int i25 = i4;
        if (i25 != q2 || i5 != eVar.k()) {
            c0368e.f4130c = true;
        }
        eVar2.f3977Y = 0;
        eVar2.f3978Z = 0;
        int i26 = this.f1791f - i24;
        int[] iArr = eVar2.f3956C;
        iArr[0] = i26;
        iArr[1] = this.f1792g - i23;
        eVar2.f3982b0 = 0;
        eVar2.f3984c0 = 0;
        eVar2.M(i20);
        eVar2.O(i25);
        eVar2.N(i6);
        eVar2.L(i5);
        int i27 = this.d - i24;
        if (i27 < 0) {
            eVar2.f3982b0 = 0;
        } else {
            eVar2.f3982b0 = i27;
        }
        int i28 = this.f1790e - i23;
        if (i28 < 0) {
            eVar2.f3984c0 = 0;
        } else {
            eVar2.f3984c0 = i28;
        }
        eVar2.f4033x0 = max5;
        eVar2.f4034y0 = max3;
        C0019l c0019l = eVar2.r0;
        c0019l.getClass();
        f fVar5 = eVar2.f4030u0;
        int size3 = eVar2.f4027q0.size();
        int q3 = eVar.q();
        int k2 = eVar.k();
        boolean c2 = s.j.c(i, 128);
        boolean z7 = c2 || s.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                d dVar = (d) eVar2.f4027q0.get(i29);
                int[] iArr2 = dVar.f4006p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.f3975W > RecyclerView.f1949A0;
                if ((dVar.x() && z8) || ((dVar.y() && z8) || (dVar instanceof s.g) || dVar.x() || dVar.y())) {
                    i7 = 1073741824;
                    z7 = false;
                    break;
                }
            }
        }
        i7 = 1073741824;
        boolean z9 = ((mode == i7 && mode2 == i7) || c2) & z7;
        if (z9) {
            int min = Math.min(iArr[0], i21);
            int min2 = Math.min(iArr[1], i22);
            if (mode == 1073741824 && eVar.q() != min) {
                eVar2.O(min);
                eVar2.f4028s0.f4129b = true;
            }
            if (mode2 == 1073741824 && eVar.k() != min2) {
                eVar2.L(min2);
                eVar2.f4028s0.f4129b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0368e.f4129b;
                e eVar3 = c0368e.f4128a;
                if (z10 || c0368e.f4130c) {
                    Iterator it3 = eVar3.f4027q0.iterator();
                    while (it3.hasNext()) {
                        d dVar2 = (d) it3.next();
                        dVar2.h();
                        dVar2.f3979a = false;
                        dVar2.d.n();
                        dVar2.f3986e.m();
                    }
                    i15 = 0;
                    eVar3.h();
                    eVar3.f3979a = false;
                    eVar3.d.n();
                    eVar3.f3986e.m();
                    c0368e.f4130c = false;
                } else {
                    i15 = 0;
                }
                c0368e.b(c0368e.d);
                eVar3.f3977Y = i15;
                eVar3.f3978Z = i15;
                int j2 = eVar3.j(i15);
                int j3 = eVar3.j(1);
                if (c0368e.f4129b) {
                    c0368e.c();
                }
                int r2 = eVar3.r();
                int s2 = eVar3.s();
                z2 = z9;
                eVar3.d.h.d(r2);
                eVar3.f3986e.h.d(s2);
                c0368e.g();
                ArrayList arrayList2 = c0368e.f4131e;
                fVar = fVar5;
                if (j2 == 2 || j3 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((p) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j2 == 2) {
                        eVar3.M(1);
                        i8 = q3;
                        eVar3.O(c0368e.d(eVar3, 0));
                        eVar3.d.f4158e.d(eVar3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j3 == 2) {
                        i16 = 1;
                        eVar3.N(1);
                        eVar3.L(c0368e.d(eVar3, 1));
                        eVar3.f3986e.f4158e.d(eVar3.k());
                        int[] iArr3 = eVar3.f4006p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = eVar3.q() + r2;
                            eVar3.d.i.d(q4);
                            eVar3.d.f4158e.d(q4 - r2);
                            c0368e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = eVar3.k() + s2;
                                eVar3.f3986e.i.d(k3);
                                eVar3.f3986e.f4158e.d(k3 - s2);
                            }
                            c0368e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            p pVar = (p) it.next();
                            if (pVar.f4156b != eVar3 || pVar.f4160g) {
                                pVar.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            p pVar2 = (p) it2.next();
                            if (z5 || pVar2.f4156b != eVar3) {
                                if (!pVar2.h.f4140j || ((!pVar2.i.f4140j && !(pVar2 instanceof i)) || (!pVar2.f4158e.f4140j && !(pVar2 instanceof C0366c) && !(pVar2 instanceof i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        eVar3.M(j2);
                        eVar3.N(j3);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = eVar3.f4006p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = eVar3.q() + r2;
                eVar3.d.i.d(q42);
                eVar3.d.f4158e.d(q42 - r2);
                c0368e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = eVar3.k() + s2;
                eVar3.f3986e.i.d(k32);
                eVar3.f3986e.f4158e.d(k32 - s2);
                c0368e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                eVar3.M(j2);
                eVar3.N(j3);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                fVar = fVar5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0368e.f4129b;
                e eVar4 = c0368e.f4128a;
                if (z11) {
                    Iterator it5 = eVar4.f4027q0.iterator();
                    while (it5.hasNext()) {
                        d dVar3 = (d) it5.next();
                        dVar3.h();
                        dVar3.f3979a = false;
                        k kVar2 = dVar3.d;
                        kVar2.f4158e.f4140j = false;
                        kVar2.f4160g = false;
                        kVar2.n();
                        m mVar2 = dVar3.f3986e;
                        mVar2.f4158e.f4140j = false;
                        mVar2.f4160g = false;
                        mVar2.m();
                    }
                    i13 = 0;
                    eVar4.h();
                    eVar4.f3979a = false;
                    k kVar3 = eVar4.d;
                    kVar3.f4158e.f4140j = false;
                    kVar3.f4160g = false;
                    kVar3.n();
                    m mVar3 = eVar4.f3986e;
                    mVar3.f4158e.f4140j = false;
                    mVar3.f4160g = false;
                    mVar3.m();
                    c0368e.c();
                } else {
                    i13 = 0;
                }
                c0368e.b(c0368e.d);
                eVar4.f3977Y = i13;
                eVar4.f3978Z = i13;
                eVar4.d.h.d(i13);
                eVar4.f3986e.h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = eVar2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= eVar2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                eVar2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            fVar = fVar5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = eVar2.f4019D0;
        if (size3 > 0) {
            int size4 = eVar2.f4027q0.size();
            boolean W2 = eVar2.W(64);
            f fVar6 = eVar2.f4030u0;
            for (int i31 = 0; i31 < size4; i31++) {
                d dVar4 = (d) eVar2.f4027q0.get(i31);
                if (!(dVar4 instanceof h) && !(dVar4 instanceof C0361a) && !dVar4.F && (!W2 || (kVar = dVar4.d) == null || (mVar = dVar4.f3986e) == null || !kVar.f4158e.f4140j || !mVar.f4158e.f4140j)) {
                    int j4 = dVar4.j(0);
                    int j5 = dVar4.j(1);
                    boolean z12 = j4 == 3 && dVar4.f4008r != 1 && j5 == 3 && dVar4.f4009s != 1;
                    if (!z12 && eVar2.W(1) && !(dVar4 instanceof s.g)) {
                        if (j4 == 3 && dVar4.f4008r == 0 && j5 != 3 && !dVar4.x()) {
                            z12 = true;
                        }
                        if (j5 == 3 && dVar4.f4009s == 0 && j4 != 3 && !dVar4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 || j5 == 3) {
                            if (dVar4.f3975W > RecyclerView.f1949A0) {
                                z12 = true;
                            }
                            if (z12) {
                                c0019l.h(0, dVar4, fVar6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar6.f4287a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1788b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((c) arrayList3.get(i33)).getClass();
                }
            }
        }
        c0019l.m(eVar2);
        ArrayList arrayList4 = (ArrayList) c0019l.f683a;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            c0019l.l(eVar2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = eVar2.f4006p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = eVar.q();
            e eVar5 = (e) c0019l.f685c;
            int max7 = Math.max(q5, eVar5.f3982b0);
            int max8 = Math.max(eVar.k(), eVar5.f3984c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                d dVar5 = (d) arrayList4.get(i36);
                if (dVar5 instanceof s.g) {
                    int q6 = dVar5.q();
                    int k4 = dVar5.k();
                    i12 = i30;
                    fVar3 = fVar;
                    boolean h = z15 | c0019l.h(1, dVar5, fVar3);
                    int q7 = dVar5.q();
                    int k5 = dVar5.k();
                    if (q7 != q6) {
                        dVar5.O(q7);
                        if (z13 && dVar5.r() + dVar5.f3973U > max7) {
                            max7 = Math.max(max7, dVar5.i(4).e() + dVar5.r() + dVar5.f3973U);
                        }
                        z4 = true;
                    } else {
                        z4 = h;
                    }
                    if (k5 != k4) {
                        dVar5.L(k5);
                        if (z14 && dVar5.s() + dVar5.f3974V > max8) {
                            max8 = Math.max(max8, dVar5.i(5).e() + dVar5.s() + dVar5.f3974V);
                        }
                        z4 = true;
                    }
                    z15 = ((s.g) dVar5).f4083y0 | z4;
                } else {
                    i12 = i30;
                    fVar3 = fVar;
                }
                i36++;
                fVar = fVar3;
                i30 = i12;
            }
            int i37 = i30;
            f fVar7 = fVar;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    d dVar6 = (d) arrayList4.get(i39);
                    if (((dVar6 instanceof s.i) && !(dVar6 instanceof s.g)) || (dVar6 instanceof h) || dVar6.f3991g0 == 8 || ((z2 && dVar6.d.f4158e.f4140j && dVar6.f3986e.f4158e.f4140j) || (dVar6 instanceof s.g))) {
                        fVar2 = fVar7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q8 = dVar6.q();
                        int k6 = dVar6.k();
                        arrayList = arrayList4;
                        int i40 = dVar6.f3980a0;
                        i11 = size6;
                        boolean h2 = c0019l.h(i38 == 1 ? 2 : 1, dVar6, fVar7) | z15;
                        int q9 = dVar6.q();
                        fVar2 = fVar7;
                        int k7 = dVar6.k();
                        if (q9 != q8) {
                            dVar6.O(q9);
                            if (z13 && dVar6.r() + dVar6.f3973U > max7) {
                                max7 = Math.max(max7, dVar6.i(4).e() + dVar6.r() + dVar6.f3973U);
                            }
                            h2 = true;
                        }
                        if (k7 != k6) {
                            dVar6.L(k7);
                            if (z14 && dVar6.s() + dVar6.f3974V > max8) {
                                max8 = Math.max(max8, dVar6.i(5).e() + dVar6.s() + dVar6.f3974V);
                            }
                            h2 = true;
                        }
                        z15 = (!dVar6.f3958E || i40 == dVar6.f3980a0) ? h2 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    fVar7 = fVar2;
                }
                f fVar8 = fVar7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                c0019l.l(eVar, i38, i34, i35);
                fVar7 = fVar8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            eVar2 = eVar;
            i30 = i37;
        }
        eVar2.f4019D0 = i30;
        C0330c.f3826p = eVar2.W(512);
    }

    public final void l(d dVar, v.e eVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1787a.get(i);
        d dVar2 = (d) sparseArray.get(i);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof v.e)) {
            return;
        }
        eVar.f4254c0 = true;
        if (i2 == 6) {
            v.e eVar2 = (v.e) view.getLayoutParams();
            eVar2.f4254c0 = true;
            eVar2.f4276p0.f3958E = true;
        }
        dVar.i(6).b(dVar2.i(i2), eVar.f4227D, eVar.f4226C, true);
        dVar.f3958E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            v.e eVar = (v.e) childAt.getLayoutParams();
            d dVar = eVar.f4276p0;
            if (childAt.getVisibility() != 8 || eVar.f4255d0 || eVar.f4257e0 || isInEditMode) {
                int r2 = dVar.r();
                int s2 = dVar.s();
                childAt.layout(r2, s2, dVar.q() + r2, dVar.k() + s2);
            }
        }
        ArrayList arrayList = this.f1788b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((c) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0310  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        d dVar;
        int i5;
        d dVar2;
        int i6;
        d dVar3;
        int i7;
        v.e eVar;
        float f2;
        int i8;
        int i9;
        int i10;
        float parseFloat;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        String resourceName;
        int id;
        d dVar4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1799p == i) {
            int i12 = constraintLayout.f1800q;
        }
        int i13 = 0;
        if (!constraintLayout.h) {
            int childCount = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i14).isLayoutRequested()) {
                    constraintLayout.h = true;
                    break;
                }
                i14++;
            }
        }
        constraintLayout.f1799p = i;
        constraintLayout.f1800q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        e eVar2 = constraintLayout.f1789c;
        eVar2.f4031v0 = z3;
        if (constraintLayout.h) {
            constraintLayout.h = false;
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i15).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i15++;
                }
            }
            if (z2) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    d h = constraintLayout.h(constraintLayout.getChildAt(i16));
                    if (h != null) {
                        h.C();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt = constraintLayout.getChildAt(i17);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.f1796m == null) {
                                    constraintLayout.f1796m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1796m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1787a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                dVar4 = view == null ? null : ((v.e) view.getLayoutParams()).f4276p0;
                                dVar4.f3992h0 = resourceName;
                            }
                        }
                        dVar4 = eVar2;
                        dVar4.f3992h0 = resourceName;
                    }
                }
                if (constraintLayout.f1795l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                n nVar = constraintLayout.f1793j;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                eVar2.f4027q0.clear();
                ArrayList arrayList3 = constraintLayout.f1788b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        c cVar = (c) arrayList3.get(i19);
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f4220e);
                        }
                        s.i iVar = cVar.d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.r0 = i13;
                            Arrays.fill(iVar.f4090q0, obj);
                            int i20 = i13;
                            while (i20 < cVar.f4218b) {
                                int i21 = cVar.f4217a[i20];
                                View view2 = (View) constraintLayout.f1787a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = cVar.f4222g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = cVar.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        cVar.f4217a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1787a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    s.i iVar2 = cVar.d;
                                    d h2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h2 != iVar2 && h2 != null) {
                                        int i22 = iVar2.r0 + 1;
                                        d[] dVarArr = iVar2.f4090q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > dVarArr.length) {
                                            iVar2.f4090q0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f4090q0;
                                        int i23 = iVar2.r0;
                                        dVarArr2[i23] = h2;
                                        iVar2.r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            cVar.d.S();
                        }
                        i19++;
                        arrayList3 = arrayList;
                        obj = null;
                        i13 = 0;
                    }
                }
                for (int i24 = 0; i24 < childCount3; i24++) {
                    constraintLayout.getChildAt(i24);
                }
                SparseArray sparseArray = constraintLayout.f1797n;
                sparseArray.clear();
                sparseArray.put(0, eVar2);
                sparseArray.put(getId(), eVar2);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    d h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        v.e eVar3 = (v.e) childAt3.getLayoutParams();
                        eVar2.f4027q0.add(h3);
                        d dVar5 = h3.f3972T;
                        if (dVar5 != null) {
                            ((e) dVar5).f4027q0.remove(h3);
                            h3.C();
                        }
                        h3.f3972T = eVar2;
                        eVar3.a();
                        h3.f3991g0 = childAt3.getVisibility();
                        h3.f3989f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(h3, eVar2.f4031v0);
                        }
                        if (eVar3.f4255d0) {
                            h hVar = (h) h3;
                            int i27 = eVar3.f4271m0;
                            int i28 = eVar3.n0;
                            float f4 = eVar3.f4274o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f4085q0 = f4;
                                    hVar.r0 = -1;
                                    hVar.f4086s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.f4085q0 = -1.0f;
                                    hVar.r0 = i27;
                                    hVar.f4086s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.f4085q0 = -1.0f;
                                hVar.r0 = -1;
                                hVar.f4086s0 = i28;
                            }
                        } else {
                            int i29 = eVar3.f4259f0;
                            int i30 = eVar3.f4261g0;
                            int i31 = eVar3.f4262h0;
                            int i32 = eVar3.f4263i0;
                            int i33 = eVar3.f4265j0;
                            i3 = childCount3;
                            int i34 = eVar3.f4267k0;
                            float f5 = eVar3.f4269l0;
                            int i35 = eVar3.f4275p;
                            if (i35 != -1) {
                                d dVar6 = (d) sparseArray.get(i35);
                                if (dVar6 != null) {
                                    float f6 = eVar3.f4278r;
                                    h3.v(7, 7, eVar3.f4277q, 0, dVar6);
                                    h3.f3957D = f6;
                                }
                                eVar = eVar3;
                            } else {
                                if (i29 != -1) {
                                    d dVar7 = (d) sparseArray.get(i29);
                                    if (dVar7 != null) {
                                        h3.v(2, 2, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i33, dVar7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        d dVar8 = (d) sparseArray.get(i30);
                                        if (dVar8 != null) {
                                            h3.v(2, 4, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i33, dVar8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        d dVar9 = (d) sparseArray.get(i31);
                                        if (dVar9 != null) {
                                            h3.v(4, 2, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i34, dVar9);
                                        }
                                    } else if (i32 != i4 && (dVar = (d) sparseArray.get(i32)) != null) {
                                        h3.v(4, 4, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i34, dVar);
                                    }
                                    i5 = eVar3.i;
                                    if (i5 == -1) {
                                        d dVar10 = (d) sparseArray.get(i5);
                                        if (dVar10 != null) {
                                            h3.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f4284x, dVar10);
                                        }
                                    } else {
                                        int i36 = eVar3.f4264j;
                                        if (i36 != -1 && (dVar2 = (d) sparseArray.get(i36)) != null) {
                                            h3.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f4284x, dVar2);
                                        }
                                    }
                                    i6 = eVar3.f4266k;
                                    if (i6 == -1) {
                                        d dVar11 = (d) sparseArray.get(i6);
                                        if (dVar11 != null) {
                                            h3.v(5, 3, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f4286z, dVar11);
                                        }
                                    } else {
                                        int i37 = eVar3.f4268l;
                                        if (i37 != -1 && (dVar3 = (d) sparseArray.get(i37)) != null) {
                                            h3.v(5, 5, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f4286z, dVar3);
                                        }
                                    }
                                    i7 = eVar3.f4270m;
                                    if (i7 == -1) {
                                        eVar = eVar3;
                                        l(h3, eVar3, sparseArray, i7, 6);
                                    } else {
                                        eVar = eVar3;
                                        int i38 = eVar.f4272n;
                                        if (i38 != -1) {
                                            l(h3, eVar, sparseArray, i38, 3);
                                        } else {
                                            int i39 = eVar.f4273o;
                                            if (i39 != -1) {
                                                l(h3, eVar, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= RecyclerView.f1949A0) {
                                        h3.f3985d0 = f5;
                                    }
                                    f2 = eVar.F;
                                    if (f2 >= RecyclerView.f1949A0) {
                                        h3.f3987e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = eVar3.i;
                                if (i5 == -1) {
                                }
                                i6 = eVar3.f4266k;
                                if (i6 == -1) {
                                }
                                i7 = eVar3.f4270m;
                                if (i7 == -1) {
                                }
                                if (f5 >= RecyclerView.f1949A0) {
                                }
                                f2 = eVar.F;
                                if (f2 >= RecyclerView.f1949A0) {
                                }
                            }
                            if (isInEditMode && ((i11 = eVar.f4242T) != -1 || eVar.f4243U != -1)) {
                                int i40 = eVar.f4243U;
                                h3.f3977Y = i11;
                                h3.f3978Z = i40;
                            }
                            if (eVar.f4250a0) {
                                h3.M(1);
                                h3.O(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    h3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.f4245W) {
                                    h3.M(3);
                                } else {
                                    h3.M(4);
                                }
                                h3.i(2).f3953g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                h3.i(4).f3953g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                h3.M(3);
                                h3.O(0);
                            }
                            if (eVar.f4252b0) {
                                i8 = -1;
                                h3.N(1);
                                h3.L(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    h3.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.f4246X) {
                                        h3.N(3);
                                    } else {
                                        h3.N(4);
                                    }
                                    h3.i(3).f3953g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    h3.i(5).f3953g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                                } else {
                                    h3.N(3);
                                    h3.L(0);
                                }
                            }
                            String str2 = eVar.f4229G;
                            if (str2 == null || str2.length() == 0) {
                                h3.f3975W = RecyclerView.f1949A0;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i9 = i8;
                                    i10 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i9 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i8;
                                    i10 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i10);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = RecyclerView.f1949A0;
                                } else {
                                    String substring3 = str2.substring(i10, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > RecyclerView.f1949A0 && parseFloat3 > RecyclerView.f1949A0) {
                                                parseFloat = i9 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                    parseFloat = RecyclerView.f1949A0;
                                }
                                if (parseFloat > RecyclerView.f1949A0) {
                                    h3.f3975W = parseFloat;
                                    h3.f3976X = i9;
                                }
                            }
                            float f7 = eVar.f4230H;
                            float[] fArr = h3.f3997k0;
                            fArr[0] = f7;
                            fArr[1] = eVar.f4231I;
                            h3.f3993i0 = eVar.f4232J;
                            h3.f3995j0 = eVar.f4233K;
                            int i41 = eVar.f4248Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h3.f4007q = i41;
                            }
                            int i42 = eVar.f4234L;
                            int i43 = eVar.f4236N;
                            int i44 = eVar.f4238P;
                            float f8 = eVar.f4240R;
                            h3.f4008r = i42;
                            h3.f4011u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h3.f4012v = i44;
                            h3.f4013w = f8;
                            if (f8 > RecyclerView.f1949A0 && f8 < 1.0f && i42 == 0) {
                                h3.f4008r = 2;
                            }
                            int i45 = eVar.f4235M;
                            int i46 = eVar.f4237O;
                            int i47 = eVar.f4239Q;
                            float f9 = eVar.f4241S;
                            h3.f4009s = i45;
                            h3.f4014x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h3.f4015y = i47;
                            h3.f4016z = f9;
                            if (f9 > RecyclerView.f1949A0 && f9 < 1.0f && i45 == 0) {
                                h3.f4009s = 2;
                            }
                            i26++;
                            constraintLayout = this;
                            childCount3 = i3;
                        }
                    }
                    i3 = childCount3;
                    i26++;
                    constraintLayout = this;
                    childCount3 = i3;
                }
            }
            if (z2) {
                eVar2.r0.m(eVar2);
            }
        }
        k(eVar2, this.i, i, i2);
        int q2 = eVar2.q();
        int k2 = eVar2.k();
        boolean z4 = eVar2.f4020E0;
        boolean z5 = eVar2.f4021F0;
        f fVar = this.f1798o;
        int i48 = fVar.f4290e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + fVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1791f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1792g, resolveSizeAndState2);
        if (z4) {
            min |= 16777216;
        }
        if (z5) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d h = h(view);
        if ((view instanceof v.p) && !(h instanceof h)) {
            v.e eVar = (v.e) view.getLayoutParams();
            h hVar = new h();
            eVar.f4276p0 = hVar;
            eVar.f4255d0 = true;
            hVar.S(eVar.f4244V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((v.e) view.getLayoutParams()).f4257e0 = true;
            ArrayList arrayList = this.f1788b;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f1787a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1787a.remove(view.getId());
        d h = h(view);
        this.f1789c.f4027q0.remove(h);
        h.C();
        this.f1788b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1793j = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1787a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1792g) {
            return;
        }
        this.f1792g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1791f) {
            return;
        }
        this.f1791f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1790e) {
            return;
        }
        this.f1790e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        j jVar = this.f1794k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        e eVar = this.f1789c;
        eVar.f4019D0 = i;
        C0330c.f3826p = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1787a = new SparseArray();
        this.f1788b = new ArrayList(4);
        this.f1789c = new e();
        this.d = 0;
        this.f1790e = 0;
        this.f1791f = Integer.MAX_VALUE;
        this.f1792g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1793j = null;
        this.f1794k = null;
        this.f1795l = -1;
        this.f1796m = new HashMap();
        this.f1797n = new SparseArray();
        this.f1798o = new f(this, this);
        this.f1799p = 0;
        this.f1800q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        v.e eVar = new v.e(layoutParams);
        eVar.f4249a = -1;
        eVar.f4251b = -1;
        eVar.f4253c = -1.0f;
        eVar.d = true;
        eVar.f4256e = -1;
        eVar.f4258f = -1;
        eVar.f4260g = -1;
        eVar.h = -1;
        eVar.i = -1;
        eVar.f4264j = -1;
        eVar.f4266k = -1;
        eVar.f4268l = -1;
        eVar.f4270m = -1;
        eVar.f4272n = -1;
        eVar.f4273o = -1;
        eVar.f4275p = -1;
        eVar.f4277q = 0;
        eVar.f4278r = RecyclerView.f1949A0;
        eVar.f4279s = -1;
        eVar.f4280t = -1;
        eVar.f4281u = -1;
        eVar.f4282v = -1;
        eVar.f4283w = Integer.MIN_VALUE;
        eVar.f4284x = Integer.MIN_VALUE;
        eVar.f4285y = Integer.MIN_VALUE;
        eVar.f4286z = Integer.MIN_VALUE;
        eVar.f4224A = Integer.MIN_VALUE;
        eVar.f4225B = Integer.MIN_VALUE;
        eVar.f4226C = Integer.MIN_VALUE;
        eVar.f4227D = 0;
        eVar.f4228E = 0.5f;
        eVar.F = 0.5f;
        eVar.f4229G = null;
        eVar.f4230H = -1.0f;
        eVar.f4231I = -1.0f;
        eVar.f4232J = 0;
        eVar.f4233K = 0;
        eVar.f4234L = 0;
        eVar.f4235M = 0;
        eVar.f4236N = 0;
        eVar.f4237O = 0;
        eVar.f4238P = 0;
        eVar.f4239Q = 0;
        eVar.f4240R = 1.0f;
        eVar.f4241S = 1.0f;
        eVar.f4242T = -1;
        eVar.f4243U = -1;
        eVar.f4244V = -1;
        eVar.f4245W = false;
        eVar.f4246X = false;
        eVar.f4247Y = null;
        eVar.f4248Z = 0;
        eVar.f4250a0 = true;
        eVar.f4252b0 = true;
        eVar.f4254c0 = false;
        eVar.f4255d0 = false;
        eVar.f4257e0 = false;
        eVar.f4259f0 = -1;
        eVar.f4261g0 = -1;
        eVar.f4262h0 = -1;
        eVar.f4263i0 = -1;
        eVar.f4265j0 = Integer.MIN_VALUE;
        eVar.f4267k0 = Integer.MIN_VALUE;
        eVar.f4269l0 = 0.5f;
        eVar.f4276p0 = new d();
        return eVar;
    }
}
