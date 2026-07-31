package com.ogury.ad.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.webkit.DownloadListener;
import android.widget.Toast;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public final class g8 implements DownloadListener {
    public final Context a;

    public g8(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long j) {
        String uuid;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(contentDisposition, "contentDisposition");
        Intrinsics.checkNotNullParameter(mimetype, "mimetype");
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter("android.permission.WRITE_EXTERNAL_STORAGE", "permission");
        if (context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "Unable to download file. Permission WRITE_EXTERNAL_STORAGE not declared");
            return;
        }
        Uri parse = Uri.parse(url);
        String path = parse.getPath();
        List<String> split = path != null ? new Regex("/").split(path, 0) : null;
        if (split == null || !(!split.isEmpty())) {
            uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        } else {
            uuid = (String) CollectionsKt.last((List) split);
        }
        DownloadManager.Request request = new DownloadManager.Request(parse);
        request.setTitle(uuid);
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "download");
        Object systemService = this.a.getSystemService("download");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        ((DownloadManager) systemService).enqueue(request);
        Context context2 = this.a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("Start downloading %s", Arrays.copyOf(new Object[]{uuid}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        Toast.makeText(context2, format, 0).show();
    }
}
