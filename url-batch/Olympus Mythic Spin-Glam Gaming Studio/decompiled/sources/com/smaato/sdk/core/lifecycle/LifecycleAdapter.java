package com.smaato.sdk.core.lifecycle;

import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.util.fi.Consumer;

/* loaded from: classes5.dex */
public class LifecycleAdapter extends Lifecycle {
    private final Object owner;

    public LifecycleAdapter(Object obj) {
        this.owner = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(Lifecycle.Observer observer) {
        observer.onCreate(this);
    }

    public void onCreate() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.LifecycleAdapter$$ExternalSyntheticLambda0
            @Override // com.smaato.sdk.core.util.fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onCreate$0((Lifecycle.Observer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStart$1(Lifecycle.Observer observer) {
        observer.onStart(this);
    }

    public void onStart() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.LifecycleAdapter$$ExternalSyntheticLambda2
            @Override // com.smaato.sdk.core.util.fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onStart$1((Lifecycle.Observer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResume$2(Lifecycle.Observer observer) {
        observer.onResume(this);
    }

    public void onResume() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.LifecycleAdapter$$ExternalSyntheticLambda5
            @Override // com.smaato.sdk.core.util.fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onResume$2((Lifecycle.Observer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPause$3(Lifecycle.Observer observer) {
        observer.onPause(this);
    }

    public void onPause() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.LifecycleAdapter$$ExternalSyntheticLambda1
            @Override // com.smaato.sdk.core.util.fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onPause$3((Lifecycle.Observer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStop$4(Lifecycle.Observer observer) {
        observer.onStop(this);
    }

    public void onStop() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.LifecycleAdapter$$ExternalSyntheticLambda3
            @Override // com.smaato.sdk.core.util.fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onStop$4((Lifecycle.Observer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$5(Lifecycle.Observer observer) {
        observer.onDestroy(this);
    }

    public void onDestroy() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.LifecycleAdapter$$ExternalSyntheticLambda4
            @Override // com.smaato.sdk.core.util.fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onDestroy$5((Lifecycle.Observer) obj);
            }
        });
    }
}
