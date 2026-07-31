package com.fyber.inneractive.sdk.activities;

/* loaded from: classes6.dex */
public final class i implements com.fyber.inneractive.sdk.click.o {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public i(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.a != com.fyber.inneractive.sdk.click.q.FAILED) {
            InneractiveInternalBrowserActivity.a(this.a, bVar);
            this.a.finish();
        }
    }
}
