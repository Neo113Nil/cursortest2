package io.bidmachine.rendering.internal.animation;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class e {
    private final float a;
    private final float b;
    private final float c;

    public e(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.a, eVar.a) == 0 && Float.compare(this.b, eVar.b) == 0 && Float.compare(this.c, eVar.c) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c);
    }

    public String toString() {
        return "AdAnimationValues(alpha=" + this.a + ", translationX=" + this.b + ", translationY=" + this.c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(View view) {
        this(view.getAlpha(), view.getTranslationX(), view.getTranslationY());
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
