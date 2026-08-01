package com.luckycounter.drinkwater.data;

/* loaded from: classes.dex */
public final class LogResult {
    private final int goalMl;
    private final int percent;
    private final boolean shouldCelebrate;
    private final int tierIndex;
    private final int todayMl;

    public LogResult(int i, int i2, int i3, boolean z2, int i4) {
        this.todayMl = i;
        this.goalMl = i2;
        this.percent = i3;
        this.shouldCelebrate = z2;
        this.tierIndex = i4;
    }

    public static /* synthetic */ LogResult copy$default(LogResult logResult, int i, int i2, int i3, boolean z2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = logResult.todayMl;
        }
        if ((i5 & 2) != 0) {
            i2 = logResult.goalMl;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = logResult.percent;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            z2 = logResult.shouldCelebrate;
        }
        boolean z3 = z2;
        if ((i5 & 16) != 0) {
            i4 = logResult.tierIndex;
        }
        return logResult.copy(i, i6, i7, z3, i4);
    }

    public final int component1() {
        return this.todayMl;
    }

    public final int component2() {
        return this.goalMl;
    }

    public final int component3() {
        return this.percent;
    }

    public final boolean component4() {
        return this.shouldCelebrate;
    }

    public final int component5() {
        return this.tierIndex;
    }

    public final LogResult copy(int i, int i2, int i3, boolean z2, int i4) {
        return new LogResult(i, i2, i3, z2, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogResult)) {
            return false;
        }
        LogResult logResult = (LogResult) obj;
        return this.todayMl == logResult.todayMl && this.goalMl == logResult.goalMl && this.percent == logResult.percent && this.shouldCelebrate == logResult.shouldCelebrate && this.tierIndex == logResult.tierIndex;
    }

    public final int getGoalMl() {
        return this.goalMl;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final boolean getShouldCelebrate() {
        return this.shouldCelebrate;
    }

    public final int getTierIndex() {
        return this.tierIndex;
    }

    public final int getTodayMl() {
        return this.todayMl;
    }

    public int hashCode() {
        return Integer.hashCode(this.tierIndex) + ((Boolean.hashCode(this.shouldCelebrate) + ((Integer.hashCode(this.percent) + ((Integer.hashCode(this.goalMl) + (Integer.hashCode(this.todayMl) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "LogResult(todayMl=" + this.todayMl + ", goalMl=" + this.goalMl + ", percent=" + this.percent + ", shouldCelebrate=" + this.shouldCelebrate + ", tierIndex=" + this.tierIndex + ")";
    }
}
