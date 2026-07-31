package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final b a;
    public i3 b;
    public boolean c;

    public a(b bVar, i3 i3Var) {
        this.a = bVar;
        this.b = i3Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String s, String str, String str2) {
        i3 i3Var;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        Intrinsics.checkNotNullParameter(s, "s");
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("AdEventListener", "s=" + s + ", value=" + str + ", id=" + str2);
        switch (s.hashCode()) {
            case -1912374177:
                if (s.equals("successfulView") && (i3Var = this.b) != null && i3Var.j() && !this.c) {
                    this.c = true;
                    b bVar5 = this.a;
                    if (bVar5 != null) {
                        bVar5.onAdRewarded(str2);
                        break;
                    }
                }
                break;
            case -1627831289:
                if (s.equals("adViewed") && (bVar = this.a) != null) {
                    bVar.onAdImpression(str2);
                    break;
                }
                break;
            case 100571:
                if (s.equals("end") && (bVar2 = this.a) != null) {
                    bVar2.onAdEnd(str2);
                    break;
                }
                break;
            case 3417674:
                if (s.equals("open")) {
                    if (!Intrinsics.areEqual(str, "adClick")) {
                        if (Intrinsics.areEqual(str, "adLeftApplication") && (bVar3 = this.a) != null) {
                            bVar3.onAdLeftApplication(str2);
                            break;
                        }
                    } else {
                        b bVar6 = this.a;
                        if (bVar6 != null) {
                            bVar6.onAdClick(str2);
                            break;
                        }
                    }
                }
                break;
            case 109757538:
                if (s.equals("start") && (bVar4 = this.a) != null) {
                    bVar4.onAdStart(str2);
                    break;
                }
                break;
        }
    }

    public final void a(VungleError error, String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        b bVar = this.a;
        if (bVar != null) {
            bVar.onFailure(error);
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AdEventListener", "AdEventListener#PlayAdCallback " + str, error);
        }
    }
}
