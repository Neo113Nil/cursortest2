package com.my.target;

import com.my.target.internal.api.internalnativead.models.InternalHtmlData;
import com.my.target.j7;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class g7 implements InternalHtmlData {
    private final j7.c a;

    public g7(j7.c cVar) {
        this.a = cVar;
    }

    public static g7 a(j7.c cVar) {
        return new g7(cVar);
    }

    public int getHeight() {
        return this.a.v();
    }

    public int getWidth() {
        return this.a.R();
    }

    public String source() {
        return this.a.X();
    }
}
