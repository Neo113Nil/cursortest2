package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5678sl {
    public final InterfaceC5789x2 a;

    public C5678sl(InterfaceC5789x2 interfaceC5789x2) {
        this.a = interfaceC5789x2;
    }

    public final ArrayList a(Iterable iterable) {
        String str;
        String a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                a = this.a.a(str2);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (a == null || (str = StringUtils.toHexString(MessageDigest.getInstance("SHA-256").digest(a.getBytes(Charsets.UTF_8)))) == null) {
                PublicLogger.INSTANCE.getAnonymousInstance().info("Input " + str2 + " is not a valid data", new Object[0]);
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
