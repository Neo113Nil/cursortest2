package com.ironsource;

import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4614df implements M8, M8.a {
    private static final int c = 1;
    private final Map<IronSource.a, Integer> a = new HashMap();
    private final C4591ca b = new C4591ca();

    /* renamed from: com.ironsource.df$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C4614df() {
        for (IronSource.a aVar : IronSource.a.values()) {
            a(aVar, 1);
        }
    }

    private void a(@NotNull IronSource.a aVar, int i) {
        this.a.put(aVar, Integer.valueOf(i));
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            this.b.d(i);
            return;
        }
        if (i2 == 2) {
            this.b.b(i);
        } else if (i2 == 3) {
            this.b.a(i);
        } else {
            if (i2 != 4) {
                return;
            }
            this.b.c(i);
        }
    }

    @Override // com.ironsource.M8.a
    public synchronized void b(IronSource.a aVar) {
        if (aVar == null) {
            return;
        }
        a(aVar, this.a.get(aVar).intValue() + 1);
    }

    @Override // com.ironsource.M8
    public synchronized int a(IronSource.a aVar) {
        int i = -1;
        if (aVar == null) {
            return -1;
        }
        Integer num = this.a.get(aVar);
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    @Override // com.ironsource.M8
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }
}
