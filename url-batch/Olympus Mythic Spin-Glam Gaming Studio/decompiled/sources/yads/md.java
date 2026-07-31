package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class md {
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public final sf a;
    public final qf b;
    public final ld c;

    public md(Context context) {
        sf sfVar = new sf();
        qf qfVar = new qf(context);
        ld ldVar = new ld(context);
        this.a = sfVar;
        this.b = qfVar;
        this.c = ldVar;
    }

    public final void a(Context context) {
        Object m8023constructorimpl;
        if (this.b.b() && d.compareAndSet(false, true)) {
            boolean z = !this.a.a.b(context);
            ld ldVar = this.c;
            if (ldVar.a.b()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    zb0 zb0Var = ldVar.b;
                    zb0Var.getClass();
                    AppMetricaLibraryAdapter.activate(zb0Var.a, AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(z).build());
                    m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
                    boolean z2 = ob1.a;
                }
            }
        }
    }
}
