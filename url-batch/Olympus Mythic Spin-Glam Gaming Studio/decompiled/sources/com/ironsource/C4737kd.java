package com.ironsource;

import com.ironsource.C4902u;
import com.ironsource.K7;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.kd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4737kd {

    @NotNull
    private final C4936vb a;

    @NotNull
    private final Map<LevelPlay.AdFormat, C4902u> b;

    public C4737kd(@NotNull C4936vb tools, @NotNull Map<LevelPlay.AdFormat, C4902u> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C4902u.d dVar) {
        I3 i3 = I3.Delivery;
        M4 c = dVar.c();
        a(aVar.a(str, adFormat, i3, new C5000z3(c != null ? Boolean.valueOf(c.a()) : null, null, null, 6, null)), str, adFormat, i3);
    }

    private final void c(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C4902u.d dVar) {
        C4594cd e = dVar.e();
        if (e != null) {
            I3 i3 = I3.Pacing;
            a(aVar.a(str, adFormat, i3, new C5000z3(e.a(), e.b(), H3.Second)), str, adFormat, i3);
        }
    }

    public final void a(@NotNull K7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C4902u> entry : this.b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C4902u.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C4902u.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C4902u.d dVar) {
        C3 b = dVar.b();
        if (b != null) {
            I3 i3 = I3.ShowCount;
            a(aVar.a(str, adFormat, i3, new C5000z3(b.a(), b.b(), b.c())), str, adFormat, i3);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, I3 i3) {
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj);
        if (m8026exceptionOrNullimpl != null) {
            this.a.a(str, adFormat, new D3().a(i3), m8026exceptionOrNullimpl.getMessage());
        }
    }
}
