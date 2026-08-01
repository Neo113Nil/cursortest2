package s0;

import com.football.transfertrivia.ResultActivity;
import com.football.transfertrivia.db.AppDatabase;
import com.football.transfertrivia.db.GameSessionDao;
import com.football.transfertrivia.db.GameSessionEntity;
import o1.AbstractC0302t;
import o1.AbstractC0308z;

/* loaded from: classes.dex */
public final class v extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f3685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultActivity f3686f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ResultActivity resultActivity, X0.d dVar) {
        super(dVar);
        this.f3686f = resultActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new v(this.f3686f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((v) a((o1.r) obj, (X0.d) obj2)).i(U0.i.f870a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[RETURN] */
    @Override // Z0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        Object insertSession;
        p1.c cVar;
        t tVar;
        Y0.a aVar = Y0.a.f1162a;
        int i = this.f3685e;
        ResultActivity resultActivity = this.f3686f;
        try {
        } catch (Exception unused) {
            u1.d dVar = AbstractC0308z.f3345a;
            p1.c cVar2 = s1.m.f3714a;
            u uVar = new u(resultActivity, null);
            this.f3685e = 4;
            if (AbstractC0302t.n(cVar2, uVar, this) == aVar) {
                return aVar;
            }
        }
        if (i == 0) {
            T.e.W(obj);
            AppDatabase appDatabase = resultActivity.f1749A;
            if (appDatabase == null) {
                g1.f.g("database");
                throw null;
            }
            GameSessionDao gameSessionDao = appDatabase.gameSessionDao();
            this.f3685e = 1;
            if (gameSessionDao.deactivateAllSessions(this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        T.e.W(obj);
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        T.e.W(obj);
                    }
                    return U0.i.f870a;
                }
                T.e.W(obj);
                insertSession = obj;
                long longValue = ((Number) insertSession).longValue();
                u1.d dVar2 = AbstractC0308z.f3345a;
                cVar = s1.m.f3714a;
                tVar = new t(resultActivity, longValue, null);
                this.f3685e = 3;
                if (AbstractC0302t.n(cVar, tVar, this) == aVar) {
                    return aVar;
                }
                return U0.i.f870a;
            }
            T.e.W(obj);
        }
        GameSessionEntity gameSessionEntity = new GameSessionEntity(0L, 0, 3, 0, 15000L, true, 0L, 65, null);
        AppDatabase appDatabase2 = resultActivity.f1749A;
        if (appDatabase2 == null) {
            g1.f.g("database");
            throw null;
        }
        GameSessionDao gameSessionDao2 = appDatabase2.gameSessionDao();
        this.f3685e = 2;
        insertSession = gameSessionDao2.insertSession(gameSessionEntity, this);
        if (insertSession == aVar) {
            return aVar;
        }
        long longValue2 = ((Number) insertSession).longValue();
        u1.d dVar22 = AbstractC0308z.f3345a;
        cVar = s1.m.f3714a;
        tVar = new t(resultActivity, longValue2, null);
        this.f3685e = 3;
        if (AbstractC0302t.n(cVar, tVar, this) == aVar) {
        }
        return U0.i.f870a;
    }
}
