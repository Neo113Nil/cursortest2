package com.inmobi.media;

import com.ironsource.X3;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.km, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4137km {
    public final C4190mm a;
    public final Lc b;
    public final Lc c;
    public final Lc d;
    public final Lc e;
    public final Lc f;
    public final Lc g;
    public final Aj h;
    public final Lc i;
    public final Lc j;
    public final Lc k;
    public final Lc l;
    public final Lc m;
    public final V5 n;
    public final Lc o;

    public C4137km(Zc nativeBeaconMacroData, C4190mm trackerData) {
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(trackerData, "trackerData");
        this.a = trackerData;
        Aj aj = new Aj(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.e(C4137km.this);
            }
        });
        Aj aj2 = new Aj(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.f(C4137km.this);
            }
        });
        this.b = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.d(C4137km.this);
            }
        });
        this.c = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.g(C4137km.this);
            }
        });
        this.d = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.h(C4137km.this);
            }
        });
        this.e = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.b(C4137km.this);
            }
        });
        this.f = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.j(C4137km.this);
            }
        });
        this.g = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.n(C4137km.this);
            }
        });
        this.h = new Aj(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.c(C4137km.this);
            }
        });
        this.i = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.k(C4137km.this);
            }
        });
        this.j = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.o(C4137km.this);
            }
        });
        this.k = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.l(C4137km.this);
            }
        });
        this.l = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.m(C4137km.this);
            }
        });
        this.m = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.i(C4137km.this);
            }
        });
        this.n = new V5(nativeBeaconMacroData, trackerData, aj, aj2);
        this.o = new Lc(nativeBeaconMacroData, new Function0() { // from class: com.inmobi.media.km$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4137km.a(C4137km.this);
            }
        });
    }

    public static final List b(C4137km c4137km) {
        return c4137km.a("complete", "complete");
    }

    public static final List d(C4137km c4137km) {
        return c4137km.a("first_quartile", "firstQuartile");
    }

    public static final List g(C4137km c4137km) {
        return c4137km.a("second_quartile", "midpoint");
    }

    public static final List h(C4137km c4137km) {
        return c4137km.a("third_quartile", "thirdQuartile");
    }

    public static final List i(C4137km c4137km) {
        return c4137km.a("error", "error");
    }

    public static final List j(C4137km c4137km) {
        return c4137km.a("load", X3.i.r);
    }

    public static final List k(C4137km c4137km) {
        return c4137km.a("mute", "mute");
    }

    public static final List l(C4137km c4137km) {
        return c4137km.a("pause", "pause");
    }

    public static final List m(C4137km c4137km) {
        return c4137km.a("resume", "resume");
    }

    public static final List n(C4137km c4137km) {
        return c4137km.a("start", "start");
    }

    public static final List o(C4137km c4137km) {
        return c4137km.a("unmute", "unmute");
    }

    public static final List a(C4137km c4137km) {
        return H4.a("companion_rendered", c4137km.a.a.a);
    }

    public static final List c(C4137km c4137km) {
        return H4.a("creative_view", c4137km.a.a.a);
    }

    public static final List e(C4137km c4137km) {
        return H4.a("progress_received", c4137km.a.a.a);
    }

    public static final List f(C4137km c4137km) {
        return H4.a("progress_occurred", c4137km.a.a.a);
    }

    public final List a(String str, String str2) {
        return CollectionsKt.plus((Collection) AbstractC4085im.a(str2, this.a.b), (Iterable) H4.a(str, this.a.a.a));
    }
}
