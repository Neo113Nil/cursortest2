package com.ironsource;

import com.ironsource.Bg;
import com.ironsource.Cg;
import com.ironsource.P3;
import com.unity3d.mediation.LevelPlay;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Ve {
    @NotNull
    public final Cg a(@NotNull Te response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Bg a = a(response.d(), response.e());
        return a == null ? Cg.b.a : new Cg.a(a);
    }

    private final Bg a(P3 p3, Hd hd) {
        P3.a e = p3.e();
        if (e == null) {
            return null;
        }
        Bg a = a(LevelPlay.AdFormat.REWARDED, hd.h(), e.h());
        if (a != null) {
            return a;
        }
        Bg a2 = a(LevelPlay.AdFormat.INTERSTITIAL, hd.f(), e.f());
        if (a2 != null) {
            return a2;
        }
        Bg a3 = a(LevelPlay.AdFormat.BANNER, hd.e(), e.e());
        if (a3 != null) {
            return a3;
        }
        Bg a4 = a(LevelPlay.AdFormat.NATIVE_AD, hd.g(), e.g());
        if (a4 != null) {
            return a4;
        }
        return null;
    }

    private final Bg a(LevelPlay.AdFormat adFormat, Map<String, ? extends List<String>> map, P3.a.InterfaceC0349a interfaceC0349a) {
        if (map == null) {
            return null;
        }
        Collection<? extends List<String>> values = map.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((List) it.next()).isEmpty()) {
                    if (interfaceC0349a != null) {
                        List<P3.a.e> a = interfaceC0349a.a();
                        if (a == null) {
                            return new Bg.b(adFormat);
                        }
                        if (a.isEmpty()) {
                            return new Bg.a(adFormat);
                        }
                    }
                }
            }
        }
        return null;
    }
}
