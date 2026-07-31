package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes6.dex */
public final class hv1 extends Lambda implements Function0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ nt3 c;
    public final /* synthetic */ k00 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv1(Context context, nt3 nt3Var, k00 k00Var) {
        super(0);
        this.b = context;
        this.c = nt3Var;
        this.d = k00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Context context = this.b;
        nt3 nt3Var = this.c;
        k00 k00Var = this.d;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new a20())), null, null, new iv1(context, null, nt3Var), 3, null);
        k00Var.onInitializationCompleted();
        return Unit.INSTANCE;
    }
}
