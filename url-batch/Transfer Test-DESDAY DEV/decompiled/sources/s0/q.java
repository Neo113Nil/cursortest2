package s0;

import com.football.transfertrivia.ResultActivity;
import com.football.transfertrivia.db.GameSessionEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f3677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultActivity f3678f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(List list, ResultActivity resultActivity, X0.d dVar) {
        super(dVar);
        this.f3677e = list;
        this.f3678f = resultActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new q(this.f3677e, this.f3678f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        q qVar = (q) a((o1.r) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f870a;
        qVar.i(iVar);
        return iVar;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        T.e.W(obj);
        List list = this.f3677e;
        boolean isEmpty = list.isEmpty();
        ResultActivity resultActivity = this.f3678f;
        if (isEmpty) {
            o oVar = resultActivity.f1750B;
            if (oVar == null) {
                g1.f.g("leaderboardAdapter");
                throw null;
            }
            oVar.d = V0.m.f875a;
            oVar.f2326a.b();
        } else {
            ArrayList arrayList = new ArrayList(V0.g.c0(list));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    V0.f.b0();
                    throw null;
                }
                GameSessionEntity gameSessionEntity = (GameSessionEntity) obj2;
                int score = gameSessionEntity.getScore();
                long timestamp = gameSessionEntity.getTimestamp();
                int i3 = ResultActivity.f1748C;
                resultActivity.getClass();
                String format = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(new Date(timestamp));
                g1.f.d(format, "format(...)");
                arrayList.add(new p(i2, score, format));
                i = i2;
            }
            o oVar2 = resultActivity.f1750B;
            if (oVar2 == null) {
                g1.f.g("leaderboardAdapter");
                throw null;
            }
            oVar2.d = arrayList;
            oVar2.f2326a.b();
        }
        return U0.i.f870a;
    }
}
