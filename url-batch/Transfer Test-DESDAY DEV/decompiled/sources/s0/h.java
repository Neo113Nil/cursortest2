package s0;

import com.football.transfertrivia.GameActivity;
import o1.AbstractC0302t;

/* loaded from: classes.dex */
public final class h extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f3659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GameActivity gameActivity, X0.d dVar) {
        super(dVar);
        this.f3660f = gameActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new h(this.f3660f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((h) a((o1.r) obj, (X0.d) obj2)).i(U0.i.f870a);
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        Y0.a aVar = Y0.a.f1162a;
        int i = this.f3659e;
        if (i == 0) {
            T.e.W(obj);
            this.f3659e = 1;
            if (AbstractC0302t.c(this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            T.e.W(obj);
        }
        GameActivity gameActivity = this.f3660f;
        gameActivity.f1741D++;
        gameActivity.n();
        return U0.i.f870a;
    }
}
