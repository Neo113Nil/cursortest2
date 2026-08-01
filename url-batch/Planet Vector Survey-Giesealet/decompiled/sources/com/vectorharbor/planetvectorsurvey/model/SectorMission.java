package com.vectorharbor.planetvectorsurvey.model;

import defpackage.nz;
import defpackage.y6;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class SectorMission {
    public static final int $stable = 0;
    private final int artRes;
    private final float baseWindow;
    private final String cluster;
    private final float driftMultiplier;
    private final String goal;
    private final int id;
    private final int requiredLocks;
    private final int targetScore;
    private final int timeLimit;
    private final String title;

    public SectorMission(int i, String str, String str2, String str3, int i2, int i3, int i4, float f, float f2, int i5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.id = i;
        this.title = str;
        this.cluster = str2;
        this.goal = str3;
        this.targetScore = i2;
        this.timeLimit = i3;
        this.requiredLocks = i4;
        this.driftMultiplier = f;
        this.baseWindow = f2;
        this.artRes = i5;
    }

    public static /* synthetic */ SectorMission copy$default(SectorMission sectorMission, int i, String str, String str2, String str3, int i2, int i3, int i4, float f, float f2, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = sectorMission.id;
        }
        if ((i6 & 2) != 0) {
            str = sectorMission.title;
        }
        if ((i6 & 4) != 0) {
            str2 = sectorMission.cluster;
        }
        if ((i6 & 8) != 0) {
            str3 = sectorMission.goal;
        }
        if ((i6 & 16) != 0) {
            i2 = sectorMission.targetScore;
        }
        if ((i6 & 32) != 0) {
            i3 = sectorMission.timeLimit;
        }
        if ((i6 & 64) != 0) {
            i4 = sectorMission.requiredLocks;
        }
        if ((i6 & 128) != 0) {
            f = sectorMission.driftMultiplier;
        }
        if ((i6 & 256) != 0) {
            f2 = sectorMission.baseWindow;
        }
        if ((i6 & 512) != 0) {
            i5 = sectorMission.artRes;
        }
        float f3 = f2;
        int i7 = i5;
        int i8 = i4;
        float f4 = f;
        int i9 = i2;
        int i10 = i3;
        return sectorMission.copy(i, str, str2, str3, i9, i10, i8, f4, f3, i7);
    }

    public final int component1() {
        return this.id;
    }

    public final int component10() {
        return this.artRes;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.cluster;
    }

    public final String component4() {
        return this.goal;
    }

    public final int component5() {
        return this.targetScore;
    }

    public final int component6() {
        return this.timeLimit;
    }

    public final int component7() {
        return this.requiredLocks;
    }

    public final float component8() {
        return this.driftMultiplier;
    }

    public final float component9() {
        return this.baseWindow;
    }

    public final SectorMission copy(int i, String str, String str2, String str3, int i2, int i3, int i4, float f, float f2, int i5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new SectorMission(i, str, str2, str3, i2, i3, i4, f, f2, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectorMission)) {
            return false;
        }
        SectorMission sectorMission = (SectorMission) obj;
        return this.id == sectorMission.id && nz.l(this.title, sectorMission.title) && nz.l(this.cluster, sectorMission.cluster) && nz.l(this.goal, sectorMission.goal) && this.targetScore == sectorMission.targetScore && this.timeLimit == sectorMission.timeLimit && this.requiredLocks == sectorMission.requiredLocks && Float.compare(this.driftMultiplier, sectorMission.driftMultiplier) == 0 && Float.compare(this.baseWindow, sectorMission.baseWindow) == 0 && this.artRes == sectorMission.artRes;
    }

    public final int getArtRes() {
        return this.artRes;
    }

    public final float getBaseWindow() {
        return this.baseWindow;
    }

    public final String getCluster() {
        return this.cluster;
    }

    public final float getDriftMultiplier() {
        return this.driftMultiplier;
    }

    public final String getGoal() {
        return this.goal;
    }

    public final int getId() {
        return this.id;
    }

    public final int getRequiredLocks() {
        return this.requiredLocks;
    }

    public final int getTargetScore() {
        return this.targetScore;
    }

    public final int getTimeLimit() {
        return this.timeLimit;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return y6.t(this.baseWindow, y6.t(this.driftMultiplier, (((((((this.goal.hashCode() + ((this.cluster.hashCode() + ((this.title.hashCode() + (this.id * 31)) * 31)) * 31)) * 31) + this.targetScore) * 31) + this.timeLimit) * 31) + this.requiredLocks) * 31, 31), 31) + this.artRes;
    }

    public String toString() {
        return "SectorMission(id=" + this.id + ", title=" + this.title + ", cluster=" + this.cluster + ", goal=" + this.goal + ", targetScore=" + this.targetScore + ", timeLimit=" + this.timeLimit + ", requiredLocks=" + this.requiredLocks + ", driftMultiplier=" + this.driftMultiplier + ", baseWindow=" + this.baseWindow + ", artRes=" + this.artRes + ")";
    }
}
