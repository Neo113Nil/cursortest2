package com.my.target;

import com.my.target.internal.api.internalnativead.models.survey.InternalSurveyQuestionData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class c8 implements InternalSurveyQuestionData {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final List e;
    private final List f;

    private c8(String str, String str2, String str3, boolean z, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = list;
        this.f = list2;
    }

    public static c8 a(String str, String str2, String str3, boolean z, List list, List list2) {
        return new c8(str, str2, str3, z, list, list2);
    }

    public List getAnswers() {
        return new ArrayList(this.e);
    }

    public String getBlockId() {
        return this.a;
    }

    public List getImages() {
        return this.f;
    }

    public String getQuestionType() {
        return this.b;
    }

    public String getText() {
        return this.c;
    }

    public boolean isRequired() {
        return this.d;
    }
}
