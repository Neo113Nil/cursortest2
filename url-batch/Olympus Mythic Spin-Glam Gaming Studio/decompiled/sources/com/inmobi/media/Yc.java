package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.X3;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class Yc {
    public final C3916cd a;
    public final Aj b;
    public final AbstractC4117k2 c;
    public final Aj d;
    public final Aj e;
    public final Aj f;
    public final Aj g;

    public Yc(Zc nativeBeaconMacroData, C3916cd trackerData) {
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(trackerData, "trackerData");
        this.a = trackerData;
        this.b = new Aj(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Yc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Yc.c(Yc.this);
            }
        });
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        this.c = ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getNative().getInteraction().getClickDedupingEnabled() ? new C4013g3(nativeBeaconMacroData) : new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Yc$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Yc.a();
            }
        });
        this.d = new Aj(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Yc$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Yc.e(Yc.this);
            }
        });
        this.e = new Aj(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Yc$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Yc.b(Yc.this);
            }
        });
        this.f = new Aj(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Yc$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Yc.a(Yc.this);
            }
        });
        this.g = new Aj(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.Yc$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Yc.d(Yc.this);
            }
        });
    }

    public static final List a() {
        return CollectionsKt.emptyList();
    }

    public static final List b(Yc yc) {
        return H4.a("impression_shown", yc.a.a.a);
    }

    public static final List c(Yc yc) {
        return H4.a(X3.i.r, yc.a.a.a);
    }

    public static final List d(Yc yc) {
        return H4.a("mrc50", yc.a.a.a);
    }

    public static final List e(Yc yc) {
        return H4.a("start_tracking", yc.a.a.a);
    }

    public static final List a(Yc yc) {
        return CollectionsKt.plus((Collection) H4.a("impression", yc.a.a.a), (Iterable) AbstractC4085im.a("Impression", yc.a.b));
    }
}
