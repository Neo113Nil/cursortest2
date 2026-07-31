package yads;

import android.view.View;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes14.dex */
public final class u72 implements bk3 {
    public final ak3 a;

    public u72(ak3 ak3Var) {
        this.a = ak3Var;
    }

    @Override // yads.bk3
    public final List a() {
        return CollectionsKt.emptyList();
    }

    @Override // yads.bk3
    public final View getView() {
        return this.a.b();
    }
}
