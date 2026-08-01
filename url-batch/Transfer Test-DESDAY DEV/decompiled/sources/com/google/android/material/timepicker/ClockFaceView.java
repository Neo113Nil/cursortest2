package com.google.android.material.timepicker;

import K.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.football.transfertrivia.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u0.AbstractC0338a;
import v.j;
import v.n;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final c f2065A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f2066B;

    /* renamed from: C, reason: collision with root package name */
    public final float[] f2067C;

    /* renamed from: D, reason: collision with root package name */
    public final int f2068D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2069E;
    public final int F;

    /* renamed from: G, reason: collision with root package name */
    public final int f2070G;

    /* renamed from: H, reason: collision with root package name */
    public final String[] f2071H;

    /* renamed from: I, reason: collision with root package name */
    public float f2072I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f2073J;

    /* renamed from: v, reason: collision with root package name */
    public final ClockHandView f2074v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2075w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f2076x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f2077y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseArray f2078z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2075w = new Rect();
        this.f2076x = new RectF();
        this.f2077y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f2078z = sparseArray;
        this.f2067C = new float[]{RecyclerView.f1570A0, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0338a.d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList G2 = A.c.G(context, obtainStyledAttributes, 1);
        this.f2073J = G2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2074v = clockHandView;
        this.f2068D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = G2.getColorForState(new int[]{android.R.attr.state_selected}, G2.getDefaultColor());
        this.f2066B = new int[]{colorForState, colorForState, G2.getDefaultColor()};
        clockHandView.f2081c.add(this);
        int defaultColor = A.c.E(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList G3 = A.c.G(context, obtainStyledAttributes, 0);
        setBackgroundColor(G3 != null ? G3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f2065A = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2071H = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i = 0; i < Math.max(this.f2071H.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f2071H.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f2071H[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z2 = i2 > 1 ? true : z2;
                T.l(textView, this.f2065A);
                textView.setTextColor(this.f2073J);
            }
        }
        ClockHandView clockHandView2 = this.f2074v;
        if (clockHandView2.f2080b && !z2) {
            clockHandView2.f2088m = 1;
        }
        clockHandView2.f2080b = z2;
        clockHandView2.invalidate();
        this.f2069E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f2070G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2094t * 0.66f) : this.f2094t;
            Iterator it = list.iterator();
            float f2 = RecyclerView.f1570A0;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = nVar.f4028c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new v.i());
                }
                j jVar = ((v.i) hashMap2.get(Integer.valueOf(id))).d;
                jVar.f4002z = R.id.circle_center;
                jVar.f3941A = round;
                jVar.f3942B = f2;
                f2 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f2078z;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f2074v.f2084g;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f2078z;
            int size = sparseArray.size();
            rectF = this.f2076x;
            rect = this.f2075w;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f2) {
                    textView = textView2;
                    f2 = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f2077y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2066B, this.f2067C, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2071H.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f2070G / Math.max(Math.max(this.f2069E / displayMetrics.heightPixels, this.F / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
