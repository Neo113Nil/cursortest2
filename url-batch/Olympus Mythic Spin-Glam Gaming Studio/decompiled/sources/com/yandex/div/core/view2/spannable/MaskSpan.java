package com.yandex.div.core.view2.spannable;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.util.DisplayMetrics;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.O6;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.MaskData;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MaskSpan.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u00012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J2\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016JP\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\nH\u0016J0\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)H\u0002J\r\u0010*\u001a\u00020\bH\u0000¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\fH\u0000¢\u0006\u0002\b.J(\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u00101\u001a\u00020)H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskSpan;", "Lcom/yandex/div/internal/spannable/PositionAwareReplacementSpan;", "mask", "Lcom/yandex/div/core/view2/spannable/MaskData;", "hostView", "Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "(Lcom/yandex/div/core/view2/spannable/MaskData;Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;)V", "active", "", "fillPaint", "Landroid/graphics/Paint;", "lastHeight", "", "lastWidth", "particles", "", "Lcom/yandex/div/core/view2/spannable/MaskSpan$Particle;", "randomSeed", "", "adjustSize", "", "paint", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", VastAttributes.HORIZONTAL_POSITION, ViewHierarchyConstants.DIMENSION_TOP_KEY, VastAttributes.VERTICAL_POSITION, "bottom", "textPaint", "initParticles", "w", "h", "particlesData", "Lcom/yandex/div/core/view2/spannable/MaskData$Particles;", "isAlive", "isAlive$div_release", "onFrame", O6.w0, "onFrame$div_release", "reinitParticle", "p", "cfg", "Particle", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MaskSpan extends PositionAwareReplacementSpan {
    private boolean active;

    @NotNull
    private final Paint fillPaint;

    @Nullable
    private final DivLineHeightTextView hostView;
    private float lastHeight;
    private float lastWidth;

    @NotNull
    private final MaskData mask;

    @NotNull
    private final List<Particle> particles = new ArrayList();
    private long randomSeed;

    public MaskSpan(@NotNull MaskData maskData, @Nullable DivLineHeightTextView divLineHeightTextView) {
        this.mask = maskData;
        this.hostView = divLineHeightTextView;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.fillPaint = paint;
        this.lastWidth = -1.0f;
        this.lastHeight = -1.0f;
    }

    /* compiled from: MaskSpan.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006."}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskSpan$Particle;", "", "cx", "", "cy", "radius", "vx", "vy", "angularVel", "lifetimeMs", "ageMs", "(FFFFFFFF)V", "getAgeMs", "()F", "setAgeMs", "(F)V", "getAngularVel", "setAngularVel", "getCx", "setCx", "getCy", "setCy", "getLifetimeMs", "setLifetimeMs", "getRadius", "setRadius", "getVx", "setVx", "getVy", "setVy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class Particle {
        private float ageMs;
        private float angularVel;
        private float cx;
        private float cy;
        private float lifetimeMs;
        private float radius;
        private float vx;
        private float vy;

        /* renamed from: component1, reason: from getter */
        public final float getCx() {
            return this.cx;
        }

        /* renamed from: component2, reason: from getter */
        public final float getCy() {
            return this.cy;
        }

        /* renamed from: component3, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        /* renamed from: component4, reason: from getter */
        public final float getVx() {
            return this.vx;
        }

        /* renamed from: component5, reason: from getter */
        public final float getVy() {
            return this.vy;
        }

        /* renamed from: component6, reason: from getter */
        public final float getAngularVel() {
            return this.angularVel;
        }

        /* renamed from: component7, reason: from getter */
        public final float getLifetimeMs() {
            return this.lifetimeMs;
        }

        /* renamed from: component8, reason: from getter */
        public final float getAgeMs() {
            return this.ageMs;
        }

        @NotNull
        public final Particle copy(float cx, float cy, float radius, float vx, float vy, float angularVel, float lifetimeMs, float ageMs) {
            return new Particle(cx, cy, radius, vx, vy, angularVel, lifetimeMs, ageMs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Particle)) {
                return false;
            }
            Particle particle = (Particle) other;
            return Float.compare(this.cx, particle.cx) == 0 && Float.compare(this.cy, particle.cy) == 0 && Float.compare(this.radius, particle.radius) == 0 && Float.compare(this.vx, particle.vx) == 0 && Float.compare(this.vy, particle.vy) == 0 && Float.compare(this.angularVel, particle.angularVel) == 0 && Float.compare(this.lifetimeMs, particle.lifetimeMs) == 0 && Float.compare(this.ageMs, particle.ageMs) == 0;
        }

        public int hashCode() {
            return (((((((((((((Float.hashCode(this.cx) * 31) + Float.hashCode(this.cy)) * 31) + Float.hashCode(this.radius)) * 31) + Float.hashCode(this.vx)) * 31) + Float.hashCode(this.vy)) * 31) + Float.hashCode(this.angularVel)) * 31) + Float.hashCode(this.lifetimeMs)) * 31) + Float.hashCode(this.ageMs);
        }

        @NotNull
        public String toString() {
            return "Particle(cx=" + this.cx + ", cy=" + this.cy + ", radius=" + this.radius + ", vx=" + this.vx + ", vy=" + this.vy + ", angularVel=" + this.angularVel + ", lifetimeMs=" + this.lifetimeMs + ", ageMs=" + this.ageMs + ')';
        }

        public Particle(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.cx = f;
            this.cy = f2;
            this.radius = f3;
            this.vx = f4;
            this.vy = f5;
            this.angularVel = f6;
            this.lifetimeMs = f7;
            this.ageMs = f8;
        }

        public final float getCx() {
            return this.cx;
        }

        public final void setCx(float f) {
            this.cx = f;
        }

        public final float getCy() {
            return this.cy;
        }

        public final void setCy(float f) {
            this.cy = f;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final void setRadius(float f) {
            this.radius = f;
        }

        public final float getVx() {
            return this.vx;
        }

        public final void setVx(float f) {
            this.vx = f;
        }

        public final float getVy() {
            return this.vy;
        }

        public final void setVy(float f) {
            this.vy = f;
        }

        public final float getAngularVel() {
            return this.angularVel;
        }

        public final void setAngularVel(float f) {
            this.angularVel = f;
        }

        public final float getLifetimeMs() {
            return this.lifetimeMs;
        }

        public final void setLifetimeMs(float f) {
            this.lifetimeMs = f;
        }

        public final float getAgeMs() {
            return this.ageMs;
        }

        public final void setAgeMs(float f) {
            this.ageMs = f;
        }
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        return (int) paint.measureText(text, start, end);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x, int top, int y, int bottom, @NotNull Paint textPaint) {
        ParticlesTicker particlesTicker$div_release;
        ParticlesTicker particlesTicker$div_release2;
        float measureText = textPaint.measureText(text, start, end);
        float f = bottom - top;
        MaskData maskData = this.mask;
        if (maskData instanceof MaskData.Solid) {
            this.fillPaint.setColor(((MaskData.Solid) maskData).getColor());
            canvas.drawRect(x, top, x + measureText, bottom, this.fillPaint);
            this.active = false;
            return;
        }
        if (maskData instanceof MaskData.Particles) {
            if (measureText != this.lastWidth || f != this.lastHeight || this.particles.isEmpty()) {
                initParticles(measureText, f, start, end, (MaskData.Particles) maskData);
            }
            MaskData.Particles particles = (MaskData.Particles) maskData;
            this.fillPaint.setColor(particles.getColor());
            for (Particle particle : this.particles) {
                canvas.drawCircle(x + RangesKt.coerceIn(particle.getCx(), particle.getRadius(), measureText - particle.getRadius()), top + RangesKt.coerceIn(particle.getCy(), particle.getRadius(), f - particle.getRadius()), particle.getRadius(), this.fillPaint);
            }
            if (!particles.isAnimated()) {
                this.active = false;
                DivLineHeightTextView divLineHeightTextView = this.hostView;
                if (divLineHeightTextView == null || (particlesTicker$div_release2 = divLineHeightTextView.getParticlesTicker$div_release()) == null) {
                    return;
                }
                particlesTicker$div_release2.untrack(this);
                return;
            }
            this.active = true;
            DivLineHeightTextView divLineHeightTextView2 = this.hostView;
            if (divLineHeightTextView2 == null || (particlesTicker$div_release = divLineHeightTextView2.getParticlesTicker$div_release()) == null) {
                return;
            }
            particlesTicker$div_release.track(this);
        }
    }

    private final void initParticles(float w, float h, int start, int end, MaskData.Particles particlesData) {
        Resources resources;
        DisplayMetrics displayMetrics;
        this.lastWidth = w;
        this.lastHeight = h;
        this.particles.clear();
        this.randomSeed = ((start * 73856093) ^ (end * 19349663)) ^ MathKt.roundToInt(particlesData.getDensity() * 1000.0f);
        Random random = new Random(this.randomSeed);
        float f = 1.0f;
        float max = Math.max(1.0f, particlesData.getParticleSize());
        double d = 3;
        float f2 = 0.7f;
        float pow = ((float) Math.pow(max, 2)) * 3.1415927f * ((((float) Math.pow(1.5f, d)) - ((float) Math.pow(0.7f, d))) / 2.4f);
        float f3 = 0.0f;
        float f4 = pow > 0.0f ? (w * h) / pow : 0.0f;
        if (particlesData.getDensity() >= 1.0f) {
            f3 = 0.99f;
        } else if (particlesData.getDensity() > 0.0f) {
            f3 = particlesData.getDensity();
        }
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt(f4 * f3), 1, 800);
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        if (divLineHeightTextView != null && (resources = divLineHeightTextView.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f = displayMetrics.density;
        }
        float f5 = 2.0f * f;
        float f6 = (f * 9.0f) - f5;
        int i = 0;
        while (i < coerceIn) {
            float nextFloat = max * ((random.nextFloat() * 0.8f) + f2);
            float nextFloat2 = (random.nextFloat() * f6) + f5;
            double nextFloat3 = ((float) (random.nextFloat() * 6.283185307179586d)) - 3.1415927f;
            float cos = ((float) Math.cos(nextFloat3)) * nextFloat2;
            float sin = ((float) Math.sin(nextFloat3)) * nextFloat2;
            float nextFloat4 = (random.nextFloat() - 0.5f) * 0.5f;
            float nextFloat5 = (random.nextFloat() * 6000.0f) + 6000.0f;
            this.particles.add(new Particle(random.nextFloat() * w, random.nextFloat() * h, nextFloat, cos, sin, nextFloat4, nextFloat5, random.nextFloat() * nextFloat5 * 0.5f));
            i++;
            f5 = f5;
            f2 = 0.7f;
        }
    }

    public final boolean onFrame$div_release(float dt) {
        MaskData maskData = this.mask;
        MaskData.Particles particles = maskData instanceof MaskData.Particles ? (MaskData.Particles) maskData : null;
        if (particles == null || !this.active || !particles.isEnabled() || !particles.isAnimated()) {
            return false;
        }
        if (dt <= 0.0f) {
            return true;
        }
        float f = this.lastWidth;
        float f2 = this.lastHeight;
        for (Particle particle : this.particles) {
            float angularVel = particle.getAngularVel() * dt;
            if (angularVel != 0.0f) {
                double d = angularVel;
                float cos = (float) Math.cos(d);
                float sin = (float) Math.sin(d);
                float vx = (particle.getVx() * cos) - (particle.getVy() * sin);
                float vx2 = (particle.getVx() * sin) + (particle.getVy() * cos);
                particle.setVx(vx);
                particle.setVy(vx2);
            }
            particle.setCx(particle.getCx() + (particle.getVx() * dt));
            particle.setCy(particle.getCy() + (particle.getVy() * dt));
            float radius = particle.getRadius();
            float f3 = -radius;
            if (particle.getCx() < f3) {
                particle.setCx(particle.getCx() + (radius * 2.0f) + f);
            }
            if (particle.getCx() > f + radius) {
                particle.setCx(particle.getCx() - ((radius * 2.0f) + f));
            }
            if (particle.getCy() < f3) {
                particle.setCy(particle.getCy() + (radius * 2.0f) + f2);
            }
            if (particle.getCy() > f2 + radius) {
                particle.setCy(particle.getCy() - ((radius * 2.0f) + f2));
            }
            particle.setAgeMs(particle.getAgeMs() + (1000.0f * dt));
            if (particle.getAgeMs() >= particle.getLifetimeMs()) {
                reinitParticle(particle, f, f2, particles);
            }
        }
        return true;
    }

    private final void reinitParticle(Particle p, float w, float h, MaskData.Particles cfg) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Random random = new Random(this.randomSeed + p.hashCode());
        float f = 1.0f;
        p.setRadius(Math.max(1.0f, cfg.getParticleSize()) * ((random.nextFloat() * 0.8f) + 0.7f));
        p.setCx(random.nextFloat() * w);
        p.setCy(random.nextFloat() * h);
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        if (divLineHeightTextView != null && (resources = divLineHeightTextView.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f = displayMetrics.density;
        }
        float f2 = 2.0f * f;
        float nextFloat = f2 + (random.nextFloat() * ((f * 9.0f) - f2));
        double nextFloat2 = ((float) (random.nextFloat() * 6.283185307179586d)) - 3.1415927f;
        p.setVx(((float) Math.cos(nextFloat2)) * nextFloat);
        p.setVy(((float) Math.sin(nextFloat2)) * nextFloat);
        p.setAngularVel((random.nextFloat() - 0.5f) * 0.5f);
        p.setLifetimeMs((random.nextFloat() * 6000.0f) + 6000.0f);
        p.setAgeMs(0.0f);
    }

    public final boolean isAlive$div_release() {
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        CharSequence text = divLineHeightTextView != null ? divLineHeightTextView.getText() : null;
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        return (spanned == null || spanned.getSpanStart(this) == -1) ? false : true;
    }
}
