package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes12.dex */
public abstract class c {
    public static final int a = 0;

    @StabilityInferred
    public static final class a extends c {
        public static final int c = 8;

        @NotNull
        public final File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File file) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.b = file;
        }

        @NotNull
        public final File a() {
            return this.b;
        }

        @NotNull
        public final File b() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.b, ((a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Complete(file=" + this.b + ')';
        }

        @NotNull
        public final a a(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new a(file);
        }

        public static /* synthetic */ a a(a aVar, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                file = aVar.b;
            }
            return aVar.a(file);
        }
    }

    @StabilityInferred
    public static final class b extends c {
        public static final int c = 0;

        @NotNull
        public final i.a.AbstractC1586a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull i.a.AbstractC1586a failure) {
            super(null);
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.b = failure;
        }

        @NotNull
        public final i.a.AbstractC1586a a() {
            return this.b;
        }

        @NotNull
        public final i.a.AbstractC1586a b() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.b, ((b) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(failure=" + this.b + ')';
        }

        @NotNull
        public final b a(@NotNull i.a.AbstractC1586a failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new b(failure);
        }

        public static /* synthetic */ b a(b bVar, i.a.AbstractC1586a abstractC1586a, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC1586a = bVar.b;
            }
            return bVar.a(abstractC1586a);
        }
    }

    @StabilityInferred
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c$c, reason: collision with other inner class name */
    public static final class C1589c extends c {
        public static final int d = 8;

        @NotNull
        public final File b;

        @NotNull
        public final d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1589c(@NotNull File file, @NotNull d progress) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.b = file;
            this.c = progress;
        }

        @NotNull
        public final File a() {
            return this.b;
        }

        @NotNull
        public final d b() {
            return this.c;
        }

        @NotNull
        public final File c() {
            return this.b;
        }

        @NotNull
        public final d d() {
            return this.c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1589c)) {
                return false;
            }
            C1589c c1589c = (C1589c) obj;
            return Intrinsics.areEqual(this.b, c1589c.b) && Intrinsics.areEqual(this.c, c1589c.c);
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        @NotNull
        public String toString() {
            return "InProgress(file=" + this.b + ", progress=" + this.c + ')';
        }

        @NotNull
        public final C1589c a(@NotNull File file, @NotNull d progress) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(progress, "progress");
            return new C1589c(file, progress);
        }

        public static /* synthetic */ C1589c a(C1589c c1589c, File file, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                file = c1589c.b;
            }
            if ((i & 2) != 0) {
                dVar = c1589c.c;
            }
            return c1589c.a(file, dVar);
        }
    }

    @StabilityInferred
    public static final class d {
        public static final int c = 0;
        public final long a;
        public final long b;

        public d(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final long a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.a;
        }

        public final long d() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public int hashCode() {
            return (Long.hashCode(this.a) * 31) + Long.hashCode(this.b);
        }

        @NotNull
        public String toString() {
            return "Progress(bytesDownloaded=" + this.a + ", totalBytes=" + this.b + ')';
        }

        @NotNull
        public final d a(long j, long j2) {
            return new d(j, j2);
        }

        public static /* synthetic */ d a(d dVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dVar.a;
            }
            if ((i & 2) != 0) {
                j2 = dVar.b;
            }
            return dVar.a(j, j2);
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public c() {
    }
}
