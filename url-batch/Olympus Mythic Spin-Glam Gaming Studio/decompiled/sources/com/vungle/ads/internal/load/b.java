package com.vungle.ads.internal.load;

import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.p0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class b implements Serializable {
    public final i3 a;
    public final p0 b;
    public final VungleAdSize c;
    public final VungleCSBData d;

    public b(i3 placement, p0 p0Var, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.a = placement;
        this.b = p0Var;
        this.c = vungleAdSize;
        this.d = vungleCSBData;
    }

    public final p0 a() {
        return this.b;
    }

    public final VungleCSBData b() {
        return this.d;
    }

    public final i3 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (!Intrinsics.areEqual(this.a.b(), bVar.a.b()) || !Intrinsics.areEqual(this.c, bVar.c)) {
            return false;
        }
        p0 p0Var = this.b;
        if (p0Var != null) {
            if (!Intrinsics.areEqual(p0Var, bVar.b)) {
                return false;
            }
        } else if (bVar.b != null) {
            return false;
        }
        VungleCSBData vungleCSBData = this.d;
        VungleCSBData vungleCSBData2 = bVar.d;
        return vungleCSBData != null ? Intrinsics.areEqual(vungleCSBData, vungleCSBData2) : vungleCSBData2 == null;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        VungleAdSize vungleAdSize = this.c;
        int hashCode2 = (hashCode + (vungleAdSize != null ? vungleAdSize.hashCode() : 0)) * 31;
        p0 p0Var = this.b;
        int hashCode3 = (hashCode2 + (p0Var != null ? p0Var.hashCode() : 0)) * 31;
        VungleCSBData vungleCSBData = this.d;
        return hashCode3 + (vungleCSBData != null ? vungleCSBData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AdRequest{placementId='");
        a.append(this.a.a);
        a.append("', adMarkup=");
        a.append(this.b);
        a.append(", requestAdSize=");
        a.append(this.c);
        a.append(", csbData=");
        a.append(this.d);
        a.append('}');
        return a.toString();
    }
}
