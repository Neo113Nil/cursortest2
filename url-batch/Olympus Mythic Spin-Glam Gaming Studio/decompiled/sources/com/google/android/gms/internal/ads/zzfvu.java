package com.google.android.gms.internal.ads;

import com.ironsource.X3;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public enum zzfvu {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(X3.i.r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String zzi;

    zzfvu(String str) {
        this.zzi = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzi;
    }
}
