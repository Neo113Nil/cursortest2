package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.e0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3954e0 {
    public final C4274q1 a;
    public final CoroutineScope b;
    public final AdConfig c;
    public final C3868ah d;
    public final C4493y9 e;
    public final C3903c0 f;
    public final C4167m0 g;

    public AbstractC3954e0(C4248p1 adManagerComponent) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullExpressionValue(adManagerComponent.b.getApplicationContext(), "getApplicationContext(...)");
        C4274q1 c4274q1 = adManagerComponent.a;
        this.a = c4274q1;
        this.b = adManagerComponent.e;
        this.c = c4274q1.b;
        this.d = c4274q1.a;
        this.e = adManagerComponent.c;
        this.f = adManagerComponent.d;
        this.g = adManagerComponent.f;
    }
}
