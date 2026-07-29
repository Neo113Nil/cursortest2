package com.google.firebase.database;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC1052fg;
import o.InterfaceC2214xJ;
import o.PX;
import o.RunnableC0790bg;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/google/firebase/database/DatabaseKt$snapshots$1$listener$1", "Lcom/google/firebase/database/ValueEventListener;", "Lcom/google/firebase/database/DataSnapshot;", "snapshot", "Lo/bY;", "onDataChange", "(Lcom/google/firebase/database/DataSnapshot;)V", "Lcom/google/firebase/database/DatabaseError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onCancelled", "(Lcom/google/firebase/database/DatabaseError;)V", "com.google.firebase-firebase-database"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatabaseKt$snapshots$1$listener$1 implements ValueEventListener {
    final /* synthetic */ InterfaceC2214xJ $$this$callbackFlow;
    final /* synthetic */ Query $this_snapshots;

    public DatabaseKt$snapshots$1$listener$1(Query query, InterfaceC2214xJ interfaceC2214xJ) {
        this.$this_snapshots = query;
        this.$$this$callbackFlow = interfaceC2214xJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDataChange$lambda$0(InterfaceC2214xJ interfaceC2214xJ, DataSnapshot dataSnapshot) {
        AbstractC0048Bt.n(interfaceC2214xJ, "$$this$callbackFlow");
        AbstractC0048Bt.n(dataSnapshot, "$snapshot");
        AbstractC1052fg.Y(interfaceC2214xJ, dataSnapshot);
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onCancelled(DatabaseError error) {
        AbstractC0048Bt.n(error, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        AbstractC1052fg.g(this.$$this$callbackFlow, PX.a("Error getting Query snapshot", error.toException()));
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onDataChange(DataSnapshot snapshot) {
        AbstractC0048Bt.n(snapshot, "snapshot");
        this.$this_snapshots.repo.scheduleNow(new RunnableC0790bg(this.$$this$callbackFlow, snapshot, 3));
    }
}
