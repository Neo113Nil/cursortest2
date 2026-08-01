package com.vectorharbor.planetvectorsurvey.viewmodel;

import com.vectorharbor.planetvectorsurvey.data.RelayRepository;
import com.vectorharbor.planetvectorsurvey.model.ArrayModule;
import com.vectorharbor.planetvectorsurvey.model.CalibrationState;
import com.vectorharbor.planetvectorsurvey.model.GaugeState;
import com.vectorharbor.planetvectorsurvey.model.RelayModelsKt;
import com.vectorharbor.planetvectorsurvey.model.RelayStats;
import com.vectorharbor.planetvectorsurvey.model.RunPhase;
import com.vectorharbor.planetvectorsurvey.model.RunResult;
import com.vectorharbor.planetvectorsurvey.model.SectorMission;
import com.vectorharbor.planetvectorsurvey.model.SignalChannel;
import com.vectorharbor.planetvectorsurvey.model.TargetProfile;
import defpackage.ae;
import defpackage.ct0;
import defpackage.dz;
import defpackage.et0;
import defpackage.ez;
import defpackage.g70;
import defpackage.k01;
import defpackage.nk;
import defpackage.nq;
import defpackage.pi0;
import defpackage.px0;
import defpackage.rg0;
import defpackage.xy;
import defpackage.zd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class RelayViewModel extends k01 {
    public static final int $stable = 8;
    private final g70 _calibrationState;
    private final g70 _selectedModule;
    private final g70 _stats;
    private final ct0 calibrationState;
    private final List<SectorMission> missions;
    private final List<ArrayModule> modules;
    private final RelayRepository repository;
    private final ct0 selectedModule;
    private final ct0 stats;

    public RelayViewModel() {
        RelayRepository relayRepository = new RelayRepository();
        this.repository = relayRepository;
        this.missions = relayRepository.missions();
        List<ArrayModule> modules = relayRepository.modules();
        this.modules = modules;
        et0 b = nk.b(zd.c0(modules));
        this._selectedModule = b;
        this.selectedModule = new pi0(b);
        et0 b2 = nk.b(new RelayStats(0, 0, 0, 0, 15, null));
        this._stats = b2;
        this.stats = new pi0(b2);
        et0 b3 = nk.b(newState(relayRepository.mission(1), (ArrayModule) zd.c0(modules)));
        this._calibrationState = b3;
        this.calibrationState = new pi0(b3);
    }

    private final List<GaugeState> destabilize(List<GaugeState> list, int i) {
        ArrayList arrayList = new ArrayList(ae.Y(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                px0.V();
                throw null;
            }
            GaugeState gaugeState = (GaugeState) obj;
            arrayList.add(GaugeState.copy$default(gaugeState, null, rg0.f(gaugeState.getValue() + ((i2 + i) % 2 == 0 ? 0.09f : -0.09f), 0.0f, 1.0f), 0.0f, 5, null));
            i2 = i3;
        }
        return arrayList;
    }

    private final List<GaugeState> disturb(List<GaugeState> list, int i) {
        int size = i % list.size();
        ArrayList arrayList = new ArrayList(ae.Y(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                px0.V();
                throw null;
            }
            GaugeState gaugeState = (GaugeState) obj;
            if (i2 == size) {
                gaugeState = GaugeState.copy$default(gaugeState, null, rg0.f(gaugeState.getValue() + (i % 2 == 0 ? 0.11f : -0.11f), 0.0f, 1.0f), gaugeState.getVelocity() * (-1.14f), 1, null);
            }
            arrayList.add(gaugeState);
            i2 = i3;
        }
        return arrayList;
    }

    private final CalibrationState finish(CalibrationState calibrationState, boolean z) {
        et0 et0Var;
        Object value;
        RelayStats relayStats;
        RunResult runResult = new RunResult(z, calibrationState.getScore(), (!z || calibrationState.getBestCombo() < 5) ? z ? "A" : ((float) calibrationState.getScore()) >= ((float) calibrationState.getMission().getTargetScore()) * 0.7f ? "B" : ((float) calibrationState.getScore()) >= ((float) calibrationState.getMission().getTargetScore()) * 0.45f ? "C" : "D" : "S", calibrationState.getCompletedLocks(), calibrationState.getBestCombo(), calibrationState.getLives());
        g70 g70Var = this._stats;
        do {
            et0Var = (et0) g70Var;
            value = et0Var.getValue();
            relayStats = (RelayStats) value;
        } while (!et0Var.i(value, relayStats.copy(Math.max(relayStats.getBestScore(), calibrationState.getScore()), Math.max(relayStats.getBestCombo(), calibrationState.getBestCombo()), relayStats.getMissionsCleared() + (z ? 1 : 0), calibrationState.getCompletedLocks() + relayStats.getTotalLocks())));
        return CalibrationState.copy$default(calibrationState, null, null, RunPhase.Complete, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0.0f, null, runResult, 131067, null);
    }

    private final boolean isLocked(CalibrationState calibrationState) {
        List<GaugeState> gauges = calibrationState.getGauges();
        gauges.getClass();
        Iterable ezVar = new ez(0, gauges.size() - 1, 1);
        if (!(ezVar instanceof Collection) || !((Collection) ezVar).isEmpty()) {
            Iterator it = ezVar.iterator();
            while (((dz) it).f) {
                int nextInt = ((xy) it).nextInt();
                if (Math.abs(calibrationState.getGauges().get(nextInt).getValue() - calibrationState.getTarget().getCenters().get(nextInt).floatValue()) > calibrationState.getTarget().getWindowRadius()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final List<GaugeState> moveGauges(CalibrationState calibrationState, float f) {
        List<GaugeState> gauges = calibrationState.getGauges();
        ArrayList arrayList = new ArrayList(ae.Y(gauges, 10));
        int i = 0;
        for (Object obj : gauges) {
            int i2 = i + 1;
            if (i < 0) {
                px0.V();
                throw null;
            }
            GaugeState gaugeState = (GaugeState) obj;
            float sin = ((float) Math.sin(calibrationState.getTimeLeft() + ((calibrationState.getCompletedLocks() + 1) * 0.7f) + i)) * 0.003f;
            float velocity = gaugeState.getVelocity();
            float value = (velocity * f) + gaugeState.getValue();
            if (value < 0.0f || value > 1.0f) {
                velocity *= -1.0f;
                value = rg0.f(value, 0.0f, 1.0f);
            }
            arrayList.add(GaugeState.copy$default(gaugeState, null, rg0.f(value + sin, 0.0f, 1.0f), velocity, 1, null));
            i = i2;
        }
        return arrayList;
    }

    private final CalibrationState newState(SectorMission sectorMission, ArrayModule arrayModule) {
        TargetProfile demoTarget = RelayModelsKt.demoTarget(sectorMission, 0);
        return new CalibrationState(sectorMission, arrayModule, null, demoTarget, seededGauges(demoTarget, sectorMission, 0), 0, 0, 0, 0, 0.0f, sectorMission.getTimeLimit(), 0, arrayModule.getExtraStasis() + 1, arrayModule.getExtraAutoTune() + 1, 0.0f, 0.0f, sectorMission.getGoal(), null, 183268, null);
    }

    private final CalibrationState nextTargetState(CalibrationState calibrationState, int i) {
        TargetProfile demoTarget = RelayModelsKt.demoTarget(calibrationState.getMission(), i);
        return CalibrationState.copy$default(calibrationState, null, null, null, demoTarget, seededGauges(demoTarget, calibrationState.getMission(), i), 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0.0f, null, null, 245735, null);
    }

    private final List<GaugeState> seededGauges(TargetProfile targetProfile, SectorMission sectorMission, int i) {
        int i2 = 0;
        List I = px0.I(Float.valueOf(0.22f), Float.valueOf(-0.18f), Float.valueOf(0.16f));
        List I2 = px0.I(Float.valueOf(0.23f), Float.valueOf(-0.19f), Float.valueOf(0.27f));
        nq entries = SignalChannel.getEntries();
        ArrayList arrayList = new ArrayList(ae.Y(entries, 10));
        for (Object obj : entries) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                px0.V();
                throw null;
            }
            SignalChannel signalChannel = (SignalChannel) obj;
            int i4 = ((sectorMission.getId() + i) + i2) % 2 == 0 ? 1 : -1;
            float f = rg0.f((((Number) I.get(i2)).floatValue() * i4) + targetProfile.getCenters().get(i2).floatValue(), 0.06f, 0.94f);
            float driftMultiplier = ((i * 0.06f) + 1.0f) * sectorMission.getDriftMultiplier() * ((Number) I2.get(i2)).floatValue();
            if (i4 <= 0) {
                driftMultiplier = -driftMultiplier;
            }
            arrayList.add(new GaugeState(signalChannel, f, driftMultiplier));
            i2 = i3;
        }
        return arrayList;
    }

    public final ct0 getCalibrationState() {
        return this.calibrationState;
    }

    public final List<SectorMission> getMissions() {
        return this.missions;
    }

    public final List<ArrayModule> getModules() {
        return this.modules;
    }

    public final ct0 getSelectedModule() {
        return this.selectedModule;
    }

    public final ct0 getStats() {
        return this.stats;
    }

    public final void lockTarget() {
        g70 g70Var;
        CalibrationState copy$default;
        g70 g70Var2 = this._calibrationState;
        while (true) {
            et0 et0Var = (et0) g70Var2;
            Object value = et0Var.getValue();
            CalibrationState calibrationState = (CalibrationState) value;
            if (calibrationState.getPhase() != RunPhase.Running) {
                g70Var = g70Var2;
            } else {
                if (isLocked(calibrationState)) {
                    int completedLocks = calibrationState.getCompletedLocks() + 1;
                    int combo = calibrationState.getCombo() + 1;
                    int scoreBonus = calibrationState.getModule().getScoreBonus() + (combo * 28) + 170 + (calibrationState.getFreezeRemaining() > 0.0f ? 18 : 0) + calibrationState.getScore();
                    int max = Math.max(calibrationState.getBestCombo(), combo);
                    float energy = calibrationState.getEnergy() + 0.16f;
                    g70Var = g70Var2;
                    CalibrationState copy$default2 = CalibrationState.copy$default(calibrationState, null, null, null, null, null, scoreBonus, combo, max, 0, energy > 1.0f ? 1.0f : energy, 0.0f, completedLocks, 0, 0, 0.0f, 0.0f, completedLocks >= calibrationState.getMission().getRequiredLocks() ? "Survey complete. The array held every lock." : "Clean lock. Rerouting the next target into view.", null, 193823, null);
                    copy$default = completedLocks >= calibrationState.getMission().getRequiredLocks() ? finish(copy$default2, true) : nextTargetState(copy$default2, completedLocks);
                } else {
                    g70Var = g70Var2;
                    int lives = calibrationState.getLives() - 1;
                    if (lives <= 0) {
                        copy$default = finish(CalibrationState.copy$default(calibrationState, null, null, null, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0.0f, "Lock failed. The relay collapsed.", null, 196287, null), false);
                    } else {
                        float energy2 = calibrationState.getEnergy() + 0.08f;
                        copy$default = CalibrationState.copy$default(calibrationState, null, null, null, null, destabilize(calibrationState.getGauges(), calibrationState.getCompletedLocks()), 0, 0, 0, lives, energy2 > 1.0f ? 1.0f : energy2, 0.0f, 0, 0, 0, 0.0f, 0.0f, "Lock missed. Reset the bands before the next attempt.", null, 195759, null);
                    }
                }
                calibrationState = copy$default;
            }
            if (et0Var.i(value, calibrationState)) {
                return;
            } else {
                g70Var2 = g70Var;
            }
        }
    }

    public final void nudgeGauge(SignalChannel signalChannel, boolean z) {
        et0 et0Var;
        Object value;
        CalibrationState calibrationState;
        signalChannel.getClass();
        g70 g70Var = this._calibrationState;
        do {
            et0Var = (et0) g70Var;
            value = et0Var.getValue();
            calibrationState = (CalibrationState) value;
            if (calibrationState.getPhase() == RunPhase.Running) {
                float energyDiscount = 0.085f - calibrationState.getModule().getEnergyDiscount();
                if (energyDiscount < 0.04f) {
                    energyDiscount = 0.04f;
                }
                if (calibrationState.getEnergy() < energyDiscount) {
                    calibrationState = CalibrationState.copy$default(calibrationState, null, null, null, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0.0f, "Energy low. Wait for the array to recharge.", null, 196607, null);
                } else {
                    float nudgeBonus = (calibrationState.getModule().getNudgeBonus() + 0.055f) * (z ? 1.0f : -1.0f);
                    List<GaugeState> gauges = calibrationState.getGauges();
                    ArrayList arrayList = new ArrayList(ae.Y(gauges, 10));
                    for (GaugeState gaugeState : gauges) {
                        if (gaugeState.getChannel() == signalChannel) {
                            gaugeState = GaugeState.copy$default(gaugeState, null, rg0.f(gaugeState.getValue() + nudgeBonus, 0.0f, 1.0f), 0.0f, 5, null);
                        }
                        arrayList.add(gaugeState);
                    }
                    float energy = calibrationState.getEnergy() - energyDiscount;
                    calibrationState = CalibrationState.copy$default(calibrationState, null, null, null, null, arrayList, 0, 0, 0, 0, energy < 0.0f ? 0.0f : energy, 0.0f, 0, 0, 0, 0.0f, 0.0f, signalChannel.getLabel() + " tuned " + (z ? "up" : "down") + ".", null, 196079, null);
                }
            }
        } while (!et0Var.i(value, calibrationState));
    }

    public final void prepareMission(int i) {
        ((et0) this._calibrationState).j(newState(this.repository.mission(i), (ArrayModule) ((et0) this._selectedModule).getValue()));
    }

    public final void resetCurrentMission() {
        g70 g70Var = this._calibrationState;
        ((et0) g70Var).j(newState(((CalibrationState) ((et0) g70Var).getValue()).getMission(), (ArrayModule) ((et0) this._selectedModule).getValue()));
    }

    public final void selectModule(int i) {
        et0 et0Var;
        Object value;
        CalibrationState calibrationState;
        ArrayModule module = this.repository.module(i);
        ((et0) this._selectedModule).j(module);
        g70 g70Var = this._calibrationState;
        do {
            et0Var = (et0) g70Var;
            value = et0Var.getValue();
            calibrationState = (CalibrationState) value;
            if (calibrationState.getPhase() != RunPhase.Running) {
                calibrationState = newState(calibrationState.getMission(), module);
            }
        } while (!et0Var.i(value, calibrationState));
    }

    public final void startRun() {
        et0 et0Var;
        Object value;
        CalibrationState calibrationState;
        g70 g70Var = this._calibrationState;
        do {
            et0Var = (et0) g70Var;
            value = et0Var.getValue();
            calibrationState = (CalibrationState) value;
            if (calibrationState.getPhase() == RunPhase.Ready) {
                calibrationState = CalibrationState.copy$default(calibrationState, null, null, RunPhase.Running, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0.0f, "Array live. Keep all three channels inside the signal window.", null, 196603, null);
            }
        } while (!et0Var.i(value, calibrationState));
    }

    public final void tick(float f) {
        et0 et0Var;
        Object value;
        CalibrationState calibrationState;
        float f2 = rg0.f(f, 0.0f, 0.05f);
        g70 g70Var = this._calibrationState;
        do {
            et0Var = (et0) g70Var;
            value = et0Var.getValue();
            calibrationState = (CalibrationState) value;
            if (calibrationState.getPhase() == RunPhase.Running) {
                float timeLeft = calibrationState.getTimeLeft() - f2;
                if (timeLeft <= 0.0f) {
                    calibrationState = finish(CalibrationState.copy$default(calibrationState, null, null, null, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0.0f, "Time expired before the final lock.", null, 195583, null), false);
                } else {
                    float freezeRemaining = calibrationState.getFreezeRemaining() - f2;
                    float f3 = freezeRemaining < 0.0f ? 0.0f : freezeRemaining;
                    List<GaugeState> gauges = f3 > 0.0f ? calibrationState.getGauges() : moveGauges(calibrationState, f2);
                    float interferenceClock = calibrationState.getInterferenceClock() + f2;
                    if (interferenceClock >= 4.25f) {
                        List<GaugeState> disturb = disturb(gauges, calibrationState.getMission().getId() + calibrationState.getCompletedLocks());
                        float energy = (0.18f * f2) + calibrationState.getEnergy();
                        calibrationState = CalibrationState.copy$default(calibrationState, null, null, null, null, disturb, 0, 0, 0, 0, energy > 1.0f ? 1.0f : energy, timeLeft, 0, 0, 0, f3, 0.0f, "Interference spike. One channel kicked off rhythm.", null, 145903, null);
                    } else {
                        float energy2 = (0.18f * f2) + calibrationState.getEnergy();
                        calibrationState = CalibrationState.copy$default(calibrationState, null, null, null, null, gauges, 0, 0, 0, 0, energy2 > 1.0f ? 1.0f : energy2, timeLeft, 0, 0, 0, f3, interferenceClock, null, null, 211439, null);
                    }
                }
            }
        } while (!et0Var.i(value, calibrationState));
    }

    public final void useAutoTune() {
        et0 et0Var;
        Object value;
        CalibrationState calibrationState;
        g70 g70Var = this._calibrationState;
        do {
            et0Var = (et0) g70Var;
            value = et0Var.getValue();
            calibrationState = (CalibrationState) value;
            if (calibrationState.getPhase() == RunPhase.Running && calibrationState.getAutoTuneCharges() > 0) {
                TargetProfile target = calibrationState.getTarget();
                List<GaugeState> gauges = calibrationState.getGauges();
                ArrayList arrayList = new ArrayList(ae.Y(gauges, 10));
                int i = 0;
                for (Object obj : gauges) {
                    int i2 = i + 1;
                    if (i < 0) {
                        px0.V();
                        throw null;
                    }
                    GaugeState gaugeState = (GaugeState) obj;
                    float floatValue = target.getCenters().get(i).floatValue() - gaugeState.getValue();
                    if (Math.abs(floatValue) > target.getWindowRadius()) {
                        gaugeState = GaugeState.copy$default(gaugeState, null, rg0.f((floatValue * 0.72f) + gaugeState.getValue(), 0.0f, 1.0f), 0.0f, 5, null);
                    }
                    arrayList.add(gaugeState);
                    i = i2;
                }
                calibrationState = CalibrationState.copy$default(calibrationState, null, null, null, null, arrayList, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, calibrationState.getAutoTuneCharges() - 1, 0.0f, 0.0f, "Auto tune pushed the weakest channel back toward center.", null, 188399, null);
            }
        } while (!et0Var.i(value, calibrationState));
    }

    public final void useStasis() {
        et0 et0Var;
        Object value;
        CalibrationState calibrationState;
        g70 g70Var = this._calibrationState;
        do {
            et0Var = (et0) g70Var;
            value = et0Var.getValue();
            calibrationState = (CalibrationState) value;
            if (calibrationState.getPhase() == RunPhase.Running && calibrationState.getStasisCharges() > 0) {
                calibrationState = CalibrationState.copy$default(calibrationState, null, null, null, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0, calibrationState.getStasisCharges() - 1, 0, 2.8f, 0.0f, "Cryo stasis engaged. Drift paused for a short window.", null, 176127, null);
            }
        } while (!et0Var.i(value, calibrationState));
    }
}
