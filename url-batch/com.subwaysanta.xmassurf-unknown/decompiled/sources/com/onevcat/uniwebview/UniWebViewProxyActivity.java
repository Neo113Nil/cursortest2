package com.onevcat.uniwebview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onevcat.uniwebview.internal.obfuscated.A;
import com.onevcat.uniwebview.internal.obfuscated.B;
import com.onevcat.uniwebview.internal.obfuscated.B2;
import com.onevcat.uniwebview.internal.obfuscated.C0058o;
import com.onevcat.uniwebview.internal.obfuscated.EnumC0054n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/onevcat/uniwebview/UniWebViewProxyActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/onevcat/uniwebview/internal/obfuscated/B;", "handler", "Lcom/onevcat/uniwebview/internal/obfuscated/B;", "Companion", "com/onevcat/uniwebview/internal/obfuscated/B2", "uniwebview_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public class UniWebViewProxyActivity extends Activity {
    public static final B2 Companion = new B2();
    public static final String HANDLER_ID = "com.uniwebview.UniWebViewProxyActivity.handlerId";
    private B handler;

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        B b = this.handler;
        if (b != null) {
            b.a(this, requestCode, resultCode, data);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        B b;
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(HANDLER_ID);
        B.a.getClass();
        LinkedHashMap linkedHashMap = A.b;
        B b2 = (B) linkedHashMap.get(stringExtra);
        if (b2 != null) {
            this.handler = b2;
            b2.a(this);
            return;
        }
        C0058o c0058o = C0058o.b;
        String message = "No handler found for this activity: " + this + ". Usually this means a wrong implementation of the browser that does not start the callback URI intent in the desired way. Trying to recover by force dismiss and go back to the normal flow...If you know the browser you are using when seeing this, please report back to the developer.";
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.CRITICAL, message);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                b = null;
                break;
            } else {
                b = (B) ((Map.Entry) it.next()).getValue();
                if (b != null) {
                    break;
                }
            }
        }
        if (b != null) {
            C0058o c0058o2 = C0058o.b;
            String message2 = "handler is null for " + this + ". Forwarding intent to the first handler: " + b;
            c0058o2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            c0058o2.a(EnumC0054n.DEBUG, message2);
            b.a(getIntent());
            b.a();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        B b = this.handler;
        if (b != null) {
            b.b();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        B b = this.handler;
        if (b != null) {
            b.a(intent);
        }
    }
}
