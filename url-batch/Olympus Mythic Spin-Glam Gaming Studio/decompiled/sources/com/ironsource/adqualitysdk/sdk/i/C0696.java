package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.र, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0696 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f1550 = new HashMap();

    public C0696() {
        new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        r4 = r3.f1550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r4 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (r4.isEmpty() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        r4 = r4.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        if (r4.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        r1 = (java.lang.String) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r0.contains(r1) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        r1 = m4141(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r1 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r1.f1584 != com.ironsource.adqualitysdk.sdk.i.EnumC0718.f1596) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r4 = true;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean m4142(boolean z) {
        boolean z2;
        try {
            ArrayList arrayList = new ArrayList();
            if (z) {
                Iterator it = AbstractC0688.f1542.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toLowerCase());
                }
            } else {
                arrayList.add(AbstractC0688.f1543.toLowerCase());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0715 m4141 = m4141((String) it2.next());
                if (m4141 == null || m4141.f1584 != EnumC0718.f1596) {
                    break;
                }
            }
            z2 = false;
        } finally {
        }
        return z2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0715 m4141(String str) {
        HashMap hashMap = this.f1550;
        if (hashMap != null) {
            return (C0715) hashMap.get(str);
        }
        return null;
    }
}
