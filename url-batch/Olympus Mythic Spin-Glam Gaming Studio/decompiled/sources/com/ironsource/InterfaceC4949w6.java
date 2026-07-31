package com.ironsource;

import android.app.Activity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.w6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC4949w6 {

    /* renamed from: com.ironsource.w6$a */
    public static final class a {

        @NotNull
        private final c a;

        public a(@NotNull c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.a = strategyType;
        }

        @NotNull
        public final c a() {
            return this.a;
        }

        @NotNull
        public final c b() {
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
            return "Config(strategyType=" + this.a + ")";
        }

        @NotNull
        public final a a(@NotNull c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new a(strategyType);
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.a;
            }
            return aVar.a(cVar);
        }
    }

    /* renamed from: com.ironsource.w6$b */
    public static final class b {

        /* renamed from: com.ironsource.w6$b$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        @NotNull
        public final InterfaceC4949w6 a(@NotNull C4814p0 adTools, @NotNull a config, @NotNull InterfaceC4873s6 fullscreenAdUnitFactory, @NotNull InterfaceC4909u6 fullscreenAdUnitListener, @NotNull InterfaceC4931v6 listener) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            Intrinsics.checkNotNullParameter(listener, "listener");
            int i = a.a[config.b().ordinal()];
            if (i == 1) {
                return new K6(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 2) {
                return new D6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 3) {
                return new C4967x6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: com.ironsource.w6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        @NotNull
        private final String a;

        c(String str) {
            this.a = str;
        }

        @NotNull
        public final String b() {
            return this.a;
        }
    }

    void a(@NotNull Activity activity);

    void loadAd();
}
