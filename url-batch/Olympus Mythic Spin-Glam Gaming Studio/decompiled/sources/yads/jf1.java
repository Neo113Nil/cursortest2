package yads;

import android.widget.ProgressBar;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final class jf1 implements zj2 {
    public static final /* synthetic */ KProperty[] c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(jf1.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0))};
    public final if1 a = new if1();
    public final qm2 b = new qm2(null);

    @Override // yads.zj2
    public final void a(long j, long j2) {
        qm2 qm2Var = this.b;
        KProperty kProperty = c[0];
        ProgressBar progressBar = (ProgressBar) qm2Var.a.get();
        if (progressBar != null) {
            xd.a(progressBar, j, j2);
        }
    }

    @Override // yads.zj2
    public final void a() {
        qm2 qm2Var = this.b;
        KProperty kProperty = c[0];
        ProgressBar progressBar = (ProgressBar) qm2Var.a.get();
        if (progressBar != null) {
            long max = progressBar.getMax();
            xd.a(progressBar, max, max);
        }
    }
}
