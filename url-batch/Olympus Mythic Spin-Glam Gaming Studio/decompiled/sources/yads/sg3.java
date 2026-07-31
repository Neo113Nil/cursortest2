package yads;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes15.dex */
public final class sg3 extends ObservableProperty {
    public final /* synthetic */ tg3 a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sg3(tg3 tg3Var) {
        super(r0);
        rg3 rg3Var = rg3.b;
        this.a = tg3Var;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.a.a.add((rg3) obj2);
    }
}
