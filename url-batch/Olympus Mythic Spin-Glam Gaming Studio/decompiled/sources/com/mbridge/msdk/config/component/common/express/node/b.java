package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: AssignmentNode.java */
/* loaded from: classes4.dex */
public class b extends d {
    private static final Set<String> d;
    String a;
    d b;
    d c;

    static {
        Set<String> m;
        m = b$$ExternalSyntheticBackport1.m(new Object[]{"=", "+=", "-=", "*=", "/=", "%="});
        d = m;
    }

    public b(String str, d dVar, d dVar2) {
        this.a = str;
        this.b = dVar;
        this.c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object a = this.b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object a2 = this.c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        return dVar.a(a, arrayList, this.a, aVar);
    }
}
