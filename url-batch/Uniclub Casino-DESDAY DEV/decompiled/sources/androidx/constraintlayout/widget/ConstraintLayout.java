package androidx.constraintlayout.widget;

import B.j;
import K.C0011l;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p1.y;
import q.C0284c;
import s.C0293a;
import s.C0296d;
import s.C0297e;
import s.g;
import s.h;
import s.i;
import t.AbstractC0313o;
import t.C0301c;
import t.C0303e;
import t.C0307i;
import t.C0309k;
import t.C0311m;
import v.AbstractC0319c;
import v.AbstractC0320d;
import v.C0321e;
import v.C0322f;
import v.C0323g;
import v.n;
import v.o;
import v.p;
import v.r;
import v.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1252r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1253a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1254b;

    /* renamed from: c, reason: collision with root package name */
    public final C0297e f1255c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1256e;

    /* renamed from: f, reason: collision with root package name */
    public int f1257f;

    /* renamed from: g, reason: collision with root package name */
    public int f1258g;
    public boolean h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public n f1259j;

    /* renamed from: k, reason: collision with root package name */
    public j f1260k;

    /* renamed from: l, reason: collision with root package name */
    public int f1261l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1262m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1263n;

    /* renamed from: o, reason: collision with root package name */
    public final C0322f f1264o;

    /* renamed from: p, reason: collision with root package name */
    public int f1265p;

    /* renamed from: q, reason: collision with root package name */
    public int f1266q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1253a = new SparseArray();
        this.f1254b = new ArrayList(4);
        this.f1255c = new C0297e();
        this.d = 0;
        this.f1256e = 0;
        this.f1257f = Integer.MAX_VALUE;
        this.f1258g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1259j = null;
        this.f1260k = null;
        this.f1261l = -1;
        this.f1262m = new HashMap();
        this.f1263n = new SparseArray();
        this.f1264o = new C0322f(this, this);
        this.f1265p = 0;
        this.f1266q = 0;
        i(attributeSet, 0);
    }

    public static C0321e g() {
        C0321e c0321e = new C0321e(-2, -2);
        c0321e.f3856a = -1;
        c0321e.f3858b = -1;
        c0321e.f3860c = -1.0f;
        c0321e.d = true;
        c0321e.f3863e = -1;
        c0321e.f3865f = -1;
        c0321e.f3867g = -1;
        c0321e.h = -1;
        c0321e.i = -1;
        c0321e.f3871j = -1;
        c0321e.f3872k = -1;
        c0321e.f3874l = -1;
        c0321e.f3876m = -1;
        c0321e.f3878n = -1;
        c0321e.f3880o = -1;
        c0321e.f3882p = -1;
        c0321e.f3884q = 0;
        c0321e.f3885r = 0.0f;
        c0321e.f3886s = -1;
        c0321e.f3887t = -1;
        c0321e.f3888u = -1;
        c0321e.f3889v = -1;
        c0321e.f3890w = Integer.MIN_VALUE;
        c0321e.f3891x = Integer.MIN_VALUE;
        c0321e.f3892y = Integer.MIN_VALUE;
        c0321e.f3893z = Integer.MIN_VALUE;
        c0321e.f3831A = Integer.MIN_VALUE;
        c0321e.f3832B = Integer.MIN_VALUE;
        c0321e.f3833C = Integer.MIN_VALUE;
        c0321e.f3834D = 0;
        c0321e.f3835E = 0.5f;
        c0321e.F = 0.5f;
        c0321e.f3836G = null;
        c0321e.f3837H = -1.0f;
        c0321e.f3838I = -1.0f;
        c0321e.f3839J = 0;
        c0321e.f3840K = 0;
        c0321e.f3841L = 0;
        c0321e.f3842M = 0;
        c0321e.f3843N = 0;
        c0321e.f3844O = 0;
        c0321e.f3845P = 0;
        c0321e.f3846Q = 0;
        c0321e.f3847R = 1.0f;
        c0321e.f3848S = 1.0f;
        c0321e.f3849T = -1;
        c0321e.f3850U = -1;
        c0321e.f3851V = -1;
        c0321e.f3852W = false;
        c0321e.f3853X = false;
        c0321e.f3854Y = null;
        c0321e.f3855Z = 0;
        c0321e.f3857a0 = true;
        c0321e.f3859b0 = true;
        c0321e.f3861c0 = false;
        c0321e.f3862d0 = false;
        c0321e.f3864e0 = false;
        c0321e.f3866f0 = -1;
        c0321e.f3868g0 = -1;
        c0321e.f3869h0 = -1;
        c0321e.f3870i0 = -1;
        c0321e.j0 = Integer.MIN_VALUE;
        c0321e.f3873k0 = Integer.MIN_VALUE;
        c0321e.f3875l0 = 0.5f;
        c0321e.f3883p0 = new C0296d();
        return c0321e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f1252r == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f1252r = sVar;
        }
        return f1252r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0321e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1254b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0319c) arrayList.get(i)).getClass();
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
        C0321e c0321e = new C0321e(context, attributeSet);
        c0321e.f3856a = -1;
        c0321e.f3858b = -1;
        c0321e.f3860c = -1.0f;
        c0321e.d = true;
        c0321e.f3863e = -1;
        c0321e.f3865f = -1;
        c0321e.f3867g = -1;
        c0321e.h = -1;
        c0321e.i = -1;
        c0321e.f3871j = -1;
        c0321e.f3872k = -1;
        c0321e.f3874l = -1;
        c0321e.f3876m = -1;
        c0321e.f3878n = -1;
        c0321e.f3880o = -1;
        c0321e.f3882p = -1;
        c0321e.f3884q = 0;
        c0321e.f3885r = 0.0f;
        c0321e.f3886s = -1;
        c0321e.f3887t = -1;
        c0321e.f3888u = -1;
        c0321e.f3889v = -1;
        c0321e.f3890w = Integer.MIN_VALUE;
        c0321e.f3891x = Integer.MIN_VALUE;
        c0321e.f3892y = Integer.MIN_VALUE;
        c0321e.f3893z = Integer.MIN_VALUE;
        c0321e.f3831A = Integer.MIN_VALUE;
        c0321e.f3832B = Integer.MIN_VALUE;
        c0321e.f3833C = Integer.MIN_VALUE;
        c0321e.f3834D = 0;
        c0321e.f3835E = 0.5f;
        c0321e.F = 0.5f;
        c0321e.f3836G = null;
        c0321e.f3837H = -1.0f;
        c0321e.f3838I = -1.0f;
        c0321e.f3839J = 0;
        c0321e.f3840K = 0;
        c0321e.f3841L = 0;
        c0321e.f3842M = 0;
        c0321e.f3843N = 0;
        c0321e.f3844O = 0;
        c0321e.f3845P = 0;
        c0321e.f3846Q = 0;
        c0321e.f3847R = 1.0f;
        c0321e.f3848S = 1.0f;
        c0321e.f3849T = -1;
        c0321e.f3850U = -1;
        c0321e.f3851V = -1;
        c0321e.f3852W = false;
        c0321e.f3853X = false;
        c0321e.f3854Y = null;
        c0321e.f3855Z = 0;
        c0321e.f3857a0 = true;
        c0321e.f3859b0 = true;
        c0321e.f3861c0 = false;
        c0321e.f3862d0 = false;
        c0321e.f3864e0 = false;
        c0321e.f3866f0 = -1;
        c0321e.f3868g0 = -1;
        c0321e.f3869h0 = -1;
        c0321e.f3870i0 = -1;
        c0321e.j0 = Integer.MIN_VALUE;
        c0321e.f3873k0 = Integer.MIN_VALUE;
        c0321e.f3875l0 = 0.5f;
        c0321e.f3883p0 = new C0296d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4009b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0320d.f3830a.get(index);
            switch (i2) {
                case 1:
                    c0321e.f3851V = obtainStyledAttributes.getInt(index, c0321e.f3851V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c0321e.f3882p);
                    c0321e.f3882p = resourceId;
                    if (resourceId == -1) {
                        c0321e.f3882p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0321e.f3884q = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3884q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c0321e.f3885r) % 360.0f;
                    c0321e.f3885r = f2;
                    if (f2 < 0.0f) {
                        c0321e.f3885r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0321e.f3856a = obtainStyledAttributes.getDimensionPixelOffset(index, c0321e.f3856a);
                    break;
                case 6:
                    c0321e.f3858b = obtainStyledAttributes.getDimensionPixelOffset(index, c0321e.f3858b);
                    break;
                case 7:
                    c0321e.f3860c = obtainStyledAttributes.getFloat(index, c0321e.f3860c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c0321e.f3863e);
                    c0321e.f3863e = resourceId2;
                    if (resourceId2 == -1) {
                        c0321e.f3863e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c0321e.f3865f);
                    c0321e.f3865f = resourceId3;
                    if (resourceId3 == -1) {
                        c0321e.f3865f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c0321e.f3867g);
                    c0321e.f3867g = resourceId4;
                    if (resourceId4 == -1) {
                        c0321e.f3867g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c0321e.h);
                    c0321e.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0321e.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c0321e.i);
                    c0321e.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0321e.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c0321e.f3871j);
                    c0321e.f3871j = resourceId7;
                    if (resourceId7 == -1) {
                        c0321e.f3871j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c0321e.f3872k);
                    c0321e.f3872k = resourceId8;
                    if (resourceId8 == -1) {
                        c0321e.f3872k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c0321e.f3874l);
                    c0321e.f3874l = resourceId9;
                    if (resourceId9 == -1) {
                        c0321e.f3874l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c0321e.f3876m);
                    c0321e.f3876m = resourceId10;
                    if (resourceId10 == -1) {
                        c0321e.f3876m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c0321e.f3886s);
                    c0321e.f3886s = resourceId11;
                    if (resourceId11 == -1) {
                        c0321e.f3886s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c0321e.f3887t);
                    c0321e.f3887t = resourceId12;
                    if (resourceId12 == -1) {
                        c0321e.f3887t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c0321e.f3888u);
                    c0321e.f3888u = resourceId13;
                    if (resourceId13 == -1) {
                        c0321e.f3888u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c0321e.f3889v);
                    c0321e.f3889v = resourceId14;
                    if (resourceId14 == -1) {
                        c0321e.f3889v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0321e.f3890w = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3890w);
                    break;
                case 22:
                    c0321e.f3891x = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3891x);
                    break;
                case 23:
                    c0321e.f3892y = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3892y);
                    break;
                case 24:
                    c0321e.f3893z = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3893z);
                    break;
                case 25:
                    c0321e.f3831A = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3831A);
                    break;
                case 26:
                    c0321e.f3832B = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3832B);
                    break;
                case 27:
                    c0321e.f3852W = obtainStyledAttributes.getBoolean(index, c0321e.f3852W);
                    break;
                case 28:
                    c0321e.f3853X = obtainStyledAttributes.getBoolean(index, c0321e.f3853X);
                    break;
                case 29:
                    c0321e.f3835E = obtainStyledAttributes.getFloat(index, c0321e.f3835E);
                    break;
                case 30:
                    c0321e.F = obtainStyledAttributes.getFloat(index, c0321e.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c0321e.f3841L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c0321e.f3842M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c0321e.f3843N = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3843N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c0321e.f3843N) == -2) {
                            c0321e.f3843N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0321e.f3845P = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3845P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c0321e.f3845P) == -2) {
                            c0321e.f3845P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c0321e.f3847R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0321e.f3847R));
                    c0321e.f3841L = 2;
                    break;
                case 36:
                    try {
                        c0321e.f3844O = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3844O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c0321e.f3844O) == -2) {
                            c0321e.f3844O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0321e.f3846Q = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3846Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c0321e.f3846Q) == -2) {
                            c0321e.f3846Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c0321e.f3848S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c0321e.f3848S));
                    c0321e.f3842M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            n.h(c0321e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0321e.f3837H = obtainStyledAttributes.getFloat(index, c0321e.f3837H);
                            break;
                        case 46:
                            c0321e.f3838I = obtainStyledAttributes.getFloat(index, c0321e.f3838I);
                            break;
                        case 47:
                            c0321e.f3839J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0321e.f3840K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0321e.f3849T = obtainStyledAttributes.getDimensionPixelOffset(index, c0321e.f3849T);
                            break;
                        case 50:
                            c0321e.f3850U = obtainStyledAttributes.getDimensionPixelOffset(index, c0321e.f3850U);
                            break;
                        case 51:
                            c0321e.f3854Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c0321e.f3878n);
                            c0321e.f3878n = resourceId15;
                            if (resourceId15 == -1) {
                                c0321e.f3878n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c0321e.f3880o);
                            c0321e.f3880o = resourceId16;
                            if (resourceId16 == -1) {
                                c0321e.f3880o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c0321e.f3834D = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3834D);
                            break;
                        case 55:
                            c0321e.f3833C = obtainStyledAttributes.getDimensionPixelSize(index, c0321e.f3833C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    n.g(c0321e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(c0321e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0321e.f3855Z = obtainStyledAttributes.getInt(index, c0321e.f3855Z);
                                    break;
                                case 67:
                                    c0321e.d = obtainStyledAttributes.getBoolean(index, c0321e.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c0321e.a();
        return c0321e;
    }

    public int getMaxHeight() {
        return this.f1258g;
    }

    public int getMaxWidth() {
        return this.f1257f;
    }

    public int getMinHeight() {
        return this.f1256e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.f1255c.f3687D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0297e c0297e = this.f1255c;
        if (c0297e.f3661j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0297e.f3661j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0297e.f3661j = "parent";
            }
        }
        if (c0297e.f3659h0 == null) {
            c0297e.f3659h0 = c0297e.f3661j;
            Log.v("ConstraintLayout", " setDebugName " + c0297e.f3659h0);
        }
        Iterator it = c0297e.f3695q0.iterator();
        while (it.hasNext()) {
            C0296d c0296d = (C0296d) it.next();
            View view = c0296d.f3656f0;
            if (view != null) {
                if (c0296d.f3661j == null && (id = view.getId()) != -1) {
                    c0296d.f3661j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0296d.f3659h0 == null) {
                    c0296d.f3659h0 = c0296d.f3661j;
                    Log.v("ConstraintLayout", " setDebugName " + c0296d.f3659h0);
                }
            }
        }
        c0297e.n(sb);
        return sb.toString();
    }

    public final C0296d h(View view) {
        if (view == this) {
            return this.f1255c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0321e) {
            return ((C0321e) view.getLayoutParams()).f3883p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0321e) {
            return ((C0321e) view.getLayoutParams()).f3883p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0297e c0297e = this.f1255c;
        c0297e.f3656f0 = this;
        C0322f c0322f = this.f1264o;
        c0297e.f3699u0 = c0322f;
        c0297e.f3697s0.f3778f = c0322f;
        this.f1253a.put(getId(), this);
        this.f1259j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4009b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.f1256e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1256e);
                } else if (index == 14) {
                    this.f1257f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1257f);
                } else if (index == 15) {
                    this.f1258g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1258g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1260k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1259j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1259j = null;
                    }
                    this.f1261l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0297e.f3687D0 = this.i;
        C0284c.f3524p = c0297e.W(512);
    }

    public final void j(int i) {
        int eventType;
        y yVar;
        Context context = getContext();
        j jVar = new j(18, false);
        jVar.f28b = new SparseArray();
        jVar.f29c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            yVar = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1260k = jVar;
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
                    yVar = new y(context, xml);
                    ((SparseArray) jVar.f28b).put(yVar.f3507a, yVar);
                } else if (c2 == 3) {
                    C0323g c0323g = new C0323g(context, xml);
                    if (yVar != null) {
                        ((ArrayList) yVar.f3509c).add(c0323g);
                    }
                } else if (c2 == 4) {
                    jVar.F(context, xml);
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
    public final void k(C0297e c0297e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C0322f c0322f;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C0322f c0322f2;
        int i12;
        C0322f c0322f3;
        boolean z4;
        C0309k c0309k;
        C0311m c0311m;
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
        C0297e c0297e2 = c0297e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0322f c0322f4 = this.f1264o;
        c0322f4.f3895b = max3;
        c0322f4.f3896c = max4;
        c0322f4.d = paddingWidth;
        c0322f4.f3897e = i19;
        c0322f4.f3898f = i2;
        c0322f4.f3899g = i3;
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
        int i23 = c0322f4.f3897e;
        int i24 = c0322f4.d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1257f - i24, i21);
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
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1258g - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1256e);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1256e);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int q2 = c0297e.q();
        C0303e c0303e = c0297e2.f3697s0;
        int i25 = i4;
        if (i25 != q2 || i5 != c0297e.k()) {
            c0303e.f3776c = true;
        }
        c0297e2.f3644Y = 0;
        c0297e2.f3645Z = 0;
        int i26 = this.f1257f - i24;
        int[] iArr = c0297e2.f3623C;
        iArr[0] = i26;
        iArr[1] = this.f1258g - i23;
        c0297e2.f3649b0 = 0;
        c0297e2.f3651c0 = 0;
        c0297e2.M(i20);
        c0297e2.O(i25);
        c0297e2.N(i6);
        c0297e2.L(i5);
        int i27 = this.d - i24;
        if (i27 < 0) {
            c0297e2.f3649b0 = 0;
        } else {
            c0297e2.f3649b0 = i27;
        }
        int i28 = this.f1256e - i23;
        if (i28 < 0) {
            c0297e2.f3651c0 = 0;
        } else {
            c0297e2.f3651c0 = i28;
        }
        c0297e2.f3702x0 = max5;
        c0297e2.f3703y0 = max3;
        C0011l c0011l = c0297e2.f3696r0;
        c0011l.getClass();
        C0322f c0322f5 = c0297e2.f3699u0;
        int size3 = c0297e2.f3695q0.size();
        int q3 = c0297e.q();
        int k2 = c0297e.k();
        boolean c2 = s.j.c(i, 128);
        boolean z7 = c2 || s.j.c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C0296d c0296d = (C0296d) c0297e2.f3695q0.get(i29);
                int[] iArr2 = c0296d.f3673p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c0296d.f3642W > 0.0f;
                if ((c0296d.x() && z8) || ((c0296d.y() && z8) || (c0296d instanceof g) || c0296d.x() || c0296d.y())) {
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
            if (mode == 1073741824 && c0297e.q() != min) {
                c0297e2.O(min);
                c0297e2.f3697s0.f3775b = true;
            }
            if (mode2 == 1073741824 && c0297e.k() != min2) {
                c0297e2.L(min2);
                c0297e2.f3697s0.f3775b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c0303e.f3775b;
                C0297e c0297e3 = c0303e.f3774a;
                if (z10 || c0303e.f3776c) {
                    Iterator it3 = c0297e3.f3695q0.iterator();
                    while (it3.hasNext()) {
                        C0296d c0296d2 = (C0296d) it3.next();
                        c0296d2.h();
                        c0296d2.f3646a = false;
                        c0296d2.d.n();
                        c0296d2.f3653e.m();
                    }
                    i15 = 0;
                    c0297e3.h();
                    c0297e3.f3646a = false;
                    c0297e3.d.n();
                    c0297e3.f3653e.m();
                    c0303e.f3776c = false;
                } else {
                    i15 = 0;
                }
                c0303e.b(c0303e.d);
                c0297e3.f3644Y = i15;
                c0297e3.f3645Z = i15;
                int j2 = c0297e3.j(i15);
                int j3 = c0297e3.j(1);
                if (c0303e.f3775b) {
                    c0303e.c();
                }
                int r2 = c0297e3.r();
                int s2 = c0297e3.s();
                z2 = z9;
                c0297e3.d.h.d(r2);
                c0297e3.f3653e.h.d(s2);
                c0303e.g();
                ArrayList arrayList2 = c0303e.f3777e;
                c0322f = c0322f5;
                if (j2 == 2 || j3 == 2) {
                    if (c2) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC0313o) it4.next()).k()) {
                                    c2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (c2 && j2 == 2) {
                        c0297e3.M(1);
                        i8 = q3;
                        c0297e3.O(c0303e.d(c0297e3, 0));
                        c0297e3.d.f3804e.d(c0297e3.q());
                    } else {
                        i8 = q3;
                    }
                    if (c2 && j3 == 2) {
                        i16 = 1;
                        c0297e3.N(1);
                        c0297e3.L(c0303e.d(c0297e3, 1));
                        c0297e3.f3653e.f3804e.d(c0297e3.k());
                        int[] iArr3 = c0297e3.f3673p0;
                        i9 = k2;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int q4 = c0297e3.q() + r2;
                            c0297e3.d.i.d(q4);
                            c0297e3.d.f3804e.d(q4 - r2);
                            c0303e.g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int k3 = c0297e3.k() + s2;
                                c0297e3.f3653e.i.d(k3);
                                c0297e3.f3653e.f3804e.d(k3 - s2);
                            }
                            c0303e.g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC0313o abstractC0313o = (AbstractC0313o) it.next();
                            if (abstractC0313o.f3802b != c0297e3 || abstractC0313o.f3806g) {
                                abstractC0313o.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC0313o abstractC0313o2 = (AbstractC0313o) it2.next();
                            if (z5 || abstractC0313o2.f3802b != c0297e3) {
                                if (!abstractC0313o2.h.f3786j || ((!abstractC0313o2.i.f3786j && !(abstractC0313o2 instanceof C0307i)) || (!abstractC0313o2.f3804e.f3786j && !(abstractC0313o2 instanceof C0301c) && !(abstractC0313o2 instanceof C0307i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c0297e3.M(j2);
                        c0297e3.N(j3);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = q3;
                }
                i16 = 1;
                int[] iArr32 = c0297e3.f3673p0;
                i9 = k2;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int q42 = c0297e3.q() + r2;
                c0297e3.d.i.d(q42);
                c0297e3.d.f3804e.d(q42 - r2);
                c0303e.g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int k32 = c0297e3.k() + s2;
                c0297e3.f3653e.i.d(k32);
                c0297e3.f3653e.f3804e.d(k32 - s2);
                c0303e.g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c0297e3.M(j2);
                c0297e3.N(j3);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c0322f = c0322f5;
                i8 = q3;
                i9 = k2;
                boolean z11 = c0303e.f3775b;
                C0297e c0297e4 = c0303e.f3774a;
                if (z11) {
                    Iterator it5 = c0297e4.f3695q0.iterator();
                    while (it5.hasNext()) {
                        C0296d c0296d3 = (C0296d) it5.next();
                        c0296d3.h();
                        c0296d3.f3646a = false;
                        C0309k c0309k2 = c0296d3.d;
                        c0309k2.f3804e.f3786j = false;
                        c0309k2.f3806g = false;
                        c0309k2.n();
                        C0311m c0311m2 = c0296d3.f3653e;
                        c0311m2.f3804e.f3786j = false;
                        c0311m2.f3806g = false;
                        c0311m2.m();
                    }
                    i13 = 0;
                    c0297e4.h();
                    c0297e4.f3646a = false;
                    C0309k c0309k3 = c0297e4.d;
                    c0309k3.f3804e.f3786j = false;
                    c0309k3.f3806g = false;
                    c0309k3.n();
                    C0311m c0311m3 = c0297e4.f3653e;
                    c0311m3.f3804e.f3786j = false;
                    c0311m3.f3806g = false;
                    c0311m3.m();
                    c0303e.c();
                } else {
                    i13 = 0;
                }
                c0303e.b(c0303e.d);
                c0297e4.f3644Y = i13;
                c0297e4.f3645Z = i13;
                c0297e4.d.h.d(i13);
                c0297e4.f3653e.h.d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c0297e2.T(i13, c2);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c0297e2.T(1, c2);
                    i10++;
                }
            }
            if (z3) {
                c0297e2.P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c0322f = c0322f5;
            i8 = q3;
            i9 = k2;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c0297e2.f3687D0;
        if (size3 > 0) {
            int size4 = c0297e2.f3695q0.size();
            boolean W2 = c0297e2.W(64);
            C0322f c0322f6 = c0297e2.f3699u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C0296d c0296d4 = (C0296d) c0297e2.f3695q0.get(i31);
                if (!(c0296d4 instanceof h) && !(c0296d4 instanceof C0293a) && !c0296d4.F && (!W2 || (c0309k = c0296d4.d) == null || (c0311m = c0296d4.f3653e) == null || !c0309k.f3804e.f3786j || !c0311m.f3804e.f3786j)) {
                    int j4 = c0296d4.j(0);
                    int j5 = c0296d4.j(1);
                    boolean z12 = j4 == 3 && c0296d4.f3675r != 1 && j5 == 3 && c0296d4.f3676s != 1;
                    if (!z12 && c0297e2.W(1) && !(c0296d4 instanceof g)) {
                        if (j4 == 3 && c0296d4.f3675r == 0 && j5 != 3 && !c0296d4.x()) {
                            z12 = true;
                        }
                        if (j5 == 3 && c0296d4.f3676s == 0 && j4 != 3 && !c0296d4.x()) {
                            z12 = true;
                        }
                        if (j4 == 3 || j5 == 3) {
                            if (c0296d4.f3642W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                c0011l.q(0, c0296d4, c0322f6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c0322f6.f3894a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1254b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC0319c) arrayList3.get(i33)).getClass();
                }
            }
        }
        c0011l.w(c0297e2);
        ArrayList arrayList4 = (ArrayList) c0011l.f413b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            c0011l.u(c0297e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c0297e2.f3673p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int q5 = c0297e.q();
            C0297e c0297e5 = (C0297e) c0011l.d;
            int max7 = Math.max(q5, c0297e5.f3649b0);
            int max8 = Math.max(c0297e.k(), c0297e5.f3651c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C0296d c0296d5 = (C0296d) arrayList4.get(i36);
                if (c0296d5 instanceof g) {
                    int q6 = c0296d5.q();
                    int k4 = c0296d5.k();
                    i12 = i30;
                    c0322f3 = c0322f;
                    boolean q7 = z15 | c0011l.q(1, c0296d5, c0322f3);
                    int q8 = c0296d5.q();
                    int k5 = c0296d5.k();
                    if (q8 != q6) {
                        c0296d5.O(q8);
                        if (z13 && c0296d5.r() + c0296d5.f3640U > max7) {
                            max7 = Math.max(max7, c0296d5.i(4).e() + c0296d5.r() + c0296d5.f3640U);
                        }
                        z4 = true;
                    } else {
                        z4 = q7;
                    }
                    if (k5 != k4) {
                        c0296d5.L(k5);
                        if (z14 && c0296d5.s() + c0296d5.f3641V > max8) {
                            max8 = Math.max(max8, c0296d5.i(5).e() + c0296d5.s() + c0296d5.f3641V);
                        }
                        z4 = true;
                    }
                    z15 = ((g) c0296d5).f3751y0 | z4;
                } else {
                    i12 = i30;
                    c0322f3 = c0322f;
                }
                i36++;
                c0322f = c0322f3;
                i30 = i12;
            }
            int i37 = i30;
            C0322f c0322f7 = c0322f;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C0296d c0296d6 = (C0296d) arrayList4.get(i39);
                    if (((c0296d6 instanceof i) && !(c0296d6 instanceof g)) || (c0296d6 instanceof h) || c0296d6.f3658g0 == 8 || ((z2 && c0296d6.d.f3804e.f3786j && c0296d6.f3653e.f3804e.f3786j) || (c0296d6 instanceof g))) {
                        c0322f2 = c0322f7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int q9 = c0296d6.q();
                        int k6 = c0296d6.k();
                        arrayList = arrayList4;
                        int i40 = c0296d6.f3647a0;
                        i11 = size6;
                        boolean q10 = c0011l.q(i38 == 1 ? 2 : 1, c0296d6, c0322f7) | z15;
                        int q11 = c0296d6.q();
                        c0322f2 = c0322f7;
                        int k7 = c0296d6.k();
                        if (q11 != q9) {
                            c0296d6.O(q11);
                            if (z13 && c0296d6.r() + c0296d6.f3640U > max7) {
                                max7 = Math.max(max7, c0296d6.i(4).e() + c0296d6.r() + c0296d6.f3640U);
                            }
                            q10 = true;
                        }
                        if (k7 != k6) {
                            c0296d6.L(k7);
                            if (z14 && c0296d6.s() + c0296d6.f3641V > max8) {
                                max8 = Math.max(max8, c0296d6.i(5).e() + c0296d6.s() + c0296d6.f3641V);
                            }
                            q10 = true;
                        }
                        z15 = (!c0296d6.f3625E || i40 == c0296d6.f3647a0) ? q10 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c0322f7 = c0322f2;
                }
                C0322f c0322f8 = c0322f7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                c0011l.u(c0297e, i38, i34, i35);
                c0322f7 = c0322f8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c0297e2 = c0297e;
            i30 = i37;
        }
        c0297e2.f3687D0 = i30;
        C0284c.f3524p = c0297e2.W(512);
    }

    public final void l(C0296d c0296d, C0321e c0321e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1253a.get(i);
        C0296d c0296d2 = (C0296d) sparseArray.get(i);
        if (c0296d2 == null || view == null || !(view.getLayoutParams() instanceof C0321e)) {
            return;
        }
        c0321e.f3861c0 = true;
        if (i2 == 6) {
            C0321e c0321e2 = (C0321e) view.getLayoutParams();
            c0321e2.f3861c0 = true;
            c0321e2.f3883p0.f3625E = true;
        }
        c0296d.i(6).b(c0296d2.i(i2), c0321e.f3834D, c0321e.f3833C, true);
        c0296d.f3625E = true;
        c0296d.i(3).j();
        c0296d.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0321e c0321e = (C0321e) childAt.getLayoutParams();
            C0296d c0296d = c0321e.f3883p0;
            if (childAt.getVisibility() != 8 || c0321e.f3862d0 || c0321e.f3864e0 || isInEditMode) {
                int r2 = c0296d.r();
                int s2 = c0296d.s();
                childAt.layout(r2, s2, c0296d.q() + r2, c0296d.k() + s2);
            }
        }
        ArrayList arrayList = this.f1254b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0319c) arrayList.get(i6)).getClass();
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
        C0296d c0296d;
        int i5;
        C0296d c0296d2;
        int i6;
        C0296d c0296d3;
        int i7;
        C0321e c0321e;
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
        C0296d c0296d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1265p == i) {
            int i12 = constraintLayout.f1266q;
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
        constraintLayout.f1265p = i;
        constraintLayout.f1266q = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0297e c0297e = constraintLayout.f1255c;
        c0297e.f3700v0 = z3;
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
                    C0296d h = constraintLayout.h(constraintLayout.getChildAt(i16));
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
                                if (constraintLayout.f1262m == null) {
                                    constraintLayout.f1262m = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1262m.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1253a.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c0296d4 = view == null ? null : ((C0321e) view.getLayoutParams()).f3883p0;
                                c0296d4.f3659h0 = resourceName;
                            }
                        }
                        c0296d4 = c0297e;
                        c0296d4.f3659h0 = resourceName;
                    }
                }
                if (constraintLayout.f1261l != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                n nVar = constraintLayout.f1259j;
                if (nVar != null) {
                    nVar.a(constraintLayout);
                }
                c0297e.f3695q0.clear();
                ArrayList arrayList3 = constraintLayout.f1254b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC0319c abstractC0319c = (AbstractC0319c) arrayList3.get(i19);
                        if (abstractC0319c.isInEditMode()) {
                            abstractC0319c.setIds(abstractC0319c.f3827e);
                        }
                        i iVar = abstractC0319c.d;
                        if (iVar == null) {
                            arrayList = arrayList3;
                        } else {
                            iVar.f3759r0 = i13;
                            Arrays.fill(iVar.f3758q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC0319c.f3825b) {
                                int i21 = abstractC0319c.f3824a[i20];
                                View view2 = (View) constraintLayout.f1253a.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC0319c.f3829g;
                                    String str = (String) hashMap.get(valueOf2);
                                    int f3 = abstractC0319c.f(constraintLayout, str);
                                    if (f3 != 0) {
                                        abstractC0319c.f3824a[i20] = f3;
                                        hashMap.put(Integer.valueOf(f3), str);
                                        view2 = (View) constraintLayout.f1253a.get(f3);
                                    }
                                }
                                if (view2 != null) {
                                    i iVar2 = abstractC0319c.d;
                                    C0296d h2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (h2 != iVar2 && h2 != null) {
                                        int i22 = iVar2.f3759r0 + 1;
                                        C0296d[] c0296dArr = iVar2.f3758q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c0296dArr.length) {
                                            iVar2.f3758q0 = (C0296d[]) Arrays.copyOf(c0296dArr, c0296dArr.length * 2);
                                        }
                                        C0296d[] c0296dArr2 = iVar2.f3758q0;
                                        int i23 = iVar2.f3759r0;
                                        c0296dArr2[i23] = h2;
                                        iVar2.f3759r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC0319c.d.S();
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
                SparseArray sparseArray = constraintLayout.f1263n;
                sparseArray.clear();
                sparseArray.put(0, c0297e);
                sparseArray.put(getId(), c0297e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C0296d h3 = constraintLayout.h(childAt3);
                    if (h3 != null) {
                        C0321e c0321e2 = (C0321e) childAt3.getLayoutParams();
                        c0297e.f3695q0.add(h3);
                        C0296d c0296d5 = h3.f3639T;
                        if (c0296d5 != null) {
                            ((C0297e) c0296d5).f3695q0.remove(h3);
                            h3.C();
                        }
                        h3.f3639T = c0297e;
                        c0321e2.a();
                        h3.f3658g0 = childAt3.getVisibility();
                        h3.f3656f0 = childAt3;
                        if (childAt3 instanceof AbstractC0319c) {
                            ((AbstractC0319c) childAt3).h(h3, c0297e.f3700v0);
                        }
                        if (c0321e2.f3862d0) {
                            h hVar = (h) h3;
                            int i27 = c0321e2.f3877m0;
                            int i28 = c0321e2.f3879n0;
                            float f4 = c0321e2.f3881o0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f3752q0 = f4;
                                    hVar.f3753r0 = -1;
                                    hVar.f3754s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    hVar.f3752q0 = -1.0f;
                                    hVar.f3753r0 = i27;
                                    hVar.f3754s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                hVar.f3752q0 = -1.0f;
                                hVar.f3753r0 = -1;
                                hVar.f3754s0 = i28;
                            }
                        } else {
                            int i29 = c0321e2.f3866f0;
                            int i30 = c0321e2.f3868g0;
                            int i31 = c0321e2.f3869h0;
                            int i32 = c0321e2.f3870i0;
                            int i33 = c0321e2.j0;
                            i3 = childCount3;
                            int i34 = c0321e2.f3873k0;
                            float f5 = c0321e2.f3875l0;
                            int i35 = c0321e2.f3882p;
                            if (i35 != -1) {
                                C0296d c0296d6 = (C0296d) sparseArray.get(i35);
                                if (c0296d6 != null) {
                                    float f6 = c0321e2.f3885r;
                                    h3.v(7, 7, c0321e2.f3884q, 0, c0296d6);
                                    h3.f3624D = f6;
                                }
                                c0321e = c0321e2;
                            } else {
                                if (i29 != -1) {
                                    C0296d c0296d7 = (C0296d) sparseArray.get(i29);
                                    if (c0296d7 != null) {
                                        h3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0321e2).leftMargin, i33, c0296d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C0296d c0296d8 = (C0296d) sparseArray.get(i30);
                                        if (c0296d8 != null) {
                                            h3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0321e2).leftMargin, i33, c0296d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C0296d c0296d9 = (C0296d) sparseArray.get(i31);
                                        if (c0296d9 != null) {
                                            h3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0321e2).rightMargin, i34, c0296d9);
                                        }
                                    } else if (i32 != i4 && (c0296d = (C0296d) sparseArray.get(i32)) != null) {
                                        h3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0321e2).rightMargin, i34, c0296d);
                                    }
                                    i5 = c0321e2.i;
                                    if (i5 == -1) {
                                        C0296d c0296d10 = (C0296d) sparseArray.get(i5);
                                        if (c0296d10 != null) {
                                            h3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0321e2).topMargin, c0321e2.f3891x, c0296d10);
                                        }
                                    } else {
                                        int i36 = c0321e2.f3871j;
                                        if (i36 != -1 && (c0296d2 = (C0296d) sparseArray.get(i36)) != null) {
                                            h3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0321e2).topMargin, c0321e2.f3891x, c0296d2);
                                        }
                                    }
                                    i6 = c0321e2.f3872k;
                                    if (i6 == -1) {
                                        C0296d c0296d11 = (C0296d) sparseArray.get(i6);
                                        if (c0296d11 != null) {
                                            h3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0321e2).bottomMargin, c0321e2.f3893z, c0296d11);
                                        }
                                    } else {
                                        int i37 = c0321e2.f3874l;
                                        if (i37 != -1 && (c0296d3 = (C0296d) sparseArray.get(i37)) != null) {
                                            h3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0321e2).bottomMargin, c0321e2.f3893z, c0296d3);
                                        }
                                    }
                                    i7 = c0321e2.f3876m;
                                    if (i7 == -1) {
                                        c0321e = c0321e2;
                                        l(h3, c0321e2, sparseArray, i7, 6);
                                    } else {
                                        c0321e = c0321e2;
                                        int i38 = c0321e.f3878n;
                                        if (i38 != -1) {
                                            l(h3, c0321e, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c0321e.f3880o;
                                            if (i39 != -1) {
                                                l(h3, c0321e, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        h3.f3652d0 = f5;
                                    }
                                    f2 = c0321e.F;
                                    if (f2 >= 0.0f) {
                                        h3.f3654e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c0321e2.i;
                                if (i5 == -1) {
                                }
                                i6 = c0321e2.f3872k;
                                if (i6 == -1) {
                                }
                                i7 = c0321e2.f3876m;
                                if (i7 == -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f2 = c0321e.F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c0321e.f3849T) != -1 || c0321e.f3850U != -1)) {
                                int i40 = c0321e.f3850U;
                                h3.f3644Y = i11;
                                h3.f3645Z = i40;
                            }
                            if (c0321e.f3857a0) {
                                h3.M(1);
                                h3.O(((ViewGroup.MarginLayoutParams) c0321e).width);
                                if (((ViewGroup.MarginLayoutParams) c0321e).width == -2) {
                                    h3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0321e).width == -1) {
                                if (c0321e.f3852W) {
                                    h3.M(3);
                                } else {
                                    h3.M(4);
                                }
                                h3.i(2).f3620g = ((ViewGroup.MarginLayoutParams) c0321e).leftMargin;
                                h3.i(4).f3620g = ((ViewGroup.MarginLayoutParams) c0321e).rightMargin;
                            } else {
                                h3.M(3);
                                h3.O(0);
                            }
                            if (c0321e.f3859b0) {
                                i8 = -1;
                                h3.N(1);
                                h3.L(((ViewGroup.MarginLayoutParams) c0321e).height);
                                if (((ViewGroup.MarginLayoutParams) c0321e).height == -2) {
                                    h3.N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0321e).height == -1) {
                                    if (c0321e.f3853X) {
                                        h3.N(3);
                                    } else {
                                        h3.N(4);
                                    }
                                    h3.i(3).f3620g = ((ViewGroup.MarginLayoutParams) c0321e).topMargin;
                                    h3.i(5).f3620g = ((ViewGroup.MarginLayoutParams) c0321e).bottomMargin;
                                } else {
                                    h3.N(3);
                                    h3.L(0);
                                }
                            }
                            String str2 = c0321e.f3836G;
                            if (str2 == null || str2.length() == 0) {
                                h3.f3642W = 0.0f;
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
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i10, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i9 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    h3.f3642W = parseFloat;
                                    h3.f3643X = i9;
                                }
                            }
                            float f7 = c0321e.f3837H;
                            float[] fArr = h3.f3663k0;
                            fArr[0] = f7;
                            fArr[1] = c0321e.f3838I;
                            h3.f3660i0 = c0321e.f3839J;
                            h3.j0 = c0321e.f3840K;
                            int i41 = c0321e.f3855Z;
                            if (i41 >= 0 && i41 <= 3) {
                                h3.f3674q = i41;
                            }
                            int i42 = c0321e.f3841L;
                            int i43 = c0321e.f3843N;
                            int i44 = c0321e.f3845P;
                            float f8 = c0321e.f3847R;
                            h3.f3675r = i42;
                            h3.f3678u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            h3.f3679v = i44;
                            h3.f3680w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                h3.f3675r = 2;
                            }
                            int i45 = c0321e.f3842M;
                            int i46 = c0321e.f3844O;
                            int i47 = c0321e.f3846Q;
                            float f9 = c0321e.f3848S;
                            h3.f3676s = i45;
                            h3.f3681x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            h3.f3682y = i47;
                            h3.f3683z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                h3.f3676s = 2;
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
                c0297e.f3696r0.w(c0297e);
            }
        }
        k(c0297e, this.i, i, i2);
        int q2 = c0297e.q();
        int k2 = c0297e.k();
        boolean z4 = c0297e.E0;
        boolean z5 = c0297e.f3688F0;
        C0322f c0322f = this.f1264o;
        int i48 = c0322f.f3897e;
        int resolveSizeAndState = View.resolveSizeAndState(q2 + c0322f.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k2 + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1257f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1258g, resolveSizeAndState2);
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
        C0296d h = h(view);
        if ((view instanceof p) && !(h instanceof h)) {
            C0321e c0321e = (C0321e) view.getLayoutParams();
            h hVar = new h();
            c0321e.f3883p0 = hVar;
            c0321e.f3862d0 = true;
            hVar.S(c0321e.f3851V);
        }
        if (view instanceof AbstractC0319c) {
            AbstractC0319c abstractC0319c = (AbstractC0319c) view;
            abstractC0319c.i();
            ((C0321e) view.getLayoutParams()).f3864e0 = true;
            ArrayList arrayList = this.f1254b;
            if (!arrayList.contains(abstractC0319c)) {
                arrayList.add(abstractC0319c);
            }
        }
        this.f1253a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1253a.remove(view.getId());
        C0296d h = h(view);
        this.f1255c.f3695q0.remove(h);
        h.C();
        this.f1254b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1259j = nVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1253a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1258g) {
            return;
        }
        this.f1258g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1257f) {
            return;
        }
        this.f1257f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1256e) {
            return;
        }
        this.f1256e = i;
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
        j jVar = this.f1260k;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0297e c0297e = this.f1255c;
        c0297e.f3687D0 = i;
        C0284c.f3524p = c0297e.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1253a = new SparseArray();
        this.f1254b = new ArrayList(4);
        this.f1255c = new C0297e();
        this.d = 0;
        this.f1256e = 0;
        this.f1257f = Integer.MAX_VALUE;
        this.f1258g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.f1259j = null;
        this.f1260k = null;
        this.f1261l = -1;
        this.f1262m = new HashMap();
        this.f1263n = new SparseArray();
        this.f1264o = new C0322f(this, this);
        this.f1265p = 0;
        this.f1266q = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0321e c0321e = new C0321e(layoutParams);
        c0321e.f3856a = -1;
        c0321e.f3858b = -1;
        c0321e.f3860c = -1.0f;
        c0321e.d = true;
        c0321e.f3863e = -1;
        c0321e.f3865f = -1;
        c0321e.f3867g = -1;
        c0321e.h = -1;
        c0321e.i = -1;
        c0321e.f3871j = -1;
        c0321e.f3872k = -1;
        c0321e.f3874l = -1;
        c0321e.f3876m = -1;
        c0321e.f3878n = -1;
        c0321e.f3880o = -1;
        c0321e.f3882p = -1;
        c0321e.f3884q = 0;
        c0321e.f3885r = 0.0f;
        c0321e.f3886s = -1;
        c0321e.f3887t = -1;
        c0321e.f3888u = -1;
        c0321e.f3889v = -1;
        c0321e.f3890w = Integer.MIN_VALUE;
        c0321e.f3891x = Integer.MIN_VALUE;
        c0321e.f3892y = Integer.MIN_VALUE;
        c0321e.f3893z = Integer.MIN_VALUE;
        c0321e.f3831A = Integer.MIN_VALUE;
        c0321e.f3832B = Integer.MIN_VALUE;
        c0321e.f3833C = Integer.MIN_VALUE;
        c0321e.f3834D = 0;
        c0321e.f3835E = 0.5f;
        c0321e.F = 0.5f;
        c0321e.f3836G = null;
        c0321e.f3837H = -1.0f;
        c0321e.f3838I = -1.0f;
        c0321e.f3839J = 0;
        c0321e.f3840K = 0;
        c0321e.f3841L = 0;
        c0321e.f3842M = 0;
        c0321e.f3843N = 0;
        c0321e.f3844O = 0;
        c0321e.f3845P = 0;
        c0321e.f3846Q = 0;
        c0321e.f3847R = 1.0f;
        c0321e.f3848S = 1.0f;
        c0321e.f3849T = -1;
        c0321e.f3850U = -1;
        c0321e.f3851V = -1;
        c0321e.f3852W = false;
        c0321e.f3853X = false;
        c0321e.f3854Y = null;
        c0321e.f3855Z = 0;
        c0321e.f3857a0 = true;
        c0321e.f3859b0 = true;
        c0321e.f3861c0 = false;
        c0321e.f3862d0 = false;
        c0321e.f3864e0 = false;
        c0321e.f3866f0 = -1;
        c0321e.f3868g0 = -1;
        c0321e.f3869h0 = -1;
        c0321e.f3870i0 = -1;
        c0321e.j0 = Integer.MIN_VALUE;
        c0321e.f3873k0 = Integer.MIN_VALUE;
        c0321e.f3875l0 = 0.5f;
        c0321e.f3883p0 = new C0296d();
        return c0321e;
    }
}
