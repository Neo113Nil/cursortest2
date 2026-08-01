package s0;

import com.football.transfertrivia.GameActivity;
import com.football.transfertrivia.db.AppDatabase;
import com.football.transfertrivia.db.GameSessionDao;
import com.football.transfertrivia.db.GameSessionEntity;

/* loaded from: classes.dex */
public final class i extends Z0.h implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public GameActivity f3661e;

    /* renamed from: f, reason: collision with root package name */
    public int f3662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(GameActivity gameActivity, X0.d dVar) {
        super(dVar);
        this.f3663g = gameActivity;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        return new i(this.f3663g, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((i) a((o1.r) obj, (X0.d) obj2)).i(U0.i.f870a);
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        GameActivity gameActivity = this.f3663g;
        Y0.a aVar = Y0.a.f1162a;
        int i = this.f3662f;
        try {
            if (i == 0) {
                T.e.W(obj);
                AppDatabase database = AppDatabase.Companion.getDatabase(gameActivity);
                gameActivity.f1738A = database;
                if (database == null) {
                    g1.f.g("database");
                    throw null;
                }
                GameSessionDao gameSessionDao = database.gameSessionDao();
                this.f3661e = gameActivity;
                this.f3662f = 1;
                obj = gameSessionDao.getActiveSession(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gameActivity = this.f3661e;
                T.e.W(obj);
            }
            gameActivity.f1739B = (GameSessionEntity) obj;
        } catch (Exception unused) {
        }
        return U0.i.f870a;
    }
}
