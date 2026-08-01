package com.vectorharbor.planetvectorsurvey.model;

import defpackage.nk;
import defpackage.nq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class SignalChannel {
    private static final /* synthetic */ nq $ENTRIES;
    private static final /* synthetic */ SignalChannel[] $VALUES;
    private final String label;
    public static final SignalChannel Focus = new SignalChannel("Focus", 0, "Focus");
    public static final SignalChannel Relay = new SignalChannel("Relay", 1, "Relay");
    public static final SignalChannel Flux = new SignalChannel("Flux", 2, "Flux");

    private static final /* synthetic */ SignalChannel[] $values() {
        return new SignalChannel[]{Focus, Relay, Flux};
    }

    static {
        SignalChannel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nk.o($values);
    }

    private SignalChannel(String str, int i, String str2) {
        this.label = str2;
    }

    public static nq getEntries() {
        return $ENTRIES;
    }

    public static SignalChannel valueOf(String str) {
        return (SignalChannel) Enum.valueOf(SignalChannel.class, str);
    }

    public static SignalChannel[] values() {
        return (SignalChannel[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
