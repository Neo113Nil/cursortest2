package com.my.tracker.config;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import com.my.tracker.obfuscated.m1;

/* loaded from: classes10.dex */
public final class AntiFraudConfig {
    public final boolean useGyroscope;
    public final boolean useLightSensor;
    public final boolean useMagneticFieldSensor;
    public final boolean usePressureSensor;
    public final boolean useProximitySensor;

    public static final class Builder {
        boolean a = m1.a;
        boolean b = true;
        boolean c = true;
        boolean d = true;
        boolean e = m1.b;

        Builder() {
        }

        @NonNull
        @AnyThread
        public AntiFraudConfig build() {
            return new AntiFraudConfig(this.a, this.b, this.c, this.d, this.e);
        }

        @NonNull
        @AnyThread
        public Builder useGyroscopeSensor(boolean z) {
            this.c = z;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder useLightSensor(boolean z) {
            this.a = z;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder useMagneticFieldSensor(boolean z) {
            this.b = z;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder usePressureSensor(boolean z) {
            this.d = z;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder useProximitySensor(boolean z) {
            this.e = z;
            return this;
        }
    }

    AntiFraudConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.useLightSensor = z;
        this.useMagneticFieldSensor = z2;
        this.useGyroscope = z3;
        this.usePressureSensor = z4;
        this.useProximitySensor = z5;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }
}
