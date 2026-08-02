package com.meta.analytics.dsp.uinode;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1060cN {
    public final Map<String, C1072ca> A00;
    public final Set<C1072ca> A01;

    public C1060cN() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1072ca> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1072ca> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C1072ca c1072ca : this.A01) {
            this.A00.put(c1072ca.A04, c1072ca);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C1072ca c1072ca) {
        if (this.A01.add(c1072ca)) {
            this.A00.remove(c1072ca.A04);
            return true;
        }
        return false;
    }
}
