package com.ogury.ad.internal;

import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class si {
    public static final si b;
    public static final si c;
    public static final si d;
    public static final /* synthetic */ si[] e;
    public final String a;

    static {
        si siVar = new si("HTML", 0, "html");
        b = siVar;
        si siVar2 = new si("FORMAT", 1, POBConstants.KEY_FORMAT);
        c = siVar2;
        si siVar3 = new si(MraidAdRenderer.LOG_TAG, 2, "mraid");
        d = siVar3;
        si[] siVarArr = {siVar, siVar2, siVar3};
        e = siVarArr;
        EnumEntriesKt.enumEntries(siVarArr);
    }

    public si(String str, int i, String str2) {
        this.a = str2;
    }

    public static si valueOf(String str) {
        return (si) Enum.valueOf(si.class, str);
    }

    public static si[] values() {
        return (si[]) e.clone();
    }
}
