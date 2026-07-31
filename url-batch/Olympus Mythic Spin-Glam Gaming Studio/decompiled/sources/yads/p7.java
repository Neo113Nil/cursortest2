package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class p7 extends Lambda implements Function0 {
    public final /* synthetic */ r7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(r7 r7Var) {
        super(0);
        this.b = r7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new z7().a(this.b.b.getApplicationContext());
    }
}
