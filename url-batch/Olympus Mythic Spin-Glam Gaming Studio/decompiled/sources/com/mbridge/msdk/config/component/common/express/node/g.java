package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;

/* compiled from: MapKeyValueNode.java */
/* loaded from: classes4.dex */
public class g extends d {
    d a;
    d b;

    public g(d dVar, d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object a = this.a.a(dVar, eVar, aVar);
        Object a2 = this.b.a(dVar, eVar, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(a, a2);
        return hashMap;
    }
}
