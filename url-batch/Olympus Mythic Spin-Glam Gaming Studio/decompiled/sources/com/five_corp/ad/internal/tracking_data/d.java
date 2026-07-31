package com.five_corp.ad.internal.tracking_data;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class d {
    public final Integer a;
    public final String b;

    public d(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final boolean a() {
        return Objects.equals(this.a, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (Objects.equals(this.a, dVar.a) && Objects.equals(this.b, dVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
