package yads;

import com.yandex.mobile.ads.common.AdError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xp3 implements AdError {
    public final String a;

    public xp3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(xp3.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.common.YandexAdError");
        return Intrinsics.areEqual(this.a, ((xp3) obj).a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    public final String getDescription() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YandexAdError(description='" + this.a + "')";
    }
}
