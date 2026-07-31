package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class g60 extends Lambda implements Function0 {
    public final /* synthetic */ r70 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(Context context, r70 r70Var) {
        super(0);
        this.b = r70Var;
        this.c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        vw2 vw2Var = (vw2) this.b.b.getValue();
        Context context = this.c;
        if (qw.a == null) {
            synchronized (qw.b) {
                try {
                    if (qw.a == null) {
                        qw.a = rw.a(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        sw swVar = qw.a;
        if (swVar != null) {
            return new az(vw2Var, swVar);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
