package com.my.target.common;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.mi;
import com.my.target.o0;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public final class MyTargetContentProvider extends ContentProvider {
    private boolean a = true;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        try {
            Context context = getContext();
            Integer num = (Integer) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.autoInitMode");
            if (num == null || num.intValue() != 0) {
                mi.c("Start autoinitialization");
                MyTargetManager.initSdk(context);
            }
        } catch (Throwable th) {
            mi.c("Autoinitialization failed - " + th.getMessage());
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo == null) {
            return;
        }
        if ("com.my.target.mytargetcontentprovider".equals(providerInfo.authority)) {
            mi.c("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
            this.a = false;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (!this.a) {
            return false;
        }
        o0.b(new Runnable() { // from class: com.my.target.common.MyTargetContentProvider$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MyTargetContentProvider.this.a();
            }
        });
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
