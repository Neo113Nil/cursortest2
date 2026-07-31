package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MaskData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskData;", "", "()V", "Particles", "Solid", "Lcom/yandex/div/core/view2/spannable/MaskData$Particles;", "Lcom/yandex/div/core/view2/spannable/MaskData$Solid;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class MaskData {
    public /* synthetic */ MaskData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MaskData() {
    }

    /* compiled from: MaskData.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskData$Particles;", "Lcom/yandex/div/core/view2/spannable/MaskData;", "color", "", "density", "", "isAnimated", "", "isEnabled", "particleSize", "(IFZZF)V", "getColor", "()I", "getDensity", "()F", "()Z", "getParticleSize", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Particles extends MaskData {
        private final int color;
        private final float density;
        private final boolean isAnimated;
        private final boolean isEnabled;
        private final float particleSize;

        public static /* synthetic */ Particles copy$default(Particles particles, int i, float f, boolean z, boolean z2, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = particles.color;
            }
            if ((i2 & 2) != 0) {
                f = particles.density;
            }
            float f3 = f;
            if ((i2 & 4) != 0) {
                z = particles.isAnimated;
            }
            boolean z3 = z;
            if ((i2 & 8) != 0) {
                z2 = particles.isEnabled;
            }
            boolean z4 = z2;
            if ((i2 & 16) != 0) {
                f2 = particles.particleSize;
            }
            return particles.copy(i, f3, z3, z4, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final float getDensity() {
            return this.density;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAnimated() {
            return this.isAnimated;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final float getParticleSize() {
            return this.particleSize;
        }

        @NotNull
        public final Particles copy(@ColorInt int color, float density, boolean isAnimated, boolean isEnabled, float particleSize) {
            return new Particles(color, density, isAnimated, isEnabled, particleSize);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Particles)) {
                return false;
            }
            Particles particles = (Particles) other;
            return this.color == particles.color && Float.compare(this.density, particles.density) == 0 && this.isAnimated == particles.isAnimated && this.isEnabled == particles.isEnabled && Float.compare(this.particleSize, particles.particleSize) == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.color) * 31) + Float.hashCode(this.density)) * 31;
            boolean z = this.isAnimated;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.isEnabled;
            return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Float.hashCode(this.particleSize);
        }

        @NotNull
        public String toString() {
            return "Particles(color=" + this.color + ", density=" + this.density + ", isAnimated=" + this.isAnimated + ", isEnabled=" + this.isEnabled + ", particleSize=" + this.particleSize + ')';
        }

        public final int getColor() {
            return this.color;
        }

        public final float getDensity() {
            return this.density;
        }

        public final boolean isAnimated() {
            return this.isAnimated;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final float getParticleSize() {
            return this.particleSize;
        }

        public Particles(@ColorInt int i, float f, boolean z, boolean z2, float f2) {
            super(null);
            this.color = i;
            this.density = f;
            this.isAnimated = z;
            this.isEnabled = z2;
            this.particleSize = f2;
        }
    }

    /* compiled from: MaskData.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskData$Solid;", "Lcom/yandex/div/core/view2/spannable/MaskData;", "color", "", "isEnabled", "", "(IZ)V", "getColor", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Solid extends MaskData {
        private final int color;
        private final boolean isEnabled;

        public static /* synthetic */ Solid copy$default(Solid solid, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = solid.color;
            }
            if ((i2 & 2) != 0) {
                z = solid.isEnabled;
            }
            return solid.copy(i, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public final Solid copy(@ColorInt int color, boolean isEnabled) {
            return new Solid(color, isEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Solid)) {
                return false;
            }
            Solid solid = (Solid) other;
            return this.color == solid.color && this.isEnabled == solid.isEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.color) * 31;
            boolean z = this.isEnabled;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        @NotNull
        public String toString() {
            return "Solid(color=" + this.color + ", isEnabled=" + this.isEnabled + ')';
        }

        public final int getColor() {
            return this.color;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public Solid(@ColorInt int i, boolean z) {
            super(null);
            this.color = i;
            this.isEnabled = z;
        }
    }
}
