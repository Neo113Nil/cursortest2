package yads;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* loaded from: classes5.dex */
public final class m01 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.message();
        consoleMessage.sourceId();
        consoleMessage.lineNumber();
        boolean z = ob1.a;
        return true;
    }
}
