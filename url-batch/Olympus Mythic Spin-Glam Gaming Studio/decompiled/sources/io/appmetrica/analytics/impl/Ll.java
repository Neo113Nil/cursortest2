package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes10.dex */
public final class Ll {
    public final Xc a;
    public final Wc b;

    public Ll(PublicLogger publicLogger, String str) {
        this(new Xc(str, publicLogger), new Wc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(C5204ad c5204ad, String str, String str2) {
        try {
            int size = c5204ad.size();
            int i = this.a.c.a;
            if (size >= i && (i != c5204ad.size() || !c5204ad.containsKey(str))) {
                Xc xc = this.a;
                xc.d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", xc.e, Integer.valueOf(xc.c.a), str);
                return false;
            }
            this.b.getClass();
            int i2 = c5204ad.a;
            if (str2 != null) {
                i2 += str2.length();
            }
            if (c5204ad.containsKey(str)) {
                String str3 = (String) c5204ad.get(str);
                if (str3 != null) {
                    i2 -= str3.length();
                }
            } else {
                i2 += str.length();
            }
            if (i2 <= 4500) {
                c5204ad.put(str, str2);
                return true;
            }
            Wc wc = this.b;
            wc.b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", wc.a, 4500, str);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(C5204ad c5204ad, String str, String str2) {
        if (c5204ad == null) {
            return false;
        }
        String a = this.a.a.a(str);
        String a2 = this.a.b.a(str2);
        if (!c5204ad.containsKey(a)) {
            if (a2 != null) {
                return a(c5204ad, a, a2);
            }
            return false;
        }
        String str3 = (String) c5204ad.get(a);
        if (a2 == null || !a2.equals(str3)) {
            return a(c5204ad, a, a2);
        }
        return false;
    }

    public Ll(Xc xc, Wc wc) {
        this.a = xc;
        this.b = wc;
    }
}
