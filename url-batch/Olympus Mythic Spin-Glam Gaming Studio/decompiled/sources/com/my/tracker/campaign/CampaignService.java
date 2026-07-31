package com.my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.my.tracker.obfuscated.m;
import com.my.tracker.obfuscated.p0;
import com.my.tracker.obfuscated.x2;

/* loaded from: classes11.dex */
public final class CampaignService extends Service {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        p0.a(str, this, runnable);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        x2.a("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        x2.a("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        final Runnable runnable = new Runnable() { // from class: com.my.tracker.campaign.CampaignService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CampaignService.this.stopSelf();
            }
        };
        if (intent != null) {
            final String stringExtra = intent.getStringExtra(Constants.REFERRER);
            if (!TextUtils.isEmpty(stringExtra)) {
                m.a(new Runnable() { // from class: com.my.tracker.campaign.CampaignService$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CampaignService.this.a(stringExtra, runnable);
                    }
                });
                return super.onStartCommand(null, i, i2);
            }
        }
        m.a(runnable);
        return 2;
    }
}
