package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class x8 implements x3 {
    public static final /* synthetic */ KProperty[] b = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(x8.class, "adEventsReceiver", "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;", 0))};
    public final qm2 a = new qm2(null);

    @Override // yads.x3
    public final void a(int i, Bundle bundle) {
        qm2 qm2Var = this.a;
        KProperty kProperty = b[0];
        x3 x3Var = (x3) qm2Var.a.get();
        if (x3Var != null) {
            x3Var.a(i, bundle);
            boolean z = ob1.a;
        }
    }

    public final void a(x3 x3Var) {
        qm2 qm2Var = this.a;
        KProperty kProperty = b[0];
        qm2Var.getClass();
        qm2Var.a = new WeakReference(x3Var);
    }
}
