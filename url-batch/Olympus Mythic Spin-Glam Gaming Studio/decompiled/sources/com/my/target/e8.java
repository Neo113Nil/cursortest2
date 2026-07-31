package com.my.target;

import com.my.target.internal.api.internalnativead.models.InternalVideoFile;
import com.my.target.j7;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class e8 implements InternalVideoFile {
    private final j7.e a;

    private e8(j7.e eVar) {
        this.a = eVar;
    }

    public static e8 a(j7.e eVar) {
        return new e8(eVar);
    }

    public int getBitrate() {
        return this.a.d;
    }

    public String getFormat() {
        return this.a.e;
    }

    public float getHeight() {
        return this.a.c;
    }

    public String getSrc() {
        return this.a.a;
    }

    public float getWidth() {
        return this.a.b;
    }
}
