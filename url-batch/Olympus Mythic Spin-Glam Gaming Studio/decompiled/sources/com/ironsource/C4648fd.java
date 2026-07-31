package com.ironsource;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.fd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4648fd {
    private boolean a;

    @NotNull
    private String b;
    private boolean c;
    private int d;

    @Nullable
    private int[] e;

    @Nullable
    private int[] f;

    public C4648fd() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public final boolean a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @Nullable
    public final int[] e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4648fd)) {
            return false;
        }
        C4648fd c4648fd = (C4648fd) obj;
        return this.a == c4648fd.a && Intrinsics.areEqual(this.b, c4648fd.b) && this.c == c4648fd.c && this.d == c4648fd.d && Intrinsics.areEqual(this.e, c4648fd.e) && Intrinsics.areEqual(this.f, c4648fd.f);
    }

    @Nullable
    public final int[] f() {
        return this.f;
    }

    public final boolean g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.b.hashCode()) * 31;
        boolean z2 = this.c;
        int hashCode2 = (((hashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Integer.hashCode(this.d)) * 31;
        int[] iArr = this.e;
        int hashCode3 = (hashCode2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f;
        return hashCode3 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.a;
    }

    @NotNull
    public final String j() {
        return this.b;
    }

    @Nullable
    public final int[] k() {
        return this.f;
    }

    @Nullable
    public final int[] l() {
        return this.e;
    }

    @NotNull
    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.a + ", pixelEventsUrl=" + this.b + ", pixelEventsCompression=" + this.c + ", pixelEventsCompressionLevel=" + this.d + ", pixelOptOut=" + Arrays.toString(this.e) + ", pixelOptIn=" + Arrays.toString(this.f) + ")";
    }

    public C4648fd(boolean z, @NotNull String pixelEventsUrl, boolean z2, int i, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.a = z;
        this.b = pixelEventsUrl;
        this.c = z2;
        this.d = i;
        this.e = iArr;
        this.f = iArr2;
    }

    @NotNull
    public final C4648fd a(boolean z, @NotNull String pixelEventsUrl, boolean z2, int i, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new C4648fd(z, pixelEventsUrl, z2, i, iArr, iArr2);
    }

    public final void b(boolean z) {
        this.a = z;
    }

    public static /* synthetic */ C4648fd a(C4648fd c4648fd, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c4648fd.a;
        }
        if ((i2 & 2) != 0) {
            str = c4648fd.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            z2 = c4648fd.c;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            i = c4648fd.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            iArr = c4648fd.e;
        }
        int[] iArr3 = iArr;
        if ((i2 & 32) != 0) {
            iArr2 = c4648fd.f;
        }
        return c4648fd.a(z, str2, z3, i3, iArr3, iArr2);
    }

    public final void b(@Nullable int[] iArr) {
        this.e = iArr;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(@Nullable int[] iArr) {
        this.f = iArr;
    }

    public /* synthetic */ C4648fd(boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C4666gd.a : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : iArr, (i2 & 32) != 0 ? null : iArr2);
    }
}
