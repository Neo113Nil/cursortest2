package com.vectorharbor.planetvectorsurvey.model;

import defpackage.nk;
import defpackage.nq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class RunPhase {
    private static final /* synthetic */ nq $ENTRIES;
    private static final /* synthetic */ RunPhase[] $VALUES;
    public static final RunPhase Ready = new RunPhase("Ready", 0);
    public static final RunPhase Running = new RunPhase("Running", 1);
    public static final RunPhase Complete = new RunPhase("Complete", 2);

    private static final /* synthetic */ RunPhase[] $values() {
        return new RunPhase[]{Ready, Running, Complete};
    }

    static {
        RunPhase[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nk.o($values);
    }

    private RunPhase(String str, int i) {
    }

    public static nq getEntries() {
        return $ENTRIES;
    }

    public static RunPhase valueOf(String str) {
        return (RunPhase) Enum.valueOf(RunPhase.class, str);
    }

    public static RunPhase[] values() {
        return (RunPhase[]) $VALUES.clone();
    }
}
