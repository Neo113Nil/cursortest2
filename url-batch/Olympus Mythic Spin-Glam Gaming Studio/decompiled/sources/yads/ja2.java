package yads;

import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final /* synthetic */ class ja2 implements wd3, FunctionAdapter {
    public final /* synthetic */ ka2 a;

    public ja2(ka2 ka2Var) {
        this.a = ka2Var;
    }

    @Override // yads.wd3
    public final void a() {
        ka2 ka2Var = this.a;
        synchronized (ka2Var.a) {
            ka2Var.f = true;
            Unit unit = Unit.INSTANCE;
        }
        ka2Var.c();
        ka2Var.d.b();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wd3) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, ka2.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
