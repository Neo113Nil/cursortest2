package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.List;

/* compiled from: DirectoryContext.java */
/* loaded from: classes11.dex */
public abstract class b {
    protected a a;

    public b(String str) {
        a aVar = new a();
        aVar.a(str);
        aVar.a(c.AD_ROOT);
        List<a> b = b();
        if (b != null && b.size() > 0) {
            aVar.a(b);
        }
        this.a = aVar;
    }

    protected a a(ArrayList<a> arrayList, c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        arrayList.add(aVar);
        return aVar;
    }

    protected abstract List<a> b();

    public a a() {
        return this.a;
    }
}
