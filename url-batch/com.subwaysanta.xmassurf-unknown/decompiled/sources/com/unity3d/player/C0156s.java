package com.unity3d.player;

import java.lang.reflect.AccessibleObject;

/* renamed from: com.unity3d.player.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156s {
    public final Class a;
    public final String b;
    public final String c;
    public final int d;
    public volatile AccessibleObject e;

    public C0156s(Class cls, String str, String str2) {
        this.a = cls;
        this.b = str;
        this.c = str2;
        this.d = str2.hashCode() + ((str.hashCode() + ((cls.hashCode() + 527) * 31)) * 31);
    }

    public final int hashCode() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0156s) {
            C0156s c0156s = (C0156s) obj;
            if (this.d == c0156s.d && this.c.equals(c0156s.c) && this.b.equals(c0156s.b) && this.a.equals(c0156s.a)) {
                return true;
            }
        }
        return false;
    }
}
