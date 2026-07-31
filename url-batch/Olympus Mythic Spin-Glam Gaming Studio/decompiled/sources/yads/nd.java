package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class nd {
    public static final Object c = new Object();
    public final ld a;
    public final Executor b;

    public nd(Context context) {
        mg1 mg1Var;
        ld ldVar = new ld(context);
        mg1 mg1Var2 = mg1.e;
        if (mg1Var2 == null) {
            synchronized (mg1.d) {
                mg1Var = mg1.e;
                if (mg1Var == null) {
                    mg1Var = new mg1();
                    mg1.e = mg1Var;
                }
            }
            mg1Var2 = mg1Var;
        }
        Executor a = mg1Var2.a();
        this.a = ldVar;
        this.b = a;
    }

    public static final void a(nd ndVar, te teVar) {
        Object m8023constructorimpl;
        ndVar.getClass();
        a(teVar);
        ld ldVar = ndVar.a;
        if (ldVar.a.b()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                zb0 zb0Var = ldVar.b;
                String str = teVar.a;
                String str2 = teVar.b;
                zb0Var.getClass();
                AppMetricaLibraryAdapter.reportEvent("ads_sdk", str, str2);
                m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
                boolean z = ob1.a;
            }
        }
    }

    public final void b(final te teVar) {
        this.b.execute(new Runnable() { // from class: yads.nd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                nd.a(nd.this, teVar);
            }
        });
    }

    public static void a(te teVar) {
        teVar.a();
        teVar.b();
        boolean z = ob1.a;
    }
}
