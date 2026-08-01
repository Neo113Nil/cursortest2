package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.d;
import com.ionia.reidopitaco.libya.R;
import defpackage.f80;
import defpackage.g;
import defpackage.g30;
import defpackage.j7;
import defpackage.jx;
import defpackage.m60;
import defpackage.oo;
import defpackage.sr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends sr {
    public static final /* synthetic */ int x = 0;
    public final LinkedHashSet r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final int v;
    public HashSet w;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(oo.R(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.r = new LinkedHashSet();
        this.s = false;
        this.w = new HashSet();
        TypedArray J = m60.J(getContext(), attributeSet, jx.q, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(J.getBoolean(7, false));
        this.v = J.getResourceId(2, -1);
        this.u = J.getBoolean(4, false);
        if (this.k == null) {
            this.k = g30.b(new g(0.0f));
        }
        setEnabled(J.getBoolean(0, true));
        J.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.t ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // defpackage.sr, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        l(materialButton.getId(), materialButton.z);
        f80.m(materialButton, new j7(2, this));
    }

    public int getCheckedButtonId() {
        if (!this.t || this.w.isEmpty()) {
            return -1;
        }
        return ((Integer) this.w.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.w.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final void l(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.w);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.t && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.u || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m(hashSet);
    }

    public final void m(Set set) {
        HashSet hashSet = this.w;
        this.w = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.s = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.s = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.r.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.v;
        if (i != -1) {
            m(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.t ? 1 : 2));
    }

    public void setSelectionRequired(boolean z) {
        this.u = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.t != z) {
            this.t = z;
            m(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
