package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.EditText;
import android.widget.Toast;
import com.onevcat.uniwebview.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059o0 {
    public final Activity a;
    public final String b;
    public final O2 c;
    public final C0083w d;
    public boolean e;
    public Toast f;
    public final HashMap g;
    public final C0055n0 h;

    public C0059o0(Activity activity, String name, O2 messageSender, C0083w customizeHeaders) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        Intrinsics.checkNotNullParameter(customizeHeaders, "customizeHeaders");
        this.a = activity;
        this.b = name;
        this.c = messageSender;
        this.d = customizeHeaders;
        this.e = true;
        this.g = new HashMap();
        this.h = new C0055n0(this);
    }

    public final void a(String url, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url, "url");
        C0038j c0038j = null;
        if (StringsKt.startsWith$default(url, "data:", false, 2, (Object) null)) {
            try {
                C0062p a = AbstractC0051m0.a(url);
                if (a != null) {
                    C0042k c0042k = new C0042k(url, a.b);
                    if (str2 == null && (str2 = a.a) == null) {
                        str2 = "";
                    }
                    String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
                    c0038j = new C0038j(c0042k, extensionFromMimeType == null ? AbstractC0071s.a(StringCompanionObject.INSTANCE) : AbstractC0071s.a(StringCompanionObject.INSTANCE) + '.' + extensionFromMimeType, z);
                }
            } catch (Exception e) {
                C0058o c0058o = C0058o.b;
                String message = "Failed to parse data url: " + url + ". Error: " + e;
                c0058o.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                c0058o.a(EnumC0054n.CRITICAL, message);
            }
        } else if (URLUtil.isValidUrl(url)) {
            String fileName = URLUtil.guessFileName(url, str, str2);
            C0046l c0046l = new C0046l(url);
            Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
            c0038j = new C0038j(c0046l, fileName, z);
        }
        if (c0038j != null) {
            a(c0038j);
        } else {
            Activity activity = this.a;
            Toast.makeText(activity, activity.getResources().getString(R.string.INVALID_URL), 1).show();
        }
    }

    public final void b(C0038j c0038j) {
        AbstractC0050m abstractC0050m = c0038j.a;
        if (!(abstractC0050m instanceof C0046l)) {
            if (abstractC0050m instanceof C0042k) {
                C0042k c0042k = (C0042k) abstractC0050m;
                String a = c0038j.a();
                if (c0038j.c) {
                    this.c.a(this.b, P2.FileDownloadStarted, new D2(a, "0", c0038j.b, null));
                }
                try {
                    File file = new File(this.a.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), c0038j.b);
                    FilesKt.writeBytes(file, c0042k.b);
                    if (c0038j.c) {
                        String absolutePath = file.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
                        this.c.a(this.b, P2.FileDownloadFinished, new D2(a, "0", absolutePath, null));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    C0058o c0058o = C0058o.b;
                    String message = "Failed to download base64 data: " + a + ". Error: " + e;
                    c0058o.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    c0058o.a(EnumC0054n.CRITICAL, message);
                    return;
                }
            }
            return;
        }
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(c0038j.a()));
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setDescription(c0038j.b);
        request.setTitle(c0038j.b);
        request.setDestinationInExternalFilesDir(this.a, Environment.DIRECTORY_DOWNLOADS, c0038j.b);
        request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(c0038j.a()));
        for (Map.Entry entry : ((Map) this.d.invoke()).entrySet()) {
            request.addRequestHeader((String) entry.getKey(), (String) entry.getValue());
        }
        Object systemService = this.a.getSystemService("download");
        if (systemService instanceof DownloadManager) {
            this.g.put(Long.valueOf(((DownloadManager) systemService).enqueue(request)), c0038j);
            Toast toast = this.f;
            if (toast != null) {
                toast.cancel();
            }
            Activity activity = this.a;
            Toast makeText = Toast.makeText(activity, activity.getResources().getString(R.string.DOWNLOAD_STARTED), 1);
            this.f = makeText;
            if (makeText != null) {
                makeText.show();
            }
            if (c0038j.c) {
                this.c.a(this.b, P2.FileDownloadStarted, new D2(c0038j.a(), "0", c0038j.b, null));
            }
        }
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.a.registerReceiver(this.h, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        } else {
            this.a.registerReceiver(this.h, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
    }

    public final void a(final C0038j c0038j) {
        if (!this.e) {
            b(c0038j);
            return;
        }
        final EditText editText = new EditText(this.a);
        editText.setSingleLine();
        editText.setText(c0038j.b);
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this.a).setTitle(c0038j.a()).setMessage(this.a.getResources().getString(R.string.DOWNLOAD_DESCRIPTION)).setIcon(android.R.drawable.ic_dialog_info).setCancelable(true);
        Intrinsics.checkNotNullExpressionValue(cancelable, "Builder(activity)\n      …     .setCancelable(true)");
        AbstractC0002a.a(cancelable, editText).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.o0$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C0059o0.a(editText, c0038j, this, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.o0$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C0059o0.a(dialogInterface, i);
            }
        }).create().show();
    }

    public static final void a(EditText input, C0038j task, C0059o0 this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(input, "$input");
        Intrinsics.checkNotNullParameter(task, "$task");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String obj = input.getText().toString();
        dialogInterface.dismiss();
        task.getClass();
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        task.b = obj;
        this$0.b(task);
    }

    public static final void a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
