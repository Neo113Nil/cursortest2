package s0;

import com.football.transfertrivia.GameActivity;
import com.football.transfertrivia.db.AppDatabase;
import com.football.transfertrivia.db.GameSessionDao;
import com.football.transfertrivia.db.GameSessionEntity;
import o1.AbstractC0302t;
import o1.AbstractC0308z;

/* loaded from: classes.dex */
public final class d extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f3649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GameActivity gameActivity, X0.d dVar) {
        super(dVar);
        this.f3650f = gameActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new d(this.f3650f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((d) a((o1.r) obj, (X0.d) obj2)).i(U0.i.f870a);
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        GameSessionEntity copy;
        Y0.a aVar = Y0.a.f1162a;
        int i = this.f3649e;
        GameActivity gameActivity = this.f3650f;
        if (i == 0) {
            T.e.W(obj);
            GameSessionEntity gameSessionEntity = gameActivity.f1739B;
            if (gameSessionEntity != null) {
                copy = gameSessionEntity.copy((r22 & 1) != 0 ? gameSessionEntity.id : 0L, (r22 & 2) != 0 ? gameSessionEntity.score : gameActivity.f1742E, (r22 & 4) != 0 ? gameSessionEntity.lives : gameActivity.F, (r22 & 8) != 0 ? gameSessionEntity.currentQuestion : gameActivity.f1741D, (r22 & 16) != 0 ? gameSessionEntity.timeLeft : 0L, (r22 & 32) != 0 ? gameSessionEntity.isActive : false, (r22 & 64) != 0 ? gameSessionEntity.timestamp : 0L);
                AppDatabase appDatabase = gameActivity.f1738A;
                if (appDatabase == null) {
                    g1.f.g("database");
                    throw null;
                }
                GameSessionDao gameSessionDao = appDatabase.gameSessionDao();
                this.f3649e = 1;
                if (gameSessionDao.updateSession(copy, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                T.e.W(obj);
                return U0.i.f870a;
            }
            T.e.W(obj);
        }
        u1.d dVar = AbstractC0308z.f3345a;
        p1.c cVar = s1.m.f3714a;
        c cVar2 = new c(gameActivity, null);
        this.f3649e = 2;
        if (AbstractC0302t.n(cVar, cVar2, this) == aVar) {
            return aVar;
        }
        return U0.i.f870a;
    }
}
