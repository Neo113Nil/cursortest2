package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class SG extends KT {
    public final /* synthetic */ SF A00;

    public SG(SF sf) {
        this.A00 = sf;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        SA sa;
        AbstractC0657Pl abstractC0657Pl;
        AbstractC0633On abstractC0633On;
        AbstractC0666Pu abstractC0666Pu;
        sa = this.A00.A04;
        C02508r<AbstractC02518s, C02498q> eventBus = sa.getEventBus();
        abstractC0657Pl = this.A00.A06;
        abstractC0633On = this.A00.A07;
        abstractC0666Pu = this.A00.A05;
        eventBus.A04(abstractC0657Pl, abstractC0633On, abstractC0666Pu);
    }
}
