package com.google.firebase.database.ktx;

import com.google.firebase.database.DataSnapshot;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC1973tg;
import o.AbstractC2188wx;
import o.InterfaceC1315jh;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/database/ktx/ChildEvent;", "", "()V", "Added", "Changed", "Moved", "Removed", "Lcom/google/firebase/database/ktx/ChildEvent$Added;", "Lcom/google/firebase/database/ktx/ChildEvent$Changed;", "Lcom/google/firebase/database/ktx/ChildEvent$Moved;", "Lcom/google/firebase/database/ktx/ChildEvent$Removed;", "com.google.firebase-firebase-database"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC1315jh
/* loaded from: classes.dex */
public abstract class ChildEvent {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/database/ktx/ChildEvent$Added;", "Lcom/google/firebase/database/ktx/ChildEvent;", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "previousChildName", "", "(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V", "getPreviousChildName", "()Ljava/lang/String;", "getSnapshot", "()Lcom/google/firebase/database/DataSnapshot;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "com.google.firebase-firebase-database"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InterfaceC1315jh
    public static final /* data */ class Added extends ChildEvent {
        private final String previousChildName;
        private final DataSnapshot snapshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Added(DataSnapshot dataSnapshot, String str) {
            super(null);
            AbstractC0048Bt.n(dataSnapshot, "snapshot");
            this.snapshot = dataSnapshot;
            this.previousChildName = str;
        }

        public static /* synthetic */ Added copy$default(Added added, DataSnapshot dataSnapshot, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                dataSnapshot = added.snapshot;
            }
            if ((i & 2) != 0) {
                str = added.previousChildName;
            }
            return added.copy(dataSnapshot, str);
        }

        /* renamed from: component1, reason: from getter */
        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPreviousChildName() {
            return this.previousChildName;
        }

        public final Added copy(DataSnapshot snapshot, String previousChildName) {
            AbstractC0048Bt.n(snapshot, "snapshot");
            return new Added(snapshot, previousChildName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Added)) {
                return false;
            }
            Added added = (Added) other;
            return AbstractC0048Bt.h(this.snapshot, added.snapshot) && AbstractC0048Bt.h(this.previousChildName, added.previousChildName);
        }

