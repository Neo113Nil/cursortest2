package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes12.dex */
public final class k42 implements FlowCollector {
    public final /* synthetic */ ri2 a;

    public k42(ri2 ri2Var) {
        this.a = ri2Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        m21 m21Var = (m21) obj;
        ri2 ri2Var = this.a;
        ri2Var.b.put(m21Var.a, m21Var.b);
        return Unit.INSTANCE;
    }
}
