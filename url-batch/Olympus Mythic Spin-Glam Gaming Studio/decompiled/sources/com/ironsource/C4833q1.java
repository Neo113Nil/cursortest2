package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.q1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C4833q1 implements InterfaceC4850r1 {

    @NotNull
    private final IronSource.a a;

    /* renamed from: com.ironsource.q1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C4833q1(@NotNull IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = adFormat;
    }

    @Override // com.ironsource.InterfaceC4850r1
    @NotNull
    public InterfaceC4868s1 a(@NotNull InterfaceC4779n1 eventBaseData) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return new D9(eventBaseData);
        }
        if (i == 2) {
            return new C4631ee(eventBaseData);
        }
        if (i == 3) {
            return new R2(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.a);
    }
}
