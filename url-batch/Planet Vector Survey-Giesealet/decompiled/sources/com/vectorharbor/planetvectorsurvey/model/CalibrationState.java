package com.vectorharbor.planetvectorsurvey.model;

import defpackage.nz;
import defpackage.pk;
import defpackage.wp;
import defpackage.y6;
import defpackage.zd;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class CalibrationState {
    public static final int $stable = 8;
    private final int autoTuneCharges;
    private final int bestCombo;
    private final int combo;
    private final int completedLocks;
    private final float energy;
    private final float freezeRemaining;
    private final List<GaugeState> gauges;
    private final float interferenceClock;
    private final int lives;
    private final String message;
    private final SectorMission mission;
    private final ArrayModule module;
    private final RunPhase phase;
    private final RunResult result;
    private final int score;
    private final int stasisCharges;
    private final TargetProfile target;
    private final float timeLeft;

    public /* synthetic */ CalibrationState(SectorMission sectorMission, ArrayModule arrayModule, RunPhase runPhase, TargetProfile targetProfile, List list, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, float f3, float f4, String str, RunResult runResult, int i8, pk pkVar) {
        this((i8 & 1) != 0 ? (SectorMission) zd.c0(RelayModelsKt.getDemoMissions()) : sectorMission, (i8 & 2) != 0 ? (ArrayModule) zd.c0(RelayModelsKt.getSupportModules()) : arrayModule, (i8 & 4) != 0 ? RunPhase.Ready : runPhase, (i8 & 8) != 0 ? RelayModelsKt.demoTarget((SectorMission) zd.c0(RelayModelsKt.getDemoMissions()), 0) : targetProfile, (i8 & 16) != 0 ? wp.d : list, (i8 & 32) != 0 ? 0 : i, (i8 & 64) != 0 ? 0 : i2, (i8 & 128) != 0 ? 0 : i3, (i8 & 256) != 0 ? 3 : i4, (i8 & 512) != 0 ? 1.0f : f, (i8 & 1024) != 0 ? ((SectorMission) zd.c0(RelayModelsKt.getDemoMissions())).getTimeLimit() : f2, (i8 & 2048) == 0 ? i5 : 0, (i8 & 4096) != 0 ? 1 : i6, (i8 & 8192) == 0 ? i7 : 1, (i8 & 16384) != 0 ? 0.0f : f3, (i8 & 32768) == 0 ? f4 : 0.0f, (i8 & 65536) != 0 ? ((SectorMission) zd.c0(RelayModelsKt.getDemoMissions())).getGoal() : str, (i8 & 131072) != 0 ? null : runResult);
    }

    public static /* synthetic */ CalibrationState copy$default(CalibrationState calibrationState, SectorMission sectorMission, ArrayModule arrayModule, RunPhase runPhase, TargetProfile targetProfile, List list, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, float f3, float f4, String str, RunResult runResult, int i8, Object obj) {
        RunResult runResult2;
        String str2;
        SectorMission sectorMission2 = (i8 & 1) != 0 ? calibrationState.mission : sectorMission;
        ArrayModule arrayModule2 = (i8 & 2) != 0 ? calibrationState.module : arrayModule;
        RunPhase runPhase2 = (i8 & 4) != 0 ? calibrationState.phase : runPhase;
        TargetProfile targetProfile2 = (i8 & 8) != 0 ? calibrationState.target : targetProfile;
        List list2 = (i8 & 16) != 0 ? calibrationState.gauges : list;
        int i9 = (i8 & 32) != 0 ? calibrationState.score : i;
        int i10 = (i8 & 64) != 0 ? calibrationState.combo : i2;
        int i11 = (i8 & 128) != 0 ? calibrationState.bestCombo : i3;
        int i12 = (i8 & 256) != 0 ? calibrationState.lives : i4;
        float f5 = (i8 & 512) != 0 ? calibrationState.energy : f;
        float f6 = (i8 & 1024) != 0 ? calibrationState.timeLeft : f2;
        int i13 = (i8 & 2048) != 0 ? calibrationState.completedLocks : i5;
        int i14 = (i8 & 4096) != 0 ? calibrationState.stasisCharges : i6;
        int i15 = (i8 & 8192) != 0 ? calibrationState.autoTuneCharges : i7;
        SectorMission sectorMission3 = sectorMission2;
        float f7 = (i8 & 16384) != 0 ? calibrationState.freezeRemaining : f3;
        float f8 = (i8 & 32768) != 0 ? calibrationState.interferenceClock : f4;
        String str3 = (i8 & 65536) != 0 ? calibrationState.message : str;
        if ((i8 & 131072) != 0) {
            str2 = str3;
            runResult2 = calibrationState.result;
        } else {
            runResult2 = runResult;
            str2 = str3;
        }
        return calibrationState.copy(sectorMission3, arrayModule2, runPhase2, targetProfile2, list2, i9, i10, i11, i12, f5, f6, i13, i14, i15, f7, f8, str2, runResult2);
    }

    public final SectorMission component1() {
        return this.mission;
    }

    public final float component10() {
        return this.energy;
    }

    public final float component11() {
        return this.timeLeft;
    }

    public final int component12() {
        return this.completedLocks;
    }

    public final int component13() {
        return this.stasisCharges;
    }

    public final int component14() {
        return this.autoTuneCharges;
    }

    public final float component15() {
        return this.freezeRemaining;
    }

    public final float component16() {
        return this.interferenceClock;
    }

    public final String component17() {
        return this.message;
    }

    public final RunResult component18() {
        return this.result;
    }

    public final ArrayModule component2() {
        return this.module;
    }

    public final RunPhase component3() {
        return this.phase;
    }

    public final TargetProfile component4() {
        return this.target;
    }

    public final List<GaugeState> component5() {
        return this.gauges;
    }

    public final int component6() {
        return this.score;
    }

    public final int component7() {
        return this.combo;
    }

    public final int component8() {
        return this.bestCombo;
    }

    public final int component9() {
        return this.lives;
    }

    public final CalibrationState copy(SectorMission sectorMission, ArrayModule arrayModule, RunPhase runPhase, TargetProfile targetProfile, List<GaugeState> list, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, float f3, float f4, String str, RunResult runResult) {
        sectorMission.getClass();
        arrayModule.getClass();
        runPhase.getClass();
        targetProfile.getClass();
        list.getClass();
        str.getClass();
        return new CalibrationState(sectorMission, arrayModule, runPhase, targetProfile, list, i, i2, i3, i4, f, f2, i5, i6, i7, f3, f4, str, runResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalibrationState)) {
            return false;
        }
        CalibrationState calibrationState = (CalibrationState) obj;
        return nz.l(this.mission, calibrationState.mission) && nz.l(this.module, calibrationState.module) && this.phase == calibrationState.phase && nz.l(this.target, calibrationState.target) && nz.l(this.gauges, calibrationState.gauges) && this.score == calibrationState.score && this.combo == calibrationState.combo && this.bestCombo == calibrationState.bestCombo && this.lives == calibrationState.lives && Float.compare(this.energy, calibrationState.energy) == 0 && Float.compare(this.timeLeft, calibrationState.timeLeft) == 0 && this.completedLocks == calibrationState.completedLocks && this.stasisCharges == calibrationState.stasisCharges && this.autoTuneCharges == calibrationState.autoTuneCharges && Float.compare(this.freezeRemaining, calibrationState.freezeRemaining) == 0 && Float.compare(this.interferenceClock, calibrationState.interferenceClock) == 0 && nz.l(this.message, calibrationState.message) && nz.l(this.result, calibrationState.result);
    }

    public final int getAutoTuneCharges() {
        return this.autoTuneCharges;
    }

    public final int getBestCombo() {
        return this.bestCombo;
    }

    public final int getCombo() {
        return this.combo;
    }

    public final int getCompletedLocks() {
        return this.completedLocks;
    }

    public final float getEnergy() {
        return this.energy;
    }

    public final float getFreezeRemaining() {
        return this.freezeRemaining;
    }

    public final List<GaugeState> getGauges() {
        return this.gauges;
    }

    public final float getInterferenceClock() {
        return this.interferenceClock;
    }

    public final int getLives() {
        return this.lives;
    }

    public final String getMessage() {
        return this.message;
    }

    public final SectorMission getMission() {
        return this.mission;
    }

    public final ArrayModule getModule() {
        return this.module;
    }

    public final RunPhase getPhase() {
        return this.phase;
    }

    public final RunResult getResult() {
        return this.result;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getStasisCharges() {
        return this.stasisCharges;
    }

    public final TargetProfile getTarget() {
        return this.target;
    }

    public final float getTimeLeft() {
        return this.timeLeft;
    }

    public int hashCode() {
        int hashCode = (this.message.hashCode() + y6.t(this.interferenceClock, y6.t(this.freezeRemaining, (((((y6.t(this.timeLeft, y6.t(this.energy, (((((((((this.gauges.hashCode() + ((this.target.hashCode() + ((this.phase.hashCode() + ((this.module.hashCode() + (this.mission.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.score) * 31) + this.combo) * 31) + this.bestCombo) * 31) + this.lives) * 31, 31), 31) + this.completedLocks) * 31) + this.stasisCharges) * 31) + this.autoTuneCharges) * 31, 31), 31)) * 31;
        RunResult runResult = this.result;
        return hashCode + (runResult == null ? 0 : runResult.hashCode());
    }

    public String toString() {
        return "CalibrationState(mission=" + this.mission + ", module=" + this.module + ", phase=" + this.phase + ", target=" + this.target + ", gauges=" + this.gauges + ", score=" + this.score + ", combo=" + this.combo + ", bestCombo=" + this.bestCombo + ", lives=" + this.lives + ", energy=" + this.energy + ", timeLeft=" + this.timeLeft + ", completedLocks=" + this.completedLocks + ", stasisCharges=" + this.stasisCharges + ", autoTuneCharges=" + this.autoTuneCharges + ", freezeRemaining=" + this.freezeRemaining + ", interferenceClock=" + this.interferenceClock + ", message=" + this.message + ", result=" + this.result + ")";
    }

    public CalibrationState(SectorMission sectorMission, ArrayModule arrayModule, RunPhase runPhase, TargetProfile targetProfile, List<GaugeState> list, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, float f3, float f4, String str, RunResult runResult) {
        sectorMission.getClass();
        arrayModule.getClass();
        runPhase.getClass();
        targetProfile.getClass();
        list.getClass();
        str.getClass();
        this.mission = sectorMission;
        this.module = arrayModule;
        this.phase = runPhase;
        this.target = targetProfile;
        this.gauges = list;
        this.score = i;
        this.combo = i2;
        this.bestCombo = i3;
        this.lives = i4;
        this.energy = f;
        this.timeLeft = f2;
        this.completedLocks = i5;
        this.stasisCharges = i6;
        this.autoTuneCharges = i7;
        this.freezeRemaining = f3;
        this.interferenceClock = f4;
        this.message = str;
        this.result = runResult;
    }

    public CalibrationState() {
        this(null, null, null, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0.0f, null, null, 262143, null);
    }
}
