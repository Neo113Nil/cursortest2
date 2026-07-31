package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.services.AbstractC5040c;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes6.dex */
public final class k {
    public static final int m = 8;
    public final boolean a;

    @NotNull
    public final MolocoPrivacy.PrivacySettings b;

    @NotNull
    public final r c;

    @NotNull
    public final d d;

    @NotNull
    public final t e;

    @NotNull
    public final h f;

    @NotNull
    public final AbstractC5040c g;

    @NotNull
    public final n h;

    @NotNull
    public final f i;

    @NotNull
    public final a j;

    @NotNull
    public final p k;

    @NotNull
    public final x l;

    public k(boolean z, @NotNull MolocoPrivacy.PrivacySettings privacySettings, @NotNull r memoryInfo, @NotNull d appDirInfo, @NotNull t networkInfoSignal, @NotNull h batteryInfoSignal, @NotNull AbstractC5040c adDataSignal, @NotNull n deviceSignal, @NotNull f audioSignal, @NotNull a accessibilitySignal, @NotNull p ilrdSignal, @NotNull x testConfigSignal) {
        Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        Intrinsics.checkNotNullParameter(memoryInfo, "memoryInfo");
        Intrinsics.checkNotNullParameter(appDirInfo, "appDirInfo");
        Intrinsics.checkNotNullParameter(networkInfoSignal, "networkInfoSignal");
        Intrinsics.checkNotNullParameter(batteryInfoSignal, "batteryInfoSignal");
        Intrinsics.checkNotNullParameter(adDataSignal, "adDataSignal");
        Intrinsics.checkNotNullParameter(deviceSignal, "deviceSignal");
        Intrinsics.checkNotNullParameter(audioSignal, "audioSignal");
        Intrinsics.checkNotNullParameter(accessibilitySignal, "accessibilitySignal");
        Intrinsics.checkNotNullParameter(ilrdSignal, "ilrdSignal");
        Intrinsics.checkNotNullParameter(testConfigSignal, "testConfigSignal");
        this.a = z;
        this.b = privacySettings;
        this.c = memoryInfo;
        this.d = appDirInfo;
        this.e = networkInfoSignal;
        this.f = batteryInfoSignal;
        this.g = adDataSignal;
        this.h = deviceSignal;
        this.i = audioSignal;
        this.j = accessibilitySignal;
        this.k = ilrdSignal;
        this.l = testConfigSignal;
    }

    public final boolean a() {
        return this.a;
    }

    @NotNull
    public final a b() {
        return this.j;
    }

    @NotNull
    public final p c() {
        return this.k;
    }

    @NotNull
    public final x d() {
        return this.l;
    }

    @NotNull
    public final MolocoPrivacy.PrivacySettings e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && Intrinsics.areEqual(this.b, kVar.b) && Intrinsics.areEqual(this.c, kVar.c) && Intrinsics.areEqual(this.d, kVar.d) && Intrinsics.areEqual(this.e, kVar.e) && Intrinsics.areEqual(this.f, kVar.f) && Intrinsics.areEqual(this.g, kVar.g) && Intrinsics.areEqual(this.h, kVar.h) && Intrinsics.areEqual(this.i, kVar.i) && Intrinsics.areEqual(this.j, kVar.j) && Intrinsics.areEqual(this.k, kVar.k) && Intrinsics.areEqual(this.l, kVar.l);
    }

    @NotNull
    public final r f() {
        return this.c;
    }

    @NotNull
    public final d g() {
        return this.d;
    }

    @NotNull
    public final t h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    @NotNull
    public final h i() {
        return this.f;
    }

    @NotNull
    public final AbstractC5040c j() {
        return this.g;
    }

    @NotNull
    public final n k() {
        return this.h;
    }

    @NotNull
    public final f l() {
        return this.i;
    }

    @NotNull
    public final a m() {
        return this.j;
    }

    @NotNull
    public final AbstractC5040c n() {
        return this.g;
    }

    @NotNull
    public final d o() {
        return this.d;
    }

    @NotNull
    public final f p() {
        return this.i;
    }

    @NotNull
    public final h q() {
        return this.f;
    }

    @NotNull
    public final n r() {
        return this.h;
    }

    @NotNull
    public final p s() {
        return this.k;
    }

    @NotNull
    public final r t() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "ClientSignals(sdkInitialized=" + this.a + ", privacySettings=" + this.b + ", memoryInfo=" + this.c + ", appDirInfo=" + this.d + ", networkInfoSignal=" + this.e + ", batteryInfoSignal=" + this.f + ", adDataSignal=" + this.g + ", deviceSignal=" + this.h + ", audioSignal=" + this.i + ", accessibilitySignal=" + this.j + ", ilrdSignal=" + this.k + ", testConfigSignal=" + this.l + ')';
    }

    @NotNull
    public final t u() {
        return this.e;
    }

    @NotNull
    public final MolocoPrivacy.PrivacySettings v() {
        return this.b;
    }

    public final boolean w() {
        return this.a;
    }

    @NotNull
    public final x x() {
        return this.l;
    }

    @NotNull
    public final k a(boolean z, @NotNull MolocoPrivacy.PrivacySettings privacySettings, @NotNull r memoryInfo, @NotNull d appDirInfo, @NotNull t networkInfoSignal, @NotNull h batteryInfoSignal, @NotNull AbstractC5040c adDataSignal, @NotNull n deviceSignal, @NotNull f audioSignal, @NotNull a accessibilitySignal, @NotNull p ilrdSignal, @NotNull x testConfigSignal) {
        Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        Intrinsics.checkNotNullParameter(memoryInfo, "memoryInfo");
        Intrinsics.checkNotNullParameter(appDirInfo, "appDirInfo");
        Intrinsics.checkNotNullParameter(networkInfoSignal, "networkInfoSignal");
        Intrinsics.checkNotNullParameter(batteryInfoSignal, "batteryInfoSignal");
        Intrinsics.checkNotNullParameter(adDataSignal, "adDataSignal");
        Intrinsics.checkNotNullParameter(deviceSignal, "deviceSignal");
        Intrinsics.checkNotNullParameter(audioSignal, "audioSignal");
        Intrinsics.checkNotNullParameter(accessibilitySignal, "accessibilitySignal");
        Intrinsics.checkNotNullParameter(ilrdSignal, "ilrdSignal");
        Intrinsics.checkNotNullParameter(testConfigSignal, "testConfigSignal");
        return new k(z, privacySettings, memoryInfo, appDirInfo, networkInfoSignal, batteryInfoSignal, adDataSignal, deviceSignal, audioSignal, accessibilitySignal, ilrdSignal, testConfigSignal);
    }
}
