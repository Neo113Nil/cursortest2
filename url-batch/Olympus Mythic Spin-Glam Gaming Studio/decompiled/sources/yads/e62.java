package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class e62 extends Lambda implements Function0 {
    public final /* synthetic */ i62 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e62(i62 i62Var) {
        super(0);
        this.b = i62Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        i62 i62Var = this.b;
        zj2 zj2Var = i62Var.c;
        if (zj2Var != null) {
            zj2Var.a();
        }
        s3 s3Var = i62Var.b;
        if (s3Var != null) {
            s3Var.b();
        }
        i62Var.a.a.remove(i62Var);
        i62Var.b = null;
        i62Var.c = null;
        return Unit.INSTANCE;
    }
}
