package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class b {
    public static final int c = 0;
    public final boolean a;

    @Nullable
    public final String b;

    public b(boolean z, @Nullable String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    @Nullable
    public final String d() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && Intrinsics.areEqual(this.b, bVar.b);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "AndroidInlineControllerData(enabled=" + this.a + ", url=" + this.b + ')';
    }

    @NotNull
    public final b a(boolean z, @Nullable String str) {
        return new b(z, str);
    }

    public static /* synthetic */ b a(b bVar, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bVar.a;
        }
        if ((i & 2) != 0) {
            str = bVar.b;
        }
        return bVar.a(z, str);
    }
}
