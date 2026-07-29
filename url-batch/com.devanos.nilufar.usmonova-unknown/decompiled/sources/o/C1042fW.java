package o;

import java.util.ArrayList;

/* renamed from: o.fW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042fW extends AbstractC1074g00 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public C1042fW(C1183hf c1183hf) {
        this.a = 1;
        this.d = c1183hf;
        this.b = false;
        this.c = 0;
    }

    @Override // o.InterfaceC1008f00
    public final void a() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((C1108gW) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i = this.c + 1;
                this.c = i;
                C1183hf c1183hf = (C1183hf) this.d;
                if (i == ((ArrayList) c1183hf.j).size()) {
                    InterfaceC1008f00 interfaceC1008f00 = (InterfaceC1008f00) c1183hf.l;
                    if (interfaceC1008f00 != null) {
                        interfaceC1008f00.a();
                    }
                    this.c = 0;
                    this.b = false;
                    c1183hf.i = false;
                    break;
                }
                break;
        }
    }

    @Override // o.AbstractC1074g00, o.InterfaceC1008f00
    public void b() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // o.AbstractC1074g00, o.InterfaceC1008f00
    public final void c() {
        switch (this.a) {
            case 0:
                ((C1108gW) this.d).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    InterfaceC1008f00 interfaceC1008f00 = (InterfaceC1008f00) ((C1183hf) this.d).l;
                    if (interfaceC1008f00 != null) {
                        interfaceC1008f00.c();
                        break;
                    }
                }
                break;
        }
    }

    public C1042fW(C1108gW c1108gW, int i) {
        this.a = 0;
        this.d = c1108gW;
        this.c = i;
        this.b = false;
    }
}
