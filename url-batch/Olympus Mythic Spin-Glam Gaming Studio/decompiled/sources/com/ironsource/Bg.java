package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public abstract class Bg {

    public static final class a extends Bg {

        @NotNull
        private final LevelPlay.AdFormat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull LevelPlay.AdFormat adFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.a = adFormat;
        }

        @NotNull
        public final LevelPlay.AdFormat a() {
            return this.a;
        }

        @NotNull
        public final LevelPlay.AdFormat b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "EmptyPlacementsArray(adFormat=" + this.a + ")";
        }

        @NotNull
        public final a a(@NotNull LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new a(adFormat);
        }

        public static /* synthetic */ a a(a aVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = aVar.a;
            }
            return aVar.a(adFormat);
        }
    }

    public static final class b extends Bg {

        @NotNull
        private final LevelPlay.AdFormat a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull LevelPlay.AdFormat adFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.a = adFormat;
        }

        @NotNull
        public final LevelPlay.AdFormat a() {
            return this.a;
        }

        @NotNull
        public final LevelPlay.AdFormat b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "MissingPlacements(adFormat=" + this.a + ")";
        }

        @NotNull
        public final b a(@NotNull LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new b(adFormat);
        }

        public static /* synthetic */ b a(b bVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = bVar.a;
            }
            return bVar.a(adFormat);
        }
    }

    public /* synthetic */ Bg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Bg() {
    }
}
