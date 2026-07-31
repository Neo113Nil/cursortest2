package com.my.target.common.models.videomotion;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class Header {

    @NonNull
    public final String adDisclaimerText;

    @NonNull
    public final String ageRestrictionText;

    @NonNull
    public final String icon;

    @NonNull
    public final String linkText;

    @NonNull
    public final String title;

    public Header(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5) {
        this.icon = str;
        this.title = str2;
        this.linkText = str3;
        this.ageRestrictionText = str4;
        this.adDisclaimerText = str5;
    }

    @NonNull
    public String toString() {
        return "Header{icon='" + this.icon + "', title='" + this.title + "', linkText='" + this.linkText + "', ageRestrictionText='" + this.ageRestrictionText + "', adDisclaimerText='" + this.adDisclaimerText + "'}";
    }
}
