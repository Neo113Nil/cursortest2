package sg.bigo.ads.am;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import sg.bigo.ads.am.b;

/* loaded from: classes13.dex */
public final class a implements d {
    public CustomTabsClient a;
    public CustomTabsServiceConnection b;
    public InterfaceC1838a c;
    public CustomTabsCallback d;
    private CustomTabsSession e;

    /* renamed from: sg.bigo.ads.am.a$a, reason: collision with other inner class name */
    public interface InterfaceC1838a {
        void c();

        void d();
    }

    public interface b {
        void a(Context context, b.a aVar);

        void a(b.a aVar);
    }

    public final CustomTabsSession a() {
        CustomTabsSession newSession;
        CustomTabsClient customTabsClient = this.a;
        if (customTabsClient != null) {
            newSession = this.e == null ? customTabsClient.newSession(new CustomTabsCallback() { // from class: sg.bigo.ads.am.a.1
                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void extraCallback(String str, Bundle bundle) {
                    super.extraCallback(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onMessageChannelReady(Bundle bundle) {
                    super.onMessageChannelReady(bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onNavigationEvent(int i, @Nullable Bundle bundle) {
                    super.onNavigationEvent(i, bundle);
                    CustomTabsCallback customTabsCallback = a.this.d;
                    if (customTabsCallback != null) {
                        customTabsCallback.onNavigationEvent(i, bundle);
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onPostMessage(String str, Bundle bundle) {
                    super.onPostMessage(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
                    super.onRelationshipValidationResult(i, uri, z, bundle);
                }
            }) : null;
            return this.e;
        }
        this.e = newSession;
        return this.e;
    }

    @Override // sg.bigo.ads.am.d
    public final void a(CustomTabsClient customTabsClient) {
        this.a = customTabsClient;
        customTabsClient.warmup(0L);
        InterfaceC1838a interfaceC1838a = this.c;
        if (interfaceC1838a != null) {
            interfaceC1838a.c();
        }
    }

    @Override // sg.bigo.ads.am.d
    public final void b() {
        this.a = null;
        this.e = null;
        InterfaceC1838a interfaceC1838a = this.c;
        if (interfaceC1838a != null) {
            interfaceC1838a.d();
        }
    }
}
