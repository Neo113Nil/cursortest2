package internal.org.jni_zero;

import internal.J.N;

/* loaded from: classes5.dex */
public abstract class GEN_JNI {
    public static void org_chromium_base_AndroidInfo_fillFields(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, int i, boolean z, Object obj14) {
        N.MYc8mtnY(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, i, z, obj14);
    }

    public static void org_chromium_base_ApkInfo_fillFields(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, boolean z, int i) {
        N.MOh5qbSu(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, z, i);
    }

    public static void org_chromium_base_CommandLine_appendSwitchWithValue(Object obj, Object obj2) {
        N.MUoYiNbY(obj, obj2);
    }

    public static Object org_chromium_base_CommandLine_getSwitchValue(Object obj) {
        return N.MZJ2lrZY(obj);
    }

    public static boolean org_chromium_base_CommandLine_hasSwitch(Object obj) {
        return N.MsCvypjU(obj);
    }

    public static void org_chromium_base_CommandLine_init(Object obj) {
        N.MDkrKi31(obj);
    }

    public static void org_chromium_base_DeviceInfo_fillFields(Object obj, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6) {
        N.MFWeJGQZ(obj, z, z2, z3, z4, i, z5, z6);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyAsyncBeginEvent(Object obj, long j, long j2) {
        N.M_Gv8TwM(obj, j, j2);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyAsyncEndEvent(long j, long j2) {
        N.MrKsqeCD(j, j2);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyBeginEvent(Object obj, long j, int i, long j2) {
        N.MrWG2uUW(obj, j, i, j2);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyEndEvent(Object obj, long j, int i, long j2) {
        N.MmyrhqXB(obj, j, i, j2);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyToplevelBeginEvent(Object obj, long j, int i, long j2) {
        N.M7UXCmoq(obj, j, i, j2);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyToplevelEndEvent(Object obj, long j, int i, long j2) {
        N.MRlw2LEn(obj, j, i, j2);
    }

    public static void org_chromium_base_JavaExceptionReporter_reportJavaException(boolean z, Object obj) {
        N.MLlibBXh(z, obj);
    }

    public static void org_chromium_base_JavaHandlerThread_initializeThread(long j, long j2) {
        N.MJcct7gJ(j, j2);
    }

    public static void org_chromium_base_JavaHandlerThread_onLooperStopped(long j) {
        N.MYwg$x8E(j);
    }

    public static void org_chromium_base_JniCallbackImpl_onResult(boolean z, long j, Object obj) {
        N.Mv1m4r87(z, j, obj);
    }

    public static void org_chromium_base_TraceEvent_addViewDump(int i, int i2, boolean z, boolean z2, Object obj, Object obj2, long j) {
        N.MmnP6i1r(i, i2, z, z2, obj, obj2, j);
    }

    public static void org_chromium_base_TraceEvent_begin(Object obj, Object obj2) {
        N.M9XfPu17(obj, obj2);
    }

    public static void org_chromium_base_TraceEvent_beginToplevel(Object obj) {
        N.M_y76mct(obj);
    }

    public static void org_chromium_base_TraceEvent_end(Object obj, long j) {
        N.Mw73xTww(obj, j);
    }

    public static void org_chromium_base_TraceEvent_endToplevel() {
        N.MLJecZJ9();
    }

    public static void org_chromium_base_TraceEvent_finishAsync(long j) {
        N.MffNhCLU(j);
    }

    public static void org_chromium_base_TraceEvent_initViewHierarchyDump(long j, Object obj) {
        N.Ml5G_GLY(j, obj);
    }

    public static void org_chromium_base_TraceEvent_instant(Object obj, Object obj2) {
        N.ML40H8ed(obj, obj2);
    }

    public static void org_chromium_base_TraceEvent_registerEnabledObserver() {
        N.MFFzPOVw();
    }

    public static long org_chromium_base_TraceEvent_startActivityDump(Object obj, long j) {
        return N.MwX2YEhL(obj, j);
    }

    public static boolean org_chromium_base_TraceEvent_viewHierarchyDumpEnabled() {
        return N.MnfJQqTB();
    }

    public static void org_chromium_base_task_TaskRunnerImpl_destroy(long j) {
        N.MERCiIV8(j);
    }

    public static long org_chromium_base_task_TaskRunnerImpl_init(int i, int i2) {
        return N.M5_IQXaH(i, i2);
    }

    public static void org_chromium_base_task_TaskRunnerImpl_postDelayedTask(long j, long j2, int i) {
        N.MGnQU$47(j, j2, i);
    }

    public static Object org_chromium_net_GURLUtils_getOrigin(Object obj) {
        return N.MpCt7siL(obj);
    }

    public static void org_chromium_net_HttpNegotiateAuthenticator_setResult(long j, int i, Object obj) {
        N.M0s8NeYn(j, i, obj);
    }

    public static boolean org_chromium_net_HttpUtil_isAllowedHeader(Object obj, Object obj2) {
        return N.MorcXgQd(obj, obj2);
    }

    public static void org_chromium_net_NetworkActiveNotifier_notifyOfDefaultNetworkActive(long j) {
        N.MSZPA7qE(j);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionCostChanged(long j, int i) {
        N.Mg0W7eRL(j, i);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionSubtypeChanged(long j, int i) {
        N.MCEqyWQ0(j, i);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(long j, int i, long j2) {
        N.MbPIImnU(j, i, j2);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(long j, long j2, int i) {
        N.MBT1i5cd(j, j2, i);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(long j, long j2) {
        N.MDpuHJTB(j, j2);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(long j, long j2) {
        N.MiJIMrTb(j, j2);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(long j, Object obj) {
        N.MpF$179U(j, obj);
    }

    public static void org_chromium_net_ProxyChangeListener_proxySettingsChanged(long j) {
        N.MCIk73GZ(j);
    }

    public static void org_chromium_net_ProxyChangeListener_proxySettingsChangedTo(long j, Object obj, int i, Object obj2, Object obj3) {
        N.MyoFZt$2(j, obj, i, obj2, obj3);
    }

    public static void org_chromium_net_X509Util_notifyClientCertStoreChanged() {
        N.MJdorYDE();
    }

    public static void org_chromium_net_X509Util_notifyTrustStoreChanged() {
        N.M6C2IQIc();
    }

    public static void org_chromium_net_impl_CompletionOnceCallback_run(long j, int i) {
        N.MGR2x4WJ(j, i);
    }

    public static long org_chromium_net_impl_CronetBidirectionalStream_createBidirectionalStream(Object obj, long j, boolean z, boolean z2, int i, boolean z3, int i2, long j2) {
        return N.MqTDYvZd(obj, j, z, z2, i, z3, i2, j2);
    }

    public static void org_chromium_net_impl_CronetBidirectionalStream_destroy(long j) {
        N.MS2l1kNx(j);
    }

    public static boolean org_chromium_net_impl_CronetBidirectionalStream_readData(long j, Object obj, int i, int i2) {
        return N.Md_rPmgC(j, obj, i, i2);
    }

    public static void org_chromium_net_impl_CronetBidirectionalStream_sendRequestHeaders(long j) {
        N.MGLIR7Sc(j);
    }

    public static int org_chromium_net_impl_CronetBidirectionalStream_start(long j, Object obj, int i, Object obj2, Object obj3, boolean z) {
        return N.McDUim_I(j, obj, i, obj2, obj3, z);
    }

    public static boolean org_chromium_net_impl_CronetBidirectionalStream_writevData(long j, Object obj, Object obj2, Object obj3, boolean z) {
        return N.MwJCBTMQ(j, obj, obj2, obj3, z);
    }

    public static void org_chromium_net_impl_CronetLibraryLoader_cronetInitOnInitThread(int i) {
        N.MROCxiBo(i);
    }

    public static Object org_chromium_net_impl_CronetLibraryLoader_getCronetVersion() {
        return N.M6xubM8G();
    }

    public static int org_chromium_net_impl_CronetLibraryLoader_getTraceNetLogCaptureModeForTesting() {
        return N.MNL5_Cay_ForTesting();
    }

    public static void org_chromium_net_impl_CronetLibraryLoader_nativeInit(boolean z) {
        N.MAuYp$hS(z);
    }

    public static void org_chromium_net_impl_CronetLibraryLoader_setMinLogLevel(int i) {
        N.Mrxu2pQS(i);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_attachUploadDataToRequest(Object obj, long j, long j2) {
        return N.MA4X1aZa(obj, j, j2);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_createAdapterForTesting(Object obj) {
        return N.MnDEFloP_ForTesting(obj);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_createUploadDataStreamForTesting(Object obj, long j, long j2) {
        return N.MymnNC4__ForTesting(obj, j, j2);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_destroy(long j) {
        N.MMW1G0N1(j);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_onReadSucceeded(long j, int i, boolean z) {
        N.MpWH3VIr(j, i, z);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_onRewindSucceeded(long j) {
        N.MFpRjSMv(j);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_addRequestHeader(long j, Object obj, Object obj2) {
        return N.MvHusd1J(j, obj, obj2);
    }

    public static long org_chromium_net_impl_CronetUrlRequest_createRequestAdapter(Object obj, long j, Object obj2, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, Object obj3, Object obj4, int i5, int i6, Object obj5, long j2) {
        return N.MuOIsMvf(obj, j, obj2, i, z, z2, z3, i2, z4, i3, i4, obj3, obj4, i5, i6, obj5, j2);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_destroy(long j, boolean z) {
        N.M4znfYdB(j, z);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_followDeferredRedirect(long j) {
        N.Mhp54Oqs(j);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_getStatus(long j, Object obj) {
        N.MgIIMpT9(j, obj);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_readData(long j, Object obj, int i, int i2) {
        return N.MfCxA8r3(j, obj, i, i2);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_setHttpMethod(long j, Object obj) {
        return N.M51RPBJe(j, obj);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_start(long j) {
        N.MabZ5m6r(j);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_addPkp(long j, Object obj, Object obj2, boolean z, long j2) {
        N.Muq3ic6p(j, obj, obj2, z, j2);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_addQuicHint(long j, Object obj, int i, int i2) {
        N.MyRIv1Ij(j, obj, i, i2);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_configureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2, boolean z3) {
        N.M6sIJDgy_ForTesting(j, z, z2, z3);
    }

    public static long org_chromium_net_impl_CronetUrlRequestContext_createRequestContextAdapter(long j) {
        return N.M135Cu0D(j);
    }

    public static long org_chromium_net_impl_CronetUrlRequestContext_createRequestContextConfig(Object obj) {
        return N.MB3ntV7V(obj);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_destroy(long j) {
        N.MeBvNXm5(j);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_flushWritePropertiesForTesting(long j) {
        N.MMxc_BIz_ForTesting(j);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_initRequestContextOnInitThread(long j, Object obj) {
        N.M6Dz0nZ5(j, obj);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_provideRTTObservations(long j, boolean z) {
        N.MpnFLFF2(j, z);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_provideThroughputObservations(long j, boolean z) {
        N.MnPUhNKP(j, z);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_startNetLogToDisk(long j, Object obj, boolean z, int i) {
        N.MTULt02u(j, obj, z, i);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequestContext_startNetLogToFile(long j, Object obj, boolean z) {
        return N.MgwJQAH1(j, obj, z);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_stopNetLog(long j) {
        N.MKFm_qQ7(j);
    }

    public static void org_chromium_net_impl_ProxyCallbackRequestImpl_cancel(long j) {
        N.MLpcvWs2(j);
    }

    public static boolean org_chromium_net_impl_ProxyCallbackRequestImpl_proceed(long j, Object obj) {
        return N.ML1ZNMN3(j, obj);
    }
}
