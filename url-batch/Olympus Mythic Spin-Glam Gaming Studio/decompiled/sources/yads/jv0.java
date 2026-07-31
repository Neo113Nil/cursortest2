package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes14.dex */
public final class jv0 extends Lambda implements Function0 {
    public final /* synthetic */ kv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv0(kv0 kv0Var) {
        super(0);
        this.b = kv0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Context context = this.b.a;
        ep2 a = fp2.a(context, y82.a(context));
        a.a();
        return a;
    }
}
