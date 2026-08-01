package com.vectorharbor.planetvectorsurvey;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.a50;
import defpackage.ag;
import defpackage.ap;
import defpackage.ch0;
import defpackage.fh;
import defpackage.pu0;
import defpackage.qu;
import defpackage.rg0;
import defpackage.tn0;
import defpackage.uo;
import defpackage.vo;
import defpackage.wo;
import defpackage.xo;
import defpackage.yo;
import defpackage.ze0;
import defpackage.zf;
import defpackage.zo;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class MainActivity extends zf {
    public static final int $stable = 8;

    @Override // defpackage.zf, defpackage.yf, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 5;
        tn0 tn0Var = new tn0(i);
        pu0 pu0Var = new pu0(0, 0, tn0Var);
        int i2 = uo.a;
        int i3 = uo.b;
        tn0 tn0Var2 = new tn0(i);
        pu0 pu0Var2 = new pu0(i2, i3, tn0Var2);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) tn0Var.c(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean booleanValue2 = ((Boolean) tn0Var2.c(resources2)).booleanValue();
        a50 a50Var = uo.c;
        if (a50Var == null) {
            int i4 = Build.VERSION.SDK_INT;
            a50Var = i4 >= 35 ? new ap() : i4 >= 30 ? new zo() : i4 >= 29 ? new yo() : i4 >= 28 ? new xo() : i4 >= 26 ? new wo() : new vo();
            uo.c = a50Var;
        }
        a50 a50Var2 = a50Var;
        Window window = getWindow();
        window.getClass();
        a50Var2.L(pu0Var, pu0Var2, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        window2.getClass();
        a50Var2.j(window2);
        qu m6getLambda$998255631$app = ComposableSingletons$MainActivityKt.INSTANCE.m6getLambda$998255631$app();
        ViewGroup.LayoutParams layoutParams = ag.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        fh fhVar = childAt instanceof fh ? (fh) childAt : null;
        if (fhVar != null) {
            fhVar.setParentCompositionContext(null);
            fhVar.setContent(m6getLambda$998255631$app);
            return;
        }
        fh fhVar2 = new fh(this);
        fhVar2.setParentCompositionContext(null);
        fhVar2.setContent(m6getLambda$998255631$app);
        View decorView2 = getWindow().getDecorView();
        if (ze0.j(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (ch0.f(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (rg0.k(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(fhVar2, ag.a);
    }
}
