package com.football.transfertrivia.db;

import g1.d;

/* loaded from: classes.dex */
public final class GameSessionEntity {
    private final int currentQuestion;
    private final long id;
    private final boolean isActive;
    private final int lives;
    private final int score;
    private final long timeLeft;
    private final long timestamp;

    public GameSessionEntity() {
        this(0L, 0, 0, 0, 0L, false, 0L, 127, null);
    }

    public final long component1() {
        return this.id;
    }

    public final int component2() {
        return this.score;
    }

    public final int component3() {
        return this.lives;
    }

    public final int component4() {
        return this.currentQuestion;
    }

    public final long component5() {
        return this.timeLeft;
    }

    public final boolean component6() {
        return this.isActive;
    }

    public final long component7() {
        return this.timestamp;
    }

    public final GameSessionEntity copy(long j2, int i, int i2, int i3, long j3, boolean z2, long j4) {
        return new GameSessionEntity(j2, i, i2, i3, j3, z2, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameSessionEntity)) {
            return false;
        }
        GameSessionEntity gameSessionEntity = (GameSessionEntity) obj;
        return this.id == gameSessionEntity.id && this.score == gameSessionEntity.score && this.lives == gameSessionEntity.lives && this.currentQuestion == gameSessionEntity.currentQuestion && this.timeLeft == gameSessionEntity.timeLeft && this.isActive == gameSessionEntity.isActive && this.timestamp == gameSessionEntity.timestamp;
    }

    public final int getCurrentQuestion() {
        return this.currentQuestion;
    }

    public final long getId() {
        return this.id;
    }

    public final int getLives() {
        return this.lives;
    }

    public final int getScore() {
        return this.score;
    }

    public final long getTimeLeft() {
        return this.timeLeft;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + ((Boolean.hashCode(this.isActive) + ((Long.hashCode(this.timeLeft) + ((Integer.hashCode(this.currentQuestion) + ((Integer.hashCode(this.lives) + ((Integer.hashCode(this.score) + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "GameSessionEntity(id=" + this.id + ", score=" + this.score + ", lives=" + this.lives + ", currentQuestion=" + this.currentQuestion + ", timeLeft=" + this.timeLeft + ", isActive=" + this.isActive + ", timestamp=" + this.timestamp + ")";
    }

    public GameSessionEntity(long j2, int i, int i2, int i3, long j3, boolean z2, long j4) {
        this.id = j2;
        this.score = i;
        this.lives = i2;
        this.currentQuestion = i3;
        this.timeLeft = j3;
        this.isActive = z2;
        this.timestamp = j4;
    }

    public /* synthetic */ GameSessionEntity(long j2, int i, int i2, int i3, long j3, boolean z2, long j4, int i4, d dVar) {
        this((i4 & 1) != 0 ? 0L : j2, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 3 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? 15000L : j3, (i4 & 32) != 0 ? true : z2, (i4 & 64) != 0 ? System.currentTimeMillis() : j4);
    }
}
