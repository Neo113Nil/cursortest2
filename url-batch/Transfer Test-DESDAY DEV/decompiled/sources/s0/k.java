package s0;

import android.content.Intent;
import com.football.transfertrivia.GameActivity;
import com.football.transfertrivia.MainActivity;

/* loaded from: classes.dex */
public final class k extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MainActivity mainActivity, long j2, X0.d dVar) {
        super(dVar);
        this.f3665e = mainActivity;
        this.f3666f = j2;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new k(this.f3665e, this.f3666f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        k kVar = (k) a((o1.r) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f870a;
        kVar.i(iVar);
        return iVar;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        T.e.W(obj);
        MainActivity mainActivity = this.f3665e;
        Intent intent = new Intent(mainActivity, (Class<?>) GameActivity.class);
        intent.putExtra("SESSION_ID", this.f3666f);
        mainActivity.startActivity(intent);
        return U0.i.f870a;
    }
}
