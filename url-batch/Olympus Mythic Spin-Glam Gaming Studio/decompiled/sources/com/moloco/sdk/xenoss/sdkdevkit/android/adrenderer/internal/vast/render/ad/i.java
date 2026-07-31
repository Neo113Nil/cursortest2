package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public interface i extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g {

    @StabilityInferred
    public static abstract class a {
        public static final int b = 0;
        public final boolean a;

        @StabilityInferred
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a, reason: collision with other inner class name */
        public static final class C1646a extends a {
            public static final int e = 8;

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h c;
            public final boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1646a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h viewModel, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.c = viewModel;
                this.d = z;
            }

            @NotNull
            public final C1646a a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h viewModel, boolean z) {
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                return new C1646a(viewModel, z);
            }

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h b() {
                return this.c;
            }

            public final boolean c() {
                return this.d;
            }

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h d() {
                return this.c;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1646a)) {
                    return false;
                }
                C1646a c1646a = (C1646a) obj;
                return Intrinsics.areEqual(this.c, c1646a.c) && this.d == c1646a.d;
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + Boolean.hashCode(this.d);
            }

            @NotNull
            public String toString() {
                return "Companion(viewModel=" + this.c + ", isLastAdPart=" + this.d + ')';
            }

            public static /* synthetic */ C1646a a(C1646a c1646a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    hVar = c1646a.c;
                }
                if ((i & 2) != 0) {
                    z = c1646a.d;
                }
                return c1646a.a(hVar, z);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.d;
            }
        }

        @StabilityInferred
        public static final class b extends a {
            public static final int e = 8;

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e c;
            public final boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e viewModel, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.c = viewModel;
                this.d = z;
            }

            @NotNull
            public final b a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e viewModel, boolean z) {
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                return new b(viewModel, z);
            }

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e b() {
                return this.c;
            }

            public final boolean c() {
                return this.d;
            }

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e d() {
                return this.c;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.c, bVar.c) && this.d == bVar.d;
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + Boolean.hashCode(this.d);
            }

            @NotNull
            public String toString() {
                return "DEC(viewModel=" + this.c + ", isLastAdPart=" + this.d + ')';
            }

            public static /* synthetic */ b a(b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    eVar = bVar.c;
                }
                if ((i & 2) != 0) {
                    z = bVar.d;
                }
                return bVar.a(eVar, z);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.d;
            }
        }

        @StabilityInferred
        public static final class c extends a {
            public static final int e = 8;

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k c;
            public final boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k viewModel, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.c = viewModel;
                this.d = z;
            }

            @NotNull
            public final c a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k viewModel, boolean z) {
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                return new c(viewModel, z);
            }

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k b() {
                return this.c;
            }

            public final boolean c() {
                return this.d;
            }

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k d() {
                return this.c;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.c, cVar.c) && this.d == cVar.d;
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + Boolean.hashCode(this.d);
            }

            @NotNull
            public String toString() {
                return "Linear(viewModel=" + this.c + ", isLastAdPart=" + this.d + ')';
            }

            public static /* synthetic */ c a(c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    kVar = cVar.c;
                }
                if ((i & 2) != 0) {
                    z = cVar.d;
                }
                return cVar.a(kVar, z);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.d;
            }
        }

        @StabilityInferred
        public static final class d extends a {
            public static final int e = 8;

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i c;
            public final boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i viewModel, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.c = viewModel;
                this.d = z;
            }

            @NotNull
            public final d a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i viewModel, boolean z) {
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                return new d(viewModel, z);
            }

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i b() {
                return this.c;
            }

            public final boolean c() {
                return this.d;
            }

            @NotNull
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i d() {
                return this.c;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.c, dVar.c) && this.d == dVar.d;
            }

            public int hashCode() {
                return (this.c.hashCode() * 31) + Boolean.hashCode(this.d);
            }

            @NotNull
            public String toString() {
                return "Mraid(viewModel=" + this.c + ", isLastAdPart=" + this.d + ')';
            }

            public static /* synthetic */ d a(d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i iVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    iVar = dVar.c;
                }
                if ((i & 2) != 0) {
                    z = dVar.d;
                }
                return dVar.a(iVar, z);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.d;
            }
        }

        public /* synthetic */ a(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        public boolean a() {
            return this.a;
        }

        public a(boolean z) {
            this.a = z;
        }
    }

    void A();

    @NotNull
    StateFlow P();

    @NotNull
    StateFlow k();

    @NotNull
    StateFlow n();

    void x();

    void z();
}
