package yads;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class tg3 {
    public static final /* synthetic */ KProperty[] c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(tg3.class, "status", "getStatus()Lcom/monetization/ads/video/status/VideoAdStatus;", 0))};
    public final Set a = SetsKt.mutableSetOf(rg3.b);
    public final sg3 b;

    public tg3() {
        Delegates delegates = Delegates.INSTANCE;
        this.b = new sg3(this);
    }

    public final rg3 a() {
        return (rg3) this.b.getValue(this, c[0]);
    }

    public final void a(rg3 rg3Var) {
        this.b.setValue(this, c[0], rg3Var);
    }
}
