package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class qg extends Lambda implements Function0 {
    public final /* synthetic */ rg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(rg rgVar) {
        super(0);
        this.b = rgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return this.b.a.d();
    }
}
