package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes3.dex */
public final class gv1 extends Lambda implements Function0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ nt3 c;
    public final /* synthetic */ k00 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv1(Context context, nt3 nt3Var, k00 k00Var) {
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
        if (!new nk().a()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new a20())), null, null, new iv1(context, null, nt3Var), 3, null);
            new ao3().a();
            Context applicationContext = context.getApplicationContext();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            if (pa.a(applicationContext) && !q63.a() && !atomicBoolean.getAndSet(true)) {
                ab1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
            }
            gu1.a(nt3Var).a(context, k00Var);
        }
        return Unit.INSTANCE;
    }
}
