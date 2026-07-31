package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class h42 implements n21 {
    public final boolean a;

    public h42(t8 t8Var) {
        String str = t8Var.w;
        g42 g42Var = g42.c;
        this.a = Intrinsics.areEqual(str, "loading_on_show") || Intrinsics.areEqual(t8Var.w, "loading_on_back");
    }

    @Override // yads.n21
    public final boolean a() {
        return this.a;
    }
}
