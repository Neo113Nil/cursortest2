package o;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: o.Qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0420Qc extends Activity implements InterfaceC0365Nz, InterfaceC0130Ex {
    private final GR extraDataMap = new GR(0);
    private final C0417Pz lifecycleRegistry = new C0417Pz(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0048Bt.n(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView, "window.decorView");
        if (AbstractC1305jX.p(decorView, keyEvent)) {
            return true;
        }
        return AbstractC1305jX.q(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC0048Bt.n(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0048Bt.m(decorView, "window.decorView");
        if (AbstractC1305jX.p(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @InterfaceC1315jh
    public <T extends AbstractC0239Jc> T getExtraData(Class<T> cls) {
        AbstractC0048Bt.n(cls, "extraDataClass");
        if (this.extraDataMap.get(cls) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // o.InterfaceC0365Nz
    public AbstractC0106Dz getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = CN.i;
        AN.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0048Bt.n(bundle, "outState");
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(bundle);
    }

    @InterfaceC1315jh
    public void putExtraData(AbstractC0239Jc abstractC0239Jc) {
        AbstractC0048Bt.n(abstractC0239Jc, "extraData");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation")) {
                        break;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture")) {
                        break;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        break;
                    }
                    break;
            }
        }
        return !z;
    }

    @Override // o.InterfaceC0130Ex
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0048Bt.n(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
