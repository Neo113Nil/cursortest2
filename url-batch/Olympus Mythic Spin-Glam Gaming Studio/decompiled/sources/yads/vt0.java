package yads;

import com.ironsource.X3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* loaded from: classes11.dex */
public final class vt0 extends Lambda implements Function0 {
    public final /* synthetic */ wt0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt0(wt0 wt0Var) {
        super(0);
        this.b = wt0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        wt0 wt0Var = this.b;
        return SequencesKt.joinToString$default(SequencesKt.plus(wt0Var.b, wt0Var.c), X3.j.c, null, null, 0, null, ut0.b, 30, null);
    }
}
