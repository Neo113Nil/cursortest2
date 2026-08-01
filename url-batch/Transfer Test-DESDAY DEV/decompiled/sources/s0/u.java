package s0;

import android.content.Intent;
import com.football.transfertrivia.GameActivity;
import com.football.transfertrivia.ResultActivity;

/* loaded from: classes.dex */
public final class u extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ResultActivity f3684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ResultActivity resultActivity, X0.d dVar) {
        super(dVar);
        this.f3684e = resultActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new u(this.f3684e, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        u uVar = (u) a((o1.r) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f870a;
        uVar.i(iVar);
        return iVar;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        T.e.W(obj);
        ResultActivity resultActivity = this.f3684e;
        Intent intent = new Intent(resultActivity, (Class<?>) GameActivity.class);
        intent.putExtra("SESSION_ID", -1L);
        resultActivity.startActivity(intent);
        return U0.i.f870a;
    }
}
