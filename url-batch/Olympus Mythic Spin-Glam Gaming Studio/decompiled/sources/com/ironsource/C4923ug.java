package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.UnityAds;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ug, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4923ug implements InterfaceC4883sg {

    @NotNull
    public static final C4923ug a = new C4923ug();

    @NotNull
    private static final Lazy b = LazyKt.lazy(a.a);

    /* renamed from: com.ironsource.ug$a */
    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            try {
                UnityAds unityAds = UnityAds.INSTANCE;
                Object invoke = UnityAds.class.getMethod(C4901tg.b, null).invoke(null, null);
                if (invoke instanceof String) {
                    return (String) invoke;
                }
                return null;
            } catch (Throwable th) {
                C4782n4.d().a(th);
                IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private C4923ug() {
    }

    @Override // com.ironsource.InterfaceC4883sg
    @Nullable
    public String a() {
        return (String) b.getValue();
    }
}
