package s0;

import android.content.Intent;
import com.football.transfertrivia.GameActivity;
import com.football.transfertrivia.MainActivity;

/* loaded from: classes.dex */
public final class l extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MainActivity mainActivity, X0.d dVar) {
        super(dVar);
        this.f3667e = mainActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new l(this.f3667e, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        l lVar = (l) a((o1.r) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f870a;
        lVar.i(iVar);
        return iVar;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        T.e.W(obj);
        MainActivity mainActivity = this.f3667e;
        Intent intent = new Intent(mainActivity, (Class<?>) GameActivity.class);
        intent.putExtra("SESSION_ID", -1L);
        mainActivity.startActivity(intent);
        return U0.i.f870a;
    }
}
