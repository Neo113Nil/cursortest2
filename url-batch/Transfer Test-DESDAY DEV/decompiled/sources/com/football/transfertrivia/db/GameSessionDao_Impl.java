package com.football.transfertrivia.db;

import X0.d;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import androidx.room.i;
import androidx.room.t;
import androidx.room.w;
import androidx.room.y;
import g1.f;
import j0.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class GameSessionDao_Impl implements GameSessionDao {
    private final t __db;
    private final i __insertionAdapterOfGameSessionEntity;
    private final y __preparedStmtOfDeactivateAllSessions;
    private final y __preparedStmtOfDeleteOldSessions;
    private final h __updateAdapterOfGameSessionEntity;

    public GameSessionDao_Impl(t tVar) {
        this.__db = tVar;
        this.__insertionAdapterOfGameSessionEntity = new i(tVar) { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(tVar);
                f.e(tVar, "database");
            }

            @Override // androidx.room.y
            public String createQuery() {
                return "INSERT OR REPLACE INTO `game_sessions` (`id`,`score`,`lives`,`currentQuestion`,`timeLeft`,`isActive`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            @Override // androidx.room.i
            public void bind(e eVar, GameSessionEntity gameSessionEntity) {
                eVar.p(1, gameSessionEntity.getId());
                eVar.p(2, gameSessionEntity.getScore());
                eVar.p(3, gameSessionEntity.getLives());
                eVar.p(4, gameSessionEntity.getCurrentQuestion());
                eVar.p(5, gameSessionEntity.getTimeLeft());
                eVar.p(6, gameSessionEntity.isActive() ? 1L : 0L);
                eVar.p(7, gameSessionEntity.getTimestamp());
            }
        };
        this.__updateAdapterOfGameSessionEntity = new h(tVar) { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(tVar);
                f.e(tVar, "database");
            }

            @Override // androidx.room.y
            public String createQuery() {
                return "UPDATE OR ABORT `game_sessions` SET `id` = ?,`score` = ?,`lives` = ?,`currentQuestion` = ?,`timeLeft` = ?,`isActive` = ?,`timestamp` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.h
            public void bind(e eVar, GameSessionEntity gameSessionEntity) {
                eVar.p(1, gameSessionEntity.getId());
                eVar.p(2, gameSessionEntity.getScore());
                eVar.p(3, gameSessionEntity.getLives());
                eVar.p(4, gameSessionEntity.getCurrentQuestion());
                eVar.p(5, gameSessionEntity.getTimeLeft());
                eVar.p(6, gameSessionEntity.isActive() ? 1L : 0L);
                eVar.p(7, gameSessionEntity.getTimestamp());
                eVar.p(8, gameSessionEntity.getId());
            }
        };
        this.__preparedStmtOfDeactivateAllSessions = new y(tVar) { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.3
            @Override // androidx.room.y
            public String createQuery() {
                return "UPDATE game_sessions SET isActive = 0 WHERE isActive = 1";
            }
        };
        this.__preparedStmtOfDeleteOldSessions = new y(tVar) { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.4
            @Override // androidx.room.y
            public String createQuery() {
                return "DELETE FROM game_sessions WHERE isActive = 0 AND timestamp < ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.football.transfertrivia.db.GameSessionDao
    public Object deactivateAllSessions(d dVar) {
        return androidx.room.f.b(this.__db, new Callable<U0.i>() { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public U0.i call() {
                e acquire = GameSessionDao_Impl.this.__preparedStmtOfDeactivateAllSessions.acquire();
                try {
                    GameSessionDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.w();
                        GameSessionDao_Impl.this.__db.setTransactionSuccessful();
                        return U0.i.f870a;
                    } finally {
                        GameSessionDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GameSessionDao_Impl.this.__preparedStmtOfDeactivateAllSessions.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.football.transfertrivia.db.GameSessionDao
    public Object deleteOldSessions(final long j2, d dVar) {
        return androidx.room.f.b(this.__db, new Callable<U0.i>() { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public U0.i call() {
                e acquire = GameSessionDao_Impl.this.__preparedStmtOfDeleteOldSessions.acquire();
                acquire.p(1, j2);
                try {
                    GameSessionDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.w();
                        GameSessionDao_Impl.this.__db.setTransactionSuccessful();
                        return U0.i.f870a;
                    } finally {
                        GameSessionDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GameSessionDao_Impl.this.__preparedStmtOfDeleteOldSessions.release(acquire);
                }
            }
        }, dVar);
    }

    @Override // com.football.transfertrivia.db.GameSessionDao
    public Object getActiveSession(d dVar) {
        final w m2 = w.m("SELECT * FROM game_sessions WHERE isActive = 1 LIMIT 1");
        return androidx.room.f.a(this.__db, new CancellationSignal(), new Callable<GameSessionEntity>() { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GameSessionEntity call() {
                GameSessionEntity gameSessionEntity;
                Cursor Q2 = T.e.Q(GameSessionDao_Impl.this.__db, m2);
                try {
                    int v2 = T.e.v(Q2, "id");
                    int v3 = T.e.v(Q2, "score");
                    int v4 = T.e.v(Q2, "lives");
                    int v5 = T.e.v(Q2, "currentQuestion");
                    int v6 = T.e.v(Q2, "timeLeft");
                    int v7 = T.e.v(Q2, "isActive");
                    int v8 = T.e.v(Q2, "timestamp");
                    if (Q2.moveToFirst()) {
                        gameSessionEntity = new GameSessionEntity(Q2.getLong(v2), Q2.getInt(v3), Q2.getInt(v4), Q2.getInt(v5), Q2.getLong(v6), Q2.getInt(v7) != 0, Q2.getLong(v8));
                    } else {
                        gameSessionEntity = null;
                    }
                    return gameSessionEntity;
                } finally {
                    Q2.close();
                    m2.n();
                }
            }
        }, dVar);
    }

    @Override // com.football.transfertrivia.db.GameSessionDao
    public Object getRecentSessions(d dVar) {
        final w m2 = w.m("SELECT * FROM game_sessions ORDER BY timestamp DESC LIMIT 5");
        return androidx.room.f.a(this.__db, new CancellationSignal(), new Callable<List<GameSessionEntity>>() { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.11
            @Override // java.util.concurrent.Callable
            public List<GameSessionEntity> call() {
                Cursor Q2 = T.e.Q(GameSessionDao_Impl.this.__db, m2);
                try {
                    int v2 = T.e.v(Q2, "id");
                    int v3 = T.e.v(Q2, "score");
                    int v4 = T.e.v(Q2, "lives");
                    int v5 = T.e.v(Q2, "currentQuestion");
                    int v6 = T.e.v(Q2, "timeLeft");
                    int v7 = T.e.v(Q2, "isActive");
                    int v8 = T.e.v(Q2, "timestamp");
                    ArrayList arrayList = new ArrayList(Q2.getCount());
                    while (Q2.moveToNext()) {
                        arrayList.add(new GameSessionEntity(Q2.getLong(v2), Q2.getInt(v3), Q2.getInt(v4), Q2.getInt(v5), Q2.getLong(v6), Q2.getInt(v7) != 0, Q2.getLong(v8)));
                    }
                    return arrayList;
                } finally {
                    Q2.close();
                    m2.n();
                }
            }
        }, dVar);
    }

    @Override // com.football.transfertrivia.db.GameSessionDao
    public Object getTopScores(d dVar) {
        final w m2 = w.m("SELECT * FROM game_sessions ORDER BY score DESC LIMIT 10");
        return androidx.room.f.a(this.__db, new CancellationSignal(), new Callable<List<GameSessionEntity>>() { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.10
            @Override // java.util.concurrent.Callable
            public List<GameSessionEntity> call() {
                Cursor Q2 = T.e.Q(GameSessionDao_Impl.this.__db, m2);
                try {
                    int v2 = T.e.v(Q2, "id");
                    int v3 = T.e.v(Q2, "score");
                    int v4 = T.e.v(Q2, "lives");
                    int v5 = T.e.v(Q2, "currentQuestion");
                    int v6 = T.e.v(Q2, "timeLeft");
                    int v7 = T.e.v(Q2, "isActive");
                    int v8 = T.e.v(Q2, "timestamp");
                    ArrayList arrayList = new ArrayList(Q2.getCount());
                    while (Q2.moveToNext()) {
                        arrayList.add(new GameSessionEntity(Q2.getLong(v2), Q2.getInt(v3), Q2.getInt(v4), Q2.getInt(v5), Q2.getLong(v6), Q2.getInt(v7) != 0, Q2.getLong(v8)));
                    }
                    return arrayList;
                } finally {
                    Q2.close();
                    m2.n();
                }
            }
        }, dVar);
    }

    @Override // com.football.transfertrivia.db.GameSessionDao
    public Object insertSession(final GameSessionEntity gameSessionEntity, d dVar) {
        return androidx.room.f.b(this.__db, new Callable<Long>() { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                GameSessionDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(GameSessionDao_Impl.this.__insertionAdapterOfGameSessionEntity.insertAndReturnId(gameSessionEntity));
                    GameSessionDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    GameSessionDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }

    @Override // com.football.transfertrivia.db.GameSessionDao
    public Object updateSession(final GameSessionEntity gameSessionEntity, d dVar) {
        return androidx.room.f.b(this.__db, new Callable<U0.i>() { // from class: com.football.transfertrivia.db.GameSessionDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public U0.i call() {
                GameSessionDao_Impl.this.__db.beginTransaction();
                try {
                    GameSessionDao_Impl.this.__updateAdapterOfGameSessionEntity.handle(gameSessionEntity);
                    GameSessionDao_Impl.this.__db.setTransactionSuccessful();
                    return U0.i.f870a;
                } finally {
                    GameSessionDao_Impl.this.__db.endTransaction();
                }
            }
        }, dVar);
    }
}
