package yads;

import android.graphics.drawable.Drawable;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ps3 implements NativeAdImage {
    public final y00 a;

    public ps3(y00 y00Var) {
        this.a = y00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ps3) && Intrinsics.areEqual(this.a, ((ps3) obj).a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final Drawable getDrawable() {
        return (Drawable) this.a.a.mo4828invoke();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.a + ")";
    }
}
