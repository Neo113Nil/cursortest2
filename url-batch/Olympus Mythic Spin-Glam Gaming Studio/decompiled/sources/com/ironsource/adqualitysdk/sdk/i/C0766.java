package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꭵ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0766 extends AbstractC0502 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0780 f1771;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1219 f1772;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1219 f1773;

    public C0766(C1219 c1219, C1219 c12192, C0780 c0780) {
        this.f1773 = c1219;
        this.f1772 = c12192;
        this.f1771 = c0780;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0766.class != obj.getClass()) {
            return false;
        }
        C0766 c0766 = (C0766) obj;
        C1219 c1219 = this.f1773;
        if (c1219 == null ? c0766.f1773 != null : !c1219.equals(c0766.f1773)) {
            return false;
        }
        C1219 c12192 = this.f1772;
        if (c12192 == null ? c0766.f1772 != null : !c12192.equals(c0766.f1772)) {
            return false;
        }
        C0780 c0780 = this.f1771;
        C0780 c07802 = c0766.f1771;
        return c0780 != null ? c0780.equals(c07802) : c07802 == null;
    }

    public final int hashCode() {
        C1219 c1219 = this.f1773;
        int hashCode = (c1219 != null ? c1219.hashCode() : 0) * 31;
        C1219 c12192 = this.f1772;
        int hashCode2 = (hashCode + (c12192 != null ? c12192.hashCode() : 0)) * 31;
        C0780 c0780 = this.f1771;
        return hashCode2 + (c0780 != null ? c0780.hashCode() : 0);
    }

    public final String toString() {
        return StringFog.decrypt("WwpfCw==\n", "L3gmK8uyd44=\n") + this.f1773 + StringFog.decrypt("MqgnEXAWzeQ=\n", "EstGZRN+7cw=\n") + this.f1771 + StringFog.decrypt("Tus=\n", "Z8s0xzehdbM=\n") + this.f1772;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final C0954 mo3961(C0785 c0785, C0880 c0880) {
        try {
            C1219 c1219 = this.f1773;
            if (c1219 != null) {
                return c1219.m4026(new C0785(new HashMap(), c0785, false), c0880);
            }
        } catch (Throwable th) {
            C1219 c12192 = this.f1773;
            c0785.f1844.remove(c12192);
            int lastIndexOf = c0785.f1845.lastIndexOf(c12192);
            if (lastIndexOf >= 0) {
                c0785.f1845 = new ArrayList(c0785.f1845.subList(0, lastIndexOf));
            }
            if (this.f1772 != null) {
                c0785.f1844.add(this);
                HashMap hashMap = new HashMap();
                C0780 c0780 = this.f1771;
                if (c0780 != null) {
                    hashMap.put(AbstractC0471.m4008(c0780.f1826), th);
                }
                return this.f1772.m4026(new C0785(hashMap, c0785, false), c0880);
            }
        }
        return new C0954(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final int mo3960() {
        return (this.f1772.mo3960() + this.f1773.mo3960()) - 1;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final int mo4027(C0785 c0785) {
        if (c0785.f1844.contains(this)) {
            return this.f1773.mo3960();
        }
        return 1;
    }
}
