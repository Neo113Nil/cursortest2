package yads;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class sl {
    public static final /* synthetic */ KProperty[] e = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(sl.class, "parentDesignView", "getParentDesignView()Landroid/view/ViewGroup;", 0))};
    public final ViewTreeObserver.OnPreDrawListener a;
    public final ik3 b;
    public hg0 c;
    public final qm2 d;

    public sl(ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        ik3 ik3Var = new ik3();
        this.a = onPreDrawListener;
        this.b = ik3Var;
        this.d = new qm2(null);
    }
}
