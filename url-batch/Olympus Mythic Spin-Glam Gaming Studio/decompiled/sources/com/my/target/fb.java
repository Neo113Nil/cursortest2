package com.my.target;

import androidx.annotation.NonNull;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class fb {
    protected final String a;
    protected int b;
    protected int c;
    private Object d;

    protected fb(String str) {
        this.a = str;
    }

    public Object a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fb fbVar = (fb) obj;
            if (this.b == fbVar.b && this.c == fbVar.c && this.a.equals(fbVar.a) && Objects.equals(this.d, fbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.c;
    }

    @NonNull
    public String getUrl() {
        return this.a;
    }

    public int getWidth() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(this.a);
    }

    public void setHeight(int i) {
        this.c = i;
    }

    public void setWidth(int i) {
        this.b = i;
    }

    public void a(Object obj) {
        this.d = obj;
    }
}
