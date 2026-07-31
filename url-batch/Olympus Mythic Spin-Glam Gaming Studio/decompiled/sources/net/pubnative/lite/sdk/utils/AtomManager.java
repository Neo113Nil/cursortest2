package net.pubnative.lite.sdk.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.ProxyUtils;

/* loaded from: classes14.dex */
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
    private static final String TAG = "AtomManager";
    public static final String VIEWABILITY = "Viewability";
    private static AtomManager instance;

    AtomManager() {
    }

    public static List<Object> getAtomCohorts() {
        return getInstance().getAtomCohortsInstance();
    }

    public static AtomManager getInstance() {
        if (instance == null) {
            instance = new AtomManager();
        }
        return instance;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$initializeAtomInstance$0(Object obj, Method method, Object[] objArr) {
        if (!"onInitialised".equals(method.getName()) || objArr.length != 1) {
            return null;
        }
        Object obj2 = objArr[0];
        if (!(obj2 instanceof Boolean)) {
            return null;
        }
        HyBid.setAtomStarted((Boolean) obj2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$stopAtomInstance$1(Object obj, Method method, Object[] objArr) {
        if (!"onStopped".equals(method.getName()) || objArr.length != 1) {
            return null;
        }
        if (!(objArr[0] instanceof Boolean)) {
            return null;
        }
        HyBid.setAtomStarted(Boolean.valueOf(!((Boolean) r0).booleanValue()));
        return null;
    }

    public static void setAdSessionData(HashMap<String, Object> hashMap) {
        getInstance().setAdSessionDataInstance(hashMap);
    }

    public static void stopAtom() {
        getInstance().stopAtomInstance();
    }

    protected Object createProxy(ClassLoader classLoader, Class<?> cls, ProxyUtils.ProxyMethodHandler proxyMethodHandler) {
        return ProxyUtils.createProxy(classLoader, cls, proxyMethodHandler);
    }

    protected Class<?> findClass(String str) {
        return Class.forName(str);
    }

    public List<Object> getAtomCohortsInstance() {
        try {
            Object invokeMethod = invokeMethod(getDeclaredMethod(findClass("com.verve.atom.sdk.Atom"), "getCalculatedCohorts", new Class[0]), null, new Object[0]);
            if (invokeMethod instanceof List) {
                return (List) invokeMethod;
            }
        } catch (Exception unused) {
            Logger.d(TAG, "Atom not found");
        }
        return new ArrayList();
    }

    public HashMap<String, String> getAtomJSData() {
        try {
            Object invokeMethod = invokeMethod(getDeclaredMethod(findClass("com.verve.atom.sdk.Atom"), "getAtomJSData", new Class[0]), null, new Object[0]);
            if (invokeMethod instanceof HashMap) {
                return (HashMap) invokeMethod;
            }
            return null;
        } catch (Exception unused) {
            Logger.d(TAG, "Atom not found");
            return null;
        }
    }

    protected Method getDeclaredMethod(Class<?> cls, String str, Class<?>... clsArr) {
        return cls.getDeclaredMethod(str, clsArr);
    }

    public void initializeAtomInstance(Context context) {
        String packageName = context.getPackageName();
        try {
            Class<?> findClass = findClass("com.verve.atom.sdk.Atom");
            Class<?> findClass2 = findClass("com.verve.atom.sdk.Atom$AtomInitialisationListener");
            invokeMethod(getDeclaredMethod(findClass, "start", Context.class, String.class, Boolean.TYPE, findClass2), null, context, packageName, Boolean.valueOf(HyBid.isTestMode()), createProxy(findClass.getClassLoader(), findClass2, new ProxyUtils.ProxyMethodHandler() { // from class: net.pubnative.lite.sdk.utils.AtomManager$$ExternalSyntheticLambda0
                @Override // net.pubnative.lite.sdk.utils.ProxyUtils.ProxyMethodHandler
                public final Object handleMethod(Object obj, Method method, Object[] objArr) {
                    Object lambda$initializeAtomInstance$0;
                    lambda$initializeAtomInstance$0 = AtomManager.lambda$initializeAtomInstance$0(obj, method, objArr);
                    return lambda$initializeAtomInstance$0;
                }
            }));
        } catch (Exception unused) {
            HyBid.setAtomStarted(Boolean.FALSE);
            Logger.d(TAG, "Atom not found");
        }
    }

    protected Object invokeMethod(Method method, Object obj, Object... objArr) {
        return method.invoke(obj, objArr);
    }

    public boolean isAtomSdkConfigurationFetchSuccessfulInstance() {
        try {
            Object invokeMethod = invokeMethod(getDeclaredMethod(findClass("com.verve.atom.sdk.Atom"), "isConfigurationFetchSuccessful", new Class[0]), null, new Object[0]);
            if (invokeMethod instanceof Boolean) {
                return ((Boolean) invokeMethod).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            Logger.d(TAG, "Atom not found");
            return false;
        }
    }

    public boolean isAtomSdkDisabledInstance() {
        try {
            Object invokeMethod = invokeMethod(getDeclaredMethod(findClass("com.verve.atom.sdk.Atom"), "isAtomDisabled", new Class[0]), null, new Object[0]);
            if (invokeMethod instanceof Boolean) {
                return ((Boolean) invokeMethod).booleanValue();
            }
            return true;
        } catch (Exception unused) {
            Logger.d(TAG, "Atom not found");
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
            invokeMethod(getDeclaredMethod(findClass("com.verve.atom.sdk.Atom"), "sendAdSessionData", Map.class), null, hashMap);
        } catch (Exception e) {
            Logger.d(TAG, "Atom not found " + e);
        }
    }

    public void stopAtomInstance() {
        try {
            Class<?> findClass = findClass("com.verve.atom.sdk.Atom");
            Class<?> findClass2 = findClass("com.verve.atom.sdk.Atom$AtomStopListener");
            invokeMethod(getDeclaredMethod(findClass, "stop", findClass2), null, createProxy(findClass.getClassLoader(), findClass2, new ProxyUtils.ProxyMethodHandler() { // from class: net.pubnative.lite.sdk.utils.AtomManager$$ExternalSyntheticLambda1
                @Override // net.pubnative.lite.sdk.utils.ProxyUtils.ProxyMethodHandler
                public final Object handleMethod(Object obj, Method method, Object[] objArr) {
                    Object lambda$stopAtomInstance$1;
                    lambda$stopAtomInstance$1 = AtomManager.lambda$stopAtomInstance$1(obj, method, objArr);
                    return lambda$stopAtomInstance$1;
                }
            }));
        } catch (Exception unused) {
            Logger.d(TAG, "Atom not found");
        }
    }
}
