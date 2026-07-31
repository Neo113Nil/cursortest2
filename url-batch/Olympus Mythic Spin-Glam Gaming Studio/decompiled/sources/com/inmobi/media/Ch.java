package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import com.inmobi.adquality.models.AdQualityResult;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes10.dex */
public final class Ch implements N0 {
    public final AdQualityResult a;

    public Ch(AdQualityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.a = result;
    }

    @Override // com.inmobi.media.N0
    public final Object a() {
        boolean z;
        try {
            z = true;
            BuildersKt__BuildersKt.runBlocking$default(null, new Bh(this, null), 1, null);
        } catch (SQLiteException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