        public final String getPreviousChildName() {
            return this.previousChildName;
        }

        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            int hashCode = this.snapshot.hashCode() * 31;
            String str = this.previousChildName;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Added(snapshot=");
            sb.append(this.snapshot);
            sb.append(", previousChildName=");
            return AbstractC2188wx.h(sb, this.previousChildName, ')');
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/database/ktx/ChildEvent$Changed;", "Lcom/google/firebase/database/ktx/ChildEvent;", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "previousChildName", "", "(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V", "getPreviousChildName", "()Ljava/lang/String;", "getSnapshot", "()Lcom/google/firebase/database/DataSnapshot;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "com.google.firebase-firebase-database"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InterfaceC1315jh
    public static final /* data */ class Changed extends ChildEvent {
        private final String previousChildName;
        private final DataSnapshot snapshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Changed(DataSnapshot dataSnapshot, String str) {
            super(null);
            AbstractC0048Bt.n(dataSnapshot, "snapshot");
            this.snapshot = dataSnapshot;
            this.previousChildName = str;
        }

        public static /* synthetic */ Changed copy$default(Changed changed, DataSnapshot dataSnapshot, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                dataSnapshot = changed.snapshot;
            }
            if ((i & 2) != 0) {
                str = changed.previousChildName;
            }
            return changed.copy(dataSnapshot, str);
        }

        /* renamed from: component1, reason: from getter */
        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPreviousChildName() {
            return this.previousChildName;
        }

        public final Changed copy(DataSnapshot snapshot, String previousChildName) {
            AbstractC0048Bt.n(snapshot, "snapshot");
            return new Changed(snapshot, previousChildName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Changed)) {
                return false;
            }
            Changed changed = (Changed) other;
            return AbstractC0048Bt.h(this.snapshot, changed.snapshot) && AbstractC0048Bt.h(this.previousChildName, changed.previousChildName);
        }

        public final String getPreviousChildName() {
            return this.previousChildName;
        }

        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            int hashCode = this.snapshot.hashCode() * 31;
            String str = this.previousChildName;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Changed(snapshot=");
            sb.append(this.snapshot);
            sb.append(", previousChildName=");
            return AbstractC2188wx.h(sb, this.previousChildName, ')');
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/database/ktx/ChildEvent$Moved;", "Lcom/google/firebase/database/ktx/ChildEvent;", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "previousChildName", "", "(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V", "getPreviousChildName", "()Ljava/lang/String;", "getSnapshot", "()Lcom/google/firebase/database/DataSnapshot;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "com.google.firebase-firebase-database"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InterfaceC1315jh
    public static final /* data */ class Moved extends ChildEvent {
        private final String previousChildName;
        private final DataSnapshot snapshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Moved(DataSnapshot dataSnapshot, String str) {
            super(null);
            AbstractC0048Bt.n(dataSnapshot, "snapshot");
            this.snapshot = dataSnapshot;
            this.previousChildName = str;
        }

        public static /* synthetic */ Moved copy$default(Moved moved, DataSnapshot dataSnapshot, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                dataSnapshot = moved.snapshot;
            }
            if ((i & 2) != 0) {
                str = moved.previousChildName;
            }
            return moved.copy(dataSnapshot, str);
        }

        /* renamed from: component1, reason: from getter */
        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPreviousChildName() {
            return this.previousChildName;
        }

        public final Moved copy(DataSnapshot snapshot, String previousChildName) {
            AbstractC0048Bt.n(snapshot, "snapshot");
            return new Moved(snapshot, previousChildName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Moved)) {
                return false;
            }
            Moved moved = (Moved) other;
            return AbstractC0048Bt.h(this.snapshot, moved.snapshot) && AbstractC0048Bt.h(this.previousChildName, moved.previousChildName);
        }

        public final String getPreviousChildName() {
            return this.previousChildName;
        }

        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            int hashCode = this.snapshot.hashCode() * 31;
            String str = this.previousChildName;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Moved(snapshot=");
            sb.append(this.snapshot);
            sb.append(", previousChildName=");
            return AbstractC2188wx.h(sb, this.previousChildName, ')');
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/database/ktx/ChildEvent$Removed;", "Lcom/google/firebase/database/ktx/ChildEvent;", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "(Lcom/google/firebase/database/DataSnapshot;)V", "getSnapshot", "()Lcom/google/firebase/database/DataSnapshot;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "com.google.firebase-firebase-database"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InterfaceC1315jh
    public static final /* data */ class Removed extends ChildEvent {
        private final DataSnapshot snapshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Removed(DataSnapshot dataSnapshot) {
            super(null);
            AbstractC0048Bt.n(dataSnapshot, "snapshot");
            this.snapshot = dataSnapshot;
        }

        public static /* synthetic */ Removed copy$default(Removed removed, DataSnapshot dataSnapshot, int i, Object obj) {
            if ((i & 1) != 0) {
                dataSnapshot = removed.snapshot;
            }
            return removed.copy(dataSnapshot);
        }

        /* renamed from: component1, reason: from getter */
        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        public final Removed copy(DataSnapshot snapshot) {
            AbstractC0048Bt.n(snapshot, "snapshot");
            return new Removed(snapshot);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Removed) && AbstractC0048Bt.h(this.snapshot, ((Removed) other).snapshot);
        }

        public final DataSnapshot getSnapshot() {
            return this.snapshot;
        }

        public int hashCode() {
            return this.snapshot.hashCode();
        }

        public String toString() {
            return "Removed(snapshot=" + this.snapshot + ')';
        }
    }

    public /* synthetic */ ChildEvent(AbstractC1973tg abstractC1973tg) {
        this();
    }

    private ChildEvent() {
    }
}
