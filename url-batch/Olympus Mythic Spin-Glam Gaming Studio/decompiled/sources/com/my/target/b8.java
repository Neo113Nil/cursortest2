package com.my.target;

import com.my.target.internal.api.internalnativead.models.survey.InternalSurveyData;
import com.my.target.internal.api.internalnativead.models.survey.InternalSurveyResultInfoData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class b8 implements InternalSurveyData {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;
    private final List f;
    private final d8 g;

    private b8(String str, String str2, int i, String str3, String str4, List list, d8 d8Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = d8Var;
    }

    public static b8 a(String str, String str2, int i, String str3, String str4, List list, d8 d8Var) {
        return new b8(str, str2, i, str3, str4, list, d8Var);
    }

    public String b() {
        return this.b;
    }

    public int getGradient() {
        return this.c;
    }

    public String getLegalDocUrl() {
        return this.e;
    }

    public String getMainColor() {
        return this.d;
    }

    public List getQuestions() {
        return new ArrayList(this.f);
    }

    public InternalSurveyResultInfoData getResultInfoData() {
        return this.g;
    }

    public String a() {
        return this.a;
    }
}
