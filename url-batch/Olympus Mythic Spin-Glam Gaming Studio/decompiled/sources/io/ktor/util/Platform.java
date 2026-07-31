package io.ktor.util;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PlatformUtils.kt */
/* loaded from: classes13.dex */
public abstract class Platform {
    public /* synthetic */ Platform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PlatformUtils.kt */
    public static final class Jvm extends Platform {
        public static final Jvm INSTANCE = new Jvm();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Jvm);
        }

        public int hashCode() {
            return 1051825272;
        }

        public String toString() {
            return "Jvm";
        }

        private Jvm() {
            super(null);
        }
    }

    private Platform() {
    }

    /* compiled from: PlatformUtils.kt */
    public static final class Native extends Platform {
        public static final Native INSTANCE = new Native();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Native);
        }

        public int hashCode() {
            return -1059277600;
        }

        public String toString() {
            return "Native";
        }

        private Native() {
            super(null);
        }
    }
}
