package com.ogury.ad.internal;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lb {
    public static final lb a;
    public static final lb b;
    public static final lb c;
    public static final lb d;
    public static final lb e;
    public static final /* synthetic */ lb[] f;

    static {
        lb lbVar = new lb(0, "TIMEOUT");
        a = lbVar;
        lb lbVar2 = new lb(1, "WEBVIEW_NULL");
        b = lbVar2;
        lb lbVar3 = new lb(2, "HTML_EMBEDDING_ERROR");
        c = lbVar3;
        lb lbVar4 = new lb(3, NativeAdContent.ViewTag.OTHER);
        d = lbVar4;
        lb lbVar5 = new lb(4, "UNLOAD");
        e = lbVar5;
        lb[] lbVarArr = {lbVar, lbVar2, lbVar3, lbVar4, lbVar5, new lb(5, "UNKNOWN")};
        f = lbVarArr;
        EnumEntriesKt.enumEntries(lbVarArr);
    }

    public lb(int i, String str) {
    }

    public static lb valueOf(String str) {
        return (lb) Enum.valueOf(lb.class, str);
    }

    public static lb[] values() {
        return (lb[]) f.clone();
    }
}
