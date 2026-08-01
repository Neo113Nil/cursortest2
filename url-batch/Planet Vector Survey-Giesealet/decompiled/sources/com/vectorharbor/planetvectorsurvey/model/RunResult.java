package com.vectorharbor.planetvectorsurvey.model;

import defpackage.nz;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class RunResult {
    public static final int $stable = 0;
    private final int bestCombo;
    private final boolean cleared;
    private final int completedLocks;
    private final String rank;
    private final int remainingLives;
    private final int score;

    public RunResult(boolean z, int i, String str, int i2, int i3, int i4) {
        str.getClass();
        this.cleared = z;
        this.score = i;
        this.rank = str;
        this.completedLocks = i2;
        this.bestCombo = i3;
        this.remainingLives = i4;
    }

    public static /* synthetic */ RunResult copy$default(RunResult runResult, boolean z, int i, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = runResult.cleared;
        }
        if ((i5 & 2) != 0) {
            i = runResult.score;
        }
        if ((i5 & 4) != 0) {
            str = runResult.rank;
        }
        if ((i5 & 8) != 0) {
            i2 = runResult.completedLocks;
        }
        if ((i5 & 16) != 0) {
            i3 = runResult.bestCombo;
        }
        if ((i5 & 32) != 0) {
            i4 = runResult.remainingLives;
        }
        int i6 = i3;
        int i7 = i4;
        return runResult.copy(z, i, str, i2, i6, i7);
    }

    public final boolean component1() {
        return this.cleared;
    }

    public final int component2() {
        return this.score;
    }

    public final String component3() {
        return this.rank;
    }

    public final int component4() {
        return this.completedLocks;
    }

    public final int component5() {
        return this.bestCombo;
    }

    public final int component6() {
        return this.remainingLives;
    }

    public final RunResult copy(boolean z, int i, String str, int i2, int i3, int i4) {
        str.getClass();
        return new RunResult(z, i, str, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RunResult)) {
            return false;
        }
        RunResult runResult = (RunResult) obj;
        return this.cleared == runResult.cleared && this.score == runResult.score && nz.l(this.rank, runResult.rank) && this.completedLocks == runResult.completedLocks && this.bestCombo == runResult.bestCombo && this.remainingLives == runResult.remainingLives;
    }

    public final int getBestCombo() {
        return this.bestCombo;
    }

    public final boolean getCleared() {
        return this.cleared;
    }

    public final int getCompletedLocks() {
        return this.completedLocks;
    }

    public final String getRank() {
        return this.rank;
    }

    public final int getRemainingLives() {
        return this.remainingLives;
    }

    public final int getScore() {
        return this.score;
    }

    public int hashCode() {
        return ((((((this.rank.hashCode() + ((((this.cleared ? 1231 : 1237) * 31) + this.score) * 31)) * 31) + this.completedLocks) * 31) + this.bestCombo) * 31) + this.remainingLives;
    }

    public String toString() {
        return "RunResult(cleared=" + this.cleared + ", score=" + this.score + ", rank=" + this.rank + ", completedLocks=" + this.completedLocks + ", bestCombo=" + this.bestCombo + ", remainingLives=" + this.remainingLives + ")";
    }
}
