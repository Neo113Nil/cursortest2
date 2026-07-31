package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes4.dex */
public final class o implements com.fyber.inneractive.sdk.player.e {
    public final /* synthetic */ r a;

    public o(r rVar) {
        this.a = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.e
    public final void a() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.a.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
            ((com.fyber.inneractive.sdk.player.controller.s) this.a.k).y();
        }
    }
}
