package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class A implements InterfaceC4731k7 {

    @NotNull
    private final M8 a;

    public A(@NotNull M8 sessionDepthService) {
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        this.a = sessionDepthService;
    }

    @Override // com.ironsource.InterfaceC4731k7
    public void a(@NotNull Map<String, Object> output) {
        Intrinsics.checkNotNullParameter(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(O6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(O6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.REWARDED)));
        output.put(O6.H0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(O6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(O6.K0, Integer.valueOf(this.a.a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
