package com.my.target;

import com.my.target.internal.api.internalnativead.models.survey.InternalSurveyResultInfoData;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class d8 implements InternalSurveyResultInfoData {
    private final String a;
    private final String b;

    private d8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static d8 a(String str, String str2) {
        return new d8(str, str2);
    }

    public String getDescription() {
        return this.b;
    }

    public String getTitle() {
        return this.a;
    }
}
