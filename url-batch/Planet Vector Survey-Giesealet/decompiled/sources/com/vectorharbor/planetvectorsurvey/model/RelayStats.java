package com.vectorharbor.planetvectorsurvey.model;

import defpackage.pk;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class RelayStats {
    public static final int $stable = 0;
    private final int bestCombo;
    private final int bestScore;
    private final int missionsCleared;
    private final int totalLocks;

    public /* synthetic */ RelayStats(int i, int i2, int i3, int i4, int i5, pk pkVar) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public static /* synthetic */ RelayStats copy$default(RelayStats relayStats, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = relayStats.bestScore;
        }
        if ((i5 & 2) != 0) {
            i2 = relayStats.bestCombo;
        }
        if ((i5 & 4) != 0) {
            i3 = relayStats.missionsCleared;
        }
        if ((i5 & 8) != 0) {
            i4 = relayStats.totalLocks;
        }
        return relayStats.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.bestScore;
    }

    public final int component2() {
        return this.bestCombo;
    }

    public final int component3() {
        return this.missionsCleared;
    }

    public final int component4() {
        return this.totalLocks;
    }

    public final RelayStats copy(int i, int i2, int i3, int i4) {
        return new RelayStats(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelayStats)) {
            return false;
        }
        RelayStats relayStats = (RelayStats) obj;
        return this.bestScore == relayStats.bestScore && this.bestCombo == relayStats.bestCombo && this.missionsCleared == relayStats.missionsCleared && this.totalLocks == relayStats.totalLocks;
    }

    public final int getBestCombo() {
        return this.bestCombo;
    }

    public final int getBestScore() {
        return this.bestScore;
    }

    public final int getMissionsCleared() {
        return this.missionsCleared;
    }

    public final int getTotalLocks() {
        return this.totalLocks;
    }

    public int hashCode() {
        return (((((this.bestScore * 31) + this.bestCombo) * 31) + this.missionsCleared) * 31) + this.totalLocks;
    }

    public String toString() {
        return "RelayStats(bestScore=" + this.bestScore + ", bestCombo=" + this.bestCombo + ", missionsCleared=" + this.missionsCleared + ", totalLocks=" + this.totalLocks + ")";
    }

    public RelayStats(int i, int i2, int i3, int i4) {
        this.bestScore = i;
        this.bestCombo = i2;
        this.missionsCleared = i3;
        this.totalLocks = i4;
    }

    public RelayStats() {
        this(0, 0, 0, 0, 15, null);
    }
}
