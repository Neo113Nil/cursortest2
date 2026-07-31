package com.ogury.ad.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class qf {
    public static final String a(pf pfVar) {
        Intrinsics.checkNotNullParameter(pfVar, "<this>");
        boolean z = pfVar.a;
        ef efVar = pfVar.b;
        int i = efVar.a;
        int i2 = efVar.b;
        int i3 = pfVar.c.a;
        te teVar = pfVar.d;
        boolean z2 = teVar.a;
        int i4 = teVar.b;
        String str = teVar.c;
        int i5 = teVar.d;
        long j = teVar.e;
        of ofVar = teVar.f;
        boolean z3 = ofVar.a;
        boolean z4 = ofVar.b;
        long j2 = ofVar.c;
        long j3 = ofVar.d;
        jf jfVar = teVar.g;
        df dfVar = jfVar.a;
        int i6 = dfVar.a;
        int i7 = dfVar.b;
        int i8 = dfVar.c;
        int i9 = dfVar.d;
        int i10 = dfVar.e;
        lf lfVar = jfVar.b;
        boolean z5 = lfVar.a;
        boolean z6 = lfVar.b;
        boolean z7 = lfVar.c;
        List list = lfVar.d;
        List list2 = lfVar.e;
        boolean z8 = lfVar.f;
        kf kfVar = jfVar.c;
        boolean z9 = kfVar.a;
        boolean z10 = kfVar.b;
        boolean z11 = kfVar.c;
        List list3 = kfVar.d;
        List list4 = kfVar.e;
        boolean z12 = kfVar.f;
        ff ffVar = pfVar.e;
        int i11 = ffVar.a;
        boolean z13 = ffVar.b.a;
        boolean z14 = ffVar.c.a;
        re reVar = ffVar.d;
        boolean z15 = reVar.a;
        List list5 = reVar.b;
        boolean z16 = pfVar.f.a;
        String str2 = pfVar.g.a;
        af afVar = pfVar.h.a;
        return StringsKt.trimIndent("\nProfigResponse:\n    isSynced: " + z + "\n    global:\n        requestTimeoutInSecond: " + i + "\n        childrenRequestPermissionsFilter: " + i2 + "\n    configPull:\n        limitPerDay: " + i3 + "\n    adServing:\n        enabled: " + z2 + "\n        requestPermissions: " + i4 + "\n        disablingReason: " + str + "\n        bidTokenMode: " + i5 + "\n        adExpirationTimeInSecond: " + j + "\n        webview:\n            backButtonEnabled: " + z3 + "\n            closeAdWhenLeavingApp: " + z4 + "\n            webviewLoadTimeoutInSecond: " + j2 + "\n            showCloseButtonDelaySecond: " + j3 + "\n        thumbnail:\n            defaultThumbnailConfig:\n                gravity: " + i6 + "\n                xMargin: " + i7 + "\n                yMargin: " + i8 + "\n                maxWidth: " + i9 + "\n                maxHeight: " + i10 + "\n            thumbnailFragmentConfig:\n                defaultWhitelistEnabled: " + z5 + "\n                publisherWhitelistEnabled: " + z6 + "\n                publisherBlacklistEnabled: " + z7 + "\n                whitelist: " + list + "\n                blacklist: " + list2 + "\n                fragmentFilterEnabled: " + z8 + "\n            thumbnailActivityConfig:\n                defaultWhitelistEnabled: " + z9 + "\n                publisherWhitelistEnabled: " + z10 + "\n                publisherBlacklistEnabled: " + z11 + "\n                whitelist: " + list3 + "\n                blacklist: " + list4 + "\n                multiActivityEnabled: " + z12 + "\n    monitoring:\n        requestPermissions: " + i11 + "\n        tracks:\n            enabled: " + z13 + "\n        precachingLogs:\n            enabled: " + z14 + "\n        adLifeCycle:\n            enabled: " + z15 + "\n            blacklist: " + list5 + "\n    omid:\n        enabled: " + z16 + "\n    crashReport:\n        url: " + str2 + "\n    adQuality:\n        blankAdDetection:\n            enabled: " + afVar.a + "\n            algo: " + afVar.b + "\n    ");
    }
}
