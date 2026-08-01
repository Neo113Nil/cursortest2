package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class kl0 extends ViewGroup {
    public final int d;
    public final ArrayList e;
    public final ArrayList f;
    public final j3 g;
    public int h;

    public kl0(Context context) {
        super(context);
        this.d = 5;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        this.g = new j3(11);
        setClipChildren(false);
        ml0 ml0Var = new ml0(context);
        addView(ml0Var);
        arrayList.add(ml0Var);
        arrayList2.add(ml0Var);
        this.h = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final ml0 a(ll0 ll0Var) {
        j3 j3Var = this.g;
        LinkedHashMap linkedHashMap = (LinkedHashMap) j3Var.e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) j3Var.e;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) j3Var.f;
        ml0 ml0Var = (ml0) linkedHashMap.get(ll0Var);
        if (ml0Var != null) {
            return ml0Var;
        }
        ArrayList arrayList = this.f;
        arrayList.getClass();
        ml0 ml0Var2 = (ml0) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (ml0Var2 == null) {
            int i = this.h;
            ArrayList arrayList2 = this.e;
            if (i > px0.B(arrayList2)) {
                ml0Var2 = new ml0(getContext());
                addView(ml0Var2);
                arrayList2.add(ml0Var2);
            } else {
                ml0Var2 = (ml0) arrayList2.get(this.h);
                ll0 ll0Var2 = (ll0) linkedHashMap3.get(ml0Var2);
                if (ll0Var2 != null) {
                    ll0Var2.N();
                    ml0 ml0Var3 = (ml0) linkedHashMap2.get(ll0Var2);
                    if (ml0Var3 != null) {
                    }
                    linkedHashMap2.remove(ll0Var2);
                    ml0Var2.c();
                }
            }
            int i2 = this.h;
            if (i2 < this.d - 1) {
                this.h = i2 + 1;
            } else {
                this.h = 0;
            }
        }
        linkedHashMap2.put(ll0Var, ml0Var2);
        linkedHashMap3.put(ml0Var2, ll0Var);
        return ml0Var2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
