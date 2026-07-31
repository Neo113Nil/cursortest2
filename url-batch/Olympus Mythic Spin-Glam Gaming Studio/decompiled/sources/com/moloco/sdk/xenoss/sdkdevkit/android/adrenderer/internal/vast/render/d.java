package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public interface d {

    @StabilityInferred
    public static abstract class a {
        public static final int a = 0;

        @StabilityInferred
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a$a, reason: collision with other inner class name */
        public static final class C1664a extends a {

            @NotNull
            public static final C1664a b = new C1664a();
            public static final int c = 0;

            public C1664a() {
                super(null);
            }
        }

        @StabilityInferred
        public static final class b extends a {
            public static final int c = 0;
            public final int b;

            public /* synthetic */ b(int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(i);
            }

            public final int a() {
                return this.b;
            }

            public final int b() {
                return this.b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public int hashCode() {
                return UInt.m8057hashCodeimpl(this.b);
            }

            @NotNull
            public String toString() {
                return "Countdown(seconds=" + ((Object) UInt.m8058toStringimpl(this.b)) + ')';
            }

            public b(int i) {
                super(null);
                this.b = i;
            }

            @NotNull
            public final b a(int i) {
                return new b(i, null);
            }

            public static /* synthetic */ b a(b bVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.b;
                }
                return bVar.a(i);
            }
        }

        @StabilityInferred
        public static final class c extends a {

            @NotNull
            public static final c b = new c();
            public static final int c = 0;

            public c() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @NotNull
    StateFlow l();
}
