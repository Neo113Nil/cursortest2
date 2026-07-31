package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import androidx.compose.runtime.internal.StabilityInferred;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public interface a {

    @StabilityInferred
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1677a {
        public static final int a = 0;

        @StabilityInferred
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$a, reason: collision with other inner class name */
        public static final class C1678a extends AbstractC1677a {

            @NotNull
            public static final C1678a b = new C1678a();
            public static final int c = 0;

            public C1678a() {
                super(null);
            }
        }

        @StabilityInferred
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$b */
        public static final class b extends AbstractC1677a {
            public static final int c = 0;
            public final long b;

            public b(long j) {
                super(null);
                this.b = j;
            }

            public final long a() {
                return this.b;
            }

            public final long b() {
                return this.b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public int hashCode() {
                return Long.hashCode(this.b);
            }

            @NotNull
            public String toString() {
                return "AppForeground(lastBgTimestamp=" + this.b + ')';
            }

            @NotNull
            public final b a(long j) {
                return new b(j);
            }

            public static /* synthetic */ b a(b bVar, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = bVar.b;
                }
                return bVar.a(j);
            }
        }

        @StabilityInferred
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c */
        public static final class c {
            public static final int d = 0;

            @NotNull
            public final EnumC1679a a;

            @NotNull
            public final f b;

            @NotNull
            public final g c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c$a, reason: collision with other inner class name */
            public static final class EnumC1679a {
                public static final EnumC1679a a = new EnumC1679a("NONE", 0);
                public static final EnumC1679a b = new EnumC1679a("CLOSE", 1);
                public static final EnumC1679a c = new EnumC1679a(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP, 2);
                public static final EnumC1679a d = new EnumC1679a("SKIP_DEC", 3);
                public static final EnumC1679a e = new EnumC1679a("MUTE", 4);
                public static final EnumC1679a f = new EnumC1679a("UNMUTE", 5);
                public static final EnumC1679a g = new EnumC1679a("CTA", 6);
                public static final EnumC1679a h = new EnumC1679a("REPLAY", 7);
                public static final EnumC1679a i = new EnumC1679a("AD_BADGE", 8);
                public static final /* synthetic */ EnumC1679a[] j;
                public static final /* synthetic */ EnumEntries k;

                static {
                    EnumC1679a[] a2 = a();
                    j = a2;
                    k = EnumEntriesKt.enumEntries(a2);
                }

                public EnumC1679a(String str, int i2) {
                }

                public static final /* synthetic */ EnumC1679a[] a() {
                    return new EnumC1679a[]{a, b, c, d, e, f, g, h, i};
                }

                @NotNull
                public static EnumEntries b() {
                    return k;
                }

                public static EnumC1679a valueOf(String str) {
                    return (EnumC1679a) Enum.valueOf(EnumC1679a.class, str);
                }

                public static EnumC1679a[] values() {
                    return (EnumC1679a[]) j.clone();
                }
            }

            public c(@NotNull EnumC1679a buttonType, @NotNull f position, @NotNull g size) {
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(size, "size");
                this.a = buttonType;
                this.b = position;
                this.c = size;
            }

            @NotNull
            public final EnumC1679a a() {
                return this.a;
            }

            @NotNull
            public final f b() {
                return this.b;
            }

            @NotNull
            public final g c() {
                return this.c;
            }

            @NotNull
            public final EnumC1679a d() {
                return this.a;
            }

            @NotNull
            public final f e() {
                return this.b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c, cVar.c);
            }

            @NotNull
            public final g f() {
                return this.c;
            }

            public int hashCode() {
                return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
            }

            @NotNull
            public String toString() {
                return "Button(buttonType=" + this.a + ", position=" + this.b + ", size=" + this.c + ')';
            }

            @NotNull
            public final c a(@NotNull EnumC1679a buttonType, @NotNull f position, @NotNull g size) {
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(size, "size");
                return new c(buttonType, position, size);
            }

            public static /* synthetic */ c a(c cVar, EnumC1679a enumC1679a, f fVar, g gVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    enumC1679a = cVar.a;
                }
                if ((i & 2) != 0) {
                    fVar = cVar.b;
                }
                if ((i & 4) != 0) {
                    gVar = cVar.c;
                }
                return cVar.a(enumC1679a, fVar, gVar);
            }
        }

        @StabilityInferred
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$e */
        public static final class e extends AbstractC1677a {

            @NotNull
            public static final e b = new e();
            public static final int c = 0;

            public e() {
                super(null);
            }
        }

        @StabilityInferred
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$f */
        public static final class f {
            public static final int c = 0;
            public final float a;
            public final float b;

            public f(float f, float f2) {
                this.a = f;
                this.b = f2;
            }

            public final float a() {
                return this.a;
            }

            public final float b() {
                return this.b;
            }

            public final float c() {
                return this.a;
            }

            public final float d() {
                return this.b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Float.compare(this.a, fVar.a) == 0 && Float.compare(this.b, fVar.b) == 0;
            }

            public int hashCode() {
                return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
            }

            @NotNull
            public String toString() {
                return "Position(topLeftXDp=" + this.a + ", topLeftYDp=" + this.b + ')';
            }

            @NotNull
            public final f a(float f, float f2) {
                return new f(f, f2);
            }

            public static /* synthetic */ f a(f fVar, float f, float f2, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = fVar.a;
                }
                if ((i & 2) != 0) {
                    f2 = fVar.b;
                }
                return fVar.a(f, f2);
            }
        }

        @StabilityInferred
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$g */
        public static final class g {
            public static final int c = 0;
            public final float a;
            public final float b;

            public g(float f, float f2) {
                this.a = f;
                this.b = f2;
            }

            public final float a() {
                return this.a;
            }

            public final float b() {
                return this.b;
            }

            public final float c() {
                return this.b;
            }

            public final float d() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Float.compare(this.a, gVar.a) == 0 && Float.compare(this.b, gVar.b) == 0;
            }

            public int hashCode() {
                return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
            }

            @NotNull
            public String toString() {
                return "Size(widthDp=" + this.a + ", heightDp=" + this.b + ')';
            }

            @NotNull
            public final g a(float f, float f2) {
                return new g(f, f2);
            }

            public static /* synthetic */ g a(g gVar, float f, float f2, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = gVar.a;
                }
                if ((i & 2) != 0) {
                    f2 = gVar.b;
                }
                return gVar.a(f, f2);
            }
        }

        public /* synthetic */ AbstractC1677a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @StabilityInferred
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$d */
        public static final class d extends AbstractC1677a {
            public static final int f = 8;

            @NotNull
            public final f b;

            @Nullable
            public final f c;

            @Nullable
            public final g d;

            @NotNull
            public final List<c> e;

            public /* synthetic */ d(f fVar, f fVar2, g gVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(fVar, (i & 2) != 0 ? null : fVar2, (i & 4) != 0 ? null : gVar, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
            }

            @NotNull
            public final List<c> a() {
                return this.e;
            }

            @NotNull
            public final f b() {
                return this.b;
            }

            @Nullable
            public final f c() {
                return this.c;
            }

            @Nullable
            public final g d() {
                return this.d;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull f clickPosition, @Nullable f fVar, @Nullable g gVar, @NotNull List<c> buttonLayout) {
                super(null);
                Intrinsics.checkNotNullParameter(clickPosition, "clickPosition");
                Intrinsics.checkNotNullParameter(buttonLayout, "buttonLayout");
                this.b = clickPosition;
                this.c = fVar;
                this.d = gVar;
                this.e = buttonLayout;
            }
        }

        public AbstractC1677a() {
        }
    }

    @Nullable
    Object a(long j, @NotNull AbstractC1677a abstractC1677a, @NotNull String str, @NotNull Continuation continuation);
}
