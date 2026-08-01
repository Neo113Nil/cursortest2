package s0;

import com.football.transfertrivia.ResultActivity;

/* loaded from: classes.dex */
public final class r extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ResultActivity f3679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ResultActivity resultActivity, X0.d dVar) {
        super(dVar);
        this.f3679e = resultActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new r(this.f3679e, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        r rVar = (r) a((o1.r) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f870a;
        rVar.i(iVar);
        return iVar;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        T.e.W(obj);
        o oVar = this.f3679e.f1750B;
        if (oVar == null) {
            g1.f.g("leaderboardAdapter");
            throw null;
        }
        oVar.d = V0.m.f875a;
        oVar.f2326a.b();
        return U0.i.f870a;
    }
}
