package com.football.transfertrivia.db;

import X0.d;

/* loaded from: classes.dex */
public interface GameSessionDao {
    Object deactivateAllSessions(d dVar);

    Object deleteOldSessions(long j2, d dVar);

    Object getActiveSession(d dVar);

    Object getRecentSessions(d dVar);

    Object getTopScores(d dVar);

    Object insertSession(GameSessionEntity gameSessionEntity, d dVar);

    Object updateSession(GameSessionEntity gameSessionEntity, d dVar);
}
