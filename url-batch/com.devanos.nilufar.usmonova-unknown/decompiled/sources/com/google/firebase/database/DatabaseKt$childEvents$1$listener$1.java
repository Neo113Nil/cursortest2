package com.google.firebase.database;

import com.google.firebase.database.ChildEvent;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC1052fg;
import o.InterfaceC2214xJ;
import o.PX;
import o.RunnableC0724ag;
import o.RunnableC0790bg;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/google/firebase/database/DatabaseKt$childEvents$1$listener$1", "Lcom/google/firebase/database/ChildEventListener;", "Lcom/google/firebase/database/DataSnapshot;", "snapshot", "", "previousChildName", "Lo/bY;", "onChildAdded", "(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V", "onChildChanged", "onChildRemoved", "(Lcom/google/firebase/database/DataSnapshot;)V", "onChildMoved", "Lcom/google/firebase/database/DatabaseError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onCancelled", "(Lcom/google/firebase/database/DatabaseError;)V", "com.google.firebase-firebase-database"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatabaseKt$childEvents$1$listener$1 implements ChildEventListener {
    final /* synthetic */ InterfaceC2214xJ $$this$callbackFlow;
    final /* synthetic */ Query $this_childEvents;

    public DatabaseKt$childEvents$1$listener$1(Query query, InterfaceC2214xJ interfaceC2214xJ) {
        this.$this_childEvents = query;
        this.$$this$callbackFlow = interfaceC2214xJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onChildAdded$lambda$0(InterfaceC2214xJ interfaceC2214xJ, DataSnapshot dataSnapshot, String str) {
        AbstractC0048Bt.n(interfaceC2214xJ, "$$this$callbackFlow");
        AbstractC0048Bt.n(dataSnapshot, "$snapshot");
        AbstractC1052fg.Y(interfaceC2214xJ, new ChildEvent.Added(dataSnapshot, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onChildChanged$lambda$1(InterfaceC2214xJ interfaceC2214xJ, DataSnapshot dataSnapshot, String str) {
        AbstractC0048Bt.n(interfaceC2214xJ, "$$this$callbackFlow");
        AbstractC0048Bt.n(dataSnapshot, "$snapshot");
        AbstractC1052fg.Y(interfaceC2214xJ, new ChildEvent.Changed(dataSnapshot, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onChildMoved$lambda$3(InterfaceC2214xJ interfaceC2214xJ, DataSnapshot dataSnapshot, String str) {
        AbstractC0048Bt.n(interfaceC2214xJ, "$$this$callbackFlow");
        AbstractC0048Bt.n(dataSnapshot, "$snapshot");
        AbstractC1052fg.Y(interfaceC2214xJ, new ChildEvent.Moved(dataSnapshot, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onChildRemoved$lambda$2(InterfaceC2214xJ interfaceC2214xJ, DataSnapshot dataSnapshot) {
        AbstractC0048Bt.n(interfaceC2214xJ, "$$this$callbackFlow");
        AbstractC0048Bt.n(dataSnapshot, "$snapshot");
        AbstractC1052fg.Y(interfaceC2214xJ, new ChildEvent.Removed(dataSnapshot));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onCancelled(DatabaseError error) {
        AbstractC0048Bt.n(error, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        AbstractC1052fg.g(this.$$this$callbackFlow, PX.a("Error getting Query childEvent", error.toException()));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildAdded(DataSnapshot snapshot, String previousChildName) {
        AbstractC0048Bt.n(snapshot, "snapshot");
        this.$this_childEvents.repo.scheduleNow(new RunnableC0724ag(this.$$this$callbackFlow, snapshot, previousChildName, 1));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildChanged(DataSnapshot snapshot, String previousChildName) {
        AbstractC0048Bt.n(snapshot, "snapshot");
        this.$this_childEvents.repo.scheduleNow(new RunnableC0724ag(this.$$this$callbackFlow, snapshot, previousChildName, 5));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildMoved(DataSnapshot snapshot, String previousChildName) {
        AbstractC0048Bt.n(snapshot, "snapshot");
        this.$this_childEvents.repo.scheduleNow(new RunnableC0724ag(this.$$this$callbackFlow, snapshot, previousChildName, 3));
    }

    @Override // com.google.firebase.database.ChildEventListener
    public void onChildRemoved(DataSnapshot snapshot) {
        AbstractC0048Bt.n(snapshot, "snapshot");
        this.$this_childEvents.repo.scheduleNow(new RunnableC0790bg(this.$$this$callbackFlow, snapshot, 0));
    }
}
