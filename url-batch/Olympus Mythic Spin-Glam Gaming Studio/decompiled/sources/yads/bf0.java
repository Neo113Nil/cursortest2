package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.reflect.KProperty;

/* loaded from: classes13.dex */
public final class bf0 {
    public static final /* synthetic */ KProperty[] e = {ra.a(bf0.class, "weakSkipButton", "getWeakSkipButton()Landroid/view/View;", 0)};
    public final p03 a;
    public final long b;
    public final oc2 c;
    public final qm2 d;

    public bf0(View view, p03 p03Var, long j) {
        oc2 oc2Var = new oc2(true, new Handler(Looper.getMainLooper()));
        this.a = p03Var;
        this.b = j;
        this.c = oc2Var;
        this.d = new qm2(view);
        p03Var.a(view);
    }
}
