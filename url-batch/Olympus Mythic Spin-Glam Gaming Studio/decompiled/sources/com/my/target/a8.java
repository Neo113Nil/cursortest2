package com.my.target;

import com.my.target.internal.api.internalnativead.models.survey.InternalSurveyAnswerData;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class a8 implements InternalSurveyAnswerData {
    private final String a;
    private final int b;
    private final String c;
    private final List d;

    private a8(String str, int i, String str2, List list) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = list;
    }

    public static a8 a(String str, int i, String str2, List list) {
        return new a8(str, i, str2, list);
    }

    public String getId() {
        return this.a;
    }

    public List getLogo() {
        return this.d;
    }

    public String getText() {
        return this.c;
    }

    public int getType() {
        return this.b;
    }
}
