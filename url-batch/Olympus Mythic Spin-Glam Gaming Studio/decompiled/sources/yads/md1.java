package yads;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class md1 {
    public final int a;
    public final hg0 b;
    public final ig0 c;

    public md1(int i, hg0 hg0Var, ig0 ig0Var) {
        this.a = i;
        this.b = hg0Var;
        this.c = ig0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md1)) {
            return false;
        }
        md1 md1Var = (md1) obj;
        return this.a == md1Var.a && Intrinsics.areEqual(ExtendedNativeAdView.class, ExtendedNativeAdView.class) && Intrinsics.areEqual(this.b, md1Var.b) && Intrinsics.areEqual(this.c, md1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((ExtendedNativeAdView.class.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LayoutDesign(layoutId=" + this.a + ", layoutViewClass=" + ExtendedNativeAdView.class + ", designComponentBinder=" + this.b + ", designConstraint=" + this.c + ")";
    }
}
