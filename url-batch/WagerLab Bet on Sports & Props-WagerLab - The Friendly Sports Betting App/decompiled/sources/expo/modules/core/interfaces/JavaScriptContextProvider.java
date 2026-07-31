package expo.modules.core.interfaces;

import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;

/* loaded from: classes7.dex */
public interface JavaScriptContextProvider {
    CallInvokerHolderImpl getJSCallInvokerHolder();

    long getJavaScriptContextRef();
}
