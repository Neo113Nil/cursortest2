package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes12.dex */
public abstract class Og extends AbstractC4349so {
    public final AdConfig.ViewabilityConfig l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Og(AdConfig.ViewabilityConfig viewabilityConfig, byte b, InterfaceC4466x9 interfaceC4466x9) {
        super(new WeakHashMap(10), new Handler(Looper.getMainLooper()), b, interfaceC4466x9);
        C4412v7 visibilityChecker = C4491y7.k;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.l = viewabilityConfig;
    }

    @Override // com.inmobi.media.AbstractC4349so
    public final void d() {
        toString();
        if (this.k || this.g.get()) {
            return;
        }
        this.k = true;
        BuildersKt__Builders_commonKt.launch$default(L9.d, null, null, new C4323ro(this, null), 3, null);
    }
}
