package com.iab.omid.library.bigosg.adsession;

import com.ironsource.X3;

/* loaded from: classes.dex */
public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(X3.i.r),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String impressionType;

    ImpressionType(String str) {
        this.impressionType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.impressionType;
    }
}
