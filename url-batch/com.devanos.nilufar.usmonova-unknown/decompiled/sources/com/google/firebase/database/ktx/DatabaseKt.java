package com.google.firebase.database.ktx;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Query;
import com.google.firebase.ktx.Firebase;
import kotlin.Metadata;
import o.AbstractC0022At;
import o.AbstractC0048Bt;
import o.InterfaceC1315jh;
import o.InterfaceC2243xm;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\t\u001a\u001e\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000bH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000eH\u0087\b¢\u0006\u0004\b\f\u0010\u000f\u001a(\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0010*\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012*\u00020\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0014\"$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012*\u00020\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/google/firebase/ktx/Firebase;", "", "url", "Lcom/google/firebase/database/FirebaseDatabase;", "database", "(Lcom/google/firebase/ktx/Firebase;Ljava/lang/String;)Lcom/google/firebase/database/FirebaseDatabase;", "Lcom/google/firebase/FirebaseApp;", "app", "(Lcom/google/firebase/ktx/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/ktx/Firebase;Lcom/google/firebase/FirebaseApp;Ljava/lang/String;)Lcom/google/firebase/database/FirebaseDatabase;", "T", "Lcom/google/firebase/database/DataSnapshot;", "getValue", "(Lcom/google/firebase/database/DataSnapshot;)Ljava/lang/Object;", "Lcom/google/firebase/database/MutableData;", "(Lcom/google/firebase/database/MutableData;)Ljava/lang/Object;", "", "Lcom/google/firebase/database/Query;", "Lo/xm;", "values", "(Lcom/google/firebase/database/Query;)Lo/xm;", "getDatabase", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/database/FirebaseDatabase;", "getSnapshots", "getSnapshots$annotations", "(Lcom/google/firebase/database/Query;)V", "snapshots", "Lcom/google/firebase/database/ktx/ChildEvent;", "getChildEvents", "getChildEvents$annotations", "childEvents", "com.google.firebase-firebase-database"}, k = 2, mv = {1, 8, 0}, xi = 48)
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

    @InterfaceC1315jh
    public static /* synthetic */ void getChildEvents$annotations(Query query) {
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

    @InterfaceC1315jh
    public static /* synthetic */ void getSnapshots$annotations(Query query) {
    }

    @InterfaceC1315jh
    public static final <T> T getValue(DataSnapshot dataSnapshot) {
        AbstractC0048Bt.n(dataSnapshot, "<this>");
        AbstractC0048Bt.h0();
        throw null;
    }

    @InterfaceC1315jh
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

    @InterfaceC1315jh
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
