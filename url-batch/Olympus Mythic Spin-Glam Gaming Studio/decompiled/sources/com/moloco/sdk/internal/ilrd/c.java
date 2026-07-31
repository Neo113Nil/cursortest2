package com.moloco.sdk.internal.ilrd;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.IlrdRequest;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public interface c {

    public interface a {

        @StabilityInferred
        /* renamed from: com.moloco.sdk.internal.ilrd.c$a$a, reason: collision with other inner class name */
        public static final class C1532a implements a {
            public static final int b = 0;

            @NotNull
            public final IlrdRequest.LevelPlayImpression a;

            public C1532a(@NotNull IlrdRequest.LevelPlayImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                this.a = impression;
            }

            @NotNull
            public final IlrdRequest.LevelPlayImpression a() {
                return this.a;
            }

            @NotNull
            public final IlrdRequest.LevelPlayImpression b() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1532a) && Intrinsics.areEqual(this.a, ((C1532a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public String toString() {
                return "LevelPlay(impression=" + this.a + ')';
            }

            @NotNull
            public final C1532a a(@NotNull IlrdRequest.LevelPlayImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                return new C1532a(impression);
            }

            public static /* synthetic */ C1532a a(C1532a c1532a, IlrdRequest.LevelPlayImpression levelPlayImpression, int i, Object obj) {
                if ((i & 1) != 0) {
                    levelPlayImpression = c1532a.a;
                }
                return c1532a.a(levelPlayImpression);
            }
        }

        @StabilityInferred
        public static final class b implements a {
            public static final int b = 0;

            @NotNull
            public final IlrdRequest.MaxImpression a;

            public b(@NotNull IlrdRequest.MaxImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                this.a = impression;
            }

            @NotNull
            public final IlrdRequest.MaxImpression a() {
                return this.a;
            }

            @NotNull
            public final IlrdRequest.MaxImpression b() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Max(impression=" + this.a + ')';
            }

            @NotNull
            public final b a(@NotNull IlrdRequest.MaxImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                return new b(impression);
            }

            public static /* synthetic */ b a(b bVar, IlrdRequest.MaxImpression maxImpression, int i, Object obj) {
                if ((i & 1) != 0) {
                    maxImpression = bVar.a;
                }
                return bVar.a(maxImpression);
            }
        }
    }

    @NotNull
    com.moloco.sdk.internal.ilrd.model.a a();

    @NotNull
    Object b();

    @NotNull
    SharedFlow c();

    @NotNull
    StateFlow getState();
}
