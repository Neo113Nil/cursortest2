package io.bidmachine.analytics.internal.v;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class a {
    private final String a;
    private final EnumC1766a b;
    private final Date c;
    private final boolean d;

    /* renamed from: io.bidmachine.analytics.internal.v.a$a, reason: collision with other inner class name */
    public enum EnumC1766a {
        INAPP_CONSUMABLE,
        INAPP_NON_CONSUMABLE,
        SUBS_AUTO_RENEWABLE,
        SUBS_NON_AUTO_RENEWABLE
    }

    public a(String str, EnumC1766a enumC1766a, Date date, boolean z) {
        this.a = str;
        this.b = enumC1766a;
        this.c = date;
        this.d = z;
    }

    public final a a(String str, EnumC1766a enumC1766a, Date date, boolean z) {
        return new a(str, enumC1766a, date, z);
    }

    public final EnumC1766a b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && this.b == aVar.b && Intrinsics.areEqual(this.c, aVar.c) && this.d == aVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ a a(a aVar, String str, EnumC1766a enumC1766a, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.a;
        }
        if ((i & 2) != 0) {
            enumC1766a = aVar.b;
        }
        if ((i & 4) != 0) {
            date = aVar.c;
        }
        if ((i & 8) != 0) {
            z = aVar.d;
        }
        return aVar.a(str, enumC1766a, date, z);
    }

    public final Date a() {
        return this.c;
    }
}
