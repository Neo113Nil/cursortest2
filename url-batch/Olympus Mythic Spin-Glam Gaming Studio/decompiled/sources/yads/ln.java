package yads;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class ln {
    public final CancellableContinuationImpl a;
    public final d8 b;
    public final CoroutineScope c;
    public final v0 d;
    public final on e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public ln(CancellableContinuationImpl cancellableContinuationImpl, d8 d8Var, CoroutineScope coroutineScope, v0 v0Var, on onVar) {
        this.a = cancellableContinuationImpl;
        this.b = d8Var;
        this.c = coroutineScope;
        this.d = v0Var;
        this.e = onVar;
    }

    public final void a(Object obj) {
        if (this.f.compareAndSet(false, true)) {
            BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new kn(this, obj, null), 3, null);
        }
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            this.d.a(this.b, null);
            CancellableContinuationImpl cancellableContinuationImpl = this.a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
    }
}
