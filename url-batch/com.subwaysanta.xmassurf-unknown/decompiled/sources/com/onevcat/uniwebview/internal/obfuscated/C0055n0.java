package com.onevcat.uniwebview.internal.obfuscated;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Environment;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.onevcat.uniwebview.R;
import java.io.File;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055n0 extends BroadcastReceiver {
    public final /* synthetic */ C0059o0 a;

    public C0055n0(C0059o0 c0059o0) {
        this.a = c0059o0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Cursor query;
        String valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        C0038j c0038j = (C0038j) this.a.g.get(Long.valueOf(longExtra));
        if (c0038j != null) {
            String a = c0038j.a();
            String str = c0038j.b;
            DownloadManager.Query query2 = new DownloadManager.Query();
            query2.setFilterById(longExtra);
            Object systemService = context.getSystemService("download");
            String str2 = "";
            String str3 = "-1";
            if ((systemService instanceof DownloadManager) && (query = ((DownloadManager) systemService).query(query2)) != null) {
                C0059o0 c0059o0 = this.a;
                try {
                    if (query.moveToFirst()) {
                        if (query.getInt(query.getColumnIndex(NotificationCompat.CATEGORY_STATUS)) == 8) {
                            Toast toast = c0059o0.f;
                            if (toast != null) {
                                toast.cancel();
                            }
                            Toast makeText = Toast.makeText(c0059o0.a, context.getResources().getString(R.string.DOWNLOAD_COMPLETED), 0);
                            c0059o0.f = makeText;
                            if (makeText != null) {
                                makeText.show();
                            }
                            str2 = new File(c0059o0.a.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), str).getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(str2, "file.absolutePath");
                            valueOf = "0";
                        } else {
                            valueOf = String.valueOf(query.getInt(query.getColumnIndex("reason")));
                        }
                        str3 = valueOf;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(query, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(query, th);
                        throw th2;
                    }
                }
            }
            if (c0038j.c) {
                D2 d2 = new D2(a, str3, str2, null);
                C0059o0 c0059o02 = this.a;
                c0059o02.c.a(c0059o02.b, P2.FileDownloadFinished, d2);
            }
            this.a.g.remove(Long.valueOf(longExtra));
        }
    }
}
