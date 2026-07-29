package com.google.firebase.database;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import kotlin.Metadata;
import o.AbstractC0022At;
import o.AbstractC0048Bt;
import o.InterfaceC2243xm;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\t\u001a\u001e\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000bH\u0086\b¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000eH\u0086\b¢\u0006\u0004\b\f\u0010\u000f\u001a(\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0010*\u00020\u0011H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014\"\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/Firebase;", "", "url", "Lcom/google/firebase/database/FirebaseDatabase;", "database", "(Lcom/google/firebase/Firebase;Ljava/lang/String;)Lcom/google/firebase/database/FirebaseDatabase;", "Lcom/google/firebase/FirebaseApp;", "app", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;Ljava/lang/String;)Lcom/google/firebase/database/FirebaseDatabase;", "T", "Lcom/google/firebase/database/DataSnapshot;", "getValue", "(Lcom/google/firebase/database/DataSnapshot;)Ljava/lang/Object;", "Lcom/google/firebase/database/MutableData;", "(Lcom/google/firebase/database/MutableData;)Ljava/lang/Object;", "", "Lcom/google/firebase/database/Query;", "Lo/xm;", "values", "(Lcom/google/firebase/database/Query;)Lo/xm;", "getDatabase", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/database/FirebaseDatabase;", "getSnapshots", "snapshots", "Lcom/google/firebase/database/ChildEvent;", "getChildEvents", "childEvents", "com.google.firebase-firebase-database"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatabaseKt {
    public static final FirebaseDatabase database(Firebase firebase, String str) {
        AbstractC0048Bt.n(firebase, "<this>");
        AbstractC0048Bt.n(str, "url");
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance(str);
        AbstractC0048Bt.m(firebaseDatabase, "getInstance(url)");
        return firebaseDatabase;
    }

    public static final InterfaceC2243xm getChildEvents(Query query) {
        AbstractC0048Bt.n(query, "<this>");
        return AbstractC0022At.j(new DatabaseKt$childEvents$1(query, null));
    }

    public static final FirebaseDatabase getDatabase(Firebase firebase) {
        AbstractC0048Bt.n(firebase, "<this>");
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        AbstractC0048Bt.m(firebaseDatabase, "getInstance()");
        return firebaseDatabase;
    }

    public static final InterfaceC2243xm getSnapshots(Query query) {
        AbstractC0048Bt.n(query, "<this>");
        return AbstractC0022At.j(new DatabaseKt$snapshots$1(query, null));
    }

    public static final <T> T getValue(DataSnapshot dataSnapshot) {
        AbstractC0048Bt.n(dataSnapshot, "<this>");
        AbstractC0048Bt.h0();
        throw null;
    }

    public static final <T> InterfaceC2243xm values(Query query) {
        AbstractC0048Bt.n(query, "<this>");
        getSnapshots(query);
        AbstractC0048Bt.h0();
        throw null;
    }

    public static final FirebaseDatabase database(Firebase firebase, FirebaseApp firebaseApp) {
        AbstractC0048Bt.n(firebase, "<this>");
        AbstractC0048Bt.n(firebaseApp, "app");
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance(firebaseApp);
        AbstractC0048Bt.m(firebaseDatabase, "getInstance(app)");
        return firebaseDatabase;
    }

    public static final <T> T getValue(MutableData mutableData) {
        AbstractC0048Bt.n(mutableData, "<this>");
        AbstractC0048Bt.h0();
        throw null;
    }

    public static final FirebaseDatabase database(Firebase firebase, FirebaseApp firebaseApp, String str) {
        AbstractC0048Bt.n(firebase, "<this>");
        AbstractC0048Bt.n(firebaseApp, "app");
        AbstractC0048Bt.n(str, "url");
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance(firebaseApp, str);
        AbstractC0048Bt.m(firebaseDatabase, "getInstance(app, url)");
        return firebaseDatabase;
    }
}
