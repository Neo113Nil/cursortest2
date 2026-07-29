package o;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseKt$childEvents$1$listener$1;
import com.google.firebase.database.ktx.DatabaseKt$snapshots$1$listener$1;

/* renamed from: o.bg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0790bg implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ InterfaceC2214xJ i;
    public final /* synthetic */ DataSnapshot j;

    public /* synthetic */ RunnableC0790bg(InterfaceC2214xJ interfaceC2214xJ, DataSnapshot dataSnapshot, int i) {
        this.h = i;
        this.i = interfaceC2214xJ;
        this.j = dataSnapshot;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                DatabaseKt$childEvents$1$listener$1.onChildRemoved$lambda$2(this.i, this.j);
                break;
            case 1:
                com.google.firebase.database.ktx.DatabaseKt$childEvents$1$listener$1.onChildRemoved$lambda$2(this.i, this.j);
                break;
            case 2:
                DatabaseKt$snapshots$1$listener$1.onDataChange$lambda$0(this.i, this.j);
                break;
            default:
                com.google.firebase.database.DatabaseKt$snapshots$1$listener$1.onDataChange$lambda$0(this.i, this.j);
                break;
        }
    }
}
