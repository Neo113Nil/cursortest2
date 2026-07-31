package com.yandex.mobile.ads.core.initializer;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import yads.nt3;
import yads.yg;
import yads.zg;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/mobile/ads/core/initializer/YandexAdsInitializeProvider;", "Landroid/content/ContentProvider;", "Lyads/zg;", "appStartupInitializer", "<init>", "(Lyads/zg;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YandexAdsInitializeProvider extends ContentProvider {
    private final zg a;

    /* JADX WARN: Multi-variable type inference failed */
    public YandexAdsInitializeProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(this.a.a, null, null, new yg(context, null, new nt3(context)), 3, null);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public /* synthetic */ YandexAdsInitializeProvider(zg zgVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new zg() : zgVar);
    }

    public YandexAdsInitializeProvider(@NotNull zg zgVar) {
        this.a = zgVar;
    }
}
