package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public final class ru2 implements bo, wo2 {
    public final lu2 a;
    public final iu2 b;
    public final i5 c;
    public final Context d;
    public final uy e = uy.c;

    public ru2(Context context, lu2 lu2Var, iu2 iu2Var, i5 i5Var) {
        this.a = lu2Var;
        this.b = iu2Var;
        this.c = i5Var;
        this.d = context.getApplicationContext();
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        HashSet hashSet;
        Object m8023constructorimpl;
        bu2 bu2Var = (bu2) obj;
        lu2 lu2Var = this.a;
        Context context = this.d;
        lu2Var.getClass();
        synchronized (lu2.b) {
            hashSet = new HashSet(lu2Var.a.keySet());
            uw2.a().a(context, bu2Var);
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            du2 du2Var = (du2) it.next();
            boolean z = !du2Var.a.a.b(context);
            ld ldVar = du2Var.b;
            if (ldVar.a.b()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    ldVar.b.getClass();
                    AppMetricaLibraryAdapter.setAdvIdentifiersTracking(z);
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
        this.c.a(h5.m);
        iu2 iu2Var = this.b;
        uy uyVar = this.e;
        if (iu2Var.a.isActive()) {
            CancellableContinuationImpl cancellableContinuationImpl = iu2Var.a;
            Result.Companion companion3 = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(new vu2(bu2Var, uyVar)));
        }
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
        this.c.a(h5.m);
        iu2 iu2Var = this.b;
        uy uyVar = this.e;
        if (iu2Var.a.isActive()) {
            CancellableContinuationImpl cancellableContinuationImpl = iu2Var.a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(new uu2(hm3Var, uyVar)));
        }
    }

    @Override // yads.wo2
    public final void a() {
        this.c.a(h5.l);
        this.c.a(h5.m, null);
    }
}
