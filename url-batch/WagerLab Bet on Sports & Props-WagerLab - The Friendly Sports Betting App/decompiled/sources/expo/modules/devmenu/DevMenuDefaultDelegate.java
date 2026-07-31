package expo.modules.devmenu;

import android.os.Bundle;
import expo.interfaces.devmenu.DevMenuDelegateInterface;
import expo.interfaces.devmenu.ReactHostWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevMenuDefaultDelegate.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lexpo/modules/devmenu/DevMenuDefaultDelegate;", "Lexpo/interfaces/devmenu/DevMenuDelegateInterface;", "delegateHost", "Lexpo/interfaces/devmenu/ReactHostWrapper;", "<init>", "(Lexpo/interfaces/devmenu/ReactHostWrapper;)V", "appInfo", "Landroid/os/Bundle;", "reactHost", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuDefaultDelegate implements DevMenuDelegateInterface {
    public static final int $stable = 8;
    private final ReactHostWrapper delegateHost;

    @Override // expo.interfaces.devmenu.DevMenuDelegateInterface
    public Bundle appInfo() {
        return null;
    }

    public DevMenuDefaultDelegate(ReactHostWrapper delegateHost) {
        Intrinsics.checkNotNullParameter(delegateHost, "delegateHost");
        this.delegateHost = delegateHost;
    }

    @Override // expo.interfaces.devmenu.DevMenuDelegateInterface
    public boolean supportsDevelopment() {
        return DevMenuDelegateInterface.DefaultImpls.supportsDevelopment(this);
    }

    @Override // expo.interfaces.devmenu.DevMenuDelegateInterface
    /* renamed from: reactHost, reason: from getter */
    public ReactHostWrapper getDelegateHost() {
        return this.delegateHost;
    }
}
