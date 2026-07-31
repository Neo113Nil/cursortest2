package yads;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final class gw0 implements hw0 {
    public static final /* synthetic */ KProperty[] b = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(gw0.class, "forceImpressionTrackingListenerReference", "getForceImpressionTrackingListenerReference()Lcom/monetization/ads/base/impression/ForceImpressionTrackingListener;", 0))};
    public final qm2 a = new qm2(null);

    @Override // yads.hw0
    public final void a() {
        qm2 qm2Var = this.a;
        KProperty kProperty = b[0];
        hw0 hw0Var = (hw0) qm2Var.a.get();
        if (hw0Var != null) {
            hw0Var.a();
        }
    }
}
