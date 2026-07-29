package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import o.D0;
import o.InterfaceC2081vI;
import o.TR;
import o.UR;
import o.VR;
import o.WR;
import o.WindowManagerC1536n10;
import o.XR;

@Keep
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final D0 accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private UR rootView;
    private boolean startFocused;
    private final XR state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, InterfaceC2081vI interfaceC2081vI, D0 d0, int i, View.OnFocusChangeListener onFocusChangeListener) {
        super(new VR(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = d0;
        this.viewId = i;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new XR();
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public XR detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public InterfaceC2081vI getView() {
        this.state.getClass();
        return null;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        XR xr = this.state;
        if (xr.b == null) {
            xr.b = new TR(getContext());
        }
        if (this.state.a == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            XR xr2 = this.state;
            xr2.a = new WindowManagerC1536n10(windowManager, xr2.b);
        }
        this.container = new FrameLayout(getContext());
        new WR(getContext(), this.state.a, this.outerContext);
        this.state.getClass();
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, D0 d0, XR xr, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(new VR(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = d0;
        this.state = xr;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z;
    }
}
