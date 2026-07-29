package com.techno_world.pencil.sketch.camera;

import android.app.Application;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* loaded from: classes.dex */
public class MyApp extends Application {
    private static AppOpenManager appOpenManager;
    public boolean showAddorNot = false;
    public boolean gotonext = false;

    public boolean getAddVariable() {
        return this.showAddorNot;
    }

    public void setAddVariable(boolean z) {
        this.showAddorNot = z;
    }

    public boolean getGoToNext() {
        return this.gotonext;
    }

    public void setGotonext(boolean z) {
        this.gotonext = z;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicationObserver());
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.techno_world.pencil.sketch.camera.MyApp.1
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        appOpenManager = new AppOpenManager(this);
    }
}
