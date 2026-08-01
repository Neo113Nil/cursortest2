package s0;

import com.football.transfertrivia.MainActivity;
import com.football.transfertrivia.db.AppDatabase;
import com.football.transfertrivia.db.GameSessionDao;
import com.football.transfertrivia.db.GameSessionEntity;
import o1.AbstractC0302t;
import o1.AbstractC0308z;

/* loaded from: classes.dex */
public final class m extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public GameSessionDao f3668e;

    /* renamed from: f, reason: collision with root package name */
    public int f3669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(MainActivity mainActivity, X0.d dVar) {
        super(dVar);
        this.f3670g = mainActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new m(this.f3670g, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((m) a((o1.r) obj, (X0.d) obj2)).i(U0.i.f870a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
    @Override // Z0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        GameSessionDao gameSessionDao;
        Object insertSession;
        p1.c cVar;
        k kVar;
        Y0.a aVar = Y0.a.f1162a;
        int i = this.f3669f;
        MainActivity mainActivity = this.f3670g;
        try {
        } catch (Exception unused) {
            u1.d dVar = AbstractC0308z.f3345a;
            p1.c cVar2 = s1.m.f3714a;
            l lVar = new l(mainActivity, null);
            this.f3668e = null;
            this.f3669f = 4;
            if (AbstractC0302t.n(cVar2, lVar, this) == aVar) {
                return aVar;
            }
        }
        if (i == 0) {
            T.e.W(obj);
            gameSessionDao = AppDatabase.Companion.getDatabase(mainActivity).gameSessionDao();
            this.f3668e = gameSessionDao;
            this.f3669f = 1;
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
                kVar = new k(mainActivity, longValue, null);
                this.f3669f = 3;
                if (AbstractC0302t.n(cVar, kVar, this) == aVar) {
                    return aVar;
                }
                return U0.i.f870a;
            }
            gameSessionDao = this.f3668e;
            T.e.W(obj);
        }
        GameSessionEntity gameSessionEntity = new GameSessionEntity(0L, 0, 3, 0, 15000L, true, 0L, 65, null);
        this.f3668e = null;
        this.f3669f = 2;
        insertSession = gameSessionDao.insertSession(gameSessionEntity, this);
        if (insertSession == aVar) {
            return aVar;
        }
        long longValue2 = ((Number) insertSession).longValue();
        u1.d dVar22 = AbstractC0308z.f3345a;
        cVar = s1.m.f3714a;
        kVar = new k(mainActivity, longValue2, null);
        this.f3669f = 3;
        if (AbstractC0302t.n(cVar, kVar, this) == aVar) {
        }
        return U0.i.f870a;
    }
}
