package com.google.firebase;

import android.content.Context;
import com.google.firebase.components.Component;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC0267Ke;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f\u001a)\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\r\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/Firebase;", "", "name", "Lcom/google/firebase/FirebaseApp;", "app", "(Lcom/google/firebase/Firebase;Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;", "Landroid/content/Context;", "context", "initialize", "(Lcom/google/firebase/Firebase;Landroid/content/Context;)Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/FirebaseOptions;", "options", "(Lcom/google/firebase/Firebase;Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;)Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/Firebase;Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;", "", "T", "Lcom/google/firebase/components/Component;", "Lo/Ke;", "coroutineDispatcher", "()Lcom/google/firebase/components/Component;", "getApp", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseApp;", "getOptions", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseOptions;", "com.google.firebase-firebase-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseKt {
    public static final FirebaseApp app(Firebase firebase, String str) {
        AbstractC0048Bt.n(firebase, "<this>");
        AbstractC0048Bt.n(str, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        AbstractC0048Bt.m(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<AbstractC0267Ke> coroutineDispatcher() {
        AbstractC0048Bt.h0();
        throw null;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        AbstractC0048Bt.n(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        AbstractC0048Bt.m(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        AbstractC0048Bt.n(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        AbstractC0048Bt.m(options, "Firebase.app.options");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        AbstractC0048Bt.n(firebase, "<this>");
        AbstractC0048Bt.n(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions) {
        AbstractC0048Bt.n(firebase, "<this>");
        AbstractC0048Bt.n(context, "context");
        AbstractC0048Bt.n(firebaseOptions, "options");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        AbstractC0048Bt.m(initializeApp, "initializeApp(context, options)");
        return initializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions, String str) {
        AbstractC0048Bt.n(firebase, "<this>");
        AbstractC0048Bt.n(context, "context");
        AbstractC0048Bt.n(firebaseOptions, "options");
        AbstractC0048Bt.n(str, "name");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        AbstractC0048Bt.m(initializeApp, "initializeApp(context, options, name)");
        return initializeApp;
    }
}
