package com.iab.omid.library.bigosg.adsession;

/* loaded from: classes14.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.typeString;
    }
}
