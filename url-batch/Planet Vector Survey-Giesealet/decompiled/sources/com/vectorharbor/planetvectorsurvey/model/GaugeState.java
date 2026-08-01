package com.vectorharbor.planetvectorsurvey.model;

import defpackage.y6;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class GaugeState {
    public static final int $stable = 0;
    private final SignalChannel channel;
    private final float value;
    private final float velocity;

    public GaugeState(SignalChannel signalChannel, float f, float f2) {
        signalChannel.getClass();
        this.channel = signalChannel;
        this.value = f;
        this.velocity = f2;
    }

    public static /* synthetic */ GaugeState copy$default(GaugeState gaugeState, SignalChannel signalChannel, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            signalChannel = gaugeState.channel;
        }
        if ((i & 2) != 0) {
            f = gaugeState.value;
        }
        if ((i & 4) != 0) {
            f2 = gaugeState.velocity;
        }
        return gaugeState.copy(signalChannel, f, f2);
    }

    public final SignalChannel component1() {
        return this.channel;
    }

    public final float component2() {
        return this.value;
    }

    public final float component3() {
        return this.velocity;
    }

    public final GaugeState copy(SignalChannel signalChannel, float f, float f2) {
        signalChannel.getClass();
        return new GaugeState(signalChannel, f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GaugeState)) {
            return false;
        }
        GaugeState gaugeState = (GaugeState) obj;
        return this.channel == gaugeState.channel && Float.compare(this.value, gaugeState.value) == 0 && Float.compare(this.velocity, gaugeState.velocity) == 0;
    }

    public final SignalChannel getChannel() {
        return this.channel;
    }

    public final float getValue() {
        return this.value;
    }

    public final float getVelocity() {
        return this.velocity;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.velocity) + y6.t(this.value, this.channel.hashCode() * 31, 31);
    }

    public String toString() {
        return "GaugeState(channel=" + this.channel + ", value=" + this.value + ", velocity=" + this.velocity + ")";
    }
}
