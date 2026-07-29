package o;

import android.view.DragEvent;

/* renamed from: o.Zi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660Zi extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0660Zi(C0405Pn c0405Pn, androidx.compose.ui.focus.a aVar, InterfaceC2114vp interfaceC2114vp) {
        super(1);
        this.i = c0405Pn;
        this.j = aVar;
        this.k = (AbstractC1596ny) interfaceC2114vp;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [o.ny, o.vp] */
    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        boolean booleanValue;
        switch (this.h) {
            case 0:
                C0727aj c0727aj = (C0727aj) obj;
                if (((ViewOnDragListenerC0634Yi) ((S2) AbstractC0946e20.K((C0727aj) this.j)).getDragAndDropManager()).b.contains(c0727aj)) {
                    DragEvent dragEvent = (DragEvent) ((Y1) this.k).i;
                    if (AbstractC0946e20.d(c0727aj, PX.h(dragEvent.getX(), dragEvent.getY()))) {
                        ((C1360kM) this.i).h = c0727aj;
                        return EnumC2359zW.j;
                    }
                }
                return EnumC2359zW.h;
            default:
                C0405Pn c0405Pn = (C0405Pn) obj;
                if (AbstractC0048Bt.h(c0405Pn, (C0405Pn) this.i)) {
                    booleanValue = false;
                } else {
                    if (AbstractC0048Bt.h(c0405Pn, ((androidx.compose.ui.focus.a) this.j).d)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((AbstractC1596ny) this.k).invoke(c0405Pn)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0660Zi(C1360kM c1360kM, C0727aj c0727aj, Y1 y1) {
        super(1);
        this.i = c1360kM;
        this.j = c0727aj;
        this.k = y1;
    }
}
