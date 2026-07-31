package com.ironsource;

import com.ironsource.C4902u;
import com.ironsource.InterfaceC4839q7;
import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4925v0 implements F3 {

    @NotNull
    private final C4936vb a;

    @NotNull
    private final Map<LevelPlay.AdFormat, C4902u> b;

    public C4925v0(@NotNull C4936vb tools, @NotNull Map<LevelPlay.AdFormat, C4902u> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(InterfaceC4839q7.a aVar, String str, C4902u.d dVar) {
        C4594cd e = dVar.e();
        if (e != null) {
            I3 i3 = I3.Pacing;
            a(aVar.a(str, i3, new C5000z3(e.a(), e.b(), e.c())), str, i3);
        }
    }

    @Override // com.ironsource.F3
    public void a(@NotNull InterfaceC4839q7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C4902u>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C4902u.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C4902u.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(InterfaceC4839q7.a aVar, String str, C4902u.d dVar) {
        C3 b = dVar.b();
        if (b != null) {
            I3 i3 = I3.ShowCount;
            a(aVar.a(str, i3, new C5000z3(b.a(), b.b(), b.c())), str, i3);
        }
    }

    private final void a(Object obj, String str, I3 i3) {
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj);
        if (m8026exceptionOrNullimpl != null) {
            this.a.a(str, new D3().a(i3), m8026exceptionOrNullimpl.getMessage());
        }
    }
}
