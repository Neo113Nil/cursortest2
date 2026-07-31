package com.smaato.sdk.ng.utils;

import android.content.Context;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.utils.ProxyUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AtomManager {
    public static final String AD_FORMAT = "Ad format";
    public static final String AD_SESSION_DATA = "Ad_Session_Data";
    public static final String ATOM_CLASS_NAME = "com.verve.atom.sdk.Atom";
    public static final String ATOM_GET_CALCULATED_COHORTS_METHOD_NAME = "getCalculatedCohorts";
    public static final String ATOM_GET_ID_METHOD_NAME = "id";
    public static final String ATOM_GET_JS_DATA_METHOD_NAME = "getAtomJSData";
    public static final String ATOM_INIT_LISTENER_CLASS_NAME = "com.verve.atom.sdk.Atom$AtomInitialisationListener";
    public static final String ATOM_IS_CONFIG_FETCHED_METHOD_NAME = "isConfigurationFetchSuccessful";
    public static final String ATOM_IS_DISABLED_METHOD_NAME = "isAtomDisabled";
    public static final String ATOM_NOT_FOUND_MESSAGE = "Atom not found";
    public static final String ATOM_ON_INITIALISED_METHOD_NAME = "onInitialised";
    public static final String ATOM_ON_STOPPED_METHOD_NAME = "onStopped";
    public static final String ATOM_PACKAGE_NAME = "com.verve.atom.sdk";
    public static final String ATOM_SET_AD_SESSION_DATA_METHOD_NAME = "sendAdSessionData";
    public static final String ATOM_SET_JS_DATA_METHOD_NAME = "setAtomJSData";
    public static final String ATOM_START_METHOD_NAME = "start";
    public static final String ATOM_STOP_LISTENER_CLASS_NAME = "com.verve.atom.sdk.Atom$AtomStopListener";
    public static final String ATOM_STOP_METHOD_NAME = "stop";
    public static final String BID_PRICE = "Bid price";
    public static final String CAMPAIGN_ID = "campaign_id";
    public static final String CREATIVE_ID = "creative_id";
    public static final String RENDERING_STATUS = "Rendering_status";
    public static final String RENDERING_SUCCESS = "rendering success";
    public static final String SURVEY_DATA_KEY = "SurveyData";
    public static final String SURVEY_HTML_KEY = "SurveyHtml";
    public static final String VIEWABILITY = "Viewability";
    private static final String a = "AtomManager";
    private static AtomManager b;

    AtomManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!"onStopped".equals(method.getName()) || objArr.length != 1) {
            return null;
        }
        if (!(objArr[0] instanceof Boolean)) {
            return null;
        }
        NextGen.setAtomStarted(Boolean.valueOf(!((Boolean) r0).booleanValue()));
        return null;
    }

    public static List<Object> getAtomCohorts() {
        return getInstance().getAtomCohortsInstance();
    }

    public static AtomManager getInstance() {
        if (b == null) {
            b = new AtomManager();
        }
        return b;
    }

    public static void initializeAtom(Context context) {
        getInstance().initializeAtomInstance(context);
    }

    public static boolean isAtomSdkConfigurationFetchSuccessful() {
        return getInstance().isAtomSdkConfigurationFetchSuccessfulInstance();
    }

    public static boolean isAtomSdkDisabled() {
        return getInstance().isAtomSdkDisabledInstance();
    }

    public static void setAdSessionData(HashMap<String, Object> hashMap) {
        getInstance().setAdSessionDataInstance(hashMap);
    }

    public static void stopAtom() {
        getInstance().stopAtomInstance();
    }

    protected Class<?> a(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public List<Object> getAtomCohortsInstance() {
        try {
            Object a2 = a(a(a("com.verve.atom.sdk.Atom"), "getCalculatedCohorts", new Class[0]), (Object) null, new Object[0]);
            if (a2 instanceof List) {
                return (List) a2;
            }
        } catch (Exception unused) {
            Logger.d(a, "Atom not found");
        }
        return new ArrayList();
    }

    public HashMap<String, String> getAtomJSData() {
        try {
            Object a2 = a(a(a("com.verve.atom.sdk.Atom"), "getAtomJSData", new Class[0]), (Object) null, new Object[0]);
            if (a2 instanceof HashMap) {
                return (HashMap) a2;
            }
            return null;
        } catch (Exception unused) {
            Logger.d(a, "Atom not found");
            return null;
        }
    }

    public void initializeAtomInstance(Context context) {
        String packageName = context.getPackageName();
        try {
            Class<?> a2 = a("com.verve.atom.sdk.Atom");
            Class<?> a3 = a("com.verve.atom.sdk.Atom$AtomInitialisationListener");
            a(a(a2, "start", Context.class, String.class, Boolean.TYPE, a3), (Object) null, context, packageName, Boolean.valueOf(NextGen.isTestMode()), a(a2.getClassLoader(), a3, new ProxyUtils.ProxyMethodHandler() { // from class: com.smaato.sdk.ng.utils.AtomManager$$ExternalSyntheticLambda1
                @Override // com.smaato.sdk.ng.utils.ProxyUtils.ProxyMethodHandler
                public final Object handleMethod(Object obj, Method method, Object[] objArr) {
                    Object a4;
                    a4 = AtomManager.a(obj, method, objArr);
                    return a4;
                }
            }));
        } catch (Exception unused) {
            NextGen.setAtomStarted(Boolean.FALSE);
            Logger.d(a, "Atom not found");
        }
    }

    public boolean isAtomSdkConfigurationFetchSuccessfulInstance() {
        try {
            Object a2 = a(a(a("com.verve.atom.sdk.Atom"), "isConfigurationFetchSuccessful", new Class[0]), (Object) null, new Object[0]);
            if (a2 instanceof Boolean) {
                return ((Boolean) a2).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            Logger.d(a, "Atom not found");
            return false;
        }
    }

    public boolean isAtomSdkDisabledInstance() {
        try {
            Object a2 = a(a(a("com.verve.atom.sdk.Atom"), "isAtomDisabled", new Class[0]), (Object) null, new Object[0]);
            if (a2 instanceof Boolean) {
                return ((Boolean) a2).booleanValue();
            }
            return true;
        } catch (Exception unused) {
            Logger.d(a, "Atom not found");
            return true;
        }
    }

    public void putAtomJSData(String str, String str2) {
        HashMap<String, String> atomJSData = getAtomJSData();
        if (atomJSData != null) {
            atomJSData.put(str, str2);
        }
    }

    public void setAdSessionDataInstance(HashMap<String, Object> hashMap) {
        try {
            a(a(a("com.verve.atom.sdk.Atom"), "sendAdSessionData", Map.class), (Object) null, hashMap);
        } catch (Exception e) {
            Logger.d(a, "Atom not found " + e);
        }
    }

    public void stopAtomInstance() {
        try {
            Class<?> a2 = a("com.verve.atom.sdk.Atom");
            Class<?> a3 = a("com.verve.atom.sdk.Atom$AtomStopListener");
            a(a(a2, "stop", a3), (Object) null, a(a2.getClassLoader(), a3, new ProxyUtils.ProxyMethodHandler() { // from class: com.smaato.sdk.ng.utils.AtomManager$$ExternalSyntheticLambda0
                @Override // com.smaato.sdk.ng.utils.ProxyUtils.ProxyMethodHandler
                public final Object handleMethod(Object obj, Method method, Object[] objArr) {
                    Object b2;
                    b2 = AtomManager.b(obj, method, objArr);
                    return b2;
                }
            }));
        } catch (Exception unused) {
            Logger.d(a, "Atom not found");
        }
    }

    protected Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        return cls.getDeclaredMethod(str, clsArr);
    }

    protected Object a(Method method, Object obj, Object... objArr) throws Exception {
        return method.invoke(obj, objArr);
    }

    protected Object a(ClassLoader classLoader, Class<?> cls, ProxyUtils.ProxyMethodHandler proxyMethodHandler) {
        return ProxyUtils.createProxy(classLoader, cls, proxyMethodHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object a(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!"onInitialised".equals(method.getName()) || objArr.length != 1) {
            return null;
        }
        Object obj2 = objArr[0];
        if (!(obj2 instanceof Boolean)) {
            return null;
        }
        NextGen.setAtomStarted((Boolean) obj2);
        return null;
    }
}
