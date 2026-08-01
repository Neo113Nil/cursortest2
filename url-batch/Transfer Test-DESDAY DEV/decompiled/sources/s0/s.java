package s0;

import com.football.transfertrivia.ResultActivity;
import com.football.transfertrivia.db.AppDatabase;
import com.football.transfertrivia.db.GameSessionDao;
import java.util.List;
import o1.AbstractC0302t;
import o1.AbstractC0308z;

/* loaded from: classes.dex */
public final class s extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f3680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ResultActivity f3681f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ResultActivity resultActivity, X0.d dVar) {
        super(dVar);
        this.f3681f = resultActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new s(this.f3681f, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((s) a((o1.r) obj, (X0.d) obj2)).i(U0.i.f870a);
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        Y0.a aVar = Y0.a.f1162a;
        int i = this.f3680e;
        ResultActivity resultActivity = this.f3681f;
        try {
        } catch (Exception unused) {
            u1.d dVar = AbstractC0308z.f3345a;
            p1.c cVar = s1.m.f3714a;
            r rVar = new r(resultActivity, null);
            this.f3680e = 3;
            if (AbstractC0302t.n(cVar, rVar, this) == aVar) {
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
            this.f3680e = 1;
            obj = gameSessionDao.getTopScores(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    T.e.W(obj);
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    T.e.W(obj);
                }
                return U0.i.f870a;
            }
            T.e.W(obj);
        }
        u1.d dVar2 = AbstractC0308z.f3345a;
        p1.c cVar2 = s1.m.f3714a;
        q qVar = new q((List) obj, resultActivity, null);
        this.f3680e = 2;
        if (AbstractC0302t.n(cVar2, qVar, this) == aVar) {
            return aVar;
        }
        return U0.i.f870a;
    }
}
