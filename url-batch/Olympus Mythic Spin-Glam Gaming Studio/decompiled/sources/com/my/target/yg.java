package com.my.target;

import com.my.target.internal.api.internalnativead.models.SizedImage;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class yg implements SizedImage {
    private final List a;

    private yg(List list) {
        this.a = list;
    }

    public static yg a(List list) {
        return new yg(list);
    }

    public List getFiles() {
        return this.a;
    }
}
