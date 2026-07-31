package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.internal.publisher.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5027c {
    public static final int c = 8;

    @NotNull
    public final Map<t, Duration> a;
    public final long b;

    /* renamed from: com.moloco.sdk.internal.publisher.c$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ C5027c(Map map, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, j);
    }

    @NotNull
    public final Map<t, Duration> a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    @NotNull
    public final Map<t, Duration> c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5027c)) {
            return false;
        }
        C5027c c5027c = (C5027c) obj;
        return Intrinsics.areEqual(this.a, c5027c.a) && Duration.m8142equalsimpl0(this.b, c5027c.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Duration.m8156hashCodeimpl(this.b);
    }

    @NotNull
    public String toString() {
        return "AdCreatorConfiguration(adTimeouts=" + this.a + ", defaultTimeoutDuration=" + ((Object) Duration.m8170toStringimpl(this.b)) + ')';
    }

    public C5027c(Map<t, Duration> adTimeouts, long j) {
        Intrinsics.checkNotNullParameter(adTimeouts, "adTimeouts");
        this.a = adTimeouts;
        this.b = j;
    }

    @NotNull
    public final C5027c a(@NotNull Map<t, Duration> adTimeouts, long j) {
        Intrinsics.checkNotNullParameter(adTimeouts, "adTimeouts");
        return new C5027c(adTimeouts, j, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5027c a(C5027c c5027c, Map map, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c5027c.a;
        }
        if ((i & 2) != 0) {
            j = c5027c.b;
        }
        return c5027c.a(map, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C5027c(Map map, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? DurationKt.toDuration(5, DurationUnit.SECONDS) : j, null);
        long duration;
        if ((i & 1) != 0) {
            t[] values = t.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
            for (t tVar : values) {
                switch (a.a[tVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        duration = DurationKt.toDuration(15, DurationUnit.SECONDS);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                linkedHashMap.put(tVar, Duration.m8137boximpl(duration));
            }
            map = linkedHashMap;
        }
    }
}
