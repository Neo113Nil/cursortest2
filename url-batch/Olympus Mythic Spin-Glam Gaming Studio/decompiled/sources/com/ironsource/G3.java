package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class G3 {
    private final boolean a;

    @Nullable
    private final I3 b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public G3(boolean z, @Nullable I3 i3) {
        this.a = z;
        this.b = i3;
    }

    public final boolean a() {
        return this.a;
    }

    @Nullable
    public final I3 b() {
        return this.b;
    }

    @Nullable
    public final I3 c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    @Nullable
    public final String e() {
        I3 i3 = this.b;
        int i = i3 == null ? -1 : a.a[i3.ordinal()];
        if (i == 1) {
            return "Placement delivery is false";
        }
        if (i == 2) {
            return "In pacing mode";
        }
        if (i != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G3)) {
            return false;
        }
        G3 g3 = (G3) obj;
        return this.a == g3.a && this.b == g3.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        I3 i3 = this.b;
        return i + (i3 == null ? 0 : i3.hashCode());
    }

    @NotNull
    public String toString() {
        return "CappingStatus(isCapped=" + this.a + " reason=" + this.b + ")";
    }

    public /* synthetic */ G3(boolean z, I3 i3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : i3);
    }

    @NotNull
    public final G3 a(boolean z, @Nullable I3 i3) {
        return new G3(z, i3);
    }

    public static /* synthetic */ G3 a(G3 g3, boolean z, I3 i3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = g3.a;
        }
        if ((i & 2) != 0) {
            i3 = g3.b;
        }
        return g3.a(z, i3);
    }
}
