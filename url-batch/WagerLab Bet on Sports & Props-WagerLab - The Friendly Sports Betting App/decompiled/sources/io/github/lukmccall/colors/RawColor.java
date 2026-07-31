package io.github.lukmccall.colors;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: RawColor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/github/lukmccall/colors/RawColor;", "", "SRgb", "P3", "Lio/github/lukmccall/colors/RawColor$P3;", "Lio/github/lukmccall/colors/RawColor$SRgb;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RawColor {

    /* compiled from: RawColor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, d2 = {"Lio/github/lukmccall/colors/RawColor$SRgb;", "Lio/github/lukmccall/colors/RawColor;", "r", "", "g", "b", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "<init>", "(FFFF)V", "getR", "()F", "getG", "getB", "getA", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SRgb implements RawColor {
        private final float a;
        private final float b;
        private final float g;
        private final float r;

        public static /* synthetic */ SRgb copy$default(SRgb sRgb, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = sRgb.r;
            }
            if ((i & 2) != 0) {
                f2 = sRgb.g;
            }
            if ((i & 4) != 0) {
                f3 = sRgb.b;
            }
            if ((i & 8) != 0) {
                f4 = sRgb.a;
            }
            return sRgb.copy(f, f2, f3, f4);
        }

        /* renamed from: component1, reason: from getter */
        public final float getR() {
            return this.r;
        }

        /* renamed from: component2, reason: from getter */
        public final float getG() {
            return this.g;
        }

        /* renamed from: component3, reason: from getter */
        public final float getB() {
            return this.b;
        }

        /* renamed from: component4, reason: from getter */
        public final float getA() {
            return this.a;
        }

        public final SRgb copy(float r, float g, float b, float a2) {
            return new SRgb(r, g, b, a2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SRgb)) {
                return false;
            }
            SRgb sRgb = (SRgb) other;
            return Float.compare(this.r, sRgb.r) == 0 && Float.compare(this.g, sRgb.g) == 0 && Float.compare(this.b, sRgb.b) == 0 && Float.compare(this.a, sRgb.a) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.r) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.a);
        }

        public String toString() {
            return "SRgb(r=" + this.r + ", g=" + this.g + ", b=" + this.b + ", a=" + this.a + ")";
        }

        public SRgb(float f, float f2, float f3, float f4) {
            this.r = f;
            this.g = f2;
            this.b = f3;
            this.a = f4;
        }

        public final float getR() {
            return this.r;
        }

        public final float getG() {
            return this.g;
        }

        public final float getB() {
            return this.b;
        }

        public final float getA() {
            return this.a;
        }
    }

    /* compiled from: RawColor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, d2 = {"Lio/github/lukmccall/colors/RawColor$P3;", "Lio/github/lukmccall/colors/RawColor;", "r", "", "g", "b", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "<init>", "(FFFF)V", "getR", "()F", "getG", "getB", "getA", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class P3 implements RawColor {
        private final float a;
        private final float b;
        private final float g;
        private final float r;

        public static /* synthetic */ P3 copy$default(P3 p3, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = p3.r;
            }
            if ((i & 2) != 0) {
                f2 = p3.g;
            }
            if ((i & 4) != 0) {
                f3 = p3.b;
            }
            if ((i & 8) != 0) {
                f4 = p3.a;
            }
            return p3.copy(f, f2, f3, f4);
        }

        /* renamed from: component1, reason: from getter */
        public final float getR() {
            return this.r;
        }

        /* renamed from: component2, reason: from getter */
        public final float getG() {
            return this.g;
        }

        /* renamed from: component3, reason: from getter */
        public final float getB() {
            return this.b;
        }

        /* renamed from: component4, reason: from getter */
        public final float getA() {
            return this.a;
        }

        public final P3 copy(float r, float g, float b, float a2) {
            return new P3(r, g, b, a2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof P3)) {
                return false;
            }
            P3 p3 = (P3) other;
            return Float.compare(this.r, p3.r) == 0 && Float.compare(this.g, p3.g) == 0 && Float.compare(this.b, p3.b) == 0 && Float.compare(this.a, p3.a) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.r) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.a);
        }

        public String toString() {
            return "P3(r=" + this.r + ", g=" + this.g + ", b=" + this.b + ", a=" + this.a + ")";
        }

        public P3(float f, float f2, float f3, float f4) {
            this.r = f;
            this.g = f2;
            this.b = f3;
            this.a = f4;
        }

        public final float getR() {
            return this.r;
        }

        public final float getG() {
            return this.g;
        }

        public final float getB() {
            return this.b;
        }

        public final float getA() {
            return this.a;
        }
    }
}
