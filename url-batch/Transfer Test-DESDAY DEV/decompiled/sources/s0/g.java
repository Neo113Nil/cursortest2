package s0;

import com.football.transfertrivia.GameActivity;
import com.football.transfertrivia.db.AppDatabase;
import com.football.transfertrivia.db.GameSessionDao;
import com.football.transfertrivia.db.GameSessionEntity;

/* loaded from: classes.dex */
public final class g extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public GameActivity f3656e;

    /* renamed from: f, reason: collision with root package name */
    public GameSessionEntity f3657f;

    /* renamed from: g, reason: collision with root package name */
    public int f3658g;
    public final /* synthetic */ GameActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GameActivity gameActivity, X0.d dVar) {
        super(dVar);
        this.h = gameActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new g(this.h, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((g) a((o1.r) obj, (X0.d) obj2)).i(U0.i.f870a);
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        GameActivity gameActivity;
        GameSessionEntity copy;
        GameSessionEntity gameSessionEntity;
        Y0.a aVar = Y0.a.f1162a;
        int i = this.f3658g;
        if (i == 0) {
            T.e.W(obj);
            gameActivity = this.h;
            GameSessionEntity gameSessionEntity2 = gameActivity.f1739B;
            if (gameSessionEntity2 != null) {
                copy = gameSessionEntity2.copy((r22 & 1) != 0 ? gameSessionEntity2.id : 0L, (r22 & 2) != 0 ? gameSessionEntity2.score : gameActivity.f1742E, (r22 & 4) != 0 ? gameSessionEntity2.lives : gameActivity.F, (r22 & 8) != 0 ? gameSessionEntity2.currentQuestion : gameActivity.f1741D + 1, (r22 & 16) != 0 ? gameSessionEntity2.timeLeft : 15000L, (r22 & 32) != 0 ? gameSessionEntity2.isActive : false, (r22 & 64) != 0 ? gameSessionEntity2.timestamp : 0L);
                AppDatabase appDatabase = gameActivity.f1738A;
                if (appDatabase == null) {
                    g1.f.g("database");
                    throw null;
                }
                GameSessionDao gameSessionDao = appDatabase.gameSessionDao();
                this.f3656e = gameActivity;
                this.f3657f = copy;
                this.f3658g = 1;
                if (gameSessionDao.updateSession(copy, this) == aVar) {
                    return aVar;
                }
                gameSessionEntity = copy;
            }
            return U0.i.f870a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gameSessionEntity = this.f3657f;
        gameActivity = this.f3656e;
        T.e.W(obj);
        gameActivity.f1739B = gameSessionEntity;
        return U0.i.f870a;
    }
}
