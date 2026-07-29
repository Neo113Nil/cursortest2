package o;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.ktx.DatabaseKt$childEvents$1$listener$1;

/* renamed from: o.ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0724ag implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ InterfaceC2214xJ i;
    public final /* synthetic */ DataSnapshot j;
    public final /* synthetic */ String k;

    public /* synthetic */ RunnableC0724ag(InterfaceC2214xJ interfaceC2214xJ, DataSnapshot dataSnapshot, String str, int i) {
        this.h = i;
        this.i = interfaceC2214xJ;
        this.j = dataSnapshot;
        this.k = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                DatabaseKt$childEvents$1$listener$1.onChildAdded$lambda$0(this.i, this.j, this.k);
                break;
            case 1:
                com.google.firebase.database.DatabaseKt$childEvents$1$listener$1.onChildAdded$lambda$0(this.i, this.j, this.k);
                break;
            case 2:
                DatabaseKt$childEvents$1$listener$1.onChildMoved$lambda$3(this.i, this.j, this.k);
                break;
            case 3:
                com.google.firebase.database.DatabaseKt$childEvents$1$listener$1.onChildMoved$lambda$3(this.i, this.j, this.k);
                break;
            case 4:
                DatabaseKt$childEvents$1$listener$1.onChildChanged$lambda$1(this.i, this.j, this.k);
                break;
            default:
                com.google.firebase.database.DatabaseKt$childEvents$1$listener$1.onChildChanged$lambda$1(this.i, this.j, this.k);
                break;
        }
    }
}
