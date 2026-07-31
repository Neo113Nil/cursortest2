package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.adquality.models.AdQualityResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class I0 {
    public final C4308r9 a;
    public WeakReference b;

    public I0(C4308r9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AdQualityResult adQualityResult, ContinuationImpl continuationImpl) {
        H0 h0;
        int i;
        WeakReference weakReference;
        A0 a0;
        if (continuationImpl instanceof H0) {
            h0 = (H0) continuationImpl;
            int i2 = h0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0.c = i2 - Integer.MIN_VALUE;
                Object obj = h0.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = h0.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    Intrinsics.checkNotNullParameter(adQualityResult, "<this>");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("image_location", adQualityResult.getImageLocation());
                    String sdkModelResult = adQualityResult.getSdkModelResult();
                    if (sdkModelResult == null) {
                        sdkModelResult = "";
                    }
                    contentValues.put("sdk_model_result", sdkModelResult);
                    contentValues.put("beacon_url", adQualityResult.getBeaconUrl());
                    contentValues.put("extras", adQualityResult.getExtras());
                    h0.c = 1;
                    if (c4308r9.a("ad_quality_db", contentValues, 4, h0) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                weakReference = this.b;
                if (weakReference != null && (a0 = (A0) weakReference.get()) != null && a0.a.b.get()) {
                    a0.a.b.set(false);
                    a0.a.a();
                }
                return Unit.INSTANCE;
            }
        }
        h0 = new H0(this, continuationImpl);
        Object obj2 = h0.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = h0.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            a0.a.b.set(false);
            a0.a.a();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        G0 g0;
        int i;
        if (continuationImpl instanceof G0) {
            g0 = (G0) continuationImpl;
            int i2 = g0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0.c = i2 - Integer.MIN_VALUE;
                Object obj = g0.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = g0.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4308r9 c4308r9 = this.a;
                    g0.c = 1;
                    c4308r9.getClass();
                    obj = c4308r9.a(new C4203n9(c4308r9, "SELECT * FROM ad_quality_db", null), g0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable<ContentValues> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ContentValues contentValues : iterable) {
                    Intrinsics.checkNotNullParameter(contentValues, "<this>");
                    String asString = contentValues.getAsString("image_location");
                    Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                    String asString2 = contentValues.getAsString("sdk_model_result");
                    String asString3 = contentValues.getAsString("beacon_url");
                    Intrinsics.checkNotNullExpressionValue(asString3, "getAsString(...)");
                    arrayList.add(new AdQualityResult(asString, asString2, asString3, contentValues.getAsString("extras")));
                }
                return arrayList;
            }
        }
        g0 = new G0(this, continuationImpl);
        Object obj2 = g0.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = g0.c;
        if (i != 0) {
        }
        Iterable<ContentValues> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r8.hasNext()) {
        }
        return arrayList2;
    }
}
