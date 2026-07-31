package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class hg3 extends ObservableProperty {
    public final /* synthetic */ jg3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg3(jg3 jg3Var) {
        super(null);
        this.a = jg3Var;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.a.d.e = (lg3) obj2;
    }
}
