package io.bidmachine.internal;

import io.bidmachine.models.DataRestrictions;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.internal.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6025u {
    private final String a;
    private final y b;
    private A c;
    private final C6024t d;
    private final List e;
    private final w f;
    private final DataRestrictions g;
    private final v h;

    public C6025u(String sessionId, y privacyRestrictionMode, A publisherPrivacySettings, C6024t platformPrivacySettings, List restrictionKindList, w privacyGroupRestrictions, DataRestrictions dataRestrictions, v privacyDataMasker) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(privacyRestrictionMode, "privacyRestrictionMode");
        Intrinsics.checkNotNullParameter(publisherPrivacySettings, "publisherPrivacySettings");
        Intrinsics.checkNotNullParameter(platformPrivacySettings, "platformPrivacySettings");
        Intrinsics.checkNotNullParameter(restrictionKindList, "restrictionKindList");
        Intrinsics.checkNotNullParameter(privacyGroupRestrictions, "privacyGroupRestrictions");
        Intrinsics.checkNotNullParameter(dataRestrictions, "dataRestrictions");
        Intrinsics.checkNotNullParameter(privacyDataMasker, "privacyDataMasker");
        this.a = sessionId;
        this.b = privacyRestrictionMode;
        this.c = publisherPrivacySettings;
        this.d = platformPrivacySettings;
        this.e = restrictionKindList;
        this.f = privacyGroupRestrictions;
        this.g = dataRestrictions;
        this.h = privacyDataMasker;
    }

    public final DataRestrictions a() {
        return this.g;
    }

    public final C6024t b() {
        return this.d;
    }

    public final v c() {
        return this.h;
    }

    public final w d() {
        return this.f;
    }

    public final y e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6025u)) {
            return false;
        }
        C6025u c6025u = (C6025u) obj;
        return Intrinsics.areEqual(this.a, c6025u.a) && this.b == c6025u.b && Intrinsics.areEqual(this.c, c6025u.c) && Intrinsics.areEqual(this.d, c6025u.d) && Intrinsics.areEqual(this.e, c6025u.e) && Intrinsics.areEqual(this.f, c6025u.f) && Intrinsics.areEqual(this.g, c6025u.g) && Intrinsics.areEqual(this.h, c6025u.h);
    }

    public final A f() {
        return this.c;
    }

    public final List g() {
        return this.e;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
