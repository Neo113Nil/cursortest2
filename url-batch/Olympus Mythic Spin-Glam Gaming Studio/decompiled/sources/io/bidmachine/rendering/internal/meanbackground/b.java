package io.bidmachine.rendering.internal.meanbackground;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class b {
    private final a a;

    public static final class a {
        private final int a;
        private final int b;
        private final d c;

        public a(int i, int i2, d samplingStrategy) {
            Intrinsics.checkNotNullParameter(samplingStrategy, "samplingStrategy");
            this.a = i;
            this.b = i2;
            this.c = samplingStrategy;
        }

        public final int a(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            return this.c.a(rect.width(), rect.height(), this.a);
        }

        public final int b(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            return this.c.a(rect.width(), rect.height(), this.b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Intrinsics.areEqual(this.c, aVar.c);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Config(maxOffsetPx=" + this.a + ", maxSampleSizePx=" + this.b + ", samplingStrategy=" + this.c + ')';
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.meanbackground.b$b, reason: collision with other inner class name */
    public enum EnumC1801b {
        TopLeft,
        TopRight,
        BottomLeft,
        BottomRight
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1801b.values().length];
            try {
                iArr[EnumC1801b.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1801b.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1801b.BottomLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1801b.BottomRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = config;
    }

    public final List a(Rect contentBounds) {
        Intrinsics.checkNotNullParameter(contentBounds, "contentBounds");
        if (contentBounds.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        EnumC1801b[] values = EnumC1801b.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC1801b enumC1801b : values) {
            arrayList.add(a(enumC1801b, contentBounds, this.a.a(contentBounds), this.a.b(contentBounds)));
        }
        return arrayList;
    }

    private final Rect a(EnumC1801b enumC1801b, Rect rect, int i, int i2) {
        int i3 = c.$EnumSwitchMapping$0[enumC1801b.ordinal()];
        if (i3 == 1) {
            int i4 = rect.left + i;
            int i5 = rect.top + i;
            return new Rect(i4, i5, i4 + i2, i2 + i5);
        }
        if (i3 == 2) {
            int i6 = rect.right - i;
            int i7 = rect.top + i;
            return new Rect(i6 - i2, i7, i6, i2 + i7);
        }
        if (i3 == 3) {
            int i8 = rect.left + i;
            int i9 = rect.bottom - i;
            return new Rect(i8, i9 - i2, i2 + i8, i9);
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = rect.right - i;
        int i11 = rect.bottom - i;
        return new Rect(i10 - i2, i11 - i2, i10, i11);
    }
}
