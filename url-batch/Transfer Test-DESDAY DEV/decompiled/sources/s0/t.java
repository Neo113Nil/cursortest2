package s0;

import android.content.Intent;
import com.football.transfertrivia.GameActivity;
import com.football.transfertrivia.ResultActivity;

/* loaded from: classes.dex */
public final class t extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ResultActivity f3682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3683f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ResultActivity resultActivity, long j2, X0.d dVar) {
        super(dVar);
        this.f3682e = resultActivity;
        this.f3683f = j2;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new t(this.f3682e, this.f3683f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        t tVar = (t) a((o1.r) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f870a;
        tVar.i(iVar);
        return iVar;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        T.e.W(obj);
        ResultActivity resultActivity = this.f3682e;
        Intent intent = new Intent(resultActivity, (Class<?>) GameActivity.class);
        intent.putExtra("SESSION_ID", this.f3683f);
        resultActivity.startActivity(intent);
        return U0.i.f870a;
    }
}
