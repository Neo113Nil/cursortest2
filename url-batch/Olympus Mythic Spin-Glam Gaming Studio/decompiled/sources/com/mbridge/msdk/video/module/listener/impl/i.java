package com.mbridge.msdk.video.module.listener.impl;

/* compiled from: ProxyOnNotifyListener.java */
/* loaded from: classes5.dex */
public class i extends f {
    protected com.mbridge.msdk.video.module.listener.a a;

    public i(com.mbridge.msdk.video.module.listener.a aVar) {
        this.a = aVar;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        com.mbridge.msdk.video.module.listener.a aVar = this.a;
        if (aVar != null) {
            aVar.a(i, obj);
        }
    }
}
