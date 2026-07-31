package com.ogury.core.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(Context context) {
        a aVar;
        a aVar2;
        a aVar3;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        boolean z = true;
        try {
        } catch (Exception e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.CORE, e);
        } finally {
        }
        if (context.bindService(intent, bVar, 1)) {
            if (bVar.b) {
                throw new IllegalStateException("Check failed.");
            }
            bVar.b = true;
            Object take = bVar.a.take();
            Intrinsics.checkNotNull(take, "null cannot be cast to non-null type android.os.IBinder");
            d dVar = new d((IBinder) take, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            aVar = new a(dVar.a(), dVar.b());
            if (aVar == null) {
                return aVar;
            }
            bVar = new b();
            Intent intent2 = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent2.setPackage("com.huawei.hwid");
            try {
            } catch (Exception e2) {
                Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.CORE, e2);
            } finally {
            }
            if (context.bindService(intent2, bVar, 1)) {
                if (bVar.b) {
                    throw new IllegalStateException("Check failed.");
                }
                bVar.b = true;
                Object take2 = bVar.a.take();
                Intrinsics.checkNotNull(take2, "null cannot be cast to non-null type android.os.IBinder");
                d dVar2 = new d((IBinder) take2, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                aVar2 = new a(dVar2.a(), dVar2.b());
                if (aVar2 == null) {
                    return aVar2;
                }
                ContentResolver contentResolver = context.getContentResolver();
                try {
                    string = Settings.Secure.getString(contentResolver, "advertising_id");
                    if (Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0) {
                        z = false;
                    }
                } catch (Exception e3) {
                    Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.CORE, e3);
                    aVar3 = null;
                }
                if (string == null) {
                    throw new IllegalStateException("Amazon Fire TV Ad Id is null");
                }
                aVar3 = new a(string, z);
                if (aVar3 != null) {
                    return aVar3;
                }
                return null;
            }
            aVar2 = null;
            if (aVar2 == null) {
            }
        }
        aVar = null;
        if (aVar == null) {
        }
    }
}
