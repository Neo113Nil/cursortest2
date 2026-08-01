package s0;

import android.content.Intent;
import com.football.transfertrivia.GameActivity;
import com.football.transfertrivia.ResultActivity;

/* loaded from: classes.dex */
public final class c extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GameActivity gameActivity, X0.d dVar) {
        super(dVar);
        this.f3648e = gameActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new c(this.f3648e, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        c cVar = (c) a((o1.r) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f870a;
        cVar.i(iVar);
        return iVar;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        T.e.W(obj);
        GameActivity gameActivity = this.f3648e;
        Intent intent = new Intent(gameActivity, (Class<?>) ResultActivity.class);
        intent.putExtra("FINAL_SCORE", gameActivity.f1742E);
        intent.putExtra("QUESTIONS_ANSWERED", gameActivity.f1741D);
        gameActivity.startActivity(intent);
        return U0.i.f870a;
    }
}
